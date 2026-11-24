package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class kd1 extends xjb {
    public final ArrayList D0;
    public s5b E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public id1 J0;
    public hd1 K0;
    public qac L0;
    public qac M0;
    public final o1 N0;
    public jd1 O0;
    public float P0;

    public kd1(Context context, PointF pointF, int i, oeb oebVar) {
        super(context, pointF, i, "", oebVar, 3);
        this.D0 = new ArrayList();
        this.N0 = new o1(this, (byte) 14);
        this.P0 = -1.0f;
        getEditText().setMaxLines(3);
        getEditText().setTallFrame(true);
        getEditText().addTextChangedListener(new b7(this, (byte) 5));
    }

    public static void v(dv3 dv3Var, int i) {
        if (i == 3) {
            float textSize = dv3Var.getTextSize();
            dv3Var.setShadowLayer(Math.max(1.0f, 0.09f * textSize), 0.0f, textSize * 0.025f, Integer.MIN_VALUE);
            return;
        }
        dv3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public float getLineWidth() {
        return (this.I0 - getEditText().getPaddingLeft()) - getEditText().getPaddingRight();
    }

    public ArrayList<s5b> getSegments() {
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
        o1 o1Var = this.N0;
        removeCallbacks(o1Var);
        postOnAnimation(o1Var);
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
            qac qacVar = this.L0;
            if (qacVar != null) {
                qacVar.a(Boolean.TRUE);
            }
        }
        super.q();
    }

    @Override
    public final void r() {
        super.r();
        if (this.G0) {
            this.G0 = false;
            qac qacVar = this.L0;
            if (qacVar != null) {
                qacVar.a(Boolean.FALSE);
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

    public void setOnEditing(qac qacVar) {
        this.L0 = qacVar;
    }

    public void setOnSeek(qac qacVar) {
        this.M0 = qacVar;
    }

    public void setPendingProvider(hd1 hd1Var) {
        this.K0 = hd1Var;
    }

    public void setPositionProvider(id1 id1Var) {
        this.J0 = id1Var;
    }

    public void setRangeProvider(jd1 jd1Var) {
        this.O0 = jd1Var;
    }

    public void setSegments(ArrayList<s5b> arrayList) {
        ArrayList<s5b> arrayList2 = this.D0;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        s5b s5bVar = this.E0;
        if (s5bVar != null && !arrayList2.contains(s5bVar) && !this.G0) {
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
        dv3 editText = getEditText();
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

    public final s5b w(int i) {
        int indexOf;
        int i2;
        s5b s5bVar = this.E0;
        ArrayList arrayList = this.D0;
        if (s5bVar == null) {
            indexOf = -1;
        } else {
            indexOf = arrayList.indexOf(s5bVar);
        }
        if (indexOf >= 0 && (i2 = indexOf + i) >= 0 && i2 < arrayList.size()) {
            s5b s5bVar2 = (s5b) arrayList.get(i2);
            jd1 jd1Var = this.O0;
            if (jd1Var != null) {
                long N = ((gd1) ((k6d) jd1Var).b).a.N();
                long K = ((gd1) ((k6d) this.O0).b).a.K();
                if (s5bVar2.b > N) {
                    if (K > N && s5bVar2.a >= K) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return s5bVar2;
        }
        return null;
    }

    public final CharSequence x(int i) {
        s5b s5bVar;
        if (this.G0) {
            s5bVar = w(i);
        } else {
            s5bVar = null;
        }
        if (s5bVar == null) {
            return null;
        }
        CharSequence charSequence = s5bVar.c;
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
        kd1 kd1Var = this;
        int i4 = i;
        ArrayList arrayList2 = kd1Var.D0;
        if (!arrayList2.isEmpty() && i4 > 0 && i2 > 0) {
            dv3 dv3Var = new dv3(kd1Var.getContext());
            dv3Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            int i5 = 0;
            dv3Var.setBackgroundColor(0);
            dv3Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
            if (kd1Var.getTypeface() != null) {
                typeface = kd1Var.getTypeface().b();
            } else {
                typeface = null;
            }
            if (typeface != null) {
                dv3Var.setTypeface(typeface);
            }
            dv3Var.setTextSize(0, kd1Var.getTextSize());
            dv3Var.setBreakStrategy(0);
            if (kd1Var.getType() != 3) {
                dv3Var.setFrameColor(-16777216);
            }
            dv3Var.setHorizontallyScrolling(false);
            dv3Var.setMaxLines(3);
            int i6 = kd1Var.I0;
            if (i6 > 0) {
                dv3Var.setMaxWidth(i6);
            }
            float f4 = 2.0f;
            float width = (kd1Var.getWidth() / 2.0f) + kd1Var.getX();
            float height = (kd1Var.getHeight() / 2.0f) + kd1Var.getY();
            float scaleX = kd1Var.getScaleX();
            int i7 = 0;
            while (i7 < arrayList2.size()) {
                s5b s5bVar = (s5b) arrayList2.get(i7);
                CharSequence charSequence2 = s5bVar.c;
                if (charSequence2 == null) {
                    charSequence = "";
                } else {
                    charSequence = charSequence2.toString();
                }
                if (!charSequence.trim().isEmpty()) {
                    f = width;
                    if (s5bVar.b > s5bVar.a) {
                        dv3Var.setText(charSequence);
                        int i8 = kd1Var.I0;
                        if (i8 > 0) {
                            i3 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
                        } else {
                            i3 = i5;
                        }
                        dv3Var.measure(i3, i5);
                        int measuredWidth = dv3Var.getMeasuredWidth() + 1;
                        int measuredHeight = dv3Var.getMeasuredHeight();
                        if (measuredWidth > 0 && measuredHeight > 0) {
                            pcc pccVar = new pcc();
                            pccVar.a = (byte) 11;
                            f2 = f4;
                            f3 = height;
                            pccVar.V = s5bVar.a;
                            pccVar.W = s5bVar.b;
                            int[] iArr2 = s5bVar.d;
                            if (iArr2 == null) {
                                iArr = null;
                            } else {
                                iArr = (int[]) iArr2.clone();
                            }
                            pccVar.X = iArr;
                            pccVar.j = charSequence;
                            pccVar.b = (byte) kd1Var.getType();
                            pccVar.l = kd1Var.getSwatch().a;
                            pccVar.m = kd1Var.getTextSize();
                            pccVar.n = kd1Var.getTypeface();
                            pccVar.p = kd1Var.getAlign();
                            pccVar.q = measuredWidth;
                            pccVar.r = measuredHeight;
                            float f5 = measuredWidth;
                            float f6 = f5 * scaleX;
                            float f7 = i4;
                            pccVar.f = f6 / f7;
                            float f8 = measuredHeight;
                            float f9 = f8 * scaleX;
                            float f10 = i2;
                            pccVar.g = f9 / f10;
                            pccVar.c = (f - (f6 / f2)) / f7;
                            pccVar.d = (f3 - (f9 / f2)) / f10;
                            pccVar.e = (float) ((-kd1Var.getRotation()) * 0.017453292519943295d);
                            pccVar.y = f / f7;
                            pccVar.z = f3 / f10;
                            pccVar.w = f5 / f7;
                            pccVar.x = f8 / f10;
                            pccVar.v = scaleX;
                            arrayList.add(pccVar);
                            i7++;
                            kd1Var = this;
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
                kd1Var = this;
                i4 = i;
                f4 = f2;
                width = f;
                height = f3;
                i5 = 0;
            }
        }
    }

    public final void z() {
        id1 id1Var;
        int[] iArr;
        s5b s5bVar;
        boolean z;
        if (!this.G0 && (id1Var = this.J0) != null && !this.s) {
            long j = id1Var.get();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.D0;
                iArr = null;
                if (i < arrayList.size()) {
                    s5bVar = (s5b) arrayList.get(i);
                    if (j >= s5bVar.a && j < s5bVar.b) {
                        break;
                    }
                    i++;
                } else {
                    s5bVar = null;
                    break;
                }
            }
            hd1 hd1Var = this.K0;
            if (hd1Var != null) {
                if (s5bVar == null) {
                    v5b v5bVar = (v5b) ((cd1) hd1Var).b;
                    if (v5bVar.o && !v5bVar.h && !v5bVar.e(v5b.a(j))) {
                        v5bVar.f();
                        z = true;
                        setLoading(z);
                    }
                }
                z = false;
                setLoading(z);
            }
            String str = (s5bVar == null || (str = s5bVar.c) == null) ? "" : "";
            if (s5bVar != this.E0 || !TextUtils.equals(str, getText())) {
                this.E0 = s5bVar;
                this.H0 = true;
                setText(str);
                this.H0 = false;
            }
            dv3 editText = getEditText();
            if (s5bVar != null) {
                iArr = s5bVar.d;
            }
            editText.setSpokenWords(iArr);
            getEditText().A(j);
        }
    }
}
