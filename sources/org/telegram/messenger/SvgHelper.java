package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.parsers.SAXParserFactory;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.tgnet.ConnectionsManager;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class SvgHelper {
    private static final double[] pow10 = new double[ConnectionsManager.RequestFlagNeedQuickAck];

    private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2) {
    }

    public static class Line {
        float f817x1;
        float f818x2;
        float f819y1;
        float f820y2;

        public Line(float f, float f2, float f3, float f4) {
            this.f817x1 = f;
            this.f819y1 = f2;
            this.f818x2 = f3;
            this.f820y2 = f4;
        }
    }

    public static class Circle {
        float rad;
        float f815x1;
        float f816y1;

        public Circle(float f, float f2, float f3) {
            this.f815x1 = f;
            this.f816y1 = f2;
            this.rad = f3;
        }
    }

    public static class Oval {
        RectF rect;

        public Oval(RectF rectF) {
            this.rect = rectF;
        }
    }

    public static class RoundRect {
        RectF rect;
        float f823rx;

        public RoundRect(RectF rectF, float f) {
            this.rect = rectF;
            this.f823rx = f;
        }
    }

    public static class SvgDrawable extends Drawable {
        private static float gradientWidth;
        private static long lastUpdateTime;
        private static int[] parentPosition = new int[2];
        private static WeakReference<Drawable> shiftDrawable;
        private static Runnable shiftRunnable;
        private static float totalTranslation;
        private Paint backgroundPaint;
        private float colorAlpha;
        private String currentColorKey;
        private Theme.ResourcesProvider currentResourcesProvider;
        protected int height;
        private Integer overrideColor;
        private Paint overridePaint;
        private ImageReceiver parentImageReceiver;
        protected int width;
        protected ArrayList<Object> commands = new ArrayList<>();
        protected HashMap<Object, Paint> paints = new HashMap<>();
        private Bitmap[] backgroundBitmap = new Bitmap[3];
        private Canvas[] backgroundCanvas = new Canvas[3];
        private LinearGradient[] placeholderGradient = new LinearGradient[3];
        private Matrix[] placeholderMatrix = new Matrix[3];
        private int[] currentColor = new int[2];
        private float crossfadeAlpha = 1.0f;
        SparseArray<Paint> overridePaintByPosition = new SparseArray<>();
        private boolean aspectFill = true;
        private boolean aspectCenter = false;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        @Override
        public int getIntrinsicHeight() {
            return this.width;
        }

        @Override
        public int getIntrinsicWidth() {
            return this.height;
        }

        public void setAspectFill(boolean z) {
            this.aspectFill = z;
        }

        public void setAspectCenter(boolean z) {
            this.aspectCenter = z;
        }

        public void overrideWidthAndHeight(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        @Override
        public void draw(Canvas canvas) {
            drawInternal(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        }

        public void drawInternal(Canvas canvas, boolean z, int i, long j, float f, float f2, float f3, float f4) {
            long j2;
            int i2;
            String str = this.currentColorKey;
            if (str != null) {
                setupGradient(str, this.currentResourcesProvider, this.colorAlpha, z);
            }
            float scale = getScale((int) f3, (int) f4);
            if (this.placeholderGradient[i] != null) {
                float f5 = gradientWidth;
                if (f5 > 0.0f) {
                    if (z) {
                        long j3 = j - lastUpdateTime;
                        j2 = j3 <= 64 ? j3 : 64L;
                        if (j2 > 0) {
                            lastUpdateTime = j;
                            totalTranslation += (((float) j2) * f5) / 1800.0f;
                            while (true) {
                                float f6 = totalTranslation;
                                float f7 = gradientWidth;
                                if (f6 < f7 * 2.0f) {
                                    break;
                                }
                                totalTranslation = f6 - (f7 * 2.0f);
                            }
                        }
                    } else if (shiftRunnable == null || shiftDrawable.get() == this) {
                        long j4 = j - lastUpdateTime;
                        j2 = j4 <= 64 ? j4 : 64L;
                        long j5 = j2 >= 0 ? j2 : 0L;
                        lastUpdateTime = j;
                        totalTranslation += (((float) j5) * gradientWidth) / 1800.0f;
                        while (true) {
                            float f8 = totalTranslation;
                            float f9 = gradientWidth;
                            if (f8 < f9 / 2.0f) {
                                break;
                            }
                            totalTranslation = f8 - f9;
                        }
                        shiftDrawable = new WeakReference<>(this);
                        Runnable runnable = shiftRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        SvgHelper$SvgDrawable$$ExternalSyntheticLambda0 svgHelper$SvgDrawable$$ExternalSyntheticLambda0 = SvgHelper$SvgDrawable$$ExternalSyntheticLambda0.INSTANCE;
                        shiftRunnable = svgHelper$SvgDrawable$$ExternalSyntheticLambda0;
                        AndroidUtilities.runOnUIThread(svgHelper$SvgDrawable$$ExternalSyntheticLambda0, ((int) (1000.0f / AndroidUtilities.screenRefreshRate)) - 1);
                    }
                    ImageReceiver imageReceiver = this.parentImageReceiver;
                    if (imageReceiver == null || z) {
                        i2 = 0;
                    } else {
                        imageReceiver.getParentPosition(parentPosition);
                        i2 = parentPosition[0];
                    }
                    int i3 = z ? i + 1 : 0;
                    Matrix[] matrixArr = this.placeholderMatrix;
                    if (matrixArr[i3] != null) {
                        matrixArr[i3].reset();
                        if (z) {
                            this.placeholderMatrix[i3].postTranslate(((-i2) + totalTranslation) - f, 0.0f);
                        } else {
                            this.placeholderMatrix[i3].postTranslate(((-i2) + totalTranslation) - f, 0.0f);
                        }
                        float f10 = 1.0f / scale;
                        this.placeholderMatrix[i3].postScale(f10, f10);
                        this.placeholderGradient[i3].setLocalMatrix(this.placeholderMatrix[i3]);
                        ImageReceiver imageReceiver2 = this.parentImageReceiver;
                        if (imageReceiver2 != null && !z) {
                            imageReceiver2.invalidate();
                        }
                    }
                }
            }
            canvas.save();
            canvas.translate(f, f2);
            if (!this.aspectFill || this.aspectCenter) {
                canvas.translate((f3 - (this.width * scale)) / 2.0f, (f4 - (this.height * scale)) / 2.0f);
            }
            canvas.scale(scale, scale);
            int size = this.commands.size();
            for (int i4 = 0; i4 < size; i4++) {
                Object obj = this.commands.get(i4);
                if (obj instanceof Matrix) {
                    canvas.save();
                    canvas.concat((Matrix) obj);
                } else if (obj == null) {
                    canvas.restore();
                } else {
                    Paint paint = this.overridePaintByPosition.get(i4);
                    if (paint == null) {
                        paint = this.overridePaint;
                    }
                    if (z) {
                        paint = this.backgroundPaint;
                    } else if (paint == null) {
                        paint = this.paints.get(obj);
                    }
                    int alpha = paint.getAlpha();
                    paint.setAlpha((int) (this.crossfadeAlpha * alpha));
                    if (obj instanceof Path) {
                        canvas.drawPath((Path) obj, paint);
                    } else if (obj instanceof Rect) {
                        canvas.drawRect((Rect) obj, paint);
                    } else if (obj instanceof RectF) {
                        canvas.drawRect((RectF) obj, paint);
                    } else if (obj instanceof Line) {
                        Line line = (Line) obj;
                        canvas.drawLine(line.f817x1, line.f819y1, line.f818x2, line.f820y2, paint);
                    } else if (obj instanceof Circle) {
                        Circle circle = (Circle) obj;
                        canvas.drawCircle(circle.f815x1, circle.f816y1, circle.rad, paint);
                    } else if (obj instanceof Oval) {
                        canvas.drawOval(((Oval) obj).rect, paint);
                    } else if (obj instanceof RoundRect) {
                        RoundRect roundRect = (RoundRect) obj;
                        RectF rectF = roundRect.rect;
                        float f11 = roundRect.f823rx;
                        canvas.drawRoundRect(rectF, f11, f11, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            canvas.restore();
        }

        public float getScale(int i, int i2) {
            float f = i / this.width;
            float f2 = i2 / this.height;
            return this.aspectFill ? Math.max(f, f2) : Math.min(f, f2);
        }

        @Override
        public void setAlpha(int i) {
            this.crossfadeAlpha = i / 255.0f;
        }

        public void addCommand(Object obj, Paint paint) {
            this.commands.add(obj);
            this.paints.put(obj, new Paint(paint));
        }

        public void addCommand(Object obj) {
            this.commands.add(obj);
        }

        public void setParent(ImageReceiver imageReceiver) {
            this.parentImageReceiver = imageReceiver;
        }

        public void setupGradient(String str, float f, boolean z) {
            setupGradient(str, null, f, z);
        }

        public void setupGradient(String str, Theme.ResourcesProvider resourcesProvider, float f, boolean z) {
            Shader bitmapShader;
            Integer num = this.overrideColor;
            int color = num == null ? Theme.getColor(str, resourcesProvider) : num.intValue();
            this.currentResourcesProvider = resourcesProvider;
            int[] iArr = this.currentColor;
            if (iArr[z ? 1 : 0] != color) {
                this.colorAlpha = f;
                this.currentColorKey = str;
                iArr[z ? 1 : 0] = color;
                gradientWidth = AndroidUtilities.displaySize.x * 2;
                float m35dp = AndroidUtilities.m35dp(180.0f) / gradientWidth;
                int argb = Color.argb((int) ((Color.alpha(color) / 2) * this.colorAlpha), Color.red(color), Color.green(color), Color.blue(color));
                float f2 = (1.0f - m35dp) / 2.0f;
                float f3 = m35dp / 2.0f;
                this.placeholderGradient[z ? 1 : 0] = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f2 - f3, f2, f2 + f3, 1.0f}, Shader.TileMode.REPEAT);
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    bitmapShader = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{argb, argb}, (float[]) null, Shader.TileMode.REPEAT);
                } else {
                    Bitmap[] bitmapArr = this.backgroundBitmap;
                    if (bitmapArr[z ? 1 : 0] == null) {
                        bitmapArr[z ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        this.backgroundCanvas[z ? 1 : 0] = new Canvas(this.backgroundBitmap[z ? 1 : 0]);
                    }
                    this.backgroundCanvas[z ? 1 : 0].drawColor(argb);
                    Bitmap bitmap = this.backgroundBitmap[z ? 1 : 0];
                    Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                    bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                }
                this.placeholderMatrix[z ? 1 : 0] = new Matrix();
                this.placeholderGradient[z ? 1 : 0].setLocalMatrix(this.placeholderMatrix[z ? 1 : 0]);
                if (z) {
                    if (this.backgroundPaint == null) {
                        this.backgroundPaint = new Paint(1);
                    }
                    if (i <= 22) {
                        this.backgroundPaint.setShader(bitmapShader);
                        return;
                    } else {
                        this.backgroundPaint.setShader(new ComposeShader(this.placeholderGradient[z ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                        return;
                    }
                }
                for (Paint paint : this.paints.values()) {
                    if (Build.VERSION.SDK_INT <= 22) {
                        paint.setShader(bitmapShader);
                    } else {
                        paint.setShader(new ComposeShader(this.placeholderGradient[z ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                    }
                }
            }
        }

        public void setColorKey(String str) {
            this.currentColorKey = str;
        }

        public void setColorKey(String str, Theme.ResourcesProvider resourcesProvider) {
            this.currentColorKey = str;
            this.currentResourcesProvider = resourcesProvider;
        }

        public void setColor(int i) {
            this.overrideColor = Integer.valueOf(i);
        }

        public void setPaint(Paint paint) {
            this.overridePaint = paint;
        }

        public void setPaint(Paint paint, int i) {
            this.overridePaintByPosition.put(i, paint);
        }

        public void copyCommandFromPosition(int i) {
            ArrayList<Object> arrayList = this.commands;
            arrayList.add(arrayList.get(i));
        }
    }

    public static Bitmap getBitmap(int i, int i2, int i3, int i4) {
        return getBitmap(i, i2, i3, i4, 1.0f);
    }

    public static Bitmap getBitmap(int i, int i2, int i3, int i4, float f) {
        try {
            InputStream openRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i2, i3, Integer.valueOf(i4), false, f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(openRawResource));
            Bitmap bitmap = sVGHandler.getBitmap();
            if (openRawResource != null) {
                openRawResource.close();
            }
            return bitmap;
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(File file, int i, int i2, boolean z) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i, i2, z ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(fileInputStream));
            Bitmap bitmap = sVGHandler.getBitmap();
            fileInputStream.close();
            return bitmap;
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(String str, int i, int i2, boolean z) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i, i2, z ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getBitmap();
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawable(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, null, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getDrawable();
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawable(int i, int i2) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, Integer.valueOf(i2), true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(ApplicationLoader.applicationContext.getResources().openRawResource(i)));
            return sVGHandler.getDrawable();
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(String str, int i, int i2) {
        try {
            Path doPath = doPath(str);
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(doPath);
            svgDrawable.paints.put(doPath, new Paint(1));
            svgDrawable.width = i;
            svgDrawable.height = i2;
            return svgDrawable;
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    public static Bitmap getBitmapByPathOnly(String str, int i, int i2, int i3, int i4) {
        try {
            Path doPath = doPath(str);
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(i3 / i, i4 / i2);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(doPath, paint);
            return createBitmap;
        } catch (Exception e) {
            FileLog.m31e(e);
            return null;
        }
    }

    private static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (z) {
                z = false;
            } else {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt == '-' && str.charAt(i2 - 1) == 'e') {
                            break;
                        } else {
                            String substring = str.substring(i, i2);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i = i2;
                                    break;
                                } else {
                                    i = i2 + 1;
                                    z = true;
                                    break;
                                }
                            } else {
                                i++;
                                continue;
                            }
                        }
                    case ')':
                    case VoIPService.CALL_MIN_LAYER:
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        String substring2 = str.substring(i, i2);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new NumberParse(arrayList, i2);
                }
            }
        }
        String substring3 = str.substring(i);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
            i = str.length();
        }
        return new NumberParse(arrayList, i);
    }

    public static Matrix parseTransform(String str) {
        float f;
        if (str.startsWith("matrix(")) {
            NumberParse parseNumbers = parseNumbers(str.substring(7));
            if (parseNumbers.numbers.size() == 6) {
                Matrix matrix = new Matrix();
                matrix.setValues(new float[]{((Float) parseNumbers.numbers.get(0)).floatValue(), ((Float) parseNumbers.numbers.get(2)).floatValue(), ((Float) parseNumbers.numbers.get(4)).floatValue(), ((Float) parseNumbers.numbers.get(1)).floatValue(), ((Float) parseNumbers.numbers.get(3)).floatValue(), ((Float) parseNumbers.numbers.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                return matrix;
            }
            return null;
        } else if (str.startsWith("translate(")) {
            NumberParse parseNumbers2 = parseNumbers(str.substring(10));
            if (parseNumbers2.numbers.size() > 0) {
                float floatValue = ((Float) parseNumbers2.numbers.get(0)).floatValue();
                r6 = parseNumbers2.numbers.size() > 1 ? ((Float) parseNumbers2.numbers.get(1)).floatValue() : 0.0f;
                Matrix matrix2 = new Matrix();
                matrix2.postTranslate(floatValue, r6);
                return matrix2;
            }
            return null;
        } else if (str.startsWith("scale(")) {
            NumberParse parseNumbers3 = parseNumbers(str.substring(6));
            if (parseNumbers3.numbers.size() > 0) {
                float floatValue2 = ((Float) parseNumbers3.numbers.get(0)).floatValue();
                r6 = parseNumbers3.numbers.size() > 1 ? ((Float) parseNumbers3.numbers.get(1)).floatValue() : 0.0f;
                Matrix matrix3 = new Matrix();
                matrix3.postScale(floatValue2, r6);
                return matrix3;
            }
            return null;
        } else if (str.startsWith("skewX(")) {
            NumberParse parseNumbers4 = parseNumbers(str.substring(6));
            if (parseNumbers4.numbers.size() > 0) {
                float floatValue3 = ((Float) parseNumbers4.numbers.get(0)).floatValue();
                Matrix matrix4 = new Matrix();
                matrix4.postSkew((float) Math.tan(floatValue3), 0.0f);
                return matrix4;
            }
            return null;
        } else if (str.startsWith("skewY(")) {
            NumberParse parseNumbers5 = parseNumbers(str.substring(6));
            if (parseNumbers5.numbers.size() > 0) {
                float floatValue4 = ((Float) parseNumbers5.numbers.get(0)).floatValue();
                Matrix matrix5 = new Matrix();
                matrix5.postSkew(0.0f, (float) Math.tan(floatValue4));
                return matrix5;
            }
            return null;
        } else if (str.startsWith("rotate(")) {
            NumberParse parseNumbers6 = parseNumbers(str.substring(7));
            if (parseNumbers6.numbers.size() > 0) {
                float floatValue5 = ((Float) parseNumbers6.numbers.get(0)).floatValue();
                if (parseNumbers6.numbers.size() > 2) {
                    r6 = ((Float) parseNumbers6.numbers.get(1)).floatValue();
                    f = ((Float) parseNumbers6.numbers.get(2)).floatValue();
                } else {
                    f = 0.0f;
                }
                Matrix matrix6 = new Matrix();
                matrix6.postTranslate(r6, f);
                matrix6.postRotate(floatValue5);
                matrix6.postTranslate(-r6, -f);
                return matrix6;
            }
            return null;
        } else {
            return null;
        }
    }

    public static android.graphics.Path doPath(java.lang.String r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SvgHelper.doPath(java.lang.String):android.graphics.Path");
    }

    public static NumberParse getNumberParseAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return parseNumbers(attributes.getValue(i));
            }
        }
        return null;
    }

    public static String getStringAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static Float getFloatAttr(String str, Attributes attributes) {
        return getFloatAttr(str, attributes, null);
    }

    public static Float getFloatAttr(String str, Attributes attributes, Float f) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return f;
        }
        if (stringAttr.endsWith("px")) {
            stringAttr = stringAttr.substring(0, stringAttr.length() - 2);
        } else if (stringAttr.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(stringAttr));
    }

    private static Integer getHexAttr(String str, Attributes attributes) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(stringAttr.substring(1), 16));
        } catch (NumberFormatException unused) {
            return getColorByName(stringAttr);
        }
    }

    public static Integer getColorByName(String str) {
        char c;
        String lowerCase = str.toLowerCase();
        lowerCase.hashCode();
        switch (lowerCase.hashCode()) {
            case -734239628:
                if (lowerCase.equals("yellow")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 112785:
                if (lowerCase.equals("red")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3027034:
                if (lowerCase.equals("blue")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3068707:
                if (lowerCase.equals("cyan")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3181155:
                if (lowerCase.equals("gray")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 93818879:
                if (lowerCase.equals("black")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 98619139:
                if (lowerCase.equals("green")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 113101865:
                if (lowerCase.equals("white")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 828922025:
                if (lowerCase.equals("magenta")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return -256;
            case 1:
                return -65536;
            case 2:
                return -16776961;
            case 3:
                return -16711681;
            case 4:
                return -7829368;
            case 5:
                return -16777216;
            case 6:
                return -16711936;
            case 7:
                return -1;
            case '\b':
                return -65281;
            default:
                return null;
        }
    }

    public static class NumberParse {
        private int nextCmd;
        private ArrayList<Float> numbers;

        public NumberParse(ArrayList<Float> arrayList, int i) {
            this.numbers = arrayList;
            this.nextCmd = i;
        }

        public int getNextCmd() {
            return this.nextCmd;
        }

        public float getNumber(int i) {
            return this.numbers.get(i).floatValue();
        }
    }

    public static class StyleSet {
        HashMap<String, String> styleMap;

        private StyleSet(StyleSet styleSet) {
            HashMap<String, String> hashMap = new HashMap<>();
            this.styleMap = hashMap;
            hashMap.putAll(styleSet.styleMap);
        }

        private StyleSet(String str) {
            this.styleMap = new HashMap<>();
            for (String str2 : str.split(";")) {
                String[] split = str2.split(":");
                if (split.length == 2) {
                    this.styleMap.put(split[0].trim(), split[1].trim());
                }
            }
        }

        public String getStyle(String str) {
            return this.styleMap.get(str);
        }
    }

    public static class Properties {
        Attributes atts;
        ArrayList<StyleSet> styles;

        private Properties(Attributes attributes, HashMap<String, StyleSet> hashMap) {
            this.atts = attributes;
            String stringAttr = SvgHelper.getStringAttr("style", attributes);
            if (stringAttr == null) {
                String stringAttr2 = SvgHelper.getStringAttr("class", attributes);
                if (stringAttr2 != null) {
                    this.styles = new ArrayList<>();
                    for (String str : stringAttr2.split(" ")) {
                        StyleSet styleSet = hashMap.get(str.trim());
                        if (styleSet != null) {
                            this.styles.add(styleSet);
                        }
                    }
                    return;
                }
                return;
            }
            ArrayList<StyleSet> arrayList = new ArrayList<>();
            this.styles = arrayList;
            arrayList.add(new StyleSet(stringAttr));
        }

        public String getAttr(String str) {
            ArrayList<StyleSet> arrayList = this.styles;
            String str2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.styles.size();
                for (int i = 0; i < size; i++) {
                    str2 = this.styles.get(i).getStyle(str);
                    if (str2 != null) {
                        break;
                    }
                }
            }
            return str2 == null ? SvgHelper.getStringAttr(str, this.atts) : str2;
        }

        public String getString(String str) {
            return getAttr(str);
        }

        public Integer getHex(String str) {
            String attr = getAttr(str);
            if (attr == null) {
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt(attr.substring(1), 16));
            } catch (NumberFormatException unused) {
                return SvgHelper.getColorByName(attr);
            }
        }

        public Float getFloat(String str, float f) {
            Float f2 = getFloat(str);
            return f2 == null ? Float.valueOf(f) : f2;
        }

        public Float getFloat(String str) {
            String attr = getAttr(str);
            if (attr == null) {
                return null;
            }
            try {
                return Float.valueOf(Float.parseFloat(attr));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
    }

    public static class SVGHandler extends DefaultHandler {
        private Bitmap bitmap;
        private boolean boundsMode;
        private Canvas canvas;
        private int desiredHeight;
        private int desiredWidth;
        private SvgDrawable drawable;
        private float globalScale;
        private HashMap<String, StyleSet> globalStyles;
        private Paint paint;
        private Integer paintColor;
        boolean pushed;
        private RectF rect;
        private RectF rectTmp;
        private float scale;
        private StringBuilder styles;

        @Override
        public void endDocument() {
        }

        @Override
        public void startDocument() {
        }

        private SVGHandler(int i, int i2, Integer num, boolean z, float f) {
            this.scale = 1.0f;
            this.paint = new Paint(1);
            this.rect = new RectF();
            this.rectTmp = new RectF();
            this.globalScale = 1.0f;
            this.pushed = false;
            this.globalStyles = new HashMap<>();
            this.globalScale = f;
            this.desiredWidth = i;
            this.desiredHeight = i2;
            this.paintColor = num;
            if (z) {
                this.drawable = new SvgDrawable();
            }
        }

        private boolean doFill(Properties properties) {
            if ("none".equals(properties.getString("display"))) {
                return false;
            }
            String string = properties.getString("fill");
            if (string != null && string.startsWith("url(#")) {
                string.substring(5, string.length() - 1);
                return false;
            }
            Integer hex = properties.getHex("fill");
            if (hex != null) {
                doColor(properties, hex, true);
                this.paint.setStyle(Paint.Style.FILL);
                return true;
            } else if (properties.getString("fill") == null && properties.getString("stroke") == null) {
                this.paint.setStyle(Paint.Style.FILL);
                Integer num = this.paintColor;
                if (num != null) {
                    this.paint.setColor(num.intValue());
                } else {
                    this.paint.setColor(-16777216);
                }
                return true;
            } else {
                return false;
            }
        }

        private boolean doStroke(Properties properties) {
            Integer hex;
            if ("none".equals(properties.getString("display")) || (hex = properties.getHex("stroke")) == null) {
                return false;
            }
            doColor(properties, hex, false);
            Float f = properties.getFloat("stroke-width");
            if (f != null) {
                this.paint.setStrokeWidth(f.floatValue());
            }
            String string = properties.getString("stroke-linecap");
            if ("round".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.ROUND);
            } else if ("square".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.SQUARE);
            } else if ("butt".equals(string)) {
                this.paint.setStrokeCap(Paint.Cap.BUTT);
            }
            String string2 = properties.getString("stroke-linejoin");
            if ("miter".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.MITER);
            } else if ("round".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.ROUND);
            } else if ("bevel".equals(string2)) {
                this.paint.setStrokeJoin(Paint.Join.BEVEL);
            }
            this.paint.setStyle(Paint.Style.STROKE);
            return true;
        }

        private void doColor(Properties properties, Integer num, boolean z) {
            Integer num2 = this.paintColor;
            if (num2 != null) {
                this.paint.setColor(num2.intValue());
            } else {
                this.paint.setColor((num.intValue() & 16777215) | (-16777216));
            }
            Float f = properties.getFloat("opacity");
            if (f == null) {
                f = properties.getFloat(z ? "fill-opacity" : "stroke-opacity");
            }
            if (f == null) {
                this.paint.setAlpha(255);
            } else {
                this.paint.setAlpha((int) (f.floatValue() * 255.0f));
            }
        }

        private void pushTransform(Attributes attributes) {
            String stringAttr = SvgHelper.getStringAttr("transform", attributes);
            boolean z = stringAttr != null;
            this.pushed = z;
            if (z) {
                Matrix parseTransform = SvgHelper.parseTransform(stringAttr);
                SvgDrawable svgDrawable = this.drawable;
                if (svgDrawable != null) {
                    svgDrawable.addCommand(parseTransform);
                    return;
                }
                this.canvas.save();
                this.canvas.concat(parseTransform);
            }
        }

        private void popTransform() {
            if (this.pushed) {
                SvgDrawable svgDrawable = this.drawable;
                if (svgDrawable != null) {
                    svgDrawable.addCommand(null);
                } else {
                    this.canvas.restore();
                }
            }
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String stringAttr;
            int i;
            if (!this.boundsMode || str2.equals("style")) {
                str2.hashCode();
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1656480802:
                        if (str2.equals("ellipse")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1360216880:
                        if (str2.equals("circle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -397519558:
                        if (str2.equals("polygon")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 103:
                        if (str2.equals(ImageLoader.AUTOPLAY_FILTER)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 114276:
                        if (str2.equals("svg")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3079438:
                        if (str2.equals("defs")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3321844:
                        if (str2.equals("line")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3433509:
                        if (str2.equals("path")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 3496420:
                        if (str2.equals("rect")) {
                            c = '\b';
                            break;
                        }
                        break;
                    case 109780401:
                        if (str2.equals("style")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 561938880:
                        if (str2.equals("polyline")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 917656469:
                        if (str2.equals("clipPath")) {
                            c = 11;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Float floatAttr = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr2 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr3 = SvgHelper.getFloatAttr("rx", attributes);
                        Float floatAttr4 = SvgHelper.getFloatAttr("ry", attributes);
                        if (floatAttr == null || floatAttr2 == null || floatAttr3 == null || floatAttr4 == null) {
                            return;
                        }
                        pushTransform(attributes);
                        Properties properties = new Properties(attributes, this.globalStyles);
                        this.rect.set(floatAttr.floatValue() - floatAttr3.floatValue(), floatAttr2.floatValue() - floatAttr4.floatValue(), floatAttr.floatValue() + floatAttr3.floatValue(), floatAttr2.floatValue() + floatAttr4.floatValue());
                        if (doFill(properties)) {
                            SvgDrawable svgDrawable = this.drawable;
                            if (svgDrawable != null) {
                                svgDrawable.addCommand(new Oval(this.rect), this.paint);
                            } else {
                                this.canvas.drawOval(this.rect, this.paint);
                            }
                        }
                        if (doStroke(properties)) {
                            SvgDrawable svgDrawable2 = this.drawable;
                            if (svgDrawable2 != null) {
                                svgDrawable2.addCommand(new Oval(this.rect), this.paint);
                            } else {
                                this.canvas.drawOval(this.rect, this.paint);
                            }
                        }
                        popTransform();
                        return;
                    case 1:
                        Float floatAttr5 = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr6 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr7 = SvgHelper.getFloatAttr("r", attributes);
                        if (floatAttr5 == null || floatAttr6 == null || floatAttr7 == null) {
                            return;
                        }
                        pushTransform(attributes);
                        Properties properties2 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties2)) {
                            SvgDrawable svgDrawable3 = this.drawable;
                            if (svgDrawable3 != null) {
                                svgDrawable3.addCommand(new Circle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue()), this.paint);
                            } else {
                                this.canvas.drawCircle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue(), this.paint);
                            }
                        }
                        if (doStroke(properties2)) {
                            SvgDrawable svgDrawable4 = this.drawable;
                            if (svgDrawable4 != null) {
                                svgDrawable4.addCommand(new Circle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue()), this.paint);
                            } else {
                                this.canvas.drawCircle(floatAttr5.floatValue(), floatAttr6.floatValue(), floatAttr7.floatValue(), this.paint);
                            }
                        }
                        popTransform();
                        return;
                    case 2:
                    case '\n':
                        NumberParse numberParseAttr = SvgHelper.getNumberParseAttr("points", attributes);
                        if (numberParseAttr != null) {
                            Path path = new Path();
                            ArrayList arrayList = numberParseAttr.numbers;
                            if (arrayList.size() > 1) {
                                pushTransform(attributes);
                                Properties properties3 = new Properties(attributes, this.globalStyles);
                                path.moveTo(((Float) arrayList.get(0)).floatValue(), ((Float) arrayList.get(1)).floatValue());
                                for (int i2 = 2; i2 < arrayList.size(); i2 += 2) {
                                    path.lineTo(((Float) arrayList.get(i2)).floatValue(), ((Float) arrayList.get(i2 + 1)).floatValue());
                                }
                                if (str2.equals("polygon")) {
                                    path.close();
                                }
                                if (doFill(properties3)) {
                                    SvgDrawable svgDrawable5 = this.drawable;
                                    if (svgDrawable5 != null) {
                                        svgDrawable5.addCommand(path, this.paint);
                                    } else {
                                        this.canvas.drawPath(path, this.paint);
                                    }
                                }
                                if (doStroke(properties3)) {
                                    SvgDrawable svgDrawable6 = this.drawable;
                                    if (svgDrawable6 != null) {
                                        svgDrawable6.addCommand(path, this.paint);
                                    } else {
                                        this.canvas.drawPath(path, this.paint);
                                    }
                                }
                                popTransform();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        if ("bounds".equalsIgnoreCase(SvgHelper.getStringAttr("id", attributes))) {
                            this.boundsMode = true;
                            return;
                        }
                        return;
                    case 4:
                        Float floatAttr8 = SvgHelper.getFloatAttr("width", attributes);
                        Float floatAttr9 = SvgHelper.getFloatAttr("height", attributes);
                        if ((floatAttr8 == null || floatAttr9 == null) && (stringAttr = SvgHelper.getStringAttr("viewBox", attributes)) != null) {
                            String[] split = stringAttr.split(" ");
                            Float valueOf = Float.valueOf(Float.parseFloat(split[2]));
                            floatAttr9 = Float.valueOf(Float.parseFloat(split[3]));
                            floatAttr8 = valueOf;
                        }
                        if (floatAttr8 == null || floatAttr9 == null) {
                            floatAttr8 = Float.valueOf(this.desiredWidth);
                            floatAttr9 = Float.valueOf(this.desiredHeight);
                        }
                        int ceil = (int) Math.ceil(floatAttr8.floatValue());
                        int ceil2 = (int) Math.ceil(floatAttr9.floatValue());
                        if (ceil == 0 || ceil2 == 0) {
                            ceil = this.desiredWidth;
                            ceil2 = this.desiredHeight;
                        } else {
                            int i3 = this.desiredWidth;
                            if (i3 != 0 && (i = this.desiredHeight) != 0) {
                                float f = ceil;
                                float f2 = ceil2;
                                float min = Math.min(i3 / f, i / f2);
                                this.scale = min;
                                ceil = (int) (f * min);
                                ceil2 = (int) (f2 * min);
                            }
                        }
                        SvgDrawable svgDrawable7 = this.drawable;
                        if (svgDrawable7 == null) {
                            Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                            this.bitmap = createBitmap;
                            createBitmap.eraseColor(0);
                            Canvas canvas = new Canvas(this.bitmap);
                            this.canvas = canvas;
                            float f3 = this.scale;
                            if (f3 != 0.0f) {
                                float f4 = this.globalScale;
                                canvas.scale(f4 * f3, f4 * f3);
                                return;
                            }
                            return;
                        }
                        svgDrawable7.width = ceil;
                        svgDrawable7.height = ceil2;
                        return;
                    case 5:
                    case 11:
                        this.boundsMode = true;
                        return;
                    case 6:
                        Float floatAttr10 = SvgHelper.getFloatAttr("x1", attributes);
                        Float floatAttr11 = SvgHelper.getFloatAttr("x2", attributes);
                        Float floatAttr12 = SvgHelper.getFloatAttr("y1", attributes);
                        Float floatAttr13 = SvgHelper.getFloatAttr("y2", attributes);
                        if (doStroke(new Properties(attributes, this.globalStyles))) {
                            pushTransform(attributes);
                            SvgDrawable svgDrawable8 = this.drawable;
                            if (svgDrawable8 != null) {
                                svgDrawable8.addCommand(new Line(floatAttr10.floatValue(), floatAttr12.floatValue(), floatAttr11.floatValue(), floatAttr13.floatValue()), this.paint);
                            } else {
                                this.canvas.drawLine(floatAttr10.floatValue(), floatAttr12.floatValue(), floatAttr11.floatValue(), floatAttr13.floatValue(), this.paint);
                            }
                            popTransform();
                            return;
                        }
                        return;
                    case 7:
                        Path doPath = SvgHelper.doPath(SvgHelper.getStringAttr("d", attributes));
                        pushTransform(attributes);
                        Properties properties4 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties4)) {
                            SvgDrawable svgDrawable9 = this.drawable;
                            if (svgDrawable9 != null) {
                                svgDrawable9.addCommand(doPath, this.paint);
                            } else {
                                this.canvas.drawPath(doPath, this.paint);
                            }
                        }
                        if (doStroke(properties4)) {
                            SvgDrawable svgDrawable10 = this.drawable;
                            if (svgDrawable10 != null) {
                                svgDrawable10.addCommand(doPath, this.paint);
                            } else {
                                this.canvas.drawPath(doPath, this.paint);
                            }
                        }
                        popTransform();
                        return;
                    case '\b':
                        Float floatAttr14 = SvgHelper.getFloatAttr("x", attributes);
                        if (floatAttr14 == null) {
                            floatAttr14 = Float.valueOf(0.0f);
                        }
                        Float floatAttr15 = SvgHelper.getFloatAttr("y", attributes);
                        if (floatAttr15 == null) {
                            floatAttr15 = Float.valueOf(0.0f);
                        }
                        Float floatAttr16 = SvgHelper.getFloatAttr("width", attributes);
                        Float floatAttr17 = SvgHelper.getFloatAttr("height", attributes);
                        Float floatAttr18 = SvgHelper.getFloatAttr("rx", attributes, null);
                        pushTransform(attributes);
                        Properties properties5 = new Properties(attributes, this.globalStyles);
                        if (doFill(properties5)) {
                            SvgDrawable svgDrawable11 = this.drawable;
                            if (svgDrawable11 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable11.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable11.addCommand(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue(), this.paint);
                            }
                        }
                        if (doStroke(properties5)) {
                            SvgDrawable svgDrawable12 = this.drawable;
                            if (svgDrawable12 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable12.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable12.addCommand(new RectF(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), floatAttr15.floatValue(), floatAttr14.floatValue() + floatAttr16.floatValue(), floatAttr15.floatValue() + floatAttr17.floatValue(), this.paint);
                            }
                        }
                        popTransform();
                        return;
                    case '\t':
                        this.styles = new StringBuilder();
                        return;
                    default:
                        return;
                }
            }
        }

        @Override
        public void characters(char[] cArr, int i, int i2) {
            StringBuilder sb = this.styles;
            if (sb != null) {
                sb.append(cArr, i, i2);
            }
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int indexOf;
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 103:
                    if (str2.equals(ImageLoader.AUTOPLAY_FILTER)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c = 2;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 3:
                    this.boundsMode = false;
                    return;
                case 2:
                    StringBuilder sb = this.styles;
                    if (sb != null) {
                        String[] split = sb.toString().split("\\}");
                        for (int i = 0; i < split.length; i++) {
                            split[i] = split[i].trim().replace("\t", BuildConfig.APP_CENTER_HASH).replace("\n", BuildConfig.APP_CENTER_HASH);
                            if (split[i].length() != 0 && split[i].charAt(0) == '.' && (indexOf = split[i].indexOf(123)) >= 0) {
                                this.globalStyles.put(split[i].substring(1, indexOf).trim(), new StyleSet(split[i].substring(indexOf + 1)));
                            }
                        }
                        this.styles = null;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public SvgDrawable getDrawable() {
            return this.drawable;
        }
    }

    static {
        int i = 0;
        while (true) {
            double[] dArr = pow10;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(10.0d, i);
            i++;
        }
    }

    public static class ParserHelper {
        private char current;
        private int f821n;
        public int pos;
        private CharSequence f822s;

        public ParserHelper(CharSequence charSequence, int i) {
            this.f822s = charSequence;
            this.pos = i;
            this.f821n = charSequence.length();
            this.current = charSequence.charAt(i);
        }

        private char read() {
            int i = this.pos;
            int i2 = this.f821n;
            if (i < i2) {
                this.pos = i + 1;
            }
            int i3 = this.pos;
            if (i3 == i2) {
                return (char) 0;
            }
            return this.f822s.charAt(i3);
        }

        public void skipWhitespace() {
            while (true) {
                int i = this.pos;
                if (i >= this.f821n || !Character.isWhitespace(this.f822s.charAt(i))) {
                    return;
                }
                advance();
            }
        }

        public void skipNumberSeparator() {
            while (true) {
                int i = this.pos;
                if (i >= this.f821n) {
                    return;
                }
                char charAt = this.f822s.charAt(i);
                if (charAt != '\t' && charAt != '\n' && charAt != ' ' && charAt != ',') {
                    return;
                }
                advance();
            }
        }

        public void advance() {
            this.current = read();
        }

        public float parseFloat() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SvgHelper.ParserHelper.parseFloat():float");
        }

        private void reportUnexpectedCharacterError(char c) {
            throw new RuntimeException("Unexpected char '" + c + "'.");
        }

        public float buildFloat(int i, int i2) {
            double d;
            if (i2 < -125 || i == 0) {
                return 0.0f;
            }
            if (i2 >= 128) {
                return i > 0 ? Float.POSITIVE_INFINITY : Float.NEGATIVE_INFINITY;
            } else if (i2 == 0) {
                return i;
            } else {
                if (i >= 67108864) {
                    i++;
                }
                double d2 = i;
                double[] dArr = SvgHelper.pow10;
                if (i2 > 0) {
                    double d3 = dArr[i2];
                    Double.isNaN(d2);
                    d = d2 * d3;
                } else {
                    double d4 = dArr[-i2];
                    Double.isNaN(d2);
                    d = d2 / d4;
                }
                return (float) d;
            }
        }

        public float nextFloat() {
            skipWhitespace();
            float parseFloat = parseFloat();
            skipNumberSeparator();
            return parseFloat;
        }
    }

    public static String decompress(byte[] bArr) {
        try {
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            sb.append('M');
            for (byte b : bArr) {
                int i = b & 255;
                if (i >= 192) {
                    sb.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt((i - 128) - 64));
                } else {
                    if (i >= 128) {
                        sb.append(',');
                    } else if (i >= 64) {
                        sb.append('-');
                    }
                    sb.append(i & 63);
                }
            }
            sb.append('z');
            return sb.toString();
        } catch (Exception e) {
            FileLog.m31e(e);
            return BuildConfig.APP_CENTER_HASH;
        }
    }
}
