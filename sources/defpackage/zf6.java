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
public final class zf6 extends kla implements vn5 {
    public final TextView E;
    public String F;
    public String G;
    public boolean H;
    public Bundle I;
    public boolean J;
    public final p09 K;
    public final p09 L;
    public boolean M;
    public final wn5 N;
    public TLRPC.FileLocation O;
    public TLRPC.FileLocation P;
    public final mh6 Q;
    public final gt7 a;
    public final gt7 b;
    public final EditTextBoldCursor c;
    public final EditTextBoldCursor d;
    public final kc0 e;
    public final pc0 f;
    public final a91 h;
    public final cj1 n;
    public final dj1 r;
    public AnimatorSet s;
    public final TextView w;
    public final TextView x;
    public final TextView y;

    public zf6(mh6 mh6Var, Context context) {
        super(context);
        int i;
        float f;
        this.Q = mh6Var;
        this.J = false;
        this.M = true;
        setOrientation(1);
        wn5 wn5Var = new wn5(0, false, false);
        this.N = wn5Var;
        wn5Var.I = true;
        wn5Var.K = false;
        wn5Var.H = false;
        wn5Var.L = false;
        wn5Var.a = mh6Var;
        wn5Var.b = this;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, qoe.r(78, 78, 1));
        pc0 pc0Var = new pc0((ylb) null);
        this.f = pc0Var;
        kc0 kc0Var = new kc0((byte) 7, context, this);
        this.e = kc0Var;
        kc0Var.setRoundRadius(gm.L(64.0f));
        pc0Var.f(13);
        pc0Var.j(5L, null, null, null);
        kc0Var.setImageDrawable(pc0Var);
        frameLayout.addView(kc0Var, qoe.c(-1.0f, -1));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a91 a91Var = new a91(this, context, paint, (byte) 15);
        this.h = a91Var;
        frameLayout.addView(a91Var, qoe.c(-1.0f, -1));
        a91Var.setOnClickListener(new View.OnClickListener(this) {
            public final zf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                zf6 zf6Var = this.b;
                switch (b) {
                    case 0:
                        cj1 cj1Var = zf6Var.n;
                        p09 p09Var = zf6Var.K;
                        wn5 wn5Var2 = zf6Var.N;
                        if (zf6Var.O != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wn5Var2.n(z, new me6(zf6Var, (byte) 1), new n1(zf6Var, (byte) 25), 0);
                        zf6Var.M = false;
                        cj1Var.setAnimation(p09Var);
                        p09Var.H(0);
                        p09Var.K(43);
                        cj1Var.d();
                        return;
                    default:
                        if (zf6Var.Q.W.getTag() == null) {
                            zf6Var.d(false);
                            return;
                        }
                        return;
                }
            }
        });
        p09 p09Var = new p09(2131623959, gm.L(70.0f), gm.L(70.0f), false, null);
        this.K = p09Var;
        this.L = new p09(2131623967, gm.L(70.0f), gm.L(70.0f), false, null);
        cj1 cj1Var = new cj1((byte) 4, context, this);
        this.n = cj1Var;
        cj1Var.setScaleType(ImageView.ScaleType.CENTER);
        cj1Var.setAnimation(p09Var);
        cj1Var.setEnabled(false);
        cj1Var.setClickable(false);
        frameLayout.addView(cj1Var, qoe.c(-1.0f, -1));
        cj1Var.addOnAttachStateChangeListener(new yf6(this));
        dj1 dj1Var = new dj1(this, context, (byte) 2);
        this.r = dj1Var;
        dj1Var.setSize(gm.L(30.0f));
        dj1Var.setProgressColor(-1);
        frameLayout.addView(dj1Var, qoe.c(-1.0f, -1));
        o(false);
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setText(jb6.M0(2131746071, null));
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gm.o());
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        textView.setGravity(1);
        addView(textView, qoe.t(-2, -2, 1, 8, 12, 8, 0));
        TextView textView2 = new TextView(context);
        this.w = textView2;
        textView2.setText(jb6.M0(2131746072, "RegisterText2"));
        textView2.setGravity(1);
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView2, qoe.t(-2, -2, 1, 8, 6, 8, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        addView(frameLayout2, qoe.k(8.0f, 21.0f, 8.0f, 0.0f, -1, -2));
        gt7 gt7Var = new gt7(context, null);
        this.a = gt7Var;
        gt7Var.setText(jb6.M0(2131750626, null));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.c = editTextBoldCursor;
        editTextBoldCursor.setCursorSize(gm.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setImeOptions(268435461);
        editTextBoldCursor.setTextSize(1, 17.0f);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setInputType(8192);
        editTextBoldCursor.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final zf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z) {
                byte b = r2;
                float f2 = 0.0f;
                zf6 zf6Var = this.b;
                switch (b) {
                    case 0:
                        gt7 gt7Var2 = zf6Var.a;
                        if (z) {
                            f2 = 1.0f;
                        }
                        gt7Var2.b(f2, f2, true);
                        return;
                    default:
                        gt7 gt7Var3 = zf6Var.b;
                        if (z) {
                            f2 = 1.0f;
                        }
                        gt7Var3.b(f2, f2, true);
                        return;
                }
            }
        });
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        gt7Var.e(editTextBoldCursor);
        gt7Var.addView(editTextBoldCursor, qoe.e(-1, -2, 48));
        editTextBoldCursor.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final zf6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b = r2;
                zf6 zf6Var = this.b;
                switch (b) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        zf6Var.d.requestFocus();
                        return true;
                    default:
                        if (i2 != 6 && i2 != 5) {
                            return false;
                        }
                        zf6Var.h(null);
                        return true;
                }
            }
        });
        gt7 gt7Var2 = new gt7(context, null);
        this.b = gt7Var2;
        gt7Var2.setText(jb6.M0(2131748789, null));
        EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
        this.d = editTextBoldCursor2;
        editTextBoldCursor2.setCursorSize(gm.L(20.0f));
        editTextBoldCursor2.setCursorWidth(1.5f);
        editTextBoldCursor2.setImeOptions(268435462);
        editTextBoldCursor2.setTextSize(1, 17.0f);
        editTextBoldCursor2.setMaxLines(1);
        editTextBoldCursor2.setInputType(8192);
        editTextBoldCursor2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final zf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onFocusChange(View view, boolean z) {
                byte b = r2;
                float f2 = 0.0f;
                zf6 zf6Var = this.b;
                switch (b) {
                    case 0:
                        gt7 gt7Var22 = zf6Var.a;
                        if (z) {
                            f2 = 1.0f;
                        }
                        gt7Var22.b(f2, f2, true);
                        return;
                    default:
                        gt7 gt7Var3 = zf6Var.b;
                        if (z) {
                            f2 = 1.0f;
                        }
                        gt7Var3.b(f2, f2, true);
                        return;
                }
            }
        });
        editTextBoldCursor2.setBackground(null);
        editTextBoldCursor2.setPadding(gm.L(16.0f), gm.L(16.0f), gm.L(16.0f), gm.L(16.0f));
        gt7Var2.e(editTextBoldCursor2);
        gt7Var2.addView(editTextBoldCursor2, qoe.e(-1, -2, 48));
        editTextBoldCursor2.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final zf6 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                byte b = r2;
                zf6 zf6Var = this.b;
                switch (b) {
                    case 0:
                        if (i2 != 5) {
                            return false;
                        }
                        zf6Var.d.requestFocus();
                        return true;
                    default:
                        if (i2 != 6 && i2 != 5) {
                            return false;
                        }
                        zf6Var.h(null);
                        return true;
                }
            }
        });
        boolean M1 = gm.M1();
        boolean hasFocus = editTextBoldCursor.hasFocus();
        boolean hasFocus2 = editTextBoldCursor2.hasFocus();
        frameLayout2.removeAllViews();
        if (M1) {
            LinearLayout linearLayout = new LinearLayout(mh6Var.getParentActivity());
            linearLayout.setOrientation(0);
            gt7Var.setText(jb6.M0(2131750625, null));
            gt7Var2.setText(jb6.M0(2131748788, null));
            linearLayout.addView(gt7Var, qoe.m(1.0f, 0, -2, 0, 8, 0));
            linearLayout.addView(gt7Var2, qoe.m(1.0f, 0, -2, 8, 0, 0));
            frameLayout2.addView(linearLayout);
            if (hasFocus) {
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
            } else if (hasFocus2) {
                editTextBoldCursor2.requestFocus();
                gm.E3(editTextBoldCursor2);
            }
        } else {
            gt7Var.setText(jb6.M0(2131750626, null));
            gt7Var2.setText(jb6.M0(2131748789, null));
            frameLayout2.addView(gt7Var, qoe.d(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            frameLayout2.addView(gt7Var2, qoe.d(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }
        TextView textView3 = new TextView(context);
        this.x = textView3;
        textView3.setText(jb6.M0(2131752525, "CancelRegistration"));
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView3.setGravity(i | 1);
        textView3.setTextSize(1, 14.0f);
        textView3.setLineSpacing(gm.L(2.0f), 1.0f);
        textView3.setPadding(0, gm.L(24.0f), 0, 0);
        textView3.setVisibility(8);
        addView(textView3, qoe.t(-2, -2, (jb6.a0 ? 5 : 3) | 48, 0, 20, 0, 0));
        textView3.setOnClickListener(new View.OnClickListener(this) {
            public final zf6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                boolean z;
                byte b = r2;
                zf6 zf6Var = this.b;
                switch (b) {
                    case 0:
                        cj1 cj1Var2 = zf6Var.n;
                        p09 p09Var2 = zf6Var.K;
                        wn5 wn5Var2 = zf6Var.N;
                        if (zf6Var.O != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        wn5Var2.n(z, new me6(zf6Var, (byte) 1), new n1(zf6Var, (byte) 25), 0);
                        zf6Var.M = false;
                        cj1Var2.setAnimation(p09Var2);
                        p09Var2.H(0);
                        p09Var2.K(43);
                        cj1Var2.d();
                        return;
                    default:
                        if (zf6Var.Q.W.getTag() == null) {
                            zf6Var.d(false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        addView(frameLayout3, qoe.r(-1, -1, 83));
        TextView textView4 = new TextView(context);
        this.y = textView4;
        textView4.setMovementMethod(new cm((byte) 0));
        if (gm.M1()) {
            f = 13.0f;
        } else {
            f = 14.0f;
        }
        textView4.setTextSize(1, f);
        textView4.setLineSpacing(gm.L(2.0f), 1.0f);
        textView4.setGravity(16);
        frameLayout3.addView(textView4, qoe.d(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
        wm9.c(textView4);
        String M0 = jb6.M0(2131743882, "TermsOfServiceLogin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
        int indexOf = M0.indexOf(42);
        int lastIndexOf = M0.lastIndexOf(42);
        if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
            spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
            spannableStringBuilder.setSpan(new z31(this, (byte) 8), indexOf, lastIndexOf - 1, 33);
        }
        textView4.setText(spannableStringBuilder);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
        gm.c3(new dt5(this, photoSize2, photoSize, (byte) 22));
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
        mh6 mh6Var = this.Q;
        if (!z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
            String M0 = jb6.M0(2131742611, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131754045, "AreYouSureRegistration");
            alertDialog$Builder.g(jb6.M0(2131744530, "Stop"), new tf6(this, (byte) 0));
            alertDialog$Builder.j(jb6.M0(2131751708, "Continue"), null);
            mh6Var.showDialog(heVar);
            return false;
        }
        mh6Var.y1(true, true);
        this.J = false;
        this.I = null;
        return true;
    }

    @Override
    public final void e() {
        this.J = false;
    }

    @Override
    public qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public String getHeaderName() {
        return jb6.M0(2131742473, "YourName");
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
        mh6 mh6Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = mh6Var.s0;
        if (tL_help_termsOfService != null && tL_help_termsOfService.popup) {
            p(true);
            return;
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor.length() == 0) {
            mh6.E1(this.a, true);
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
        mh6Var.B1(0, true);
        i = ((d) mh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_auth_signUp, new kc((byte) 0), new vt4(this, (byte) 15), 10);
    }

    @Override
    public final void j() {
        TextView textView = this.y;
        if (textView != null) {
            if (this.Q.f) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(0.0f);
                textView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(gm.F).start();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.c;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.requestFocus();
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
            gm.E3(editTextBoldCursor);
        }
        gm.d3(new me6(this, (byte) 3), mh6.A0);
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
            fc4.g(e, true);
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
        mh6 mh6Var = this.Q;
        TLRPC.TL_help_termsOfService tL_help_termsOfService = mh6Var.s0;
        if (tL_help_termsOfService != null) {
            SerializedData serializedData = new SerializedData(tL_help_termsOfService.getObjectSize());
            mh6Var.s0.serializeToStream(serializedData);
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
        this.y.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(gm.G).start();
    }

    public final void o(boolean z) {
        cj1 cj1Var = this.n;
        if (cj1Var == null) {
            return;
        }
        AnimatorSet animatorSet = this.s;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.s = null;
        }
        dj1 dj1Var = this.r;
        if (z) {
            this.s = new AnimatorSet();
            cj1Var.setVisibility(0);
            AnimatorSet animatorSet2 = this.s;
            Property property = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(cj1Var, property, 1.0f), ObjectAnimator.ofFloat(dj1Var, property, 0.0f));
            this.s.setDuration(180L);
            this.s.addListener(new v85(this, (byte) 16));
            this.s.start();
            return;
        }
        cj1Var.setAlpha(1.0f);
        cj1Var.setVisibility(0);
        dj1Var.setAlpha(0.0f);
        dj1Var.setVisibility(4);
    }

    public final void p(boolean z) {
        mh6 mh6Var = this.Q;
        if (mh6Var.s0 == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mh6Var.getParentActivity());
        String M0 = jb6.M0(2131743883, "TermsOfService");
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        if (z) {
            alertDialog$Builder.j(jb6.M0(2131754716, "Accept"), new tf6(this, (byte) 1));
            alertDialog$Builder.g(jb6.M0(2131751541, "Decline"), new tf6(this, (byte) 2));
        } else {
            alertDialog$Builder.j(jb6.M0(2131747564, "OK"), null);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mh6Var.s0.text);
        k47.b(spannableStringBuilder, mh6Var.s0.entities, false, false, false, false, 0);
        heVar.U = spannableStringBuilder;
        mh6Var.showDialog(heVar);
    }

    @Override
    public final void updateColors() {
        this.f.invalidateSelf();
        int i = cmb.F6;
        this.E.setTextColor(cmb.w0(null, i, false));
        int i2 = cmb.C6;
        this.w.setTextColor(cmb.w0(null, i2, false));
        int w0 = cmb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.c;
        editTextBoldCursor.setTextColor(w0);
        int i3 = cmb.k6;
        editTextBoldCursor.setCursorColor(cmb.w0(null, i3, false));
        int w02 = cmb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor2 = this.d;
        editTextBoldCursor2.setTextColor(w02);
        editTextBoldCursor2.setCursorColor(cmb.w0(null, i3, false));
        this.x.setTextColor(cmb.w0(null, cmb.p6, false));
        int w03 = cmb.w0(null, i2, false);
        TextView textView = this.y;
        textView.setTextColor(w03);
        textView.setLinkTextColor(cmb.w0(null, cmb.I6, false));
        this.a.f();
        this.b.f();
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void H(float f) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }
}
