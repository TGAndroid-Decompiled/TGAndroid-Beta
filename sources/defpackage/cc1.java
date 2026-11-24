package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class cc1 extends vhb {
    public final ArrayList D0;
    public r3b E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public ac1 J0;
    public zb1 K0;
    public p8c L0;
    public p8c M0;
    public final o1 N0;
    public bc1 O0;
    public float P0;

    public cc1(Context context, PointF pointF, int i, mcb mcbVar) {
        super(context, pointF, i, "", mcbVar, 3);
        this.D0 = new ArrayList();
        this.N0 = new o1(this, (byte) 14);
        this.P0 = -1.0f;
        getEditText().setMaxLines(3);
        getEditText().setTallFrame(true);
        getEditText().addTextChangedListener(new b7(this, (byte) 4));
    }

    public static void v(st3 st3Var, int i) {
        if (i == 3) {
            float textSize = st3Var.getTextSize();
            st3Var.setShadowLayer(Math.max(1.0f, 0.09f * textSize), 0.0f, textSize * 0.025f, Integer.MIN_VALUE);
            return;
        }
        st3Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }

    public float getLineWidth() {
        return (this.I0 - getEditText().getPaddingLeft()) - getEditText().getPaddingRight();
    }

    public ArrayList<r3b> getSegments() {
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
            p8c p8cVar = this.L0;
            if (p8cVar != null) {
                p8cVar.a(Boolean.TRUE);
            }
        }
        super.q();
    }

    @Override
    public final void r() {
        super.r();
        if (this.G0) {
            this.G0 = false;
            p8c p8cVar = this.L0;
            if (p8cVar != null) {
                p8cVar.a(Boolean.FALSE);
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

    public void setOnEditing(p8c p8cVar) {
        this.L0 = p8cVar;
    }

    public void setOnSeek(p8c p8cVar) {
        this.M0 = p8cVar;
    }

    public void setPendingProvider(zb1 zb1Var) {
        this.K0 = zb1Var;
    }

    public void setPositionProvider(ac1 ac1Var) {
        this.J0 = ac1Var;
    }

    public void setRangeProvider(bc1 bc1Var) {
        this.O0 = bc1Var;
    }

    public void setSegments(ArrayList<r3b> arrayList) {
        ArrayList<r3b> arrayList2 = this.D0;
        if (arrayList != arrayList2) {
            arrayList2.clear();
            arrayList2.addAll(arrayList);
        }
        r3b r3bVar = this.E0;
        if (r3bVar != null && !arrayList2.contains(r3bVar) && !this.G0) {
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
        st3 editText = getEditText();
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

    public final r3b w(int i) {
        int indexOf;
        int i2;
        r3b r3bVar = this.E0;
        ArrayList arrayList = this.D0;
        if (r3bVar == null) {
            indexOf = -1;
        } else {
            indexOf = arrayList.indexOf(r3bVar);
        }
        if (indexOf >= 0 && (i2 = indexOf + i) >= 0 && i2 < arrayList.size()) {
            r3b r3bVar2 = (r3b) arrayList.get(i2);
            bc1 bc1Var = this.O0;
            if (bc1Var != null) {
                long I = ((yb1) ((i4d) bc1Var).a).a.I();
                long F = ((yb1) ((i4d) this.O0).a).a.F();
                if (r3bVar2.b > I) {
                    if (F > I && r3bVar2.a >= F) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            return r3bVar2;
        }
        return null;
    }

    public final CharSequence x(int i) {
        r3b r3bVar;
        if (this.G0) {
            r3bVar = w(i);
        } else {
            r3bVar = null;
        }
        if (r3bVar == null) {
            return null;
        }
        CharSequence charSequence = r3bVar.c;
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
        cc1 cc1Var = this;
        int i4 = i;
        ArrayList arrayList2 = cc1Var.D0;
        if (!arrayList2.isEmpty() && i4 > 0 && i2 > 0) {
            st3 st3Var = new st3(cc1Var.getContext());
            st3Var.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            int i5 = 0;
            st3Var.setBackgroundColor(0);
            st3Var.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
            if (cc1Var.getTypeface() != null) {
                typeface = cc1Var.getTypeface().b();
            } else {
                typeface = null;
            }
            if (typeface != null) {
                st3Var.setTypeface(typeface);
            }
            st3Var.setTextSize(0, cc1Var.getTextSize());
            st3Var.setBreakStrategy(0);
            if (cc1Var.getType() != 3) {
                st3Var.setFrameColor(-16777216);
            }
            st3Var.setHorizontallyScrolling(false);
            st3Var.setMaxLines(3);
            int i6 = cc1Var.I0;
            if (i6 > 0) {
                st3Var.setMaxWidth(i6);
            }
            float f4 = 2.0f;
            float width = (cc1Var.getWidth() / 2.0f) + cc1Var.getX();
            float height = (cc1Var.getHeight() / 2.0f) + cc1Var.getY();
            float scaleX = cc1Var.getScaleX();
            int i7 = 0;
            while (i7 < arrayList2.size()) {
                r3b r3bVar = (r3b) arrayList2.get(i7);
                CharSequence charSequence2 = r3bVar.c;
                if (charSequence2 == null) {
                    charSequence = "";
                } else {
                    charSequence = charSequence2.toString();
                }
                if (!charSequence.trim().isEmpty()) {
                    f = width;
                    if (r3bVar.b > r3bVar.a) {
                        st3Var.setText(charSequence);
                        int i8 = cc1Var.I0;
                        if (i8 > 0) {
                            i3 = View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
                        } else {
                            i3 = i5;
                        }
                        st3Var.measure(i3, i5);
                        int measuredWidth = st3Var.getMeasuredWidth() + 1;
                        int measuredHeight = st3Var.getMeasuredHeight();
                        if (measuredWidth > 0 && measuredHeight > 0) {
                            mac macVar = new mac();
                            macVar.a = (byte) 11;
                            f2 = f4;
                            f3 = height;
                            macVar.V = r3bVar.a;
                            macVar.W = r3bVar.b;
                            int[] iArr2 = r3bVar.d;
                            if (iArr2 == null) {
                                iArr = null;
                            } else {
                                iArr = (int[]) iArr2.clone();
                            }
                            macVar.X = iArr;
                            macVar.j = charSequence;
                            macVar.b = (byte) cc1Var.getType();
                            macVar.l = cc1Var.getSwatch().a;
                            macVar.m = cc1Var.getTextSize();
                            macVar.n = cc1Var.getTypeface();
                            macVar.p = cc1Var.getAlign();
                            macVar.q = measuredWidth;
                            macVar.r = measuredHeight;
                            float f5 = measuredWidth;
                            float f6 = f5 * scaleX;
                            float f7 = i4;
                            macVar.f = f6 / f7;
                            float f8 = measuredHeight;
                            float f9 = f8 * scaleX;
                            float f10 = i2;
                            macVar.g = f9 / f10;
                            macVar.c = (f - (f6 / f2)) / f7;
                            macVar.d = (f3 - (f9 / f2)) / f10;
                            macVar.e = (float) ((-cc1Var.getRotation()) * 0.017453292519943295d);
                            macVar.y = f / f7;
                            macVar.z = f3 / f10;
                            macVar.w = f5 / f7;
                            macVar.x = f8 / f10;
                            macVar.v = scaleX;
                            arrayList.add(macVar);
                            i7++;
                            cc1Var = this;
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
                cc1Var = this;
                i4 = i;
                f4 = f2;
                width = f;
                height = f3;
                i5 = 0;
            }
        }
    }

    public final void z() {
        ac1 ac1Var;
        int[] iArr;
        r3b r3bVar;
        boolean z;
        if (!this.G0 && (ac1Var = this.J0) != null && !this.s) {
            long j = ac1Var.get();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.D0;
                iArr = null;
                if (i < arrayList.size()) {
                    r3bVar = (r3b) arrayList.get(i);
                    if (j >= r3bVar.a && j < r3bVar.b) {
                        break;
                    }
                    i++;
                } else {
                    r3bVar = null;
                    break;
                }
            }
            zb1 zb1Var = this.K0;
            if (zb1Var != null) {
                if (r3bVar == null) {
                    u3b u3bVar = (u3b) ((sg0) zb1Var).b;
                    if (u3bVar.o && !u3bVar.h && !u3bVar.e(u3b.a(j))) {
                        u3bVar.f();
                        z = true;
                        setLoading(z);
                    }
                }
                z = false;
                setLoading(z);
            }
            String str = (r3bVar == null || (str = r3bVar.c) == null) ? "" : "";
            if (r3bVar != this.E0 || !TextUtils.equals(str, getText())) {
                this.E0 = r3bVar;
                this.H0 = true;
                setText(str);
                this.H0 = false;
            }
            st3 editText = getEditText();
            if (r3bVar != null) {
                iArr = r3bVar.d;
            }
            editText.setSpokenWords(iArr);
            getEditText().A(j);
        }
    }
}
