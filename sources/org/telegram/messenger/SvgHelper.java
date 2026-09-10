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
        float f14659x1;
        float f14660y1;

        public Circle(float f7, float f10, float f11) {
            this.f14659x1 = f7;
            this.f14660y1 = f10;
            this.rad = f11;
        }
    }

    public static class Line {
        float f14661x1;
        float f14662x2;
        float f14663y1;
        float f14664y2;

        public Line(float f7, float f10, float f11, float f12) {
            this.f14661x1 = f7;
            this.f14663y1 = f10;
            this.f14662x2 = f11;
            this.f14664y2 = f12;
        }
    }

    public static class NumberParse {
        private int nextCmd;
        private ArrayList<Float> numbers;

        public NumberParse(ArrayList<Float> arrayList, int i10) {
            this.numbers = arrayList;
            this.nextCmd = i10;
        }

        public int getNextCmd() {
            return this.nextCmd;
        }

        public float getNumber(int i10) {
            return this.numbers.get(i10).floatValue();
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
        private int f14665n;
        public int pos;
        private CharSequence f14666s;

        public ParserHelper(CharSequence charSequence, int i10) {
            this.f14666s = charSequence;
            this.pos = i10;
            this.f14665n = charSequence.length();
            this.current = charSequence.charAt(i10);
        }

        private char read() {
            int i10 = this.pos;
            int i11 = this.f14665n;
            if (i10 < i11) {
                this.pos = i10 + 1;
            }
            int i12 = this.pos;
            if (i12 == i11) {
                return (char) 0;
            }
            return this.f14666s.charAt(i12);
        }

        private void reportUnexpectedCharacterError(char c10) {
            throw new RuntimeException("Unexpected char '" + c10 + "'.");
        }

        public void advance() {
            this.current = read();
        }

        public float buildFloat(int i10, int i11) {
            double d;
            if (i11 >= -125 && i10 != 0) {
                if (i11 >= 128) {
                    if (i10 > 0) {
                        return Float.POSITIVE_INFINITY;
                    }
                    return Float.NEGATIVE_INFINITY;
                } else if (i11 == 0) {
                    return i10;
                } else {
                    if (i10 >= 67108864) {
                        i10++;
                    }
                    double d10 = i10;
                    double[] dArr = SvgHelper.pow10;
                    if (i11 > 0) {
                        d = d10 * dArr[i11];
                    } else {
                        d = d10 / dArr[-i11];
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
                int i10 = this.pos;
                if (i10 < this.f14665n) {
                    char charAt = this.f14666s.charAt(i10);
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
                int i10 = this.pos;
                if (i10 < this.f14665n && Character.isWhitespace(this.f14666s.charAt(i10))) {
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
                for (int i10 = 0; i10 < size; i10++) {
                    str2 = this.styles.get(i10).getStyle(str);
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

        public Float getFloat(String str, float f7) {
            Float f10 = getFloat(str);
            return f10 == null ? Float.valueOf(f7) : f10;
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

        public RoundRect(RectF rectF, float f7) {
            this.rect = rectF;
            this.rx = f7;
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
        private org.telegram.ui.ActionBar.f6 currentResourcesProvider;
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

        public void copyCommandFromPosition(int i10) {
            ArrayList<Object> arrayList = this.commands;
            arrayList.add(arrayList.get(i10));
        }

        @Override
        public void draw(Canvas canvas) {
            drawInternal(canvas, false, 0, System.currentTimeMillis(), getBounds().left, getBounds().top, getBounds().width(), getBounds().height());
        }

        public void drawInternal(Canvas canvas, boolean z10, int i10, long j3, float f7, float f10, float f11, float f12) {
            int i11;
            int i12;
            int i13 = this.currentColorKey;
            if (i13 >= 0) {
                setupGradient(i13, this.currentResourcesProvider, this.colorAlpha, z10);
            }
            float scale = getScale((int) f11, (int) f12);
            if (this.placeholderGradient[i10] != null) {
                float f13 = gradientWidth;
                if (f13 > 0.0f && lite) {
                    long j10 = 0;
                    long j11 = 64;
                    if (z10) {
                        long j12 = j3 - lastUpdateTime;
                        if (j12 <= 64) {
                            j11 = j12;
                        }
                        if (j11 > 0) {
                            lastUpdateTime = j3;
                            totalTranslation = a4.a.A((float) j11, f13, 1800.0f, totalTranslation);
                            while (true) {
                                float f14 = totalTranslation;
                                float f15 = gradientWidth;
                                if (f14 < f15 * 2.0f) {
                                    break;
                                }
                                totalTranslation = f14 - (f15 * 2.0f);
                            }
                        }
                    } else if (shiftRunnable == null || shiftDrawable.get() == this) {
                        long j13 = j3 - lastUpdateTime;
                        if (j13 <= 64) {
                            j11 = j13;
                        }
                        if (j11 >= 0) {
                            j10 = j11;
                        }
                        lastUpdateTime = j3;
                        totalTranslation = a4.a.A((float) j10, gradientWidth, 1800.0f, totalTranslation);
                        while (true) {
                            float f16 = totalTranslation;
                            float f17 = gradientWidth;
                            if (f16 < f17 / 2.0f) {
                                break;
                            }
                            totalTranslation = f16 - f17;
                        }
                        shiftDrawable = new WeakReference<>(this);
                        Runnable runnable = shiftRunnable;
                        if (runnable != null) {
                            AndroidUtilities.cancelRunOnUIThread(runnable);
                        }
                        y1 y1Var = new y1(22);
                        shiftRunnable = y1Var;
                        AndroidUtilities.runOnUIThread(y1Var, ((int) (1000.0f / AndroidUtilities.screenRefreshRate)) - 1);
                    }
                    ImageReceiver imageReceiver = this.parentImageReceiver;
                    if (imageReceiver != null && !z10) {
                        int[] iArr = parentPosition;
                        imageReceiver.getParentPosition(iArr);
                        i11 = iArr[0];
                    } else {
                        i11 = 0;
                    }
                    if (z10) {
                        i12 = i10 + 1;
                    } else {
                        i12 = 0;
                    }
                    Matrix matrix = this.placeholderMatrix[i12];
                    if (matrix != null) {
                        matrix.reset();
                        if (z10) {
                            this.placeholderMatrix[i12].postTranslate(((-i11) + totalTranslation) - f7, 0.0f);
                        } else {
                            this.placeholderMatrix[i12].postTranslate(((-i11) + totalTranslation) - f7, 0.0f);
                        }
                        float f18 = 1.0f / scale;
                        this.placeholderMatrix[i12].postScale(f18, f18);
                        this.placeholderGradient[i12].setLocalMatrix(this.placeholderMatrix[i12]);
                        ImageReceiver imageReceiver2 = this.parentImageReceiver;
                        if (imageReceiver2 != null && !z10) {
                            imageReceiver2.invalidate();
                        }
                    }
                }
            }
            canvas.save();
            canvas.translate(f7, f10);
            if (!this.aspectFill || this.aspectCenter) {
                canvas.translate(com.google.android.gms.internal.vision.e2.v(this.width, scale, f11, 2.0f), com.google.android.gms.internal.vision.e2.v(this.height, scale, f12, 2.0f));
            }
            canvas.scale(scale, scale);
            int size = this.commands.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = this.commands.get(i14);
                if (obj instanceof Matrix) {
                    canvas.save();
                    canvas.concat((Matrix) obj);
                } else if (obj == null) {
                    canvas.restore();
                } else {
                    Paint paint = this.overridePaintByPosition.get(i14);
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
                        canvas.drawLine(line.f14661x1, line.f14663y1, line.f14662x2, line.f14664y2, paint);
                    } else if (obj instanceof Circle) {
                        Circle circle = (Circle) obj;
                        canvas.drawCircle(circle.f14659x1, circle.f14660y1, circle.rad, paint);
                    } else if (obj instanceof Oval) {
                        canvas.drawOval(((Oval) obj).rect, paint);
                    } else if (obj instanceof RoundRect) {
                        RoundRect roundRect = (RoundRect) obj;
                        RectF rectF = roundRect.rect;
                        float f19 = roundRect.rx;
                        canvas.drawRoundRect(rectF, f19, f19, paint);
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

        public float getScale(int i10, int i11) {
            float f7 = i10 / this.width;
            float f10 = i11 / this.height;
            if (this.aspectFill) {
                return Math.max(f7, f10);
            }
            return Math.min(f7, f10);
        }

        public void overrideWidthAndHeight(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        @Override
        public void setAlpha(int i10) {
            this.crossfadeAlpha = i10 / 255.0f;
        }

        public void setAspectCenter(boolean z10) {
            this.aspectCenter = z10;
        }

        public void setAspectFill(boolean z10) {
            this.aspectFill = z10;
        }

        public void setColor(int i10) {
            this.overrideColor = Integer.valueOf(i10);
        }

        public void setColorKey(int i10) {
            this.currentColorKey = i10;
        }

        public void setPaint(Paint paint) {
            this.overridePaint = paint;
        }

        public void setParent(ImageReceiver imageReceiver) {
            this.parentImageReceiver = imageReceiver;
        }

        public void setupGradient(int i10, float f7, boolean z10) {
            setupGradient(i10, null, f7, z10);
        }

        public SvgDrawable clone() {
            SvgDrawable svgDrawable = new SvgDrawable();
            for (int i10 = 0; i10 < this.commands.size(); i10++) {
                svgDrawable.commands.add(this.commands.get(i10));
                Paint paint = this.paints.get(this.commands.get(i10));
                if (paint != null) {
                    Paint paint2 = new Paint();
                    paint2.setColor(paint.getColor());
                    paint2.setStrokeCap(paint.getStrokeCap());
                    paint2.setStrokeJoin(paint.getStrokeJoin());
                    paint2.setStrokeWidth(paint.getStrokeWidth());
                    paint2.setStyle(paint.getStyle());
                    svgDrawable.paints.put(this.commands.get(i10), paint2);
                }
            }
            svgDrawable.width = this.width;
            svgDrawable.height = this.height;
            return svgDrawable;
        }

        public void setColorKey(int i10, org.telegram.ui.ActionBar.f6 f6Var) {
            this.currentColorKey = i10;
            this.currentResourcesProvider = f6Var;
        }

        public void setPaint(Paint paint, int i10) {
            this.overridePaintByPosition.put(i10, paint);
        }

        public void setupGradient(int i10, org.telegram.ui.ActionBar.f6 f6Var, float f7, boolean z10) {
            BitmapShader bitmapShader;
            Integer num = this.overrideColor;
            int v02 = num == null ? org.telegram.ui.ActionBar.j6.v0(i10, f6Var) : num.intValue();
            this.currentResourcesProvider = f6Var;
            int[] iArr = this.currentColor;
            if (iArr[z10 ? 1 : 0] != v02) {
                this.colorAlpha = f7;
                this.currentColorKey = i10;
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
                float f10 = (1.0f - dp) / 2.0f;
                LinearGradient[] linearGradientArr = this.placeholderGradient;
                float f11 = dp / 2.0f;
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                linearGradientArr[z10 ? 1 : 0] = new LinearGradient(0.0f, 0.0f, gradientWidth, 0.0f, new int[]{0, 0, argb, 0, 0}, new float[]{0.0f, f10 - f11, f10, f11 + f10, 1.0f}, tileMode);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
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
                    if (i11 <= 22) {
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

        List<cg.c> getGiftPatternPositions();
    }

    static {
        int i10 = 0;
        while (true) {
            double[] dArr = pow10;
            if (i10 < dArr.length) {
                dArr[i10] = Math.pow(10.0d, i10);
                i10++;
            } else {
                SPLIT_BOUNDARY = Pattern.compile("(?<=\\))\\s*(?=[A-Za-z])");
                return;
            }
        }
    }

    private static float[] arcToBeziers(double d, double d10) {
        int ceil = (int) Math.ceil((Math.abs(d10) * 2.0d) / 3.141592653589793d);
        double d11 = d10 / ceil;
        double d12 = d11 / 2.0d;
        double sin = (Math.sin(d12) * 1.3333333333333333d) / (Math.cos(d12) + 1.0d);
        float[] fArr = new float[ceil * 6];
        int i10 = 0;
        int i11 = 0;
        while (i10 < ceil) {
            double d13 = (i10 * d11) + d;
            double cos = Math.cos(d13);
            double sin2 = Math.sin(d13);
            float[] fArr2 = fArr;
            fArr2[i11] = (float) (cos - (sin * sin2));
            fArr2[i11 + 1] = (float) ((cos * sin) + sin2);
            double d14 = d13 + d11;
            double cos2 = Math.cos(d14);
            double sin3 = Math.sin(d14);
            fArr2[i11 + 2] = (float) ((sin * sin3) + cos2);
            fArr2[i11 + 3] = (float) (sin3 - (sin * cos2));
            int i12 = i11 + 5;
            fArr2[i11 + 4] = (float) cos2;
            i11 += 6;
            fArr2[i12] = (float) sin3;
            i10++;
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
                int i10 = b10 & 255;
                if (i10 >= 192) {
                    sb2.append("AACAAAAHAAALMAAAQASTAVAAAZaacaaaahaaalmaaaqastava.az0123456789-,".charAt(i10 - 192));
                } else {
                    if (i10 >= 128) {
                        sb2.append(',');
                    } else if (i10 >= 64) {
                        sb2.append('-');
                    }
                    sb2.append(b10 & 63);
                }
            }
            sb2.append('z');
            return sb2.toString();
        } catch (Exception e) {
            FileLog.e(e);
            return "";
        }
    }

    public static Path doPath(String str) {
        char c10;
        float f7;
        boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
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
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        float f22 = 0.0f;
        while (true) {
            int i10 = parserHelper.pos;
            if (i10 < length) {
                char charAt = str2.charAt(i10);
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
                        float f23 = f19;
                        float nextFloat5 = parserHelper.nextFloat();
                        if (((int) parserHelper.nextFloat()) == 1) {
                            f7 = f20;
                            z10 = true;
                        } else {
                            f7 = f20;
                            z10 = false;
                        }
                        if (((int) parserHelper.nextFloat()) != 1) {
                            z11 = false;
                        }
                        float nextFloat6 = parserHelper.nextFloat();
                        float nextFloat7 = parserHelper.nextFloat();
                        if (c11 == 'a') {
                            float f24 = nextFloat6 + f17;
                            nextFloat7 += f18;
                            f10 = f17;
                            f11 = f18;
                            f12 = f24;
                        } else {
                            f10 = f17;
                            f11 = f18;
                            f12 = nextFloat6;
                        }
                        float f25 = f7;
                        float f26 = nextFloat7;
                        drawArc(path, f10, f11, f12, f26, nextFloat3, nextFloat4, nextFloat5, z10, z11);
                        f17 = f12;
                        f18 = f26;
                        f20 = f25;
                        f19 = f23;
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
                            nextFloat8 += f17;
                            nextFloat10 += f17;
                            nextFloat12 += f17;
                            nextFloat9 += f18;
                            nextFloat11 += f18;
                            nextFloat13 += f18;
                        }
                        float f27 = nextFloat8;
                        float f28 = nextFloat9;
                        f13 = nextFloat10;
                        f14 = nextFloat11;
                        f15 = nextFloat12;
                        f16 = nextFloat13;
                        path.cubicTo(f27, f28, f13, f14, f15, f16);
                        f21 = f13;
                        f22 = f14;
                        f17 = f15;
                        f18 = f16;
                        break;
                    case 'H':
                    case 'h':
                        float nextFloat14 = parserHelper.nextFloat();
                        if (c11 == 'h') {
                            path.rLineTo(nextFloat14, 0.0f);
                            f17 += nextFloat14;
                        } else {
                            path.lineTo(nextFloat14, f18);
                            f17 = nextFloat14;
                        }
                        z11 = false;
                        break;
                    case 'L':
                    case 'l':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c11 == 'l') {
                            path.rLineTo(nextFloat, nextFloat2);
                            f17 += nextFloat;
                            f18 += nextFloat2;
                            z11 = false;
                            break;
                        } else {
                            path.lineTo(nextFloat, nextFloat2);
                            f17 = nextFloat;
                            f18 = nextFloat2;
                            z11 = false;
                        }
                    case 'M':
                    case 'm':
                        nextFloat = parserHelper.nextFloat();
                        nextFloat2 = parserHelper.nextFloat();
                        if (c11 == 'm') {
                            f19 += nextFloat;
                            f20 += nextFloat2;
                            path.rMoveTo(nextFloat, nextFloat2);
                            f17 += nextFloat;
                            f18 += nextFloat2;
                            z11 = false;
                            break;
                        } else {
                            path.moveTo(nextFloat, nextFloat2);
                            f17 = nextFloat;
                            f19 = f17;
                            f18 = nextFloat2;
                            f20 = f18;
                            z11 = false;
                        }
                    case 'Q':
                    case 'q':
                        float nextFloat15 = parserHelper.nextFloat();
                        float nextFloat16 = parserHelper.nextFloat();
                        float nextFloat17 = parserHelper.nextFloat();
                        float nextFloat18 = parserHelper.nextFloat();
                        if (c11 == 'q') {
                            nextFloat15 += f17;
                            nextFloat16 += f18;
                            nextFloat17 += f17;
                            nextFloat18 += f18;
                        }
                        f21 = nextFloat15;
                        f17 = nextFloat17;
                        f18 = nextFloat18;
                        path.quadTo(f21, nextFloat16, f17, f18);
                        f22 = nextFloat16;
                        break;
                    case 'S':
                    case 's':
                        float nextFloat19 = parserHelper.nextFloat();
                        float nextFloat20 = parserHelper.nextFloat();
                        float nextFloat21 = parserHelper.nextFloat();
                        float nextFloat22 = parserHelper.nextFloat();
                        if (c11 == 's') {
                            nextFloat19 += f17;
                            nextFloat21 += f17;
                            nextFloat20 += f18;
                            nextFloat22 += f18;
                        }
                        f15 = nextFloat21;
                        float f29 = (f17 * 2.0f) - f21;
                        float f30 = (f18 * 2.0f) - f22;
                        f13 = nextFloat19;
                        f14 = nextFloat20;
                        f16 = nextFloat22;
                        path.cubicTo(f29, f30, f13, f14, f15, f16);
                        f21 = f13;
                        f22 = f14;
                        f17 = f15;
                        f18 = f16;
                        break;
                    case 'T':
                    case 't':
                        f15 = parserHelper.nextFloat();
                        f16 = parserHelper.nextFloat();
                        if (c11 == 't') {
                            f15 += f17;
                            f16 += f18;
                        }
                        f21 = (f17 * 2.0f) - f21;
                        float f31 = (f18 * 2.0f) - f22;
                        path.quadTo(f21, f31, f15, f16);
                        f22 = f31;
                        f17 = f15;
                        f18 = f16;
                        break;
                    case 'V':
                    case 'v':
                        float nextFloat23 = parserHelper.nextFloat();
                        if (c11 == 'v') {
                            path.rLineTo(0.0f, nextFloat23);
                            f18 += nextFloat23;
                        } else {
                            path.lineTo(f17, nextFloat23);
                            f18 = nextFloat23;
                        }
                        z11 = false;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f19, f20);
                        f17 = f19;
                        f21 = f17;
                        f18 = f20;
                        f22 = f18;
                        break;
                    default:
                        z11 = false;
                        break;
                }
                if (!z11) {
                    f21 = f17;
                    f22 = f18;
                }
                parserHelper.skipWhitespace();
                str2 = str;
                c11 = c10;
            } else {
                return path;
            }
        }
    }

    private static void drawArc(Path path, float f7, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        double d;
        double d10;
        if (f7 != f11 || f10 != f12) {
            if (f13 != 0.0f && f14 != 0.0f) {
                float abs = Math.abs(f13);
                float abs2 = Math.abs(f14);
                double radians = Math.toRadians(f15 % 360.0d);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d11 = (f7 - f11) / 2.0d;
                double d12 = (f10 - f12) / 2.0d;
                double d13 = (sin * d12) + (cos * d11);
                double d14 = (d12 * cos) + ((-sin) * d11);
                double d15 = abs * abs;
                double d16 = abs2 * abs2;
                double d17 = d13 * d13;
                double d18 = d14 * d14;
                double d19 = (d18 / d16) + (d17 / d15);
                if (d19 > 0.99999d) {
                    double sqrt = Math.sqrt(d19) * 1.00001d;
                    abs = (float) (abs * sqrt);
                    abs2 = (float) (sqrt * abs2);
                    d15 = abs * abs;
                    d16 = abs2 * abs2;
                }
                double d20 = 1.0d;
                if (z10 == z11) {
                    d = -1.0d;
                } else {
                    d = 1.0d;
                }
                double d21 = d15 * d16;
                double d22 = d15 * d18;
                double d23 = d16 * d17;
                double d24 = ((d21 - d22) - d23) / (d22 + d23);
                if (d24 < 0.0d) {
                    d24 = 0.0d;
                }
                double sqrt2 = Math.sqrt(d24) * d;
                double d25 = abs;
                double d26 = d25 * d14;
                double d27 = abs2;
                double d28 = (d26 / d27) * sqrt2;
                double d29 = sqrt2 * (-((d27 * d13) / d25));
                double d30 = ((cos * d28) - (sin * d29)) + ((f7 + f11) / 2.0d);
                double d31 = (cos * d29) + (sin * d28) + ((f10 + f12) / 2.0d);
                double d32 = (d13 - d28) / d25;
                double d33 = (d14 - d29) / d27;
                double d34 = ((-d13) - d28) / d25;
                double d35 = ((-d14) - d29) / d27;
                double d36 = (d33 * d33) + (d32 * d32);
                double sqrt3 = Math.sqrt(d36);
                if (d33 < 0.0d) {
                    d10 = -1.0d;
                } else {
                    d10 = 1.0d;
                }
                double acos = Math.acos(d32 / sqrt3) * d10;
                double sqrt4 = Math.sqrt(((d35 * d35) + (d34 * d34)) * d36);
                double d37 = (d33 * d35) + (d32 * d34);
                if ((d32 * d35) - (d33 * d34) < 0.0d) {
                    d20 = -1.0d;
                }
                double checkedArcCos = d20 * checkedArcCos(d37 / sqrt4);
                int i10 = (checkedArcCos > 0.0d ? 1 : (checkedArcCos == 0.0d ? 0 : -1));
                if (i10 == 0) {
                    path.lineTo(f11, f12);
                    return;
                }
                if (!z11 && i10 > 0) {
                    checkedArcCos -= 6.283185307179586d;
                } else if (z11 && checkedArcCos < 0.0d) {
                    checkedArcCos += 6.283185307179586d;
                }
                float[] arcToBeziers = arcToBeziers(acos % 6.283185307179586d, checkedArcCos % 6.283185307179586d);
                Matrix matrix = new Matrix();
                matrix.postScale(abs, abs2);
                matrix.postRotate(f15);
                matrix.postTranslate((float) d30, (float) d31);
                matrix.mapPoints(arcToBeziers);
                arcToBeziers[arcToBeziers.length - 2] = f11;
                arcToBeziers[arcToBeziers.length - 1] = f12;
                for (int i11 = 0; i11 < arcToBeziers.length; i11 += 6) {
                    path.cubicTo(arcToBeziers[i11], arcToBeziers[i11 + 1], arcToBeziers[i11 + 2], arcToBeziers[i11 + 3], arcToBeziers[i11 + 4], arcToBeziers[i11 + 5]);
                }
                return;
            }
            path.lineTo(f11, f12);
        }
    }

    public static Bitmap getBitmap(int i10, int i11, int i12, int i13) {
        return getBitmap(i10, i11, i12, i13, 1.0f);
    }

    public static Bitmap getBitmapByPathOnly(String str, int i10, int i11, int i12, int i13) {
        try {
            Path doPath = doPath(str);
            Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(i12 / i10, i13 / i11);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawPath(doPath, paint);
            return createBitmap;
        } catch (Exception e) {
            FileLog.e(e);
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
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(String str, int i10, int i11) {
        try {
            Path doPath = doPath(str);
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(doPath);
            svgDrawable.paints.put(doPath, new Paint(1));
            svgDrawable.width = i10;
            svgDrawable.height = i11;
            return svgDrawable;
        } catch (Exception e) {
            FileLog.e(e);
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
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return parseNumbers(attributes.getValue(i10));
            }
        }
        return null;
    }

    public static String getStringAttr(String str, Attributes attributes) {
        int length = attributes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            if (attributes.getLocalName(i10).equals(str)) {
                return attributes.getValue(i10);
            }
        }
        return null;
    }

    public static SvgResult getSvgBitmap(File file, int i10, int i11, boolean z10) {
        Integer num;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            if (z10) {
                num = -1;
            } else {
                num = null;
            }
            SVGHandler sVGHandler = new SVGHandler(i10, i11, num, false, 1.0f);
            if (!z10) {
                sVGHandler.alphaOnly = true;
            }
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(fileInputStream));
            fileInputStream.close();
            return sVGHandler;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private static NumberParse parseNumbers(String str) {
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 1; i11 < length; i11++) {
            if (z10) {
                z10 = false;
            } else {
                char charAt = str.charAt(i11);
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        if (charAt == '-' && str.charAt(i11 - 1) == 'e') {
                            break;
                        } else {
                            String substring = str.substring(i10, i11);
                            if (substring.trim().length() > 0) {
                                arrayList.add(Float.valueOf(Float.parseFloat(substring)));
                                if (charAt == '-') {
                                    i10 = i11;
                                    break;
                                } else {
                                    i10 = i11 + 1;
                                    z10 = true;
                                    break;
                                }
                            } else {
                                i10++;
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
                        String substring2 = str.substring(i10, i11);
                        if (substring2.trim().length() > 0) {
                            arrayList.add(Float.valueOf(Float.parseFloat(substring2)));
                        }
                        return new NumberParse(arrayList, i11);
                }
            }
        }
        String substring3 = str.substring(i10);
        if (substring3.length() > 0) {
            try {
                arrayList.add(Float.valueOf(Float.parseFloat(substring3)));
            } catch (NumberFormatException unused) {
            }
            i10 = str.length();
        }
        return new NumberParse(arrayList, i10);
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
        float f7 = 0.0f;
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
                    f7 = ((Float) parseNumbers2.numbers.get(1)).floatValue();
                }
                Matrix matrix2 = new Matrix();
                matrix2.postTranslate(floatValue, f7);
                return matrix2;
            }
            return null;
        } else if (str.startsWith("scale(")) {
            NumberParse parseNumbers3 = parseNumbers(str.substring(6));
            if (parseNumbers3.numbers.size() > 0) {
                float floatValue2 = ((Float) parseNumbers3.numbers.get(0)).floatValue();
                if (parseNumbers3.numbers.size() > 1) {
                    f7 = ((Float) parseNumbers3.numbers.get(1)).floatValue();
                }
                Matrix matrix3 = new Matrix();
                matrix3.postScale(floatValue2, f7);
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
        private List<cg.c> insideGiftRectPositions;
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
            Float f7 = properties.getFloat("opacity");
            if (f7 == null) {
                if (z10) {
                    str = "fill-opacity";
                } else {
                    str = "stroke-opacity";
                }
                f7 = properties.getFloat(str);
            }
            if (f7 == null) {
                this.paint.setAlpha(255);
            } else {
                this.paint.setAlpha((int) (f7.floatValue() * 255.0f));
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
            Float f7 = properties.getFloat("stroke-width");
            if (f7 != null) {
                this.paint.setStrokeWidth(f7.floatValue());
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
        public void characters(char[] cArr, int i10, int i11) {
            StringBuilder sb2 = this.styles;
            if (sb2 != null) {
                sb2.append(cArr, i10, i11);
            }
        }

        @Override
        public void endElement(String str, String str2, String str3) {
            int indexOf;
            if (this.insideGiftRect) {
                int i10 = this.insideGiftRectDepth - 1;
                this.insideGiftRectDepth = i10;
                if (i10 == 0) {
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
                        for (int i11 = 0; i11 < split.length; i11++) {
                            String replace = split[i11].trim().replace("\t", "").replace("\n", "");
                            split[i11] = replace;
                            if (replace.length() != 0 && split[i11].charAt(0) == '.' && (indexOf = split[i11].indexOf(123)) >= 0) {
                                this.globalStyles.put(split[i11].substring(1, indexOf).trim(), new StyleSet(split[i11].substring(indexOf + 1)));
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
        public List<cg.c> getGiftPatternPositions() {
            return this.insideGiftRectPositions;
        }

        @Override
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            String stringAttr;
            Bitmap.Config config;
            int i10;
            Float valueOf = Float.valueOf(0.0f);
            cg.c cVar = null;
            if ("g".equals(str3) && !this.insideGiftRect) {
                if ("GiftPatterns".equals(attributes.getValue("id"))) {
                    this.insideGiftRect = true;
                    this.insideGiftRectDepth = 1;
                    return;
                }
            } else if (this.insideGiftRect) {
                this.insideGiftRectDepth++;
                if ("rect".equals(str3)) {
                    float f7 = this.scale;
                    try {
                        float parseFloat = Float.parseFloat(attributes.getValue("x"));
                        float parseFloat2 = Float.parseFloat(attributes.getValue("y"));
                        RectF rectF = new RectF(parseFloat, parseFloat2, Float.parseFloat(attributes.getValue("width")) + parseFloat, Float.parseFloat(attributes.getValue("height")) + parseFloat2);
                        Matrix parseTransform = SvgHelper.parseTransform(attributes.getValue("transform"));
                        parseTransform.postScale(f7, f7);
                        cVar = new cg.c(rectF, parseTransform);
                    } catch (Exception e) {
                        FileLog.e(e);
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
                                for (int i11 = 2; i11 < arrayList.size(); i11 += 2) {
                                    path.lineTo(((Float) arrayList.get(i11)).floatValue(), ((Float) arrayList.get(i11 + 1)).floatValue());
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
                            int i12 = this.desiredWidth;
                            if (i12 != 0 && (i10 = this.desiredHeight) != 0) {
                                if (this.scaleMode == ScaleMode.ByWidth) {
                                    this.scale = i12 / ceil;
                                } else {
                                    this.scale = Math.min(i12 / ceil, i10 / ceil2);
                                }
                                float f10 = this.scale;
                                ceil = (int) (ceil * f10);
                                ceil2 = (int) (ceil2 * f10);
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
                            float f11 = this.scale;
                            if (f11 != 0.0f) {
                                float f12 = this.globalScale;
                                canvas.scale(f12 * f11, f12 * f11);
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

        private SVGHandler(int i10, int i11, Integer num, boolean z10, float f7) {
            this(i10, i11, num, z10, f7, ScaleMode.Default);
        }

        private SVGHandler(int i10, int i11, Integer num, boolean z10, float f7, ScaleMode scaleMode) {
            this.scale = 1.0f;
            this.paint = new Paint(1);
            this.rect = new RectF();
            this.rectTmp = new RectF();
            this.globalScale = 1.0f;
            this.pushed = false;
            this.globalStyles = new HashMap<>();
            this.insideGiftRect = false;
            this.insideGiftRectDepth = 0;
            this.globalScale = f7;
            this.desiredWidth = i10;
            this.desiredHeight = i11;
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

    public static Bitmap getBitmap(int i10, int i11, int i12, int i13, float f7) {
        return getBitmap(i10, i11, i12, i13, f7, ScaleMode.Default);
    }

    public static Float getFloatAttr(String str, Attributes attributes, Float f7) {
        String stringAttr = getStringAttr(str, attributes);
        if (stringAttr == null) {
            return f7;
        }
        if (stringAttr.endsWith("px")) {
            stringAttr = com.google.android.gms.internal.vision.e2.h(2, 0, stringAttr);
        } else if (stringAttr.endsWith("mm")) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(stringAttr));
    }

    public static Bitmap getBitmap(int i10, int i11, int i12, int i13, float f7, ScaleMode scaleMode) {
        try {
            InputStream openRawResource = ApplicationLoader.applicationContext.getResources().openRawResource(i10);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i11, i12, Integer.valueOf(i13), false, f7, scaleMode);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(openRawResource));
            Bitmap bitmap = sVGHandler.getBitmap();
            if (openRawResource != null) {
                openRawResource.close();
            }
            return bitmap;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawableByPath(Path path, int i10, int i11) {
        try {
            SvgDrawable svgDrawable = new SvgDrawable();
            svgDrawable.commands.add(path);
            svgDrawable.paints.put(path, new Paint(1));
            svgDrawable.width = i10;
            svgDrawable.height = i11;
            return svgDrawable;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static SvgDrawable getDrawable(int i10, Integer num) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(0, 0, num, true, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(ApplicationLoader.applicationContext.getResources().openRawResource(i10)));
            return sVGHandler.getDrawable();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(InputStream inputStream, int i10, int i11, boolean z10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(inputStream));
            return sVGHandler.getBitmap();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(File file, int i10, int i11, boolean z10) {
        return getBitmap(file, i10, i11, z10, ScaleMode.Default);
    }

    public static Bitmap getBitmap(File file, int i10, int i11, boolean z10, ScaleMode scaleMode) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f, scaleMode);
            if (!z10) {
                sVGHandler.alphaOnly = true;
            }
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(fileInputStream));
            Bitmap bitmap = sVGHandler.getBitmap();
            fileInputStream.close();
            return bitmap;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap getBitmap(String str, int i10, int i11, boolean z10) {
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            SVGHandler sVGHandler = new SVGHandler(i10, i11, z10 ? -1 : null, false, 1.0f);
            xMLReader.setContentHandler(sVGHandler);
            xMLReader.parse(new InputSource(new StringReader(str)));
            return sVGHandler.getBitmap();
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }
}
