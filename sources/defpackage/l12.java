package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
public final class l12 implements TextWatcher {
    public final byte a;
    public boolean b;
    public boolean c;
    public final KeyEvent.Callback d;

    public l12(KeyEvent.Callback callback, byte b) {
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
                i22 i22Var = (i22) callback;
                io ioVar = i22Var.u1;
                k12 k12Var = i22Var.B2;
                io ioVar2 = i22Var.t1;
                if (this.c != TextUtils.isEmpty(editable)) {
                    a22 a22Var = i22Var.v2;
                    if (a22Var != null) {
                        a22Var.E(a22Var.getSelectedItemsCount());
                    }
                    this.c = !this.c;
                }
                if (this.b) {
                    for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                        editable.removeSpan(imageSpan);
                    }
                    gw3.l(editable, k12Var.getEditText().getPaint().getFontMetricsInt(), false);
                    this.b = false;
                }
                int codePointCount = Character.codePointCount(editable, 0, editable.length());
                i22Var.F1 = codePointCount;
                fn0 fn0Var = i22Var.o1;
                if (codePointCount > 0) {
                    z = true;
                } else {
                    z = false;
                }
                fn0Var.a(z, true);
                int i2 = i22Var.E1;
                if (i2 > 0 && (i = i2 - i22Var.F1) <= 100) {
                    if (i < -9999) {
                        i = -9999;
                    }
                    long j = i;
                    String E = jb6.E(j, ',');
                    if (ioVar2.getVisibility() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ioVar2.c(E, z3, true);
                    if (ioVar2.getVisibility() != 0) {
                        ioVar2.setVisibility(0);
                        ioVar2.setAlpha(0.0f);
                        ioVar2.setScaleX(0.5f);
                        ioVar2.setScaleY(0.5f);
                    }
                    ioVar2.animate().setListener(null).cancel();
                    ioVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                    if (i < 0) {
                        anb.U(ioVar2, cmb.o7, i22Var.J0);
                        z2 = false;
                    } else {
                        anb.U(ioVar2, cmb.x6, i22Var.J0);
                        z2 = true;
                    }
                    ioVar.c(jb6.E(j, ','), false, true);
                    ioVar.setAlpha(1.0f);
                } else {
                    ioVar2.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(100L).setListener(new b91(this, (byte) 13));
                    ioVar.setAlpha(0.0f);
                    z2 = true;
                }
                if (i22Var.R2 != z2) {
                    i22Var.R2 = z2;
                    i22Var.F2.invalidate();
                }
                if (!i22Var.W1) {
                    if (k12Var.getEditText().getLineCount() > 2 && !TextUtils.isEmpty(k12Var.getText().toString().trim())) {
                        z4 = true;
                    }
                    i22Var.w1(z4);
                }
                i22Var.I0(true);
                return;
            default:
                qrc qrcVar = (qrc) callback;
                if (this.b) {
                    this.b = false;
                    this.c = true;
                    try {
                        editable.append('.');
                        this.c = false;
                        qrcVar.c.setSelection(editable.length());
                        return;
                    } catch (Throwable th) {
                        this.c = false;
                        throw th;
                    }
                }
                qrcVar.f(editable);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                return;
            default:
                qrc qrcVar = (qrc) this.d;
                mrc mrcVar = qrcVar.c;
                if (charSequence.length() > 0 && i2 == charSequence.length() && i3 == 0 && mrcVar.getLayout() != null) {
                    qrcVar.O = mrcVar.getLayout().getLineLeft(0) - mrcVar.getScrollX();
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
                i22 i22Var = (i22) callback;
                if (i3 - i2 >= 1) {
                    this.b = true;
                }
                if (i22Var.B4 == null) {
                    i22Var.O0();
                }
                if (i22Var.B4.getAdapter() != null) {
                    i22Var.B4.setReversed(false);
                    i22Var.B4.getAdapter().U(charSequence, i22Var.B2.getEditText().getSelectionStart(), null, false, false);
                    i22Var.E1();
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
                qrc qrcVar = (qrc) callback;
                if (!qrcVar.S && !this.c) {
                    if (i2 != 0 || i3 != 0) {
                        npc npcVar = qrcVar.d;
                        if (i3 <= 0 || i3 < i2) {
                            z2 = false;
                        }
                        if (npcVar.y && npcVar.r && npcVar.E == -1) {
                            s09 s09Var = npcVar.h;
                            if (s09Var != null) {
                                if (!s09Var.b()) {
                                    npcVar.h.setProgress(0.0f);
                                    npcVar.h.d();
                                    return;
                                }
                                return;
                            }
                            float f2 = npcVar.e0;
                            if (z2) {
                                f = -160.0f;
                            } else {
                                f = 160.0f;
                            }
                            npcVar.e0 = mlb.f(f2, f, 360.0f, -360.0f);
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
