package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class q02 implements TextWatcher {
    public final byte a;
    public boolean b;
    public boolean c;
    public final KeyEvent.Callback d;

    public q02(KeyEvent.Callback callback, byte b) {
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
                n12 n12Var = (n12) callback;
                in inVar = n12Var.u1;
                p02 p02Var = n12Var.B2;
                in inVar2 = n12Var.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    f12 f12Var = n12Var.v2;
                    if (f12Var != null) {
                        f12Var.E(f12Var.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    pv3.l(editable, p02Var.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                n12Var.F1 = codePointCount;
                fm0 fm0Var = n12Var.o1;
                if (codePointCount > 0) {
                    z = true;
                } else {
                    z = false;
                }
                fm0Var.a(z, true);
                int i2 = n12Var.E1;
                if (i2 > 0 && (i = i2 - n12Var.F1) <= 100) {
                    if (i < -9999) {
                        i = -9999;
                    }
                    long j = i;
                    String E = ob6.E(j, ',');
                    if (inVar2.getVisibility() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    inVar2.c(E, z3, true);
                    if (inVar2.getVisibility() != 0) {
                        inVar2.setVisibility(0);
                        inVar2.setAlpha(0.0f);
                        inVar2.setScaleX(0.5f);
                        inVar2.setScaleY(0.5f);
                    }
                    inVar2.animate().setListener(null).cancel();
                    inVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i < 0) {
                        yob.U(inVar2, aob.p7, n12Var.J0);
                        z2 = false;
                    } else {
                        yob.U(inVar2, aob.y6, n12Var.J0);
                        z2 = true;
                    }
                    inVar.c(ob6.E(j, ','), false, true);
                    inVar.setAlpha(1.0f);
                } else {
                    inVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new jb1(this, (byte) 11));
                    inVar.setAlpha(0.0f);
                    z2 = true;
                }
                if (n12Var.R2 != z2) {
                    n12Var.R2 = z2;
                    n12Var.F2.invalidate();
                }
                if (!n12Var.W1) {
                    if (p02Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(p02Var.getText().toString().trim())) {
                        z4 = true;
                    }
                    n12Var.x1(z4);
                }
                n12Var.J0(true);
                return;
            default:
                duc ducVar = (duc) callback;
                if (this.b) {
                    this.b = false;
                    this.c = true;
                    try {
                        editable.append('.');
                        this.c = false;
                        ducVar.c.setSelection(editable.length());
                        return;
                    } catch (Throwable th) {
                        this.c = false;
                        throw th;
                    }
                }
                ducVar.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                duc ducVar = (duc) this.d;
                ytc ytcVar = ducVar.c;
                if (charSequence.length() > 0 && i2 == charSequence.length() && i3 == 0 && ytcVar.getLayout() != null) {
                    ducVar.O = ytcVar.getLayout().getLineLeft(0) - ytcVar.getScrollX();
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
                n12 n12Var = (n12) callback;
                if (i3 - i2 >= 1) {
                    this.b = true;
                }
                if (n12Var.B4 == null) {
                    n12Var.P0();
                }
                if (n12Var.B4.getAdapter() != null) {
                    n12Var.B4.setReversed(false);
                    n12Var.B4.getAdapter().U(charSequence, n12Var.B2.getEditText().getSelectionStart(), null, false, false);
                    n12Var.F1();
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
                duc ducVar = (duc) callback;
                if (!ducVar.S && !this.c) {
                    if (i2 != 0 || i3 != 0) {
                        yrc yrcVar = ducVar.d;
                        if (i3 <= 0 || i3 < i2) {
                            z2 = false;
                        }
                        if (yrcVar.y && yrcVar.r && yrcVar.E == -1) {
                            e29 e29Var = yrcVar.h;
                            if (e29Var != null) {
                                if (!e29Var.b()) {
                                    yrcVar.h.setProgress(0.0f);
                                    yrcVar.h.d();
                                    return;
                                }
                                return;
                            }
                            float f2 = yrcVar.e0;
                            if (z2) {
                                f = -160.0f;
                            } else {
                                f = 160.0f;
                            }
                            yrcVar.e0 = xnb.f(f2, f, 360.0f, -360.0f);
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
