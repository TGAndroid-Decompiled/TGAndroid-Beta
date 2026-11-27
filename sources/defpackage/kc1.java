package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class kc1 extends rlb {
    public final ArrayList D0;
    public o7b E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public ic1 J0;
    public hc1 K0;
    public pcc L0;
    public pcc M0;
    public final p1 N0;
    public jc1 O0;
    public float P0;

    public kc1(Context context, PointF pointF, int i, igb igbVar) {
        super(context, pointF, i, "", igbVar, 3);
        this.D0 = new ArrayList();
        this.N0 = new p1(this, (byte) 14);
        this.P0 = -1.0f;
        getEditText().setMaxLines(3);
        getEditText().setTallFrame(true);
        getEditText().addTextChangedListener(new c7(this, (byte) 4));
    }

    public static void v(ju3 ju3Var, int i) {
        if (i == 3) {
            float textSize = ju3Var.getTextSize();
            ju3Var.setShadowLayer(Math.max(1.0f, 0.09f * textSize), 0.0f, textSize * 0.025f, Integer.MIN_VALUE);
            return;
        }
        ju3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public float getLineWidth() {
        return (this.I0 - getEditText().getPaddingLeft()) - getEditText().getPaddingRight();
    }

    public ArrayList<o7b> getSegments() {
        return this.D0;
    }

    @Override
    public float getSelectionWidth() {
        float f = this.P0;
        if (f >= 0.0f) {
            return f;
        }
        return super.getSelectionWidth();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p1 p1Var = this.N0;
        removeCallbacks(p1Var);
        postOnAnimation(p1Var);
    }

    @Override
    public final void onDetachedFromWindow() {
        removeCallbacks(this.N0);
        super.onDetachedFromWindow();
    }

    @Override
    public final void q() {
        if (!this.G0) {
            this.G0 = true;
            getEditText().setSpokenWords(null);
            pcc pccVar = this.L0;
            if (pccVar != null) {
                pccVar.a(Boolean.TRUE);
            }
        }
        super.q();
    }

    @Override
    public final void r() {
        super.r();
        if (this.G0) {
            this.G0 = false;
            pcc pccVar = this.L0;
            if (pccVar != null) {
                pccVar.a(Boolean.FALSE);
            }
            z();
        }
    }

    @Override
    public final void s() {
        super.s();
        if (getEditText() != null) {
            v(getEditText(), getType());
        }
    }

    @Override
    public void setBaseFontSize(int i) {
        super.setBaseFontSize(i);
        v(getEditText(), getType());
    }

    public void setLoading(boolean z) {
        if (this.F0 == z) {
            return;
        }
        this.F0 = z;
        t();
    }

    @Override
    public void setMaxWidth(int i) {
        this.I0 = i;
        super.setMaxWidth(i);
    }

    public void setOnEditing(pcc pccVar) {
        this.L0 = pccVar;
    }

    public void setOnSeek(pcc pccVar) {
        this.M0 = pccVar;
    }

    public void setPendingProvider(hc1 hc1Var) {
        this.K0 = hc1Var;
    }

    public void setPositionProvider(ic1 ic1Var) {
        this.J0 = ic1Var;
    }

    public void setRangeProvider(jc1 jc1Var) {
        this.O0 = jc1Var;
    }

    public void setSegments(ArrayList<o7b> arrayList) {
        ArrayList<o7b> arrayList2 = this.D0;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        o7b o7bVar = this.E0;
        if (o7bVar != null && !arrayList2.contains(o7bVar) && !this.G0) {
            this.E0 = null;
        }
        z();
    }

    public void setSelectionWidth(float f) {
        if (this.P0 == f) {
            return;
        }
        this.P0 = f;
        m();
    }

    @Override
    public final void t() {
        ju3 editText = getEditText();
        if (editText == null) {
            return;
        }
        if (this.F0 && editText.getText().length() <= 0) {
            editText.setHint("…");
            editText.setHintTextColor(-1711276033);
            return;
        }
        editText.setHint((CharSequence) null);
    }

    public final void u(long j, long j2, String str, int[] iArr) {
        ?? obj = new Object();
        obj.a = j;
        obj.b = j2;
        obj.c = str;
        obj.d = iArr;
        obj.e = true;
        this.D0.add(obj);
    }

    public final o7b w(int i) {
        int indexOf;
        int i2;
        o7b o7bVar = this.E0;
        ArrayList arrayList = this.D0;
        if (o7bVar == null) {
            indexOf = -1;
        } else {
            indexOf = arrayList.indexOf(o7bVar);
        }
        if (indexOf >= 0 && (i2 = indexOf + i) >= 0 && i2 < arrayList.size()) {
            o7b o7bVar2 = (o7b) arrayList.get(i2);
            jc1 jc1Var = this.O0;
            if (jc1Var != null) {
                long J = ((gc1) ((z8d) jc1Var).b).a.J();
                long G = ((gc1) ((z8d) this.O0).b).a.G();
                if (o7bVar2.b > J) {
                    if (G > J && o7bVar2.a >= G) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return o7bVar2;
        }
        return null;
    }

    public final CharSequence x(int i) {
        o7b o7bVar;
        if (this.G0) {
            o7bVar = w(i);
        } else {
            o7bVar = null;
        }
        if (o7bVar == null) {
            return null;
        }
        CharSequence charSequence = o7bVar.c;
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    public final void y(int i, int i2, ArrayList arrayList) {
        Typeface typeface;
        String charSequence;
        float f;
        float f2;
        float f3;
        int i3;
        int[] iArr;
        kc1 kc1Var = this;
        int i4 = i;
        ArrayList arrayList2 = kc1Var.D0;
        if (!arrayList2.isEmpty() && i4 > 0 && i2 > 0) {
            ju3 ju3Var = new ju3(kc1Var.getContext());
            ju3Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            int i5 = 0;
            ju3Var.setBackgroundColor(0);
            ju3Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
            if (kc1Var.getTypeface() != null) {
                typeface = kc1Var.getTypeface().b();
            } else {
                typeface = null;
            }
            if (typeface != null) {
                ju3Var.setTypeface(typeface);
            }
            ju3Var.setTextSize(0, kc1Var.getTextSize());
            ju3Var.setBreakStrategy(0);
            if (kc1Var.getType() != 3) {
                ju3Var.setFrameColor(-16777216);
            }
            ju3Var.setHorizontallyScrolling(false);
            ju3Var.setMaxLines(3);
            int i6 = kc1Var.I0;
            if (i6 > 0) {
                ju3Var.setMaxWidth(i6);
            }
            float f4 = 2.0f;
            float width = (kc1Var.getWidth() / 2.0f) + kc1Var.getX();
            float height = (kc1Var.getHeight() / 2.0f) + kc1Var.getY();
            float scaleX = kc1Var.getScaleX();
            int i7 = 0;
            while (i7 < arrayList2.size()) {
                o7b o7bVar = (o7b) arrayList2.get(i7);
                CharSequence charSequence2 = o7bVar.c;
                if (charSequence2 == null) {
                    charSequence = "";
                } else {
                    charSequence = charSequence2.toString();
                }
                if (!charSequence.trim().isEmpty()) {
                    f = width;
                    if (o7bVar.b > o7bVar.a) {
                        ju3Var.setText(charSequence);
                        int i8 = kc1Var.I0;
                        if (i8 > 0) {
                            i3 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
                        } else {
                            i3 = i5;
                        }
                        ju3Var.measure(i3, i5);
                        int measuredWidth = ju3Var.getMeasuredWidth() + 1;
                        int measuredHeight = ju3Var.getMeasuredHeight();
                        if (measuredWidth > 0 && measuredHeight > 0) {
                            mec mecVar = new mec();
                            mecVar.a = (byte) 11;
                            f2 = f4;
                            f3 = height;
                            mecVar.V = o7bVar.a;
                            mecVar.W = o7bVar.b;
                            int[] iArr2 = o7bVar.d;
                            if (iArr2 == null) {
                                iArr = null;
                            } else {
                                iArr = (int[]) iArr2.clone();
                            }
                            mecVar.X = iArr;
                            mecVar.j = charSequence;
                            mecVar.b = (byte) kc1Var.getType();
                            mecVar.l = kc1Var.getSwatch().a;
                            mecVar.m = kc1Var.getTextSize();
                            mecVar.n = kc1Var.getTypeface();
                            mecVar.p = kc1Var.getAlign();
                            mecVar.q = measuredWidth;
                            mecVar.r = measuredHeight;
                            float f5 = measuredWidth;
                            float f6 = f5 * scaleX;
                            float f7 = i4;
                            mecVar.f = f6 / f7;
                            float f8 = measuredHeight;
                            float f9 = f8 * scaleX;
                            float f10 = i2;
                            mecVar.g = f9 / f10;
                            mecVar.c = (f - (f6 / f2)) / f7;
                            mecVar.d = (f3 - (f9 / f2)) / f10;
                            mecVar.e = (float) ((-kc1Var.getRotation()) * 0.017453292519943295d);
                            mecVar.y = f / f7;
                            mecVar.z = f3 / f10;
                            mecVar.w = f5 / f7;
                            mecVar.x = f8 / f10;
                            mecVar.v = scaleX;
                            arrayList.add(mecVar);
                            i7++;
                            kc1Var = this;
                            i4 = i;
                            f4 = f2;
                            width = f;
                            height = f3;
                            i5 = 0;
                        }
                    }
                } else {
                    f = width;
                }
                f2 = f4;
                f3 = height;
                i7++;
                kc1Var = this;
                i4 = i;
                f4 = f2;
                width = f;
                height = f3;
                i5 = 0;
            }
        }
    }

    public final void z() {
        ic1 ic1Var;
        int[] iArr;
        o7b o7bVar;
        boolean z;
        if (!this.G0 && (ic1Var = this.J0) != null && !this.s) {
            long j = ic1Var.get();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.D0;
                iArr = null;
                if (i < arrayList.size()) {
                    o7bVar = (o7b) arrayList.get(i);
                    if (j >= o7bVar.a && j < o7bVar.b) {
                        break;
                    }
                    i++;
                } else {
                    o7bVar = null;
                    break;
                }
            }
            hc1 hc1Var = this.K0;
            if (hc1Var != null) {
                if (o7bVar == null) {
                    r7b r7bVar = (r7b) ((tg0) hc1Var).b;
                    if (r7bVar.o && !r7bVar.h && !r7bVar.e(r7b.a(j))) {
                        r7bVar.f();
                        z = true;
                        setLoading(z);
                    }
                }
                z = false;
                setLoading(z);
            }
            String str = (o7bVar == null || (str = o7bVar.c) == null) ? "" : "";
            if (o7bVar != this.E0 || !TextUtils.equals(str, getText())) {
                this.E0 = o7bVar;
                this.H0 = true;
                setText(str);
                this.H0 = false;
            }
            ju3 editText = getEditText();
            if (o7bVar != null) {
                iArr = o7bVar.d;
            }
            editText.setSpokenWords(iArr);
            getEditText().A(j);
        }
    }
}
