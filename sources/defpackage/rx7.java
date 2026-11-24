package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Timer;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rx7 extends jja implements gk7, tjb {
    public int E;
    public int F;
    public double G;
    public double H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public final int M;
    public int N;
    public String O;
    public int P;
    public int Q;
    public final vx7 R;
    public String a;
    public String b;
    public final LinearLayout c;
    public EditTextBoldCursor[] d;
    public final TextView e;
    public final TextView f;
    public final ImageView h;
    public final wb n;
    public final wb r;
    public final sx7 s;
    public Timer w;
    public Timer x;
    public final Object y;

    public rx7(vx7 vx7Var, Context context, int i) {
        super(context);
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        this.R = vx7Var;
        this.y = new Object();
        this.E = 60000;
        this.F = 15000;
        this.L = "";
        this.O = "*";
        this.M = i;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        int i9 = bkb.C6;
        zkb.X(textView, i9, null);
        textView.setTextSize(1, 14.0f);
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        int i10 = bkb.F6;
        tb4.w(textView2, i10, null, 1, 18.0f);
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        textView2.setGravity(i2);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        textView2.setGravity(49);
        if (i == 3) {
            if (k96.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            textView.setGravity(i5 | 48);
            FrameLayout frameLayout = new FrameLayout(context);
            if (k96.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            addView(frameLayout, nme.r(-2, -2, i6));
            ImageView k = tb4.k(context, 2131232523);
            boolean z = k96.a0;
            if (z) {
                f = 2.0f;
                frameLayout.addView(k, nme.d(64, 76.0f, 19, 2.0f, 2.0f, 0.0f, 0.0f));
                if (k96.a0) {
                    i8 = 5;
                } else {
                    i8 = 3;
                }
                frameLayout.addView(textView, nme.d(-1, -2.0f, i8, 82.0f, 0.0f, 0.0f, 0.0f));
            } else {
                f = 2.0f;
                if (z) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                frameLayout.addView(textView, nme.d(-1, -2.0f, i7, 0.0f, 0.0f, 82.0f, 0.0f));
                frameLayout.addView(k, nme.d(64, 76.0f, 21, 0.0f, 2.0f, 0.0f, 2.0f));
            }
        } else {
            f = 2.0f;
            textView.setGravity(49);
            FrameLayout frameLayout2 = new FrameLayout(context);
            addView(frameLayout2, nme.r(-2, -2, 49));
            if (i == 1) {
                ImageView k2 = tb4.k(context, 2131232752);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                zkb.s(k2, i10, null, mode);
                frameLayout2.addView(k2, nme.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                ImageView imageView = new ImageView(context);
                this.h = imageView;
                imageView.setImageResource(2131232750);
                zkb.s(imageView, bkb.O9, null, mode);
                frameLayout2.addView(imageView, nme.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(k96.M0(2131745380, null));
            } else {
                ImageView imageView2 = new ImageView(context);
                this.h = imageView2;
                imageView2.setImageResource(2131232751);
                zkb.s(imageView2, bkb.O9, null, PorterDuff.Mode.MULTIPLY);
                frameLayout2.addView(imageView2, nme.d(-2, -2.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                textView2.setText(k96.M0(2131745374, null));
            }
            addView(textView2, nme.t(-2, -2, 49, 0, 18, 0, 0));
            addView(textView, nme.t(-2, -2, 49, 0, 17, 0, 0));
        }
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, nme.r(-2, 36, 1));
        if (i == 3) {
            linearLayout.setVisibility(8);
        }
        wb wbVar = new wb(context, (byte) 27);
        this.n = wbVar;
        zkb.X(wbVar, i9, null);
        wbVar.setLineSpacing(gl.L(f), 1.0f);
        if (i == 3) {
            wbVar.setTextSize(1, 14.0f);
            if (k96.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            addView(wbVar, nme.r(-2, -2, i3));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.a = paint;
            Paint paint2 = new Paint();
            view.b = paint2;
            paint.setColor(bkb.w0(null, bkb.Wi, false));
            paint2.setColor(bkb.w0(null, bkb.Xi, false));
            this.s = view;
            if (k96.a0) {
                i4 = 5;
            } else {
                i4 = 3;
            }
            wbVar.setGravity(i4);
            addView((View) view, nme.k(0.0f, 12.0f, 0.0f, 0.0f, -1, 3));
        } else {
            wbVar.setPadding(0, gl.L(f), 0, gl.L(10.0f));
            wbVar.setTextSize(1, 15.0f);
            wbVar.setGravity(49);
            addView(wbVar, nme.r(-2, -2, 49));
        }
        wb wbVar2 = new wb(context, (byte) 28);
        this.r = wbVar2;
        zkb.X(wbVar2, bkb.p6, null);
        wbVar2.setLineSpacing(gl.L(f), 1.0f);
        wbVar2.setPadding(0, gl.L(f), 0, gl.L(10.0f));
        wbVar2.setTextSize(1, 15.0f);
        wbVar2.setGravity(49);
        if (i == 1) {
            wbVar2.setText(k96.M0(2131751431, null));
        } else {
            wbVar2.setText(k96.M0(2131751437, null));
        }
        addView(wbVar2, nme.r(-2, -2, 49));
        wbVar2.setOnClickListener(new fr7(this, (byte) 6));
    }

    public String getCode() {
        if (this.d == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            if (i < editTextBoldCursorArr.length) {
                sb.append(p38.h(editTextBoldCursorArr[i].getText().toString(), false));
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        int i;
        vx7 vx7Var = this.R;
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
            String M0 = k96.M0(2131689472, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131744586, null);
            alertDialog$Builder.j(k96.M0(2131751759, null), null);
            alertDialog$Builder.g(k96.M0(2131744604, null), new nx7(this, (byte) 0));
            vx7Var.showDialog(hdVar);
            return false;
        }
        TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
        tL_auth_cancelCode.phone_number = this.a;
        tL_auth_cancelCode.phone_code_hash = this.b;
        i = ((d) vx7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_cancelCode, new ce2((byte) 0), 2);
        r();
        q();
        int i2 = this.M;
        if (i2 == 2) {
            gl.z3(false);
            kk7.e().n(this, kk7.i4);
        } else if (i2 == 3) {
            gl.y3(false);
            kk7.e().n(this, kk7.j4);
        }
        this.J = false;
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (this.J && (editTextBoldCursorArr = this.d) != null) {
            if (i == kk7.i4) {
                editTextBoldCursorArr[0].setText(String.valueOf(objArr[0]));
                h(null);
            } else if (i == kk7.j4) {
                String valueOf = String.valueOf(objArr[0]);
                if (gl.x(this.O, valueOf)) {
                    this.I = true;
                    this.d[0].setText(valueOf);
                    this.I = false;
                    h(null);
                }
            }
        }
    }

    @Override
    public final void e() {
        this.K = false;
    }

    @Override
    public final void f() {
        int i = this.M;
        if (i == 2) {
            gl.z3(false);
            kk7.e().n(this, kk7.i4);
        } else if (i == 3) {
            gl.y3(false);
            kk7.e().n(this, kk7.j4);
        }
        this.J = false;
        r();
        q();
    }

    @Override
    public final void h(String str) {
        int i;
        if (this.K) {
            return;
        }
        String code = getCode();
        if (TextUtils.isEmpty(code)) {
            gl.A3(this.c);
            return;
        }
        this.K = true;
        int i2 = this.M;
        if (i2 == 2) {
            gl.z3(false);
            kk7.e().n(this, kk7.i4);
        } else if (i2 == 3) {
            gl.y3(false);
            kk7.e().n(this, kk7.j4);
        }
        this.J = false;
        vx7 vx7Var = this.R;
        vx7Var.P1(true, true);
        TL_account.verifyPhone verifyphone = new TL_account.verifyPhone();
        verifyphone.phone_number = this.a;
        verifyphone.phone_code = code;
        verifyphone.phone_code_hash = this.b;
        r();
        vx7Var.A1();
        i = ((d) vx7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(verifyphone, new hj7(this, verifyphone, (byte) 2), 2);
    }

    @Override
    public final void j() {
        LinearLayout linearLayout = this.c;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            for (int length = this.d.length - 1; length >= 0; length--) {
                if (length == 0 || this.d[length].length() != 0) {
                    this.d[length].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = this.d[length];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gl.F3(this.d[length]);
                    return;
                }
            }
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (bundle != null) {
            this.J = true;
            int i9 = this.M;
            if (i9 == 2) {
                gl.z3(true);
                kk7.e().a(this, kk7.i4);
            } else if (i9 == 3) {
                gl.y3(true);
                kk7.e().a(this, kk7.j4);
            }
            this.a = bundle.getString("phone");
            this.b = bundle.getString("phoneHash");
            int i10 = bundle.getInt("timeout");
            this.E = i10;
            this.Q = i10;
            this.N = bundle.getInt("nextType");
            this.O = bundle.getString("pattern");
            int i11 = bundle.getInt("length");
            this.P = i11;
            if (i11 == 0) {
                i11 = 5;
                this.P = 5;
            }
            EditTextBoldCursor[] editTextBoldCursorArr = this.d;
            CharSequence charSequence = "";
            if (editTextBoldCursorArr != null && editTextBoldCursorArr.length == i11) {
                int i12 = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr2 = this.d;
                    if (i12 >= editTextBoldCursorArr2.length) {
                        break;
                    }
                    editTextBoldCursorArr2[i12].setText("");
                    i12++;
                }
            } else {
                this.d = new EditTextBoldCursor[i11];
                for (final int i13 = 0; i13 < this.P; i13++) {
                    this.d[i13] = new EditTextBoldCursor(getContext());
                    EditTextBoldCursor editTextBoldCursor = this.d[i13];
                    int i14 = bkb.F6;
                    zkb.X(editTextBoldCursor, i14, null);
                    zkb.v(this.d[i13], i14, null);
                    this.d[i13].setCursorSize(gl.L(20.0f));
                    this.d[i13].setCursorWidth(1.5f);
                    Drawable mutate = getResources().getDrawable(2131232689).mutate();
                    zkb.x(this, mutate, bkb.k6, null, PorterDuff.Mode.MULTIPLY);
                    this.d[i13].setBackgroundDrawable(mutate);
                    this.d[i13].setImeOptions(268435461);
                    this.d[i13].setTextSize(1, 20.0f);
                    this.d[i13].setMaxLines(1);
                    this.d[i13].setTypeface(gl.o());
                    this.d[i13].setPadding(0, 0, 0, 0);
                    this.d[i13].setGravity(49);
                    EditTextBoldCursor[] editTextBoldCursorArr3 = this.d;
                    if (i9 == 3) {
                        editTextBoldCursorArr3[i13].setEnabled(false);
                        this.d[i13].setInputType(0);
                        this.d[i13].setVisibility(8);
                    } else {
                        editTextBoldCursorArr3[i13].setInputType(3);
                    }
                    EditTextBoldCursor editTextBoldCursor2 = this.d[i13];
                    if (i13 != this.P - 1) {
                        i = 7;
                    } else {
                        i = 0;
                    }
                    this.c.addView(editTextBoldCursor2, nme.t(34, 36, 1, 0, 0, i, 0));
                    this.d[i13].addTextChangedListener(new px7(this, i13));
                    this.d[i13].setOnKeyListener(new View.OnKeyListener() {
                        @Override
                        public final boolean onKey(View view, int i15, KeyEvent keyEvent) {
                            if (i15 == 67) {
                                rx7 rx7Var = rx7.this;
                                EditTextBoldCursor[] editTextBoldCursorArr4 = rx7Var.d;
                                int i16 = i13;
                                if (editTextBoldCursorArr4[i16].length() == 0 && i16 > 0) {
                                    int i17 = i16 - 1;
                                    EditTextBoldCursor editTextBoldCursor3 = rx7Var.d[i17];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    rx7Var.d[i17].requestFocus();
                                    rx7Var.d[i17].dispatchKeyEvent(keyEvent);
                                    return true;
                                }
                                return false;
                            }
                            return false;
                        }
                    });
                    this.d[i13].setOnEditorActionListener(new j(this, (byte) 18));
                }
            }
            sx7 sx7Var = this.s;
            if (sx7Var != null) {
                if (this.N != 0) {
                    i8 = 0;
                } else {
                    i8 = 8;
                }
                sx7Var.setVisibility(i8);
            }
            if (this.a == null) {
                return;
            }
            String k = yjb.k(new StringBuilder("+"), this.a, p38.f());
            if (i9 == 2) {
                charSequence = gl.T2(k96.a0("SentSmsCode", null, 2131745375, k96.a(k)));
            } else if (i9 == 3) {
                charSequence = gl.T2(k96.a0("SentCallCode", null, 2131745378, k96.a(k)));
            } else if (i9 == 4) {
                charSequence = gl.T2(k96.a0("SentCallOnly", null, 2131745377, k96.a(k)));
            }
            this.e.setText(charSequence);
            EditTextBoldCursor[] editTextBoldCursorArr4 = this.d;
            if (i9 != 3) {
                gl.F3(editTextBoldCursorArr4[0]);
                this.d[0].requestFocus();
            } else {
                gl.t1(editTextBoldCursorArr4[0]);
            }
            r();
            q();
            this.G = System.currentTimeMillis();
            wb wbVar = this.r;
            wb wbVar2 = this.n;
            if (i9 == 3) {
                int i15 = this.N;
                i2 = 2;
                if (i15 == 4 || i15 == 2) {
                    wbVar.setVisibility(8);
                    wbVar2.setVisibility(0);
                    int i16 = this.N;
                    if (i16 == 4) {
                        wbVar2.setText(k96.a0("CallText", null, 2131752589, 1, 0));
                    } else if (i16 == 2) {
                        wbVar2.setText(k96.a0("SmsText", null, 2131745103, 1, 0));
                    }
                    p();
                    return;
                }
            } else {
                i2 = 2;
            }
            if (i9 == i2) {
                int i17 = this.N;
                i3 = 0;
                if (i17 == 4 || i17 == 3) {
                    Object[] objArr = new Object[i2];
                    objArr[0] = 2;
                    objArr[1] = 0;
                    wbVar2.setText(k96.a0("CallText", null, 2131752589, objArr));
                    if (this.E < 1000) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    wbVar.setVisibility(i6);
                    if (this.E < 1000) {
                        i7 = 8;
                    } else {
                        i7 = 0;
                    }
                    wbVar2.setVisibility(i7);
                    p();
                    return;
                }
            } else {
                i3 = 0;
            }
            if (i9 == 4 && this.N == 2) {
                Object[] objArr2 = new Object[2];
                objArr2[i3] = 2;
                objArr2[1] = 0;
                wbVar2.setText(k96.a0("SmsText", null, 2131745103, objArr2));
                if (this.E < 1000) {
                    i4 = i3;
                } else {
                    i4 = 8;
                }
                wbVar.setVisibility(i4);
                if (this.E < 1000) {
                    i5 = 8;
                } else {
                    i5 = i3;
                }
                wbVar2.setVisibility(i5);
                p();
                return;
            }
            wbVar2.setVisibility(8);
            wbVar.setVisibility(8);
            o();
        }
    }

    public final void o() {
        if (this.x != null) {
            return;
        }
        this.F = 15000;
        this.x = new Timer();
        this.H = System.currentTimeMillis();
        this.x.schedule(new aw3(this, (byte) 2), 0L, 1000L);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.M != 3 && this.h != null) {
            int bottom = this.e.getBottom();
            int measuredHeight = getMeasuredHeight() - bottom;
            wb wbVar = this.r;
            if (wbVar.getVisibility() == 0) {
                int measuredHeight2 = wbVar.getMeasuredHeight();
                i5 = (measuredHeight + bottom) - measuredHeight2;
                wbVar.layout(wbVar.getLeft(), i5, wbVar.getRight(), measuredHeight2 + i5);
            } else {
                wb wbVar2 = this.n;
                if (wbVar2.getVisibility() == 0) {
                    int measuredHeight3 = wbVar2.getMeasuredHeight();
                    i5 = (measuredHeight + bottom) - measuredHeight3;
                    wbVar2.layout(wbVar2.getLeft(), i5, wbVar2.getRight(), measuredHeight3 + i5);
                } else {
                    i5 = measuredHeight + bottom;
                }
            }
            LinearLayout linearLayout = this.c;
            int measuredHeight4 = linearLayout.getMeasuredHeight();
            int g = ug8.g(i5 - bottom, measuredHeight4, 2, bottom);
            linearLayout.layout(linearLayout.getLeft(), g, linearLayout.getRight(), measuredHeight4 + g);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ImageView imageView;
        super.onMeasure(i, i2);
        if (this.M != 3 && (imageView = this.h) != null) {
            int L = gl.L(35.0f) + this.e.getMeasuredHeight() + this.f.getMeasuredHeight() + imageView.getMeasuredHeight();
            int L2 = gl.L(80.0f);
            int L3 = gl.L(291.0f);
            vx7 vx7Var = this.R;
            if (vx7Var.t0 - L < L2) {
                setMeasuredDimension(getMeasuredWidth(), L + L2);
            } else {
                setMeasuredDimension(getMeasuredWidth(), Math.min(vx7Var.t0, L3));
            }
        }
    }

    public final void p() {
        if (this.w != null) {
            return;
        }
        Timer timer = new Timer();
        this.w = timer;
        timer.schedule(new qx7(this), 0L, 1000L);
    }

    public final void q() {
        try {
            synchronized (this.y) {
                Timer timer = this.x;
                if (timer != null) {
                    timer.cancel();
                    this.x = null;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void r() {
        try {
            synchronized (this.y) {
                Timer timer = this.w;
                if (timer != null) {
                    timer.cancel();
                    this.w = null;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void s() {
        int i;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.a);
        this.K = true;
        vx7 vx7Var = this.R;
        vx7Var.A1();
        TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
        tL_auth_resendCode.phone_number = this.a;
        tL_auth_resendCode.phone_code_hash = this.b;
        i = ((d) vx7Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_resendCode, new k45(this, bundle, tL_auth_resendCode, (byte) 24), 2);
    }

    @Override
    public final void updateColors() {
        try {
            if (this.d != null) {
                int i = 0;
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = this.d;
                    if (i < editTextBoldCursorArr.length) {
                        EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                        if (editTextBoldCursor != null) {
                            editTextBoldCursor.setCursorColor(bkb.w0(null, bkb.F6, false));
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
