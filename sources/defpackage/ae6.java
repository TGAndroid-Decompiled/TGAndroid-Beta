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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ae6 extends jja implements vl5 {
    public final TextView E;
    public String F;
    public String G;
    public boolean H;
    public Bundle I;
    public boolean J;
    public final oy8 K;
    public final oy8 L;
    public boolean M;
    public final wl5 N;
    public TLRPC.FileLocation O;
    public TLRPC.FileLocation P;
    public final mf6 Q;
    public final er7 a;
    public final er7 b;
    public final EditTextBoldCursor c;
    public final EditTextBoldCursor d;
    public final kb0 e;
    public final pb0 f;
    public final s71 h;
    public final vh1 n;
    public final wh1 r;
    public AnimatorSet s;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    public ae6(mf6 mf6Var, Context context) {
        super(context);
        int i;
        float f;
        this.Q = mf6Var;
        this.J = false;
        this.M = true;
        setOrientation(1);
        wl5 wl5Var = new wl5(0, false, false);
        this.N = wl5Var;
        wl5Var.I = true;
        wl5Var.K = false;
        wl5Var.H = false;
        wl5Var.L = false;
        wl5Var.a = mf6Var;
        wl5Var.b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, nme.r(78, 78, 1));
        pb0 pb0Var = new pb0((wjb) null);
        this.f = pb0Var;
        kb0 kb0Var = new kb0((byte) 7, context, this);
        this.e = kb0Var;
        kb0Var.setRoundRadius(gl.L(64.0f));
        pb0Var.f(13);
        pb0Var.j(5L, null, null, null);
        kb0Var.setImageDrawable(pb0Var);
        frameLayout.addView(kb0Var, nme.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        s71 s71Var = new s71(this, context, paint, (byte) 15);
        this.h = s71Var;
        frameLayout.addView(s71Var, nme.c(-1.0f, -1));
        s71Var.setOnClickListener(new View.OnClickListener(this) {
            public final ae6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                ae6 ae6Var = this.b;
                switch (b) {
                    case 0:
                        vh1 vh1Var = ae6Var.n;
                        oy8 oy8Var = ae6Var.K;
                        wl5 wl5Var2 = ae6Var.N;
                        if (ae6Var.O != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wl5Var2.n(z, new nc6(ae6Var, (byte) 1), new n1(ae6Var, (byte) 25), 0);
                        ae6Var.M = false;
                        vh1Var.setAnimation(oy8Var);
                        oy8Var.H(0);
                        oy8Var.K(43);
                        vh1Var.d();
                        return;
                    default:
                        if (ae6Var.Q.W.getTag() == null) {
                            ae6Var.d(false);
                            return;
                        }
                        return;
                }
            }
        });
        oy8 oy8Var = new oy8(2131623959, gl.L(70.0f), gl.L(70.0f), false, null);
        this.K = oy8Var;
        this.L = new oy8(2131623967, gl.L(70.0f), gl.L(70.0f), false, null);
        vh1 vh1Var = new vh1((byte) 4, context, this);
        this.n = vh1Var;
        vh1Var.setScaleType(ImageView.ScaleType.CENTER);
        vh1Var.setAnimation(oy8Var);
        vh1Var.setEnabled(false);
        vh1Var.setClickable(false);
        frameLayout.addView(vh1Var, nme.c(-1.0f, -1));
        vh1Var.addOnAttachStateChangeListener(new zd6(this));
        wh1 wh1Var = new wh1(this, context, (byte) 2);
        this.r = wh1Var;
        wh1Var.setSize(gl.L(30.0f));
        wh1Var.setProgressColor(-1);
        frameLayout.addView(wh1Var, nme.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setText(k96.M0(2131746145, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gl.o());
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, nme.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setText(k96.M0(2131746146, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, nme.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        er7 er7Var = new er7(context, null);
        this.a = er7Var;
        er7Var.setText(k96.M0(2131750677, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final ae6 b;

            {
                this.b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z) {
                byte b = r2;
                float f2 = 0.0f;
                ae6 ae6Var = this.b;
                switch (b) {
                    case 0:
                        er7 er7Var2 = ae6Var.a;
                        if (z) {
                            f2 = 1.0f;
                        }
                        er7Var2.b(f2, f2, true);
                        return;
                    default:
                        er7 er7Var3 = ae6Var.b;
                        if (z) {
                            f2 = 1.0f;
                        }
                        er7Var3.b(f2, f2, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        er7Var.e(editTextBoldCursor);
        er7Var.addView(editTextBoldCursor, nme.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ae6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b = r2;
                ae6 ae6Var = this.b;
                switch (b) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        ae6Var.d.requestFocus();
                        return true;
                    default:
                        if (i2 != 6 && i2 != 5) {
                            return false;
                        }
                        ae6Var.h(null);
                        return true;
                }
            }
        });
        er7 er7Var2 = new er7(context, null);
        this.b = er7Var2;
        er7Var2.setText(k96.M0(2131748840, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(gl.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final ae6 b;

            {
                this.b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z) {
                byte b = r2;
                float f2 = 0.0f;
                ae6 ae6Var = this.b;
                switch (b) {
                    case 0:
                        er7 er7Var22 = ae6Var.a;
                        if (z) {
                            f2 = 1.0f;
                        }
                        er7Var22.b(f2, f2, true);
                        return;
                    default:
                        er7 er7Var3 = ae6Var.b;
                        if (z) {
                            f2 = 1.0f;
                        }
                        er7Var3.b(f2, f2, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        er7Var2.e(editTextBoldCursor2);
        er7Var2.addView(editTextBoldCursor2, nme.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ae6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b = r2;
                ae6 ae6Var = this.b;
                switch (b) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        ae6Var.d.requestFocus();
                        return true;
                    default:
                        if (i2 != 6 && i2 != 5) {
                            return false;
                        }
                        ae6Var.h(null);
                        return true;
                }
            }
        });
        boolean M1 = gl.M1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (M1) {
            LinearLayout linearLayout = new LinearLayout(mf6Var.getParentActivity());
            linearLayout.setOrientation(0);
            er7Var.setText(k96.M0(2131750676, null));
            er7Var2.setText(k96.M0(2131748839, null));
            linearLayout.addView(er7Var, nme.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(er7Var2, nme.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                gl.E3(editTextBoldCursor2);
            }
        } else {
            er7Var.setText(k96.M0(2131750677, null));
            er7Var2.setText(k96.M0(2131748840, null));
            frameLayout2.addView(er7Var, nme.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(er7Var2, nme.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.x = textView3;
        textView3.setText(k96.M0(2131752560, "CancelRegistration"));
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView3.setGravity(i | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(gl.L(2.0f), 1.0f);
        textView3.setPadding(0, gl.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, nme.t(-2, -2, (k96.a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final ae6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                ae6 ae6Var = this.b;
                switch (b) {
                    case 0:
                        vh1 vh1Var2 = ae6Var.n;
                        oy8 oy8Var2 = ae6Var.K;
                        wl5 wl5Var2 = ae6Var.N;
                        if (ae6Var.O != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wl5Var2.n(z, new nc6(ae6Var, (byte) 1), new n1(ae6Var, (byte) 25), 0);
                        ae6Var.M = false;
                        vh1Var2.setAnimation(oy8Var2);
                        oy8Var2.H(0);
                        oy8Var2.K(43);
                        vh1Var2.d();
                        return;
                    default:
                        if (ae6Var.Q.W.getTag() == null) {
                            ae6Var.d(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, nme.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setMovementMethod(new cl((byte) 0));
        if (gl.M1()) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView4.setTextSize(1, f);
        textView4.setLineSpacing(gl.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, nme.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        vk9.c(textView4);
        String M0 = k96.M0(2131743956, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new r21(this, (byte) 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gl.c3(new sx5(this, photoSize2, photoSize, (byte) 20));
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        mf6 mf6Var = this.Q;
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
            String M0 = k96.M0(2131742685, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131754077, "AreYouSureRegistration");
            alertDialog$Builder.g(k96.M0(2131744604, "Stop"), new ud6(this, (byte) 0));
            alertDialog$Builder.j(k96.M0(2131751759, "Continue"), null);
            mf6Var.showDialog(hdVar);
            return false;
        }
        mf6Var.x1(true, true);
        this.J = false;
        this.I = null;
        return true;
    }

    @Override
    public final void e() {
        this.J = false;
    }

    @Override
    public p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return k96.M0(2131742547, "YourName");
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
        mf6 mf6Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = mf6Var.s0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor.length() == 0) {
            mf6.D1(this.a, true);
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
        mf6Var.A1(0, true);
        i = ((d) mf6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_auth_signUp, new hc((byte) 0), new ur4(this, (byte) 15), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.y;
        if (textView != null) {
            if (this.Q.f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(gl.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            gl.E3(editTextBoldCursor);
        }
        gl.d3(new nc6(this, (byte) 3), mf6.A0);
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
            fa4.g(e, true);
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
        mf6 mf6Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = mf6Var.s0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            mf6Var.s0.serializeToStream(serializedData);
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
        this.y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(gl.G).start();
    }

    public final void o(boolean z) {
        vh1 vh1Var = this.n;
        if (vh1Var == null) {
            return;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        wh1 wh1Var = this.r;
        if (z) {
            this.s = new AnimatorSet();
            vh1Var.setVisibility(0);
            AnimatorSet animatorSet2 = this.s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(vh1Var, property, 1.0f), ObjectAnimator.ofFloat(wh1Var, property, 0.0f));
            this.s.setDuration(180L);
            this.s.addListener(new v85(this, (byte) 14));
            this.s.start();
            return;
        }
        vh1Var.setAlpha(1.0f);
        vh1Var.setVisibility(0);
        wh1Var.setAlpha(0.0f);
        wh1Var.setVisibility(4);
    }

    public final void p(boolean z) {
        mf6 mf6Var = this.Q;
        if (mf6Var.s0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf6Var.getParentActivity());
        String M0 = k96.M0(2131743957, "TermsOfService");
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        if (z) {
            alertDialog$Builder.j(k96.M0(2131754716, "Accept"), new ud6(this, (byte) 1));
            alertDialog$Builder.g(k96.M0(2131751592, "Decline"), new ud6(this, (byte) 2));
        } else {
            alertDialog$Builder.j(k96.M0(2131747638, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mf6Var.s0.text);
        k27.b(spannableStringBuilder, mf6Var.s0.entities, false, false, false, false, 0);
        hdVar.U = spannableStringBuilder;
        mf6Var.showDialog(hdVar);
    }

    @Override
    public final void updateColors() {
        this.f.invalidateSelf();
        int i = bkb.F6;
        this.E.setTextColor(bkb.w0(null, i, false));
        int i2 = bkb.C6;
        this.w.setTextColor(bkb.w0(null, i2, false));
        int w0 = bkb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.c;
        editTextBoldCursor.setTextColor(w0);
        int i3 = bkb.k6;
        editTextBoldCursor.setCursorColor(bkb.w0(null, i3, false));
        int w02 = bkb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w02);
        editTextBoldCursor2.setCursorColor(bkb.w0(null, i3, false));
        this.x.setTextColor(bkb.w0(null, bkb.p6, false));
        int w03 = bkb.w0(null, i2, false);
        TextView textView = this.y;
        textView.setTextColor(w03);
        textView.setLinkTextColor(bkb.w0(null, bkb.I6, false));
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
