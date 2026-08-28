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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
public class SvgHelper {
    private static final Pattern SPLIT_BOUNDARY;
    private static final double[] pow10 = new double[128];

    public static class Circle {
        float rad;
        float f19663x1;
        float f19664y1;

        public Circle(float f10, float f11, float f12) {
            this.f19663x1 = f10;
            this.f19664y1 = f11;
            this.rad = f12;
        }
    }

    public static class Line {
        float f19665x1;
        float f19666x2;
        float f19667y1;
        float f19668y2;

        public Line(float f10, float f11, float f12, float f13) {
            this.f19665x1 = f10;
            this.f19667y1 = f11;
            this.f19666x2 = f12;
            this.f19668y2 = f13;
        }
    }

    public static class NumberParse {
        private int nextCmd;
        private ArrayList<Float> numbers;

        public NumberParse(ArrayList<Float> arrayList, int i9) {
            this.numbers = arrayList;
            this.nextCmd = i9;
        }

        public int getNextCmd() {
            return this.nextCmd;
        }

        public float getNumber(int i9) {
            return this.numbers.get(i9).floatValue();
        }
    }

    public static class Oval {
        RectF rect;

        public Oval(RectF rectF) {
            this.rect = rectF;
        }
    }

    public static class ParserHelper {
        private char current;
        private int f19669n;
        public int pos;
        private CharSequence f19670s;

        public ParserHelper(CharSequence charSequence, int i9) {
            this.f19670s = charSequence;
            this.pos = i9;
            this.f19669n = charSequence.length();
            this.current = charSequence.charAt(i9);
        }

        private char read() {
            int i9 = this.pos;
            int i10 = this.f19669n;
            if (i9 < i10) {
                this.pos = i9 + 1;
            }
            int i11 = this.pos;
            if (i11 == i10) {
                return (char) 0;
            }
            return this.f19670s.charAt(i11);
        }

        private void reportUnexpectedCharacterError(char c10) {
            throw new RuntimeException("Unexpected char '" + c10 + "'.");
        }

        public void advance() {
            this.current = read();
        }

        public float buildFloat(int i9, int i10) {
            double d;
            if (i10 >= -125 && i9 != 0) {
                if (i10 >= 128) {
                    if (i9 > 0) {
                        return Float.POSITIVE_INFINITY;
                    }
                    return Float.NEGATIVE_INFINITY;
                } else if (i10 == 0) {
                    return i9;
                } else {
                    if (i9 >= 67108864) {
                        i9++;
                    }
                    double d9 = i9;
                    double[] dArr = SvgHelper.pow10;
                    if (i10 > 0) {
                        d = d9 * dArr[i10];
                    } else {
                        d = d9 / dArr[-i10];
                    }
                    return (float) d;
                }
            }
            return 0.0f;
        }

        public float nextFloat() {
            skipWhitespace();
            float parseFloat = parseFloat();
            skipNumberSeparator();
            return parseFloat;
        }

        public float parseFloat() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SvgHelper.ParserHelper.parseFloat():float");
        }

        public void skipNumberSeparator() {
            while (true) {
                int i9 = this.pos;
                if (i9 < this.f19669n) {
                    char charAt = this.f19670s.charAt(i9);
                    if (charAt == '\t' || charAt == '\n' || charAt == ' ' || charAt == ',') {
                        advance();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        public void skipWhitespace() {
            while (true) {
                int i9 = this.pos;
                if (i9 < this.f19669n && Character.isWhitespace(this.f19670s.charAt(i9))) {
                    advance();
                } else {
                    return;
                }
            }
        }
    }

    public static class Properties {
        Attributes atts;
        ArrayList<StyleSet> styles;

        public String getAttr(String str) {
            ArrayList<StyleSet> arrayList = this.styles;
            String str2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = this.styles.size();
                for (int i9 = 0; i9 < size; i9++) {
                    str2 = this.styles.get(i9).getStyle(str);
                    if (str2 != null) {
                        break;
                    }
                }
            }
            if (str2 == null) {
                return SvgHelper.getStringAttr(str, this.atts);
            }
            return str2;
        }

        public Float getFloat(String str, float f10) {
            Float f11 = getFloat(str);
            return f11 == null ? Float.valueOf(f10) : f11;
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

        public String getString(String str) {
            return getAttr(str);
        }

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

    public static class RoundRect {
        RectF rect;
        float rx;

        public RoundRect(RectF rectF, float f10) {
            this.rect = rectF;
            this.rx = f10;
        }
    }

    public enum ScaleMode {
        Default,
        ByWidth
    }

    public static class StyleSet {
        HashMap<String, String> styleMap;

        public String getStyle(String str) {
            return this.styleMap.get(str);
        }

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
    }

    public static class SvgDrawable extends Drawable {
        private static float gradientWidth;
        private static long lastUpdateTime;
        private static WeakReference<Drawable> shiftDrawable;
        private static Runnable shiftRunnable;
        private static float totalTranslation;
        private Paint backgroundPaint;
        private float colorAlpha;
        private int currentColorKey;
        private org.telegram.ui.ActionBar.b6 currentResourcesProvider;
        protected int height;
        private Integer overrideColor;
        private Paint overridePaint;
        private ImageReceiver parentImageReceiver;
        protected int width;
        private static final int[] parentPosition = new int[2];
        private static boolean lite = LiteMode.isEnabled(32);
        protected ArrayList<Object> commands = new ArrayList<>();
        protected HashMap<Object, Paint> paints = new HashMap<>();
        private final Bitmap[] backgroundBitmap = new Bitmap[3];
        private final Canvas[] backgroundCanvas = new Canvas[3];
        private final LinearGradient[] placeholderGradient = new LinearGradient[3];
        private final Matrix[] placeholderMatrix = new Matrix[3];
        private final int[] currentColor = new int[2];
        private float crossfadeAlpha = 1.0f;
        SparseArray<Paint> overridePaintByPosition = new SparseArray<>();
        private boolean aspectFill = true;
        private boolean aspectCenter = false;

        public void addCommand(Object obj, Paint paint) {
            this.commands.add(obj);
            this.paints.put(obj, new Paint(paint));
        }

        public static void updateLiteValues() {
            lite = LiteMode.isEnabled(32);
        }

        public void copyCommandFromPosition(int i9) {
            ArrayList<Object> arrayList = this.commands;
            arrayList.add(arrayList.get(i9));
        }

        @Override
        public void draw(Canvas canvas) {
            drawInternal(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        }

        public void drawInternal(Canvas canvas, boolean z10, int i9, long j10, float f10, float f11, float f12, float f13) {
            int i10;
            int i11;
            int i12 = this.currentColorKey;
            if (i12 >= 0) {
                setupGradient(i12, this.currentResourcesProvider, this.colorAlpha, z10);
            }
            float scale = getScale((int) f12, (int) f13);
            if (this.placeholderGradient[i9] != null) {
                float f14 = gradientWidth;
                if (f14 > 0.0f && lite) {
                    long j11 = 0;
                    long j12 = 64;
                    if (z10) {
                        long j13 = j10 - lastUpdateTime;
                        if (j13 <= 64) {
                            j12 = j13;
                        }
                        if (j12 > 0) {
                            lastUpdateTime = j10;
                            totalTranslation = aa.d.d((float) j12, f14, 1800.0f, totalTranslation);
                            while (true) {
                                float f15 = totalTranslation;
                                float f16 = gradientWidth;
                                if (f15 < f16 * 2.0f) {
                                    break;
                                }
                                totalTranslation = f15 - (f16 * 2.0f);
                            }
                        }
                    } else if (shiftRunnable == null || shiftDrawable.get() == this) {
                        long j14 = j10 - lastUpdateTime;
                        if (j14 <= 64) {
                            j12 = j14;
                        }
                        if (j12 >= 0) {
                            j11 = j12;
                        }
                        lastUpdateTime = j10;
                        totalTranslation = aa.d.d((float) j11, gradientWidth, 1800.0f, totalTranslation);
                        while (true) {
                            float f17 = totalTranslation;
                            float f18 = gradientWidth;
                            if (f17 < f18 / 2.0f) {
                                break;
                            }
                            totalTranslation = f17 - f18;
                        }
                        shiftDrawable = new WeakReference<>(this);
                        Runnable runnable = shiftRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        w1 w1Var = new w1(22);
                        shiftRunnable = w1Var;
                        AndroidUtilities.runOnUIThread(w1Var, ((int) (1000.0f / AndroidUtilities.screenRefreshRate)) - 1);
                    }
                    ImageReceiver imageReceiver = this.parentImageReceiver;
                    if (imageReceiver != null && !z10) {
                        int[] iArr = parentPosition;
                        imageReceiver.getParentPosition(iArr);
                        i10 = iArr[0];
                    } else {
                        i10 = 0;
                    }
                    if (z10) {
                        i11 = i9 + 1;
                    } else {
                        i11 = 0;
                    }
                    Matrix matrix = this.placeholderMatrix[i11];
                    if (matrix != null) {
                        matrix.reset();
                        if (z10) {
                            this.placeholderMatrix[i11].postTranslate(((-i10) + totalTranslation) - f10, 0.0f);
                        } else {
                            this.placeholderMatrix[i11].postTranslate(((-i10) + totalTranslation) - f10, 0.0f);
                        }
                        float f19 = 1.0f / scale;
                        this.placeholderMatrix[i11].postScale(f19, f19);
                        this.placeholderGradient[i11].setLocalMatrix(this.placeholderMatrix[i11]);
                        ImageReceiver imageReceiver2 = this.parentImageReceiver;
                        if (imageReceiver2 != null && !z10) {
                            imageReceiver2.invalidate();
                        }
                    }
                }
            }
            canvas.save();
            canvas.translate(f10, f11);
            if (!this.aspectFill || this.aspectCenter) {
                canvas.translate(e2.c.d(this.width, scale, f12, 2.0f), e2.c.d(this.height, scale, f13, 2.0f));
            }
            canvas.scale(scale, scale);
            int size = this.commands.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj = this.commands.get(i13);
                if (obj instanceof Matrix) {
                    canvas.save();
                    canvas.concat((Matrix) obj);
                } else if (obj == null) {
                    canvas.restore();
                } else {
                    Paint paint = this.overridePaintByPosition.get(i13);
                    if (paint == null) {
                        paint = this.overridePaint;
                    }
                    if (z10) {
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
                        canvas.drawLine(line.f19665x1, line.f19667y1, line.f19666x2, line.f19668y2, paint);
                    } else if (obj instanceof Circle) {
                        Circle circle = (Circle) obj;
                        canvas.drawCircle(circle.f19663x1, circle.f19664y1, circle.rad, paint);
                    } else if (obj instanceof Oval) {
                        canvas.drawOval(((Oval) obj).rect, paint);
                    } else if (obj instanceof RoundRect) {
                        RoundRect roundRect = (RoundRect) obj;
                        RectF rectF = roundRect.rect;
                        float f20 = roundRect.rx;
                        canvas.drawRoundRect(rectF, f20, f20, paint);
                    }
                    paint.setAlpha(alpha);
                }
            }
            canvas.restore();
        }

        @Override
        public int getIntrinsicHeight() {
            return this.width;
        }

        @Override
        public int getIntrinsicWidth() {
            return this.height;
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        public float getScale(int i9, int i10) {
            float f10 = i9 / this.width;
            float f11 = i10 / this.height;
            if (this.aspectFill) {
                return Math.max(f10, f11);
            }
            return Math.min(f10, f11);
        }

        public void overrideWidthAndHeight(int i9, int i10) {
            this.width = i9;
            this.height = i10;
        }

        @Override
        public void setAlpha(int i9) {
            this.crossfadeAlpha = i9 / 255.0f;
        }

        public void setAspectCenter(boolean z10) {
            this.aspectCenter = z10;
        }

        public void setAspectFill(boolean z10) {
            this.aspectFill = z10;
        }

        public void setColor(int i9) {
            this.overrideColor = Integer.valueOf(i9);
        }

        public void setColorKey(int i9) {
            this.currentColorKey = i9;
        }

        public void setPaint(Paint paint) {
            this.overridePaint = paint;
        }

        public void setParent(ImageReceiver imageReceiver) {
            this.parentImageReceiver = imageReceiver;
        }

        public void setupGradient(int i9, float f10, boolean z10) {
            setupGradient(i9, null, f10, z10);
        }

        public SvgDrawable clone() {
            SvgDrawable svgDrawable = new SvgDrawable();
            for (int i9 = 0; i9 < this.commands.size(); i9++) {
                svgDrawable.commands.add(this.commands.get(i9));
                Paint paint = this.paints.get(this.commands.get(i9));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    svgDrawable.paints.put(this.commands.get(i9), paint2);
                }
            }
            svgDrawable.width = this.width;
            svgDrawable.height = this.height;
            return svgDrawable;
        }

        public void setColorKey(int i9, org.telegram.ui.ActionBar.b6 b6Var) {
            this.currentColorKey = i9;
            this.currentResourcesProvider = b6Var;
        }

        public void setPaint(Paint paint, int i9) {
            this.overridePaintByPosition.put(i9, paint);
        }

        public void setupGradient(int i9, org.telegram.ui.ActionBar.b6 b6Var, float f10, boolean z10) {
            BitmapShader bitmapShader;
            Integer num = this.overrideColor;
            int v02 = num == null ? org.telegram.ui.ActionBar.f6.v0(i9, b6Var) : num.intValue();
            this.currentResourcesProvider = b6Var;
            int[] iArr = this.currentColor;
            if (iArr[z10 ? 1 : 0] != v02) {
                this.colorAlpha = f10;
                this.currentColorKey = i9;
                iArr[z10 ? 1 : 0] = v02;
                gradientWidth = AndroidUtilities.displaySize.x * 2;
                if (!lite) {
                    int k10 = i0.a.k(v02, 70);
                    if (z10) {
                        if (this.backgroundPaint == null) {
                            this.backgroundPaint = new Paint(1);
                        }
                        this.backgroundPaint.setShader(null);
                        this.backgroundPaint.setColor(k10);
                        return;
                    }
                    for (Paint paint : this.paints.values()) {
                        paint.setShader(null);
                        paint.setColor(k10);
                    }
                    return;
                }
                float dp = AndroidUtilities.dp(180.0f) / gradientWidth;
                int argb = Color.argb((int) ((Color.alpha(v02) / 2) * this.colorAlpha), Color.red(v02), Color.green(v02), Color.blue(v02));
                float f11 = (1.0f - dp) / 2.0f;
                LinearGradient[] linearGradientArr = this.placeholderGradient;
                float f12 = dp / 2.0f;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                linearGradientArr[z10 ? 1 : 0] = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f11 - f12, f11, f12 + f11, 1.0f}, tileMode);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    bitmapShader = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{argb, argb}, (float[]) null, tileMode);
                } else {
                    Bitmap[] bitmapArr = this.backgroundBitmap;
                    if (bitmapArr[z10 ? 1 : 0] == null) {
                        bitmapArr[z10 ? 1 : 0] = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                        this.backgroundCanvas[z10 ? 1 : 0] = new Canvas(this.backgroundBitmap[z10 ? 1 : 0]);
                    }
                    this.backgroundCanvas[z10 ? 1 : 0].drawColor(argb);
                    bitmapShader = new BitmapShader(this.backgroundBitmap[z10 ? 1 : 0], tileMode, tileMode);
                }
                this.placeholderMatrix[z10 ? 1 : 0] = new Matrix();
                this.placeholderGradient[z10 ? 1 : 0].setLocalMatrix(this.placeholderMatrix[z10 ? 1 : 0]);
                if (z10) {
                    if (this.backgroundPaint == null) {
                        this.backgroundPaint = new Paint(1);
                    }
                    if (i10 <= 22) {
                        this.backgroundPaint.setShader(bitmapShader);
                        return;
                    } else {
                        this.backgroundPaint.setShader(new ComposeShader(this.placeholderGradient[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                        return;
                    }
                }
                for (Paint paint2 : this.paints.values()) {
                    if (Build.VERSION.SDK_INT <= 22) {
                        paint2.setShader(bitmapShader);
                    } else {
                        paint2.setShader(new ComposeShader(this.placeholderGradient[z10 ? 1 : 0], bitmapShader, PorterDuff.Mode.ADD));
                    }
                }
            }
        }

        public void addCommand(Object obj) {
            this.commands.add(obj);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public interface SvgResult {
        Bitmap getBitmap();

        SvgDrawable getDrawable();

        List<lf.c> getGiftPatternPositions();
    }

    static {
        int i9 = 0;
        while (true) {
            double[] dArr = pow10;
            if (i9 < dArr.length) {
                dArr[i9] = Math.pow(10.0d, i9);
                i9++;
            } else {
                SPLIT_BOUNDARY = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            }
        }
    }

    private static float[] arcToBeziers(double d, double d9) {
        int ceil = (int) Math.ceil((Math.abs(d9) * 2.0d) / 3.141592653589793d);
        double d10 = d9 / ceil;
        double d11 = d10 / 2.0d;
        double sin = (Math.sin(d11) * 1.3333333333333333d) / (Math.cos(d11) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i9 = 0;
        int i10 = 0;
        while (i9 < ceil) {
            double d12 = (i9 * d10) + d;
            double cos = Math.cos(d12);
            double sin2 = Math.sin(d12);
            float[] fArr2 = fArr;
            fArr2[i10] = (float) (cos - (sin * sin2));
            fArr2[i10 + 1] = (float) ((cos * sin) + sin2);
            double d13 = d12 + d10;
            double cos2 = Math.cos(d13);
            double sin3 = Math.sin(d13);
            fArr2[i10 + 2] = (float) ((sin * sin3) + cos2);
            fArr2[i10 + 3] = (float) (sin3 - (sin * cos2));
            int i11 = i10 + 5;
            fArr2[i10 + 4] = (float) cos2;
            i10 += 6;
            fArr2[i11] = (float) sin3;
            i9++;
            fArr = fArr2;
            ceil = ceil;
        }
        return fArr;
    }

    private static double checkedArcCos(double d) {
        if (d < -1.0d) {
            return 3.141592653589793d;
        }
        if (d > 1.0d) {
            return 0.0d;
        }
        return Math.acos(d);
    }

    public static String decompress(byte[] bArr) {
        try {
            StringBuilder sb2 = new StringBuilder(bArr.length * 2);
            sb2.append('M');
            for (byte b10 : bArr) {
                int i9 = b10 & 255;
                if (i9 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i9 - 192));
                } else {
                    if (i9 >= 128) {
                        sb2.append(',');
                    } else if (i9 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e10) {
            FileLog.e(e10);
            return "";
        }
    }

    public static Path doPath(String str) {
        char c10;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float nextFloat;
        float nextFloat2;
        String str2 = str;
        if (ApplicationLoader.isAndroidTestEnvironment()) {
            return new Path();
        }
        int length = str2.length();
        ParserHelper parserHelper = new ParserHelper(str2, 0);
        parserHelper.skipWhitespace();
        Path path = new Path();
        char c11 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        while (true) {
            int i9 = parserHelper.pos;
            if (i9 < length) {
                char charAt = str2.charAt(i9);
                switch (charAt) {
                    case '+':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        if (c11 != 'm' && c11 != 'M') {
                            if (c11 == 'c' || c11 == 'C' || c11 == 'l' || c11 == 'L' || c11 == 's' || c11 == 'S' || c11 == 'h' || c11 == 'H' || c11 == 'v' || c11 == 'V' || c11 == 'q' || c11 == 'Q' || c11 == 'a' || c11 == 'A' || c11 == 't' || c11 == 'T') {
                                c10 = c11;
                                break;
                            }
                        } else {
                            char c12 = c11;
                            c11 = (char) (c11 - 1);
                            c10 = c12;
                            break;
                        }
                        break;
                    case ',':
                    case '/':
                    default:
                        parserHelper.advance();
                        c10 = charAt;
                        c11 = c10;
                        break;
                }
                boolean z11 = true;
                switch (c11) {
                    case 'A':
                    case 'a':
                        float nextFloat3 = parserHelper.nextFloat();
                        float nextFloat4 = parserHelper.nextFloat();
                        float f24 = f20;
                        float nextFloat5 = parserHelper.nextFloat();
                        if (((int) parserHelper.nextFloat()) == 1) {
                            f10 = f21;
                            z10 = true;
                        } else {
                            f10 = f21;
                            z10 = false;
                        }
                        if (((int) parserHelper.nextFloat()) != 1) {
                            z11 = false;
                        }
                        float nextFloat6 = parserHelper.nextFloat();
                        float nextFloat7 = parserHelper.nextFloat();
                        if (c11 == 'a') {
                            float f25 = nextFloat6 + f18;
                            nextFloat7 += f19;
                            f11 = f18;
                            f12 = f19;
                            f13 = f25;
                        } else {
                            f11 = f18;
                            f12 = f19;
                            f13 = nextFloat6;
                        }
                        float f26 = f10;
                        float f27 = nextFloat7;
                        drawArc(path, f11, f12, f13, f27, nextFloat3, nextFloat4, nextFloat5, z10, z11);
                        f18 = f13;
                        f19 = f27;
                        f21 = f26;
                        f20 = f24;
                        z11 = false;
                        break;
                    case 'C':
                    case 'c':
                        float nextFloat8 = parserHelper.nextFloat();
                        float nextFloat9 = parserHelper.nextFloat();
                        float nextFloat10 = parserHelper.nextFloat();
                        float nextFloat11 = parserHelper.nextFloat();
                        float nextFloat12 = parserHelper.nextFloat();
                        float nextFloat13 = parserHelper.nextFloat();
                        if (c11 == 'c') {
                            nextFloat8 += f18;
                            nextFloat10 += f18;
                            nextFloat12 += f18;
                            nextFloat9 += f19;
                            nextFloat11 += f19;
                            nextFloat13 += f19;
                        }
                        float f28 = nextFloat8;
                        float f29 = nextFloat9;
                        f14 = nextFloat10;
                        f15 = nextFloat11;
                        f16 = nextFloat12;
                        f17 = nextFloat13;
                        path.cubicTo(f28, f29, f14, f15, f16, f17);
                        f22 = f14;
                        f23 = f15;
                        f18 = f16;
                        f19 = f17;
                        break;
                    case 'H':
                    case 'h':
                        float nextFloat14 = parserHelper.nextFloat();
                        if (c11 == 'h') {
                            path.rLineTo(nextFloat14, 0.0f);
                            f18 += nextFloat14;
                        } else {
                            path.lineTo(nextFloat14, f19);
                            f18 = nextFloat14;
                        }
                        z11 = false;
                        break;
                    case 'L':
                    case 'l':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c11 == 'l') {
                            path.rLineTo(nextFloat, nextFloat2);
                            f18 += nextFloat;
                            f19 += nextFloat2;
                            z11 = false;
                            break;
                        } else {
                            path.lineTo(nextFloat, nextFloat2);
                            f18 = nextFloat;
                            f19 = nextFloat2;
                            z11 = false;
                        }
                    case 'M':
                    case 'm':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c11 == 'm') {
                            f20 += nextFloat;
                            f21 += nextFloat2;
                            path.rMoveTo(nextFloat, nextFloat2);
                            f18 += nextFloat;
                            f19 += nextFloat2;
                            z11 = false;
                            break;
                        } else {
                            path.moveTo(nextFloat, nextFloat2);
                            f18 = nextFloat;
                            f20 = f18;
                            f19 = nextFloat2;
                            f21 = f19;
                            z11 = false;
                        }
                    case 'Q':
                    case 'q':
                        float nextFloat15 = parserHelper.nextFloat();
                        float nextFloat16 = parserHelper.nextFloat();
                        float nextFloat17 = parserHelper.nextFloat();
                        float nextFloat18 = parserHelper.nextFloat();
                        if (c11 == 'q') {
                            nextFloat15 += f18;
                            nextFloat16 += f19;
                            nextFloat17 += f18;
                            nextFloat18 += f19;
                        }
                        f22 = nextFloat15;
                        f18 = nextFloat17;
                        f19 = nextFloat18;
                        path.quadTo(f22, nextFloat16, f18, f19);
                        f23 = nextFloat16;
                        break;
                    case 'S':
                    case 's':
                        float nextFloat19 = parserHelper.nextFloat();
                        float nextFloat20 = parserHelper.nextFloat();
                        float nextFloat21 = parserHelper.nextFloat();
                        float nextFloat22 = parserHelper.nextFloat();
                        if (c11 == 's') {
                            nextFloat19 += f18;
                            nextFloat21 += f18;
                            nextFloat20 += f19;
                            nextFloat22 += f19;
                        }
                        f16 = nextFloat21;
                        float f30 = (f18 * 2.0f) - f22;
                        float f31 = (f19 * 2.0f) - f23;
                        f14 = nextFloat19;
                        f15 = nextFloat20;
                        f17 = nextFloat22;
                        path.cubicTo(f30, f31, f14, f15, f16, f17);
                        f22 = f14;
                        f23 = f15;
                        f18 = f16;
                        f19 = f17;
                        break;
                    case 'T':
                    case 't':
                        f16 = parserHelper.nextFloat();
                        f17 = parserHelper.nextFloat();
                        if (c11 == 't') {
                            f16 += f18;
                            f17 += f19;
                        }
                        f22 = (f18 * 2.0f) - f22;
                        float f32 = (f19 * 2.0f) - f23;
                        path.quadTo(f22, f32, f16, f17);
                        f23 = f32;
                        f18 = f16;
                        f19 = f17;
                        break;
                    case 'V':
                    case 'v':
                        float nextFloat23 = parserHelper.nextFloat();
                        if (c11 == 'v') {
                            path.rLineTo(0.0f, nextFloat23);
                            f19 += nextFloat23;
                        } else {
                            path.lineTo(f18, nextFloat23);
                            f19 = nextFloat23;
                        }
                        z11 = false;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f20, f21);
                        f18 = f20;
                        f22 = f18;
                        f19 = f21;
                        f23 = f19;
                        break;
                    default:
                        z11 = false;
                        break;
                }
                if (!z11) {
                    f22 = f18;
                    f23 = f19;
                }
                parserHelper.skipWhitespace();
                str2 = str;
                c11 = c10;
            } else {
                return path;
            }
        }
    }

    private static void drawArc(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        double d;
        double d9;
        if (f10 != f12 || f11 != f13) {
            if (f14 != 0.0f && f15 != 0.0f) {
                float abs = Math.abs(f14);
                float abs2 = Math.abs(f15);
                double radians = Math.toRadians(f16 % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d10 = (f10 - f12) / 2.0d;
                double d11 = (f11 - f13) / 2.0d;
                double d12 = (sin * d11) + (cos * d10);
                double d13 = (d11 * cos) + ((-sin) * d10);
                double d14 = abs * abs;
                double d15 = abs2 * abs2;
                double d16 = d12 * d12;
                double d17 = d13 * d13;
                double d18 = (d17 / d15) + (d16 / d14);
                if (d18 > 0.99999d) {
                    double sqrt = Math.sqrt(d18) * 1.00001d;
                    abs = (float) (abs * sqrt);
                    abs2 = (float) (sqrt * abs2);
                    d14 = abs * abs;
                    d15 = abs2 * abs2;
                }
                double d19 = 1.0d;
                if (z10 == z11) {
                    d = -1.0d;
                } else {
                    d = 1.0d;
                }
                double d20 = d14 * d15;
                double d21 = d14 * d17;
                double d22 = d15 * d16;
                double d23 = ((d20 - d21) - d22) / (d21 + d22);
                if (d23 < 0.0d) {
                    d23 = 0.0d;
                }
                double sqrt2 = Math.sqrt(d23) * d;
                double d24 = abs;
                double d25 = d24 * d13;
                double d26 = abs2;
                double d27 = (d25 / d26) * sqrt2;
                double d28 = sqrt2 * (-((d26 * d12) / d24));
                double d29 = ((cos * d27) - (sin * d28)) + ((f10 + f12) / 2.0d);
                double d30 = (cos * d28) + (sin * d27) + ((f11 + f13) / 2.0d);
                double d31 = (d12 - d27) / d24;
                double d32 = (d13 - d28) / d26;
                double d33 = ((-d12) - d27) / d24;
                double d34 = ((-d13) - d28) / d26;
                double d35 = (d32 * d32) + (d31 * d31);
                double sqrt3 = Math.sqrt(d35);
                if (d32 < 0.0d) {
                    d9 = -1.0d;
                } else {
                    d9 = 1.0d;
                }
                double acos = Math.acos(d31 / sqrt3) * d9;
                double sqrt4 = Math.sqrt(((d34 * d34) + (d33 * d33)) * d35);
                double d36 = (d32 * d34) + (d31 * d33);
                if ((d31 * d34) - (d32 * d33) < 0.0d) {
                    d19 = -1.0d;
                }
                double checkedArcCos = d19 * checkedArcCos(d36 / sqrt4);
                int i9 = (checkedArcCos > 0.0d ? 1 : (checkedArcCos == 0.0d ? 0 : -1));
                if (i9 == 0) {
                    path.lineTo(f12, f13);
                    return;
                }
                if (!z11 && i9 > 0) {
                    checkedArcCos -= 6.283185307179586d;
                } else if (z11 && checkedArcCos < 0.0d) {
                    checkedArcCos += 6.283185307179586d;
                }
                float[] arcToBeziers = arcToBeziers(acos % 6.283185307179586d, checkedArcCos % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(abs, abs2);
                matrix.postRotate(f16);
                matrix.postTranslate((float) d29, (float) d30);
                matrix.mapPoints(arcToBeziers);
                arcToBeziers[arcToBeziers.length - 2] = f12;
                arcToBeziers[arcToBeziers.length - 1] = f13;
                for (int i10 = 0; i10 < arcToBeziers.length; i10 += 6) {
                    path.cubicTo(arcToBeziers[i10], arcToBeziers[i10 + 1], arcToBeziers[i10 + 2], arcToBeziers[i10 + 3], arcToBeziers[i10 + 4], arcToBeziers[i10 + 5]);
                }
                return;
            }
            path.lineTo(f12, f13);
        }
    }

    public static Bitmap getBitmap(int i9, int i10, int i11, int i12) {
        return getBitmap(i9, i10, i11, i12, 1.0f);
    }

    public static Bitmap getBitmapByPathOnly(String str, int i9, int i10, int i11, int i12) {
        try {
            Path doPath = doPath(str);
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(i11 / i9, i12 / i10);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(doPath, paint);
            return createBitmap;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Integer getColorByName(String str) {
        char c10;
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -734239628:
                if (lowerCase.equals("yellow")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 112785:
                if (lowerCase.equals("red")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3027034:
                if (lowerCase.equals("blue")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3068707:
                if (lowerCase.equals("cyan")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3181155:
                if (lowerCase.equals("gray")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 93818879:
                if (lowerCase.equals("black")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 98619139:
                if (lowerCase.equals("green")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 113101865:
                if (lowerCase.equals("white")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 828922025:
                if (lowerCase.equals("magenta")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
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

    public static SvgDrawable getDrawable(String str) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, (Integer) null, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getDrawable();
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(String str, int i9, int i10) {
        try {
            Path doPath = doPath(str);
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(doPath);
            svgDrawable.paints.put(doPath, new Paint(1));
            svgDrawable.width = i9;
            svgDrawable.height = i10;
            return svgDrawable;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Float getFloatAttr(String str, Attributes attributes) {
        return getFloatAttr(str, attributes, null);
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

    public static NumberParse getNumberParseAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i9 = 0; i9 < length; i9++) {
            if (attributes.getLocalName(i9).equals(str)) {
                return parseNumbers(attributes.getValue(i9));
            }
        }
        return null;
    }

    public static String getStringAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i9 = 0; i9 < length; i9++) {
            if (attributes.getLocalName(i9).equals(str)) {
                return attributes.getValue(i9);
            }
        }
        return null;
    }

    public static SvgResult getSvgBitmap(File file, int i9, int i10, boolean z10) {
        Integer num;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            if (z10) {
                num = -1;
            } else {
                num = null;
            }
            SVGHandler sVGHandler = new SVGHandler(i9, i10, num, false, 1.0f);
            if (!z10) {
                sVGHandler.alphaOnly = true;
            }
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(fileInputStream));
            fileInputStream.close();
            return sVGHandler;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    private static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        boolean z10 = false;
        for (int i10 = 1; i10 < length; i10++) {
            if (z10) {
                z10 = false;
            } else {
                char charAt = str.charAt(i10);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt == '-' && str.charAt(i10 - 1) == 'e') {
                            break;
                        } else {
                            String substring = str.substring(i9, i10);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i9 = i10;
                                    break;
                                } else {
                                    i9 = i10 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i9++;
                                continue;
                            }
                        }
                    case ')':
                    case 'A':
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
                        String substring2 = str.substring(i9, i10);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new NumberParse(arrayList, i10);
                }
            }
        }
        String substring3 = str.substring(i9);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
            i9 = str.length();
        }
        return new NumberParse(arrayList, i9);
    }

    public static Matrix parseTransform(String str) {
        Matrix matrix = new Matrix();
        for (String str2 : splitSvgTransforms(str)) {
            Matrix parseTransformCommand = parseTransformCommand(str2);
            if (parseTransformCommand != null) {
                matrix.preConcat(parseTransformCommand);
            }
        }
        return matrix;
    }

    private static Matrix parseTransformCommand(String str) {
        float f10 = 0.0f;
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
                if (parseNumbers2.numbers.size() > 1) {
                    f10 = ((Float) parseNumbers2.numbers.get(1)).floatValue();
                }
                Matrix matrix2 = new Matrix();
                matrix2.postTranslate(floatValue, f10);
                return matrix2;
            }
            return null;
        } else if (str.startsWith("scale(")) {
            NumberParse parseNumbers3 = parseNumbers(str.substring(6));
            if (parseNumbers3.numbers.size() > 0) {
                float floatValue2 = ((Float) parseNumbers3.numbers.get(0)).floatValue();
                if (parseNumbers3.numbers.size() > 1) {
                    f10 = ((Float) parseNumbers3.numbers.get(1)).floatValue();
                }
                Matrix matrix3 = new Matrix();
                matrix3.postScale(floatValue2, f10);
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
                Matrix matrix6 = new Matrix();
                float floatValue5 = ((Float) parseNumbers6.numbers.get(0)).floatValue();
                if (parseNumbers6.numbers.size() > 2) {
                    matrix6.postRotate(floatValue5, ((Float) parseNumbers6.numbers.get(1)).floatValue(), ((Float) parseNumbers6.numbers.get(2)).floatValue());
                    return matrix6;
                }
                matrix6.postRotate(floatValue5);
                return matrix6;
            }
            return null;
        } else {
            return null;
        }
    }

    private static List<String> splitSvgTransforms(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] split = SPLIT_BOUNDARY.split(trim);
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            String trim2 = str2.trim();
            if (!trim2.isEmpty()) {
                arrayList.add(trim2);
            }
        }
        return arrayList;
    }

    public static class SVGHandler extends DefaultHandler implements SvgResult {
        private boolean alphaOnly;
        private Bitmap bitmap;
        private boolean boundsMode;
        private Canvas canvas;
        private int desiredHeight;
        private int desiredWidth;
        private SvgDrawable drawable;
        private float globalScale;
        private HashMap<String, StyleSet> globalStyles;
        private boolean insideGiftRect;
        private int insideGiftRectDepth;
        private List<lf.c> insideGiftRectPositions;
        private Paint paint;
        private Integer paintColor;
        boolean pushed;
        private RectF rect;
        private RectF rectTmp;
        private float scale;
        private ScaleMode scaleMode;
        private StringBuilder styles;

        private void doColor(Properties properties, Integer num, boolean z10) {
            String str;
            Integer num2 = this.paintColor;
            if (num2 != null) {
                this.paint.setColor(num2.intValue());
            } else {
                this.paint.setColor((num.intValue() & 16777215) | (-16777216));
            }
            Float f10 = properties.getFloat("opacity");
            if (f10 == null) {
                if (z10) {
                    str = "fill-opacity";
                } else {
                    str = "stroke-opacity";
                }
                f10 = properties.getFloat(str);
            }
            if (f10 == null) {
                this.paint.setAlpha(255);
            } else {
                this.paint.setAlpha((int) (f10.floatValue() * 255.0f));
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
            } else if (properties.getString("fill") != null || properties.getString("stroke") != null) {
                return false;
            } else {
                this.paint.setStyle(Paint.Style.FILL);
                Integer num = this.paintColor;
                if (num != null) {
                    this.paint.setColor(num.intValue());
                } else {
                    this.paint.setColor(-16777216);
                }
                return true;
            }
        }

        private boolean doStroke(Properties properties) {
            Integer hex;
            if ("none".equals(properties.getString("display")) || (hex = properties.getHex("stroke")) == null) {
                return false;
            }
            doColor(properties, hex, false);
            Float f10 = properties.getFloat("stroke-width");
            if (f10 != null) {
                this.paint.setStrokeWidth(f10.floatValue());
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

        private void pushTransform(Attributes attributes) {
            boolean z10;
            String stringAttr = SvgHelper.getStringAttr("transform", attributes);
            if (stringAttr != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.pushed = z10;
            if (z10) {
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

        @Override
        public void characters(char[] cArr, int i9, int i10) {
            StringBuilder sb2 = this.styles;
            if (sb2 != null) {
                sb2.append(cArr, i9, i10);
            }
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int indexOf;
            if (this.insideGiftRect) {
                int i9 = this.insideGiftRectDepth - 1;
                this.insideGiftRectDepth = i9;
                if (i9 == 0) {
                    this.insideGiftRect = false;
                    return;
                }
                return;
            }
            str2.getClass();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 103:
                    if (str2.equals("g")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3079438:
                    if (str2.equals("defs")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 109780401:
                    if (str2.equals("style")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 917656469:
                    if (str2.equals("clipPath")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                case 3:
                    this.boundsMode = false;
                    return;
                case 2:
                    StringBuilder sb2 = this.styles;
                    if (sb2 != null) {
                        String[] split = sb2.toString().split("\\}");
                        for (int i10 = 0; i10 < split.length; i10++) {
                            String replace = split[i10].trim().replace("\t", "").replace("\n", "");
                            split[i10] = replace;
                            if (replace.length() != 0 && split[i10].charAt(0) == '.' && (indexOf = split[i10].indexOf(123)) >= 0) {
                                this.globalStyles.put(split[i10].substring(1, indexOf).trim(), new StyleSet(split[i10].substring(indexOf + 1)));
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

        @Override
        public Bitmap getBitmap() {
            return this.bitmap;
        }

        @Override
        public SvgDrawable getDrawable() {
            return this.drawable;
        }

        @Override
        public List<lf.c> getGiftPatternPositions() {
            return this.insideGiftRectPositions;
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String stringAttr;
            Bitmap.Config config;
            int i9;
            Float valueOf = Float.valueOf(0.0f);
            lf.c cVar = null;
            if ("g".equals(str3) && !this.insideGiftRect) {
                if ("GiftPatterns".equals(attributes.getValue("id"))) {
                    this.insideGiftRect = true;
                    this.insideGiftRectDepth = 1;
                    return;
                }
            } else if (this.insideGiftRect) {
                this.insideGiftRectDepth++;
                if ("rect".equals(str3)) {
                    float f10 = this.scale;
                    try {
                        float parseFloat = Float.parseFloat(attributes.getValue("x"));
                        float parseFloat2 = Float.parseFloat(attributes.getValue("y"));
                        RectF rectF = new RectF(parseFloat, parseFloat2, Float.parseFloat(attributes.getValue("width")) + parseFloat, Float.parseFloat(attributes.getValue("height")) + parseFloat2);
                        Matrix parseTransform = SvgHelper.parseTransform(attributes.getValue("transform"));
                        parseTransform.postScale(f10, f10);
                        cVar = new lf.c(rectF, parseTransform);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    if (cVar != null) {
                        if (this.insideGiftRectPositions == null) {
                            this.insideGiftRectPositions = new ArrayList();
                        }
                        this.insideGiftRectPositions.add(cVar);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.boundsMode || str2.equals("style")) {
                str2.getClass();
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case -1656480802:
                        if (str2.equals("ellipse")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1360216880:
                        if (str2.equals("circle")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -397519558:
                        if (str2.equals("polygon")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 103:
                        if (str2.equals("g")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 114276:
                        if (str2.equals("svg")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3079438:
                        if (str2.equals("defs")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 3321844:
                        if (str2.equals("line")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 3433509:
                        if (str2.equals("path")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 3496420:
                        if (str2.equals("rect")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 109780401:
                        if (str2.equals("style")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 561938880:
                        if (str2.equals("polyline")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 917656469:
                        if (str2.equals("clipPath")) {
                            c10 = 11;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        Float floatAttr = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr2 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr3 = SvgHelper.getFloatAttr("rx", attributes);
                        Float floatAttr4 = SvgHelper.getFloatAttr("ry", attributes);
                        if (floatAttr != null && floatAttr2 != null && floatAttr3 != null && floatAttr4 != null) {
                            pushTransform(attributes);
                            Properties properties = new Properties(attributes, this.globalStyles);
                            this.rect.set(floatAttr.floatValue() - floatAttr3.floatValue(), floatAttr2.floatValue() - floatAttr4.floatValue(), floatAttr3.floatValue() + floatAttr.floatValue(), floatAttr4.floatValue() + floatAttr2.floatValue());
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
                        }
                        return;
                    case 1:
                        Float floatAttr5 = SvgHelper.getFloatAttr("cx", attributes);
                        Float floatAttr6 = SvgHelper.getFloatAttr("cy", attributes);
                        Float floatAttr7 = SvgHelper.getFloatAttr("r", attributes);
                        if (floatAttr5 != null && floatAttr6 != null && floatAttr7 != null) {
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
                        }
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
                                for (int i10 = 2; i10 < arrayList.size(); i10 += 2) {
                                    path.lineTo(((Float) arrayList.get(i10)).floatValue(), ((Float) arrayList.get(i10 + 1)).floatValue());
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
                            Float valueOf2 = Float.valueOf(Float.parseFloat(split[2]));
                            floatAttr9 = Float.valueOf(Float.parseFloat(split[3]));
                            floatAttr8 = valueOf2;
                        }
                        if (floatAttr8 == null || floatAttr9 == null) {
                            floatAttr8 = Float.valueOf(this.desiredWidth);
                            floatAttr9 = Float.valueOf(this.desiredHeight);
                        }
                        int ceil = (int) Math.ceil(floatAttr8.floatValue());
                        int ceil2 = (int) Math.ceil(floatAttr9.floatValue());
                        if (ceil != 0 && ceil2 != 0) {
                            int i11 = this.desiredWidth;
                            if (i11 != 0 && (i9 = this.desiredHeight) != 0) {
                                if (this.scaleMode == ScaleMode.ByWidth) {
                                    this.scale = i11 / ceil;
                                } else {
                                    this.scale = Math.min(i11 / ceil, i9 / ceil2);
                                }
                                float f11 = this.scale;
                                ceil = (int) (ceil * f11);
                                ceil2 = (int) (ceil2 * f11);
                            }
                        } else {
                            ceil = this.desiredWidth;
                            ceil2 = this.desiredHeight;
                        }
                        SvgDrawable svgDrawable7 = this.drawable;
                        if (svgDrawable7 == null) {
                            if (this.alphaOnly) {
                                config = Bitmap.Config.ALPHA_8;
                            } else {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, config);
                            this.bitmap = createBitmap;
                            createBitmap.eraseColor(0);
                            Canvas canvas = new Canvas(this.bitmap);
                            this.canvas = canvas;
                            float f12 = this.scale;
                            if (f12 != 0.0f) {
                                float f13 = this.globalScale;
                                canvas.scale(f13 * f12, f13 * f12);
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
                            floatAttr14 = valueOf;
                        }
                        Float floatAttr15 = SvgHelper.getFloatAttr("y", attributes);
                        if (floatAttr15 != null) {
                            valueOf = floatAttr15;
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
                                    svgDrawable11.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable11.addCommand(new RectF(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue(), this.paint);
                            }
                        }
                        if (doStroke(properties5)) {
                            SvgDrawable svgDrawable12 = this.drawable;
                            if (svgDrawable12 != null) {
                                if (floatAttr18 != null) {
                                    svgDrawable12.addCommand(new RoundRect(new RectF(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue()), floatAttr18.floatValue()), this.paint);
                                } else {
                                    svgDrawable12.addCommand(new RectF(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue()), this.paint);
                                }
                            } else if (floatAttr18 != null) {
                                this.rectTmp.set(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue());
                                this.canvas.drawRoundRect(this.rectTmp, floatAttr18.floatValue(), floatAttr18.floatValue(), this.paint);
                            } else {
                                this.canvas.drawRect(floatAttr14.floatValue(), valueOf.floatValue(), floatAttr16.floatValue() + floatAttr14.floatValue(), floatAttr17.floatValue() + valueOf.floatValue(), this.paint);
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

        private SVGHandler(int i9, int i10, Integer num, boolean z10, float f10) {
            this(i9, i10, num, z10, f10, ScaleMode.Default);
        }

        private SVGHandler(int i9, int i10, Integer num, boolean z10, float f10, ScaleMode scaleMode) {
            this.scale = 1.0f;
            this.paint = new Paint(1);
            this.rect = new RectF();
            this.rectTmp = new RectF();
            this.globalScale = 1.0f;
            this.pushed = false;
            this.globalStyles = new HashMap<>();
            this.insideGiftRect = false;
            this.insideGiftRectDepth = 0;
            this.globalScale = f10;
            this.desiredWidth = i9;
            this.desiredHeight = i10;
            this.paintColor = num;
            this.scaleMode = scaleMode;
            if (z10) {
                this.drawable = new SvgDrawable();
            }
        }

        @Override
        public void endDocument() {
        }

        @Override
        public void startDocument() {
        }
    }

    public static Bitmap getBitmap(int i9, int i10, int i11, int i12, float f10) {
        return getBitmap(i9, i10, i11, i12, f10, ScaleMode.Default);
    }

    public static Float getFloatAttr(String str, Attributes attributes, Float f10) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return f10;
        }
        if (stringAttr.endsWith("px")) {
            stringAttr = e2.c.m(stringAttr, 2, 0);
        } else if (stringAttr.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(stringAttr));
    }

    public static Bitmap getBitmap(int i9, int i10, int i11, int i12, float f10, ScaleMode scaleMode) {
        try {
            InputStream openRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i9);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i10, i11, Integer.valueOf(i12), false, f10, scaleMode);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(openRawResource));
            Bitmap bitmap = sVGHandler.getBitmap();
            if (openRawResource != null) {
                openRawResource.close();
            }
            return bitmap;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(Path path, int i9, int i10) {
        try {
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(path);
            svgDrawable.paints.put(path, new Paint(1));
            svgDrawable.width = i9;
            svgDrawable.height = i10;
            return svgDrawable;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static SvgDrawable getDrawable(int i9, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, num, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(ApplicationLoader.applicationContext.getResources().openRawResource(i9)));
            return sVGHandler.getDrawable();
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream, int i9, int i10, boolean z10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i9, i10, z10 ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(inputStream));
            return sVGHandler.getBitmap();
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Bitmap getBitmap(File file, int i9, int i10, boolean z10) {
        return getBitmap(file, i9, i10, z10, ScaleMode.Default);
    }

    public static Bitmap getBitmap(File file, int i9, int i10, boolean z10, ScaleMode scaleMode) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i9, i10, z10 ? -1 : null, false, 1.0f, scaleMode);
            if (!z10) {
                sVGHandler.alphaOnly = true;
            }
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(fileInputStream));
            Bitmap bitmap = sVGHandler.getBitmap();
            fileInputStream.close();
            return bitmap;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    public static Bitmap getBitmap(String str, int i9, int i10, boolean z10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i9, i10, z10 ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getBitmap();
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }
}
