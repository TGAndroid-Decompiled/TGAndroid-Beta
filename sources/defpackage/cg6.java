package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cg6 extends cna implements yn5 {
    public final TextView E;
    public String F;
    public String G;
    public boolean H;
    public Bundle I;
    public boolean J;
    public final b29 K;
    public final b29 L;
    public boolean M;
    public final zn5 N;
    public TLRPC.FileLocation O;
    public TLRPC.FileLocation P;
    public final qh6 Q;
    public final lu7 a;
    public final lu7 b;
    public final EditTextBoldCursor c;
    public final EditTextBoldCursor d;
    public final mb0 e;
    public final rb0 f;
    public final a81 h;
    public final di1 n;
    public final ei1 r;
    public AnimatorSet s;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    public cg6(qh6 qh6Var, Context context) {
        super(context);
        int i;
        float f;
        this.Q = qh6Var;
        this.J = false;
        this.M = true;
        setOrientation(1);
        zn5 zn5Var = new zn5(0, false, false);
        this.N = zn5Var;
        zn5Var.I = true;
        zn5Var.K = false;
        zn5Var.H = false;
        zn5Var.L = false;
        zn5Var.a = qh6Var;
        zn5Var.b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, tre.r(78, 78, 1));
        rb0 rb0Var = new rb0((vnb) null);
        this.f = rb0Var;
        mb0 mb0Var = new mb0((byte) 7, context, this);
        this.e = mb0Var;
        mb0Var.setRoundRadius(hl.L(64.0f));
        rb0Var.f(13);
        rb0Var.j(5L, null, null, null);
        mb0Var.setImageDrawable(rb0Var);
        frameLayout.addView(mb0Var, tre.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a81 a81Var = new a81(this, context, paint, (byte) 15);
        this.h = a81Var;
        frameLayout.addView(a81Var, tre.c(-1.0f, -1));
        a81Var.setOnClickListener(new View.OnClickListener(this) {
            public final cg6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                cg6 cg6Var = this.b;
                switch (b) {
                    case 0:
                        di1 di1Var = cg6Var.n;
                        b29 b29Var = cg6Var.K;
                        zn5 zn5Var2 = cg6Var.N;
                        if (cg6Var.O != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zn5Var2.n(z, new re6(cg6Var, (byte) 1), new o1(cg6Var, (byte) 25), 0);
                        cg6Var.M = false;
                        di1Var.setAnimation(b29Var);
                        b29Var.H(0);
                        b29Var.K(43);
                        di1Var.d();
                        return;
                    default:
                        if (cg6Var.Q.W.getTag() == null) {
                            cg6Var.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        b29 b29Var = new b29(2131623959, hl.L(70.0f), hl.L(70.0f), false, null);
        this.K = b29Var;
        this.L = new b29(2131623967, hl.L(70.0f), hl.L(70.0f), false, null);
        di1 di1Var = new di1((byte) 4, context, this);
        this.n = di1Var;
        di1Var.setScaleType(ImageView.ScaleType.CENTER);
        di1Var.setAnimation(b29Var);
        di1Var.setEnabled(false);
        di1Var.setClickable(false);
        frameLayout.addView(di1Var, tre.c(-1.0f, -1));
        di1Var.addOnAttachStateChangeListener(new bg6(this));
        ei1 ei1Var = new ei1(this, context, (byte) 2);
        this.r = ei1Var;
        ei1Var.setSize(hl.L(30.0f));
        ei1Var.setProgressColor(-1);
        frameLayout.addView(ei1Var, tre.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setText(ob6.M0(2131746065, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(hl.o());
        textView.setLineSpacing(hl.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, tre.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setText(ob6.M0(2131746066, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView2, tre.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, tre.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        lu7 lu7Var = new lu7(context, null);
        this.a = lu7Var;
        lu7Var.setText(ob6.M0(2131750654, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final cg6 b;

            {
                this.b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z) {
                byte b = r2;
                float f2 = 0.0f;
                cg6 cg6Var = this.b;
                switch (b) {
                    case 0:
                        lu7 lu7Var2 = cg6Var.a;
                        if (z) {
                            f2 = 1.0f;
                        }
                        lu7Var2.b(f2, f2, true);
                        return;
                    default:
                        lu7 lu7Var3 = cg6Var.b;
                        if (z) {
                            f2 = 1.0f;
                        }
                        lu7Var3.b(f2, f2, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        lu7Var.e(editTextBoldCursor);
        lu7Var.addView(editTextBoldCursor, tre.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final cg6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b = r2;
                cg6 cg6Var = this.b;
                switch (b) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        cg6Var.d.requestFocus();
                        return true;
                    default:
                        if (i2 != 6 && i2 != 5) {
                            return false;
                        }
                        cg6Var.h(null);
                        return true;
                }
            }
        });
        lu7 lu7Var2 = new lu7(context, null);
        this.b = lu7Var2;
        lu7Var2.setText(ob6.M0(2131748786, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(hl.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final cg6 b;

            {
                this.b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z) {
                byte b = r2;
                float f2 = 0.0f;
                cg6 cg6Var = this.b;
                switch (b) {
                    case 0:
                        lu7 lu7Var22 = cg6Var.a;
                        if (z) {
                            f2 = 1.0f;
                        }
                        lu7Var22.b(f2, f2, true);
                        return;
                    default:
                        lu7 lu7Var3 = cg6Var.b;
                        if (z) {
                            f2 = 1.0f;
                        }
                        lu7Var3.b(f2, f2, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        lu7Var2.e(editTextBoldCursor2);
        lu7Var2.addView(editTextBoldCursor2, tre.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final cg6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b = r2;
                cg6 cg6Var = this.b;
                switch (b) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        cg6Var.d.requestFocus();
                        return true;
                    default:
                        if (i2 != 6 && i2 != 5) {
                            return false;
                        }
                        cg6Var.h(null);
                        return true;
                }
            }
        });
        boolean M1 = hl.M1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (M1) {
            LinearLayout linearLayout = new LinearLayout(qh6Var.getParentActivity());
            linearLayout.setOrientation(0);
            lu7Var.setText(ob6.M0(2131750653, null));
            lu7Var2.setText(ob6.M0(2131748785, null));
            linearLayout.addView(lu7Var, tre.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(lu7Var2, tre.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                hl.E3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                hl.E3(editTextBoldCursor2);
            }
        } else {
            lu7Var.setText(ob6.M0(2131750654, null));
            lu7Var2.setText(ob6.M0(2131748786, null));
            frameLayout2.addView(lu7Var, tre.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(lu7Var2, tre.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.x = textView3;
        textView3.setText(ob6.M0(2131752553, "CancelRegistration"));
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView3.setGravity(i | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(hl.L(2.0f), 1.0f);
        textView3.setPadding(0, hl.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, tre.t(-2, -2, (ob6.a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final cg6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                cg6 cg6Var = this.b;
                switch (b) {
                    case 0:
                        di1 di1Var2 = cg6Var.n;
                        b29 b29Var2 = cg6Var.K;
                        zn5 zn5Var2 = cg6Var.N;
                        if (cg6Var.O != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        zn5Var2.n(z, new re6(cg6Var, (byte) 1), new o1(cg6Var, (byte) 25), 0);
                        cg6Var.M = false;
                        di1Var2.setAnimation(b29Var2);
                        b29Var2.H(0);
                        b29Var2.K(43);
                        di1Var2.d();
                        return;
                    default:
                        if (cg6Var.Q.W.getTag() == null) {
                            cg6Var.c(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, tre.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setMovementMethod(new dl((byte) 0));
        if (hl.M1()) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView4.setTextSize(1, f);
        textView4.setLineSpacing(hl.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, tre.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        ko9.e(textView4);
        String M0 = ob6.M0(2131743850, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new a31(this, (byte) 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        hl.c3(new ls5(this, photoSize2, photoSize, (byte) 25));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c(boolean z) {
        qh6 qh6Var = this.Q;
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
            String M0 = ob6.M0(2131742579, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131754073, "AreYouSureRegistration");
            alertDialog$Builder.g(ob6.M0(2131744498, "Stop"), new wf6(this, (byte) 0));
            alertDialog$Builder.j(ob6.M0(2131751736, "Continue"), null);
            qh6Var.showDialog(idVar);
            return false;
        }
        qh6Var.y1(true, true);
        this.J = false;
        this.I = null;
        return true;
    }

    @Override
    public final void d() {
        this.J = false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public fd8 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return ob6.M0(2131742441, "YourName");
    }

    @Override
    public String getInitialSearchString() {
        return null;
    }

    @Override
    public final void h(String str) {
        TLRPC.TL_auth_signUp tL_auth_signUp;
        int i;
        if (this.J) {
            return;
        }
        qh6 qh6Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = qh6Var.s0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor.length() == 0) {
            qh6.E1(this.a, true);
            return;
        }
        this.J = true;
        boolean z = this.H;
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        if (z) {
            TLRPC.TL_auth_firebasePnvSignUp tL_auth_firebasePnvSignUp = new TLRPC.TL_auth_firebasePnvSignUp();
            tL_auth_firebasePnvSignUp.first_name = editTextBoldCursor.getText().toString();
            tL_auth_firebasePnvSignUp.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_firebasePnvSignUp;
        } else {
            TLRPC.TL_auth_signUp tL_auth_signUp2 = new TLRPC.TL_auth_signUp();
            tL_auth_signUp2.phone_code_hash = this.G;
            tL_auth_signUp2.phone_number = this.F;
            tL_auth_signUp2.first_name = editTextBoldCursor.getText().toString();
            tL_auth_signUp2.last_name = editTextBoldCursor2.getText().toString();
            tL_auth_signUp = tL_auth_signUp2;
        }
        qh6Var.B1(0, true);
        i = ((e) qh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_auth_signUp, new ic((byte) 0), new yt4(this, (byte) 15), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.y;
        if (textView != null) {
            if (this.Q.f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(hl.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            hl.E3(editTextBoldCursor);
        }
        hl.d3(new re6(this, (byte) 3), qh6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        byte[] decode;
        Bundle bundle2 = bundle.getBundle("registerview_params");
        this.I = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        try {
            String string = bundle.getString("terms");
            if (string != null && (decode = Base64.decode(string, 0)) != null) {
                SerializedData serializedData = new SerializedData(decode);
                this.Q.s0 = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                serializedData.cleanup();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        String string2 = bundle.getString("registerview_first");
        if (string2 != null) {
            this.c.setText(string2);
        }
        String string3 = bundle.getString("registerview_last");
        if (string3 != null) {
            this.d.setText(string3);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.c.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("registerview_first", obj);
        }
        String obj2 = this.d.getText().toString();
        if (obj2.length() != 0) {
            bundle.putString("registerview_last", obj2);
        }
        qh6 qh6Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = qh6Var.s0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            qh6Var.s0.serializeToStream(serializedData);
            bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
            serializedData.cleanup();
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle("registerview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        this.c.setText("");
        this.d.setText("");
        this.F = bundle.getString("phoneFormated");
        this.G = bundle.getString("phoneHash");
        this.H = bundle.getBoolean("fromFirebasePhoneNumberVerification");
        this.I = bundle;
    }

    public final void n() {
        this.y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(hl.G).start();
    }

    public final void o(boolean z) {
        di1 di1Var = this.n;
        if (di1Var == null) {
            return;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        ei1 ei1Var = this.r;
        if (z) {
            this.s = new AnimatorSet();
            di1Var.setVisibility(0);
            AnimatorSet animatorSet2 = this.s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(di1Var, property, 1.0f), ObjectAnimator.ofFloat(ei1Var, property, 0.0f));
            this.s.setDuration(180L);
            this.s.addListener(new ad5(this, (byte) 13));
            this.s.start();
            return;
        }
        di1Var.setAlpha(1.0f);
        di1Var.setVisibility(0);
        ei1Var.setAlpha(0.0f);
        ei1Var.setVisibility(4);
    }

    public final void p(boolean z) {
        qh6 qh6Var = this.Q;
        if (qh6Var.s0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qh6Var.getParentActivity());
        String M0 = ob6.M0(2131743851, "TermsOfService");
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        if (z) {
            alertDialog$Builder.j(ob6.M0(2131754712, "Accept"), new wf6(this, (byte) 1));
            alertDialog$Builder.g(ob6.M0(2131751569, "Decline"), new wf6(this, (byte) 2));
        } else {
            alertDialog$Builder.j(ob6.M0(2131747558, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(qh6Var.s0.text);
        r47.b(spannableStringBuilder, qh6Var.s0.entities, false, false, false, false, 0);
        idVar.U = spannableStringBuilder;
        qh6Var.showDialog(idVar);
    }

    @Override
    public final void updateColors() {
        this.f.invalidateSelf();
        int i = aob.G6;
        this.E.setTextColor(aob.w0(null, i, false));
        int i2 = aob.D6;
        this.w.setTextColor(aob.w0(null, i2, false));
        int w0 = aob.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.c;
        editTextBoldCursor.setTextColor(w0);
        int i3 = aob.l6;
        editTextBoldCursor.setCursorColor(aob.w0(null, i3, false));
        int w02 = aob.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w02);
        editTextBoldCursor2.setCursorColor(aob.w0(null, i3, false));
        this.x.setTextColor(aob.w0(null, aob.q6, false));
        int w03 = aob.w0(null, i2, false);
        TextView textView = this.y;
        textView.setTextColor(w03);
        textView.setLinkTextColor(aob.w0(null, aob.J6, false));
        this.a.f();
        this.b.f();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void T() {
    }

    @Override
    public final void H(float f) {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
