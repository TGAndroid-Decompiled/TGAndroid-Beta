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
public class gn extends ReplacementSpan {
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

    public gn(long j, float f, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = gm.L(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j;
        this.scale = f;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = gm.L(20.0f);
            }
        }
    }

    public static boolean a(Layout layout, int i, int i2) {
        if (layout.getText() instanceof Spanned) {
            xkb[] xkbVarArr = (xkb[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i), Math.min(layout.getText().length() - 1, i2), xkb.class);
            for (int i3 = 0; xkbVarArr != null && i3 < xkbVarArr.length; i3++) {
                xkb xkbVar = xkbVarArr[i3];
                if (xkbVar != null && xkbVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean access$400(gn gnVar) {
        if (gnVar.moveAnimator == null && gnVar.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            gn[] gnVarArr = (gn[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), gn.class);
            if (gnVarArr != null) {
                for (gn gnVar : gnVarArr) {
                    gnVar.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static gn cloneSpan(gn gnVar, Paint.FontMetricsInt fontMetricsInt) {
        gn gnVar2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = gnVar.document;
        if (document != null) {
            float f = gnVar.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = gnVar.fontMetrics;
            }
            gnVar2 = new gn(document, f, fontMetricsInt3);
        } else {
            long j = gnVar.documentId;
            float f2 = gnVar.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = gnVar.fontMetrics;
            }
            gnVar2 = new gn(j, f2, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            gnVar2.size = gnVar.size;
        }
        gnVar2.fromEmojiKeyboard = gnVar.fromEmojiKeyboard;
        gnVar2.isAdded = gnVar.isAdded;
        gnVar2.isRemoved = gnVar.isRemoved;
        return gnVar2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i, Paint.FontMetricsInt fontMetricsInt, float f) {
        gn[] gnVarArr;
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        Spanned spanned = (Spanned) charSequence;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0 && ((gnVarArr = (gn[]) spanned.getSpans(0, spanned.length(), gn.class)) == null || gnVarArr.length > 0)) {
            charSequence = new SpannableString(spanned);
            for (int i2 = 0; i2 < characterStyleArr.length; i2++) {
                CharacterStyle characterStyle = characterStyleArr[i2];
                if (characterStyle != null && (characterStyle instanceof gn)) {
                    int spanStart = spanned.getSpanStart(characterStyle);
                    int spanEnd = spanned.getSpanEnd(characterStyleArr[i2]);
                    gn gnVar = (gn) characterStyleArr[i2];
                    charSequence.removeSpan(gnVar);
                    gn cloneSpan = cloneSpan(gnVar, fontMetricsInt);
                    if (i != -1) {
                        cloneSpan.cacheType = i;
                    }
                    cloneSpan.scale = gnVar.scale * f;
                    charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, cn cnVar, float f, List<rna> list, float f2, float f3, float f4, float f5, ColorFilter colorFilter) {
        boolean z;
        float f6;
        float f7;
        ColorFilter colorFilter2;
        if (canvas != null && layout != null && cnVar != null) {
            ArrayList arrayList = cnVar.c;
            boolean z2 = false;
            if (gw3.m == 0.0f && f == 0.0f) {
                z = false;
            } else {
                canvas.save();
                canvas.translate(0.0f, gw3.m + gm.L(20.0f * f));
                z = true;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                en enVar = (en) arrayList.get(i);
                if (enVar.a == layout) {
                    ArrayList arrayList2 = enVar.b;
                    int i2 = z2 ? 1 : 0;
                    ?? r8 = z2;
                    while (i2 < arrayList2.size()) {
                        bn bnVar = (bn) arrayList2.get(i2);
                        if (bnVar != null) {
                            vm vmVar = bnVar.f;
                            if (vmVar != null) {
                                vmVar.setColorFilter(colorFilter);
                            }
                            gn gnVar = bnVar.d;
                            if (gnVar.spanDrawn) {
                                float f8 = gnVar.measuredSize / 2.0f;
                                float f9 = gnVar.lastDrawnCx;
                                float f10 = gnVar.lastDrawnCy;
                                bnVar.e.set((int) (f9 - f8), (int) (f10 - f8), (int) (f9 + f8), (int) (f10 + f8));
                                if (list != null && !list.isEmpty() && bnVar.w) {
                                    f6 = 0.0f;
                                    f7 = Math.max(0.0f, list.get(r8).n);
                                } else {
                                    f6 = 0.0f;
                                    f7 = 1.0f;
                                }
                                bnVar.r = f4;
                                bnVar.s = f7;
                                if (f2 != f6 || f3 != f6) {
                                    Rect rect = bnVar.e;
                                    if (rect.bottom < f2 || rect.top > f3) {
                                        bnVar.n = true;
                                    }
                                }
                                bnVar.n = r8;
                                vm vmVar2 = bnVar.f;
                                int i3 = -1;
                                if (vmVar2 == null) {
                                    if (bnVar.h != null) {
                                        float extraScale = bnVar.d.getExtraScale();
                                        bnVar.h.setAlpha((int) (bnVar.s * 255.0f * f5));
                                        bnVar.h.setBounds(bnVar.e);
                                        if (extraScale == 1.0f && !bnVar.d.invert) {
                                            bnVar.h.draw(canvas);
                                        } else {
                                            canvas.save();
                                            if (!bnVar.d.invert) {
                                                i3 = 1;
                                            }
                                            canvas.scale(i3 * extraScale, extraScale, bnVar.e.centerX(), bnVar.e.centerY());
                                            bnVar.h.draw(canvas);
                                            canvas.restore();
                                        }
                                    }
                                } else if (vmVar2.k != null) {
                                    if (colorFilter == null) {
                                        colorFilter2 = cmb.u3;
                                    } else {
                                        colorFilter2 = colorFilter;
                                    }
                                    vmVar2.setColorFilter(colorFilter2);
                                    bnVar.f.p(currentTimeMillis);
                                    float extraScale2 = bnVar.d.getExtraScale();
                                    if (extraScale2 == 1.0f && !bnVar.d.invert) {
                                        vm vmVar3 = bnVar.f;
                                        Rect rect2 = bnVar.e;
                                        float f11 = bnVar.s * f5;
                                        mm mmVar = vmVar3.k;
                                        if (mmVar != null) {
                                            mmVar.j0(rect2);
                                            vmVar3.k.setAlpha(f11);
                                            vmVar3.k.h(canvas, null);
                                        }
                                    } else {
                                        canvas.save();
                                        if (!bnVar.d.invert) {
                                            i3 = 1;
                                        }
                                        canvas.scale(i3 * extraScale2, extraScale2, bnVar.e.centerX(), bnVar.e.centerY());
                                        vm vmVar4 = bnVar.f;
                                        Rect rect3 = bnVar.e;
                                        float f12 = bnVar.s * f5;
                                        mm mmVar2 = vmVar4.k;
                                        if (mmVar2 != null) {
                                            mmVar2.j0(rect3);
                                            vmVar4.k.setAlpha(f12);
                                            vmVar4.k.h(canvas, null);
                                        }
                                        canvas.restore();
                                    }
                                    if (access$400(bnVar.d)) {
                                        bnVar.invalidate();
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
            if (!(characterStyle instanceof gn) && !(characterStyle instanceof dw3)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<vm> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i = 0; i < longSparseArray.size(); i++) {
            vm valueAt = longSparseArray.valueAt(i);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static cn update(int i, View view, boolean z, cn cnVar, boolean z2, Layout... layoutArr) {
        int i2;
        gn[] gnVarArr;
        bn bnVar;
        int i3;
        int i4;
        cn cnVar2 = cnVar;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i5 = 0;
        if (layoutArr != null && layoutArr.length > 0) {
            int i6 = 0;
            while (i6 < layoutArr.length) {
                Layout layout = layoutArr[i6];
                if (layout != null && (layout.getText() instanceof Spanned)) {
                    Spanned spanned = (Spanned) layout.getText();
                    gnVarArr = (gn[]) spanned.getSpans(i5, spanned.length(), gn.class);
                    int i7 = i5;
                    ?? r0 = cnVar2;
                    while (gnVarArr != null && i7 < gnVarArr.length) {
                        gn gnVar = gnVarArr[i7];
                        if (gnVar == null) {
                            i3 = i6;
                        } else {
                            if (z2 && (layout.getText() instanceof Spannable)) {
                                int spanStart = spanned.getSpanStart(gnVar);
                                int spanEnd = spanned.getSpanEnd(gnVar);
                                Spannable spannable = (Spannable) spanned;
                                spannable.removeSpan(gnVar);
                                gnVar = cloneSpan(gnVar, fontMetricsInt);
                                gnVarArr[i7] = gnVar;
                                spannable.setSpan(gnVar, spanStart, spanEnd, 33);
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
                                    if (((bn) arrayList.get(i8)).d == gnVar && ((bn) arrayList.get(i8)).c == layout) {
                                        bnVar = (bn) arrayList.get(i8);
                                        break;
                                    }
                                    i8++;
                                } else {
                                    bnVar = fontMetricsInt;
                                    break;
                                }
                            }
                            if (bnVar == 0) {
                                bn bnVar2 = new bn(view, z);
                                bnVar2.c = layout;
                                if (gnVar.standard) {
                                    i4 = 8;
                                } else {
                                    i4 = gnVar.cacheType;
                                    if (i4 < 0) {
                                        i4 = i;
                                    }
                                }
                                if (gnVar.documentAbsolutePath != null) {
                                    i3 = i6;
                                    bnVar2.f = vm.m(z8c.t0, gnVar.getDocumentId(), gnVar.documentAbsolutePath, i4);
                                } else {
                                    i3 = i6;
                                    TLRPC.Document document = gnVar.document;
                                    if (document != null) {
                                        bnVar2.f = vm.l(z8c.t0, i4, document);
                                    } else {
                                        long j = gnVar.documentId;
                                        if (j != 0) {
                                            bnVar2.f = vm.m(z8c.t0, j, null, i4);
                                        }
                                    }
                                }
                                int i9 = gnVar.cacheType;
                                if ((i9 == 20 || i9 == 21) && !TextUtils.isEmpty(gnVar.emoji)) {
                                    vm vmVar = bnVar2.f;
                                    String str = gnVar.emoji;
                                    if (vmVar != null) {
                                        vmVar.q(str);
                                    } else {
                                        bnVar2.h = gw3.g(str);
                                    }
                                }
                                bnVar2.w = a(layout, spanned.getSpanStart(gnVar), spanned.getSpanEnd(gnVar));
                                bnVar2.e = new Rect();
                                bnVar2.d = gnVar;
                                arrayList.add(bnVar2);
                                HashMap hashMap = r0.b;
                                en enVar = (en) hashMap.get(layout);
                                if (enVar == null) {
                                    enVar = new en(bnVar2.a, layout);
                                    hashMap.put(layout, enVar);
                                    r0.c.add(enVar);
                                }
                                enVar.b.add(bnVar2);
                                enVar.a();
                                vm vmVar2 = bnVar2.f;
                                if (vmVar2 != null) {
                                    vmVar2.a(bnVar2);
                                }
                            } else {
                                i3 = i6;
                                bnVar.w = a(layout, spanned.getSpanStart(gnVar), spanned.getSpanEnd(gnVar));
                            }
                        }
                        i7++;
                        i6 = i3;
                        fontMetricsInt = null;
                        i5 = 0;
                        r0 = r0;
                    }
                    i2 = i6;
                    cnVar2 = r0;
                } else {
                    i2 = i6;
                    gnVarArr = null;
                    cnVar2 = cnVar2;
                }
                if (cnVar2 != null) {
                    ArrayList arrayList2 = cnVar2.a;
                    int i10 = 0;
                    while (i10 < arrayList2.size()) {
                        if (((bn) arrayList2.get(i10)).c == layout) {
                            gn gnVar2 = ((bn) arrayList2.get(i10)).d;
                            for (int i11 = 0; gnVarArr != null && i11 < gnVarArr.length; i11++) {
                                if (gnVarArr[i11] != gnVar2) {
                                }
                            }
                            cnVar2.b(i10);
                            i10--;
                        }
                        i10++;
                    }
                }
                i6 = i2 + 1;
                fontMetricsInt = null;
                i5 = 0;
            }
            if (cnVar2 != null) {
                ArrayList arrayList3 = cnVar2.a;
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    Layout layout2 = ((bn) arrayList3.get(i12)).c;
                    int i13 = 0;
                    while (true) {
                        if (i13 < layoutArr.length) {
                            if (layoutArr[i13] != layout2) {
                                i13++;
                            }
                        } else {
                            cnVar2.b(i12);
                            i12--;
                            break;
                        }
                    }
                    i12++;
                }
            }
            return cnVar2;
        } else if (cnVar2 != null) {
            ArrayList arrayList4 = cnVar2.a;
            arrayList4.clear();
            while (arrayList4.size() > 0) {
                cnVar2.b(0);
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
        this.scale = gm.R1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public final void c(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.extraScale = floatValue;
        this.scale = gm.R1(0.0f, 1.0f, floatValue);
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
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
                public final gn b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b = r2;
                    gn gnVar = this.b;
                    switch (b) {
                        case 0:
                            gnVar.b(valueAnimator2);
                            return;
                        default:
                            gnVar.c(valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new an(this, (byte) 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(d53.f);
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
                public final gn b;

                {
                    this.b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b = r2;
                    gn gnVar = this.b;
                    switch (b) {
                        case 0:
                            gnVar.b(valueAnimator22);
                            return;
                        default:
                            gnVar.c(valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new an(this, (byte) 1));
            this.scaleAnimator.setInterpolator(d53.f);
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
            int L = gm.L(8.0f);
            int L2 = gm.L(10.0f);
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
                this.size = gm.L(20.0f);
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

    public gn setMinimumLineHeight(int i) {
        this.minimumLineHeight = i;
        return this;
    }

    public gn setPreserveFontMetrics(boolean z) {
        this.preserveFontMetrics = z;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public gn setSize(int i) {
        this.size = i;
        return this;
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static void release(View view, cn cnVar) {
        if (cnVar != null) {
            while (cnVar.a.size() > 0) {
                cnVar.b(0);
            }
        }
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i, int i2) {
        this.fontMetrics = fontMetricsInt;
        this.size = i;
        this.cacheType = i2;
    }

    public gn(TLRPC.Document document, float f, Paint.FontMetricsInt fontMetricsInt) {
        this(document.id, f, fontMetricsInt);
        this.document = document;
    }

    public gn(long j, Paint.FontMetricsInt fontMetricsInt) {
        this(j, 1.2f, fontMetricsInt);
    }

    public gn(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
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

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, cn cnVar, float f, List<rna> list, float f2, float f3, float f4, float f5) {
        drawAnimatedEmojis(canvas, layout, cnVar, f, list, f2, f3, f4, f5, null);
    }

    public static cn update(int i, View view, cn cnVar, ArrayList<h47> arrayList, boolean z) {
        return update(i, view, false, cnVar, arrayList, z);
    }

    public static cn update(int i, View view, boolean z, cn cnVar, ArrayList<h47> arrayList) {
        return update(i, view, z, cnVar, arrayList, false);
    }

    public static cn update(int i, View view, boolean z, cn cnVar, ArrayList<h47> arrayList, boolean z2) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                layoutArr[i2] = arrayList.get(i2).e;
            }
        }
        return update(i, view, z, cnVar, z2, layoutArr);
    }

    public static cn update(int i, View view, cn cnVar, Layout... layoutArr) {
        return update(i, view, false, cnVar, layoutArr);
    }

    public static cn update(int i, View view, boolean z, cn cnVar, Layout... layoutArr) {
        return update(i, view, z, cnVar, false, layoutArr);
    }

    public static cn update(int i, View view, cn cnVar, ArrayList<h47> arrayList) {
        return update(i, view, cnVar, arrayList, false);
    }

    public static LongSparseArray<vm> update(View view, gn[] gnVarArr, LongSparseArray<vm> longSparseArray) {
        return update(0, view, gnVarArr, longSparseArray);
    }

    public static LongSparseArray<vm> update(int i, View view, gn[] gnVarArr, LongSparseArray<vm> longSparseArray) {
        int i2;
        vm m;
        int i3;
        if (gnVarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i4 = 0;
        while (i4 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i4);
            vm vmVar = longSparseArray.get(keyAt);
            if (vmVar == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (gn gnVar : gnVarArr) {
                    i3 = (gnVar == null || gnVar.getDocumentId() != keyAt) ? i3 + 1 : 0;
                }
                vmVar.o(view);
                longSparseArray.remove(keyAt);
            }
            i4--;
            i4++;
        }
        for (gn gnVar2 : gnVarArr) {
            if (gnVar2 != null && longSparseArray.get(gnVar2.getDocumentId()) == null) {
                if (gnVar2.standard) {
                    i2 = 8;
                } else {
                    i2 = gnVar2.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                TLRPC.Document document = gnVar2.document;
                int i5 = z8c.t0;
                if (document != null) {
                    m = vm.l(i5, i2, document);
                } else {
                    m = vm.m(i5, gnVar2.documentId, null, i2);
                }
                m.b(view);
                longSparseArray.put(gnVar2.getDocumentId(), m);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<vm> update(View view, ArrayList<gn> arrayList, LongSparseArray<vm> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<vm> update(int i, View view, ArrayList<gn> arrayList, LongSparseArray<vm> longSparseArray) {
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
            vm vmVar = longSparseArray.get(keyAt);
            if (vmVar == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i3 = 0; i3 < arrayList.size(); i3 = i3 + 1) {
                    i3 = (arrayList.get(i3) == null || arrayList.get(i3).getDocumentId() != keyAt) ? i3 + 1 : 0;
                }
                vmVar.b(view);
                longSparseArray.remove(keyAt);
            }
            i4--;
            i4++;
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            gn gnVar = arrayList.get(i5);
            if (gnVar != null && longSparseArray.get(gnVar.getDocumentId()) == null) {
                if (gnVar.standard) {
                    i2 = 8;
                } else {
                    i2 = gnVar.cacheType;
                    if (i2 < 0) {
                        i2 = i;
                    }
                }
                vm m = vm.m(z8c.t0, gnVar.documentId, null, i2);
                m.b(view);
                longSparseArray.put(gnVar.getDocumentId(), m);
            }
        }
        return longSparseArray;
    }
}
