package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class a02 implements TextWatcher {
    public final byte a;
    public boolean b;
    public boolean c;
    public final KeyEvent.Callback d;

    public a02(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.d = callback;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        byte b = this.a;
        boolean z4 = false;
        KeyEvent.Callback callback = this.d;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                hn hnVar = x02Var.u1;
                zz1 zz1Var = x02Var.B2;
                hn hnVar2 = x02Var.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    p02 p02Var = x02Var.v2;
                    if (p02Var != null) {
                        p02Var.E(p02Var.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    vu3.l(editable, zz1Var.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                x02Var.F1 = codePointCount;
                fm0 fm0Var = x02Var.o1;
                if (codePointCount > 0) {
                    z = true;
                } else {
                    z = false;
                }
                fm0Var.a(z, true);
                int i2 = x02Var.E1;
                if (i2 > 0 && (i = i2 - x02Var.F1) <= 100) {
                    if (i < -9999) {
                        i = -9999;
                    }
                    long j = i;
                    String E = k96.E(j, ',');
                    if (hnVar2.getVisibility() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    hnVar2.c(E, z3, true);
                    if (hnVar2.getVisibility() != 0) {
                        hnVar2.setVisibility(0);
                        hnVar2.setAlpha(0.0f);
                        hnVar2.setScaleX(0.5f);
                        hnVar2.setScaleY(0.5f);
                    }
                    hnVar2.animate().setListener(null).cancel();
                    hnVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i < 0) {
                        zkb.U(hnVar2, bkb.o7, x02Var.J0);
                        z2 = false;
                    } else {
                        zkb.U(hnVar2, bkb.x6, x02Var.J0);
                        z2 = true;
                    }
                    hnVar.c(k96.E(j, ','), false, true);
                    hnVar.setAlpha(1.0f);
                } else {
                    hnVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new bb1(this, (byte) 11));
                    hnVar.setAlpha(0.0f);
                    z2 = true;
                }
                if (x02Var.R2 != z2) {
                    x02Var.R2 = z2;
                    x02Var.F2.invalidate();
                }
                if (!x02Var.W1) {
                    if (zz1Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(zz1Var.getText().toString().trim())) {
                        z4 = true;
                    }
                    x02Var.w1(z4);
                }
                x02Var.I0(true);
                return;
            default:
                ppc ppcVar = (ppc) callback;
                if (this.b) {
                    this.b = false;
                    this.c = true;
                    try {
                        editable.append('.');
                        this.c = false;
                        ppcVar.c.setSelection(editable.length());
                        return;
                    } catch (Throwable th) {
                        this.c = false;
                        throw th;
                    }
                }
                ppcVar.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                ppc ppcVar = (ppc) this.d;
                lpc lpcVar = ppcVar.c;
                if (charSequence.length() > 0 && i2 == charSequence.length() && i3 == 0 && lpcVar.getLayout() != null) {
                    ppcVar.O = lpcVar.getLayout().getLineLeft(0) - lpcVar.getScrollX();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        float f;
        byte b = this.a;
        KeyEvent.Callback callback = this.d;
        boolean z2 = true;
        switch (b) {
            case 0:
                x02 x02Var = (x02) callback;
                if (i3 - i2 >= 1) {
                    this.b = true;
                }
                if (x02Var.B4 == null) {
                    x02Var.O0();
                }
                if (x02Var.B4.getAdapter() != null) {
                    x02Var.B4.setReversed(false);
                    x02Var.B4.getAdapter().U(charSequence, x02Var.B2.getEditText().getSelectionStart(), null, false, false);
                    x02Var.E1();
                    return;
                }
                return;
            default:
                if (i3 > 0 && TextUtils.equals(charSequence, "0")) {
                    z = true;
                } else {
                    z = false;
                }
                this.b = z;
                ppc ppcVar = (ppc) callback;
                if (!ppcVar.S && !this.c) {
                    if (i2 != 0 || i3 != 0) {
                        lnc lncVar = ppcVar.d;
                        if (i3 <= 0 || i3 < i2) {
                            z2 = false;
                        }
                        if (lncVar.y && lncVar.r && lncVar.E == -1) {
                            ry8 ry8Var = lncVar.h;
                            if (ry8Var != null) {
                                if (!ry8Var.b()) {
                                    lncVar.h.setProgress(0.0f);
                                    lncVar.h.d();
                                    return;
                                }
                                return;
                            }
                            float f2 = lncVar.e0;
                            if (z2) {
                                f = -160.0f;
                            } else {
                                f = 160.0f;
                            }
                            lncVar.e0 = yjb.f(f2, f, 360.0f, -360.0f);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }
}
