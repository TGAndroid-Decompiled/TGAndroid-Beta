package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public class gm extends ReplacementSpan {
    private static boolean lockPositionChanging;
    private boolean animateChanges;
    public int cacheType;
    public TLRPC.Document document;
    public String documentAbsolutePath;
    public long documentId;
    public String emoji;
    public float extraScale;
    private Paint.FontMetricsInt fontMetrics;
    public boolean fromEmojiKeyboard;
    public boolean full;
    public boolean invert;
    private boolean isAdded;
    private boolean isRemoved;
    float lastDrawnCx;
    float lastDrawnCy;
    protected int measuredSize;
    private int minimumLineHeight;
    private ValueAnimator moveAnimator;
    boolean positionChanged;
    private boolean preserveFontMetrics;
    private boolean recordPositions;
    private Runnable removedAction;
    private float scale;
    private ValueAnimator scaleAnimator;
    public float size;
    boolean spanDrawn;
    public boolean standard;
    public boolean top;

    public gm(long j, float f, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = gl.L(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j;
        this.scale = f;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = gl.L(20.0f);
            }
        }
    }

    public static boolean a(Layout layout, int i, int i2) {
        if (layout.getText() instanceof Spanned) {
            wib[] wibVarArr = (wib[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i), Math.min(layout.getText().length() - 1, i2), wib.class);
            for (int i3 = 0; wibVarArr != null && i3 < wibVarArr.length; i3++) {
                wib wibVar = wibVarArr[i3];
                if (wibVar != null && wibVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean access$400(gm gmVar) {
        if (gmVar.moveAnimator == null && gmVar.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            gm[] gmVarArr = (gm[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), gm.class);
            if (gmVarArr != null) {
                for (gm gmVar : gmVarArr) {
                    gmVar.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static gm cloneSpan(gm gmVar, Paint.FontMetricsInt fontMetricsInt) {
        gm gmVar2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = gmVar.document;
        if (document != null) {
            float f = gmVar.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = gmVar.fontMetrics;
            }
            gmVar2 = new gm(document, f, fontMetricsInt3);
        } else {
            long j = gmVar.documentId;
            float f2 = gmVar.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = gmVar.fontMetrics;
            }
            gmVar2 = new gm(j, f2, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            gmVar2.size = gmVar.size;
        }
        gmVar2.fromEmojiKeyboard = gmVar.fromEmojiKeyboard;
        gmVar2.isAdded = gmVar.isAdded;
        gmVar2.isRemoved = gmVar.isRemoved;
        return gmVar2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt, float f) {
        gm[] gmVarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((gmVarArr = (gm[]) spanned.getSpans(0, spanned.length(), gm.class)) == null || gmVarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                CharacterStyle characterStyle = characterStyleArr[i2];
                if (characterStyle != null && (characterStyle instanceof gm)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i2]);
                    gm gmVar = (gm) characterStyleArr[i2];
                    charSequence.removeSpan(gmVar);
                    gm cloneSpan = cloneSpan(gmVar, fontMetricsInt);
                    if (i != -1) {
                        cloneSpan.cacheType = i;
                    }
                    cloneSpan.scale = gmVar.scale * f;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, cm cmVar, float f, List<qla> list, float f2, float f3, float f4, float f5, ColorFilter colorFilter) {
        boolean z;
        float f6;
        float f7;
        ColorFilter colorFilter2;
        if (canvas != null && layout != null && cmVar != null) {
            ArrayList arrayList = cmVar.c;
            boolean z2 = false;
            if (vu3.m == 0.0f && f == 0.0f) {
                z = false;
            } else {
                canvas.save();
                canvas.translate(0.0f, vu3.m + gl.L(20.0f * f));
                z = true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                em emVar = (em) arrayList.get(i);
                if (emVar.a == layout) {
                    ArrayList arrayList2 = emVar.b;
                    int i2 = z2 ? 1 : 0;
                    ?? r8 = z2;
                    while (i2 < arrayList2.size()) {
                        bm bmVar = (bm) arrayList2.get(i2);
                        if (bmVar != null) {
                            vl vlVar = bmVar.f;
                            if (vlVar != null) {
                                vlVar.setColorFilter(colorFilter);
                            }
                            gm gmVar = bmVar.d;
                            if (gmVar.spanDrawn) {
                                float f8 = gmVar.measuredSize / 2.0f;
                                float f9 = gmVar.lastDrawnCx;
                                float f10 = gmVar.lastDrawnCy;
                                bmVar.e.set((int) (f9 - f8), (int) (f10 - f8), (int) (f9 + f8), (int) (f10 + f8));
                                if (list != null && !list.isEmpty() && bmVar.w) {
                                    f6 = 0.0f;
                                    f7 = Math.max(0.0f, list.get(r8).n);
                                } else {
                                    f6 = 0.0f;
                                    f7 = 1.0f;
                                }
                                bmVar.r = f4;
                                bmVar.s = f7;
                                if (f2 != f6 || f3 != f6) {
                                    Rect rect = bmVar.e;
                                    if (rect.bottom < f2 || rect.top > f3) {
                                        bmVar.n = true;
                                    }
                                }
                                bmVar.n = r8;
                                vl vlVar2 = bmVar.f;
                                int i3 = -1;
                                if (vlVar2 == null) {
                                    if (bmVar.h != null) {
                                        float extraScale = bmVar.d.getExtraScale();
                                        bmVar.h.setAlpha((int) (bmVar.s * 255.0f * f5));
                                        bmVar.h.setBounds(bmVar.e);
                                        if (extraScale == 1.0f && !bmVar.d.invert) {
                                            bmVar.h.draw(canvas);
                                        } else {
                                            canvas.save();
                                            if (!bmVar.d.invert) {
                                                i3 = 1;
                                            }
                                            canvas.scale(i3 * extraScale, extraScale, bmVar.e.centerX(), bmVar.e.centerY());
                                            bmVar.h.draw(canvas);
                                            canvas.restore();
                                        }
                                    }
                                } else if (vlVar2.k != null) {
                                    if (colorFilter == null) {
                                        colorFilter2 = bkb.u3;
                                    } else {
                                        colorFilter2 = colorFilter;
                                    }
                                    vlVar2.setColorFilter(colorFilter2);
                                    bmVar.f.p(currentTimeMillis);
                                    float extraScale2 = bmVar.d.getExtraScale();
                                    if (extraScale2 == 1.0f && !bmVar.d.invert) {
                                        vl vlVar3 = bmVar.f;
                                        Rect rect2 = bmVar.e;
                                        float f11 = bmVar.s * f5;
                                        ml mlVar = vlVar3.k;
                                        if (mlVar != null) {
                                            mlVar.j0(rect2);
                                            vlVar3.k.setAlpha(f11);
                                            vlVar3.k.h(canvas, null);
                                        }
                                    } else {
                                        canvas.save();
                                        if (!bmVar.d.invert) {
                                            i3 = 1;
                                        }
                                        canvas.scale(i3 * extraScale2, extraScale2, bmVar.e.centerX(), bmVar.e.centerY());
                                        vl vlVar4 = bmVar.f;
                                        Rect rect3 = bmVar.e;
                                        float f12 = bmVar.s * f5;
                                        ml mlVar2 = vlVar4.k;
                                        if (mlVar2 != null) {
                                            mlVar2.j0(rect3);
                                            vlVar4.k.setAlpha(f12);
                                            vlVar4.k.h(canvas, null);
                                        }
                                        canvas.restore();
                                    }
                                    if (access$400(bmVar.d)) {
                                        bmVar.invalidate();
                                    }
                                }
                            }
                        }
                        i2++;
                        r8 = 0;
                    }
                } else {
                    i++;
                    z2 = false;
                }
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof gm) && !(characterStyle instanceof su3)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<vl> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            vl valueAt = longSparseArray.valueAt(i);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static cm update(int i, View view, boolean z, cm cmVar, boolean z2, Layout... layoutArr) {
        int i2;
        gm[] gmVarArr;
        bm bmVar;
        int i3;
        int i4;
        cm cmVar2 = cmVar;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i5 = 0;
        if (layoutArr != null && layoutArr.length > 0) {
            int i6 = 0;
            while (i6 < layoutArr.length) {
                Layout layout = layoutArr[i6];
                if (layout != null && (layout.getText() instanceof Spanned)) {
                    Spanned spanned = (Spanned) layout.getText();
                    gmVarArr = (gm[]) spanned.getSpans(i5, spanned.length(), gm.class);
                    int i7 = i5;
                    ?? r0 = cmVar2;
                    while (gmVarArr != null && i7 < gmVarArr.length) {
                        gm gmVar = gmVarArr[i7];
                        if (gmVar == null) {
                            i3 = i6;
                        } else {
                            if (z2 && (layout.getText() instanceof Spannable)) {
                                int spanStart = spanned.getSpanStart(gmVar);
                                int spanEnd = spanned.getSpanEnd(gmVar);
                                Spannable spannable = (Spannable) spanned;
                                spannable.removeSpan(gmVar);
                                gmVar = cloneSpan(gmVar, fontMetricsInt);
                                gmVarArr[i7] = gmVar;
                                spannable.setSpan(gmVar, spanStart, spanEnd, 33);
                            }
                            if (r0 == 0) {
                                r0 = new Object();
                                r0.a = new ArrayList();
                                r0.b = new HashMap();
                                r0.c = new ArrayList();
                            }
                            ArrayList arrayList = r0.a;
                            int i8 = i5;
                            while (true) {
                                if (i8 < arrayList.size()) {
                                    if (((bm) arrayList.get(i8)).d == gmVar && ((bm) arrayList.get(i8)).c == layout) {
                                        bmVar = (bm) arrayList.get(i8);
                                        break;
                                    }
                                    i8++;
                                } else {
                                    bmVar = fontMetricsInt;
                                    break;
                                }
                            }
                            if (bmVar == 0) {
                                bm bmVar2 = new bm(view, z);
                                bmVar2.c = layout;
                                if (gmVar.standard) {
                                    i4 = 8;
                                } else {
                                    i4 = gmVar.cacheType;
                                    if (i4 < 0) {
                                        i4 = i;
                                    }
                                }
                                if (gmVar.documentAbsolutePath != null) {
                                    i3 = i6;
                                    bmVar2.f = vl.m(y6c.t0, gmVar.getDocumentId(), gmVar.documentAbsolutePath, i4);
                                } else {
                                    i3 = i6;
                                    TLRPC.Document document = gmVar.document;
                                    if (document != null) {
                                        bmVar2.f = vl.l(y6c.t0, i4, document);
                                    } else {
                                        long j = gmVar.documentId;
                                        if (j != 0) {
                                            bmVar2.f = vl.m(y6c.t0, j, null, i4);
                                        }
                                    }
                                }
                                int i9 = gmVar.cacheType;
                                if ((i9 == 20 || i9 == 21) && !TextUtils.isEmpty(gmVar.emoji)) {
                                    vl vlVar = bmVar2.f;
                                    String str = gmVar.emoji;
                                    if (vlVar != null) {
                                        vlVar.q(str);
                                    } else {
                                        bmVar2.h = vu3.g(str);
                                    }
                                }
                                bmVar2.w = a(layout, spanned.getSpanStart(gmVar), spanned.getSpanEnd(gmVar));
                                bmVar2.e = new Rect();
                                bmVar2.d = gmVar;
                                arrayList.add(bmVar2);
                                HashMap hashMap = r0.b;
                                em emVar = (em) hashMap.get(layout);
                                if (emVar == null) {
                                    emVar = new em(bmVar2.a, layout);
                                    hashMap.put(layout, emVar);
                                    r0.c.add(emVar);
                                }
                                emVar.b.add(bmVar2);
                                emVar.a();
                                vl vlVar2 = bmVar2.f;
                                if (vlVar2 != null) {
                                    vlVar2.a(bmVar2);
                                }
                            } else {
                                i3 = i6;
                                bmVar.w = a(layout, spanned.getSpanStart(gmVar), spanned.getSpanEnd(gmVar));
                            }
                        }
                        i7++;
                        i6 = i3;
                        fontMetricsInt = null;
                        i5 = 0;
                        r0 = r0;
                    }
                    i2 = i6;
                    cmVar2 = r0;
                } else {
                    i2 = i6;
                    gmVarArr = null;
                    cmVar2 = cmVar2;
                }
                if (cmVar2 != null) {
                    ArrayList arrayList2 = cmVar2.a;
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        if (((bm) arrayList2.get(i10)).c == layout) {
                            gm gmVar2 = ((bm) arrayList2.get(i10)).d;
                            for (int i11 = 0; gmVarArr != null && i11 < gmVarArr.length; i11++) {
                                if (gmVarArr[i11] != gmVar2) {
                                }
                            }
                            cmVar2.b(i10);
                            i10--;
                        }
                        i10++;
                    }
                }
                i6 = i2 + 1;
                fontMetricsInt = null;
                i5 = 0;
            }
            if (cmVar2 != null) {
                ArrayList arrayList3 = cmVar2.a;
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    Layout layout2 = ((bm) arrayList3.get(i12)).c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < layoutArr.length) {
                            if (layoutArr[i13] != layout2) {
                                i13++;
                            }
                        } else {
                            cmVar2.b(i12);
                            i12--;
                            break;
                        }
                    }
                    i12++;
                }
            }
            return cmVar2;
        } else if (cmVar2 != null) {
            ArrayList arrayList4 = cmVar2.a;
            arrayList4.clear();
            while (arrayList4.size() > 0) {
                cmVar2.b(0);
            }
            return null;
        } else {
            return null;
        }
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i;
    }

    public final void b(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = gl.R1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public final void c(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = gl.R1(0.0f, 1.0f, floatValue);
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gm.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.id;
        }
        return this.documentId;
    }

    public float getExtraScale() {
        if (this.isAdded) {
            lockPositionChanging = true;
            this.isAdded = false;
            this.extraScale = 0.0f;
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.extraScale, 1.0f);
            this.scaleAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final gm b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b = r2;
                    gm gmVar = this.b;
                    switch (b) {
                        case 0:
                            gmVar.b(valueAnimator2);
                            return;
                        default:
                            gmVar.c(valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new am(this, (byte) 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(s33.f);
            this.scaleAnimator.start();
        } else if (this.isRemoved) {
            this.isRemoved = false;
            this.extraScale = 1.0f;
            ValueAnimator valueAnimator2 = this.scaleAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.extraScale, 0.0f);
            this.scaleAnimator = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final gm b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b = r2;
                    gm gmVar = this.b;
                    switch (b) {
                        case 0:
                            gmVar.b(valueAnimator22);
                            return;
                        default:
                            gmVar.c(valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new am(this, (byte) 1));
            this.scaleAnimator.setInterpolator(s33.f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.preserveFontMetrics && fontMetricsInt2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = fontMetricsInt2.top;
            i4 = fontMetricsInt2.ascent;
            i5 = fontMetricsInt2.descent;
            i6 = fontMetricsInt2.bottom;
            i7 = fontMetricsInt2.leading;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        if (fontMetricsInt2 == null) {
            i8 = 0;
            i9 = 0;
        } else {
            i8 = fontMetricsInt2.ascent;
            i9 = fontMetricsInt2.descent;
        }
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        float f = this.size;
        if (fontMetricsInt3 == null) {
            int i10 = (int) f;
            int L = gl.L(8.0f);
            int L2 = gl.L(10.0f);
            if (fontMetricsInt2 != null) {
                float f2 = (-L2) - L;
                float f3 = this.scale;
                fontMetricsInt2.top = (int) (f2 * f3);
                float f4 = L2 - L;
                fontMetricsInt2.bottom = (int) (f4 * f3);
                fontMetricsInt2.ascent = (int) (f2 * f3);
                fontMetricsInt2.descent = (int) (f4 * f3);
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i10 * this.scale);
        } else {
            this.measuredSize = (int) (f * this.scale);
            if (fontMetricsInt2 != null) {
                if (!this.full) {
                    fontMetricsInt2.ascent = fontMetricsInt3.ascent;
                    fontMetricsInt2.descent = fontMetricsInt3.descent;
                    fontMetricsInt2.top = fontMetricsInt3.top;
                    fontMetricsInt2.bottom = fontMetricsInt3.bottom;
                } else {
                    float abs = Math.abs(this.fontMetrics.top) + Math.abs(fontMetricsInt3.bottom);
                    fontMetricsInt2.ascent = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt2.descent = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                    fontMetricsInt2.top = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt2.bottom = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                }
            }
        }
        if (fontMetricsInt2 != null && this.top) {
            int i11 = fontMetricsInt2.ascent;
            int i12 = fontMetricsInt2.descent;
            int i13 = ((i9 - i12) + (i8 - i11)) / 2;
            fontMetricsInt2.ascent = i11 + i13;
            fontMetricsInt2.descent = i12 - i13;
        }
        if (z) {
            fontMetricsInt2.top = i3;
            fontMetricsInt2.ascent = i4;
            fontMetricsInt2.descent = i5;
            fontMetricsInt2.bottom = i6;
            fontMetricsInt2.leading = i7;
            int i14 = this.minimumLineHeight;
            int i15 = i5 - i4;
            if (i14 > i15) {
                int i16 = i14 - i15;
                int i17 = (i16 + 1) / 2;
                int i18 = i4 - i17;
                fontMetricsInt2.ascent = i18;
                fontMetricsInt2.descent = i5 + (i16 - i17);
                fontMetricsInt2.top = Math.min(i3, i18);
                fontMetricsInt2.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt2.descent);
            }
        }
        return Math.max(0, this.measuredSize - 1);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = gl.L(20.0f);
            }
        }
    }

    public void setAdded() {
        this.isAdded = true;
        this.extraScale = 0.0f;
    }

    public void setAnimateChanges() {
        this.animateChanges = true;
    }

    public gm setMinimumLineHeight(int i) {
        this.minimumLineHeight = i;
        return this;
    }

    public gm setPreserveFontMetrics(boolean z) {
        this.preserveFontMetrics = z;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public gm setSize(int i) {
        this.size = i;
        return this;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static void release(View view, cm cmVar) {
        if (cmVar != null) {
            while (cmVar.a.size() > 0) {
                cmVar.b(0);
            }
        }
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        this.fontMetrics = fontMetricsInt;
        this.size = i;
        this.cacheType = i2;
    }

    public gm(TLRPC.Document document, float f, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f, fontMetricsInt);
        this.document = document;
    }

    public gm(long j, Paint.FontMetricsInt fontMetricsInt) {
        this(j, 1.2f, fontMetricsInt);
    }

    public gm(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i) {
        return cloneSpans(charSequence, i, null);
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i, fontMetricsInt, 1.0f);
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, cm cmVar, float f, List<qla> list, float f2, float f3, float f4, float f5) {
        drawAnimatedEmojis(canvas, layout, cmVar, f, list, f2, f3, f4, f5, null);
    }

    public static cm update(int i, View view, cm cmVar, ArrayList<h27> arrayList, boolean z) {
        return update(i, view, false, cmVar, arrayList, z);
    }

    public static cm update(int i, View view, boolean z, cm cmVar, ArrayList<h27> arrayList) {
        return update(i, view, z, cmVar, arrayList, false);
    }

    public static cm update(int i, View view, boolean z, cm cmVar, ArrayList<h27> arrayList, boolean z2) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                layoutArr[i2] = arrayList.get(i2).e;
            }
        }
        return update(i, view, z, cmVar, z2, layoutArr);
    }

    public static cm update(int i, View view, cm cmVar, Layout... layoutArr) {
        return update(i, view, false, cmVar, layoutArr);
    }

    public static cm update(int i, View view, boolean z, cm cmVar, Layout... layoutArr) {
        return update(i, view, z, cmVar, false, layoutArr);
    }

    public static cm update(int i, View view, cm cmVar, ArrayList<h27> arrayList) {
        return update(i, view, cmVar, arrayList, false);
    }

    public static LongSparseArray<vl> update(View view, gm[] gmVarArr, LongSparseArray<vl> longSparseArray) {
        return update(0, view, gmVarArr, longSparseArray);
    }

    public static LongSparseArray<vl> update(int i, View view, gm[] gmVarArr, LongSparseArray<vl> longSparseArray) {
        int i2;
        vl m;
        int i3;
        if (gmVarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i4 = 0;
        while (i4 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i4);
            vl vlVar = longSparseArray.get(keyAt);
            if (vlVar == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (gm gmVar : gmVarArr) {
                    i3 = (gmVar == null || gmVar.getDocumentId() != keyAt) ? i3 + 1 : 0;
                }
                vlVar.o(view);
                longSparseArray.remove(keyAt);
            }
            i4--;
            i4++;
        }
        for (gm gmVar2 : gmVarArr) {
            if (gmVar2 != null && longSparseArray.get(gmVar2.getDocumentId()) == null) {
                if (gmVar2.standard) {
                    i2 = 8;
                } else {
                    i2 = gmVar2.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                TLRPC.Document document = gmVar2.document;
                int i5 = y6c.t0;
                if (document != null) {
                    m = vl.l(i5, i2, document);
                } else {
                    m = vl.m(i5, gmVar2.documentId, null, i2);
                }
                m.b(view);
                longSparseArray.put(gmVar2.getDocumentId(), m);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<vl> update(View view, ArrayList<gm> arrayList, LongSparseArray<vl> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<vl> update(int i, View view, ArrayList<gm> arrayList, LongSparseArray<vl> longSparseArray) {
        int i2;
        int i3;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i4 = 0;
        while (i4 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i4);
            vl vlVar = longSparseArray.get(keyAt);
            if (vlVar == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i3 = 0; i3 < arrayList.size(); i3 = i3 + 1) {
                    i3 = (arrayList.get(i3) == null || arrayList.get(i3).getDocumentId() != keyAt) ? i3 + 1 : 0;
                }
                vlVar.b(view);
                longSparseArray.remove(keyAt);
            }
            i4--;
            i4++;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            gm gmVar = arrayList.get(i5);
            if (gmVar != null && longSparseArray.get(gmVar.getDocumentId()) == null) {
                if (gmVar.standard) {
                    i2 = 8;
                } else {
                    i2 = gmVar.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                vl m = vl.m(y6c.t0, gmVar.documentId, null, i2);
                m.b(view);
                longSparseArray.put(gmVar.getDocumentId(), m);
            }
        }
        return longSparseArray;
    }
}
