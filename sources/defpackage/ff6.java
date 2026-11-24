package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ff6 extends kla {
    public boolean E;
    public int F;
    public int G;
    public final mh6 H;
    public final gt7[] a;
    public final EditTextBoldCursor[] b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public String h;
    public String n;
    public String r;
    public TL_account.Password s;
    public Bundle w;
    public boolean x;
    public final boolean y;

    public ff6(mh6 mh6Var, Context context, int i) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        this.H = mh6Var;
        this.y = i;
        setOrientation(1);
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.b = new EditTextBoldCursor[i2];
        this.a = new gt7[i2];
        TextView textView = new TextView(context);
        this.c = textView;
        float f = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gm.o());
        float f2 = 2.0f;
        textView.setLineSpacing(gm.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(jb6.M0(2131745256, null));
        if (gm.M1()) {
            i3 = 16;
        } else {
            i3 = 72;
        }
        addView(textView, qoe.t(-2, -2, 1, 8, i3, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView2, qoe.t(-2, -2, 1, 8, 6, 8, 16));
        final int i6 = 0;
        while (i6 < this.b.length) {
            gt7 gt7Var = new gt7(context, null);
            this.a[i6] = gt7Var;
            if (i == 0) {
                if (i6 == 0) {
                    i4 = 2131746943;
                } else {
                    i4 = 2131746941;
                }
            } else {
                i4 = 2131747175;
            }
            gt7Var.setText(jb6.M0(i4, null));
            this.b[i6] = new EditTextBoldCursor(context);
            this.b[i6].setCursorSize(gm.L(20.0f));
            this.b[i6].setCursorWidth(1.5f);
            this.b[i6].setImeOptions(268435461);
            this.b[i6].setTextSize(1, f);
            this.b[i6].setMaxLines(1);
            this.b[i6].setBackground(null);
            int L = gm.L(16.0f);
            this.b[i6].setPadding(L, L, L, L);
            if (i == 0) {
                this.b[i6].setInputType(129);
                this.b[i6].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i6].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.b[i6];
            if (jb6.a0) {
                i5 = 5;
            } else {
                i5 = 3;
            }
            editTextBoldCursor.setGravity(i5);
            EditTextBoldCursor editTextBoldCursor2 = this.b[i6];
            if (i6 == 0 && i == 0) {
                z = true;
            } else {
                z = false;
            }
            editTextBoldCursor2.addTextChangedListener(new ef6(this, z));
            float f3 = f2;
            this.b[i6].setOnFocusChangeListener(new tt0(gt7Var, (byte) 7));
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i6], qoe.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(2131232230);
                gm.T3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final ff6 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7;
                        int i8;
                        byte b = r2;
                        ff6 ff6Var = this.b;
                        switch (b) {
                            case 0:
                                ImageView imageView2 = ff6Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = ff6Var.b;
                                ff6Var.E = !ff6Var.E;
                                for (int i9 = 0; i9 < editTextBoldCursorArr.length; i9++) {
                                    int selectionStart = editTextBoldCursorArr[i9].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i9].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i9];
                                    if (ff6Var.E) {
                                        i8 = 144;
                                    } else {
                                        i8 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i8 | 1);
                                    editTextBoldCursorArr[i9].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(ff6Var.E));
                                if (ff6Var.E) {
                                    i7 = cmb.k6;
                                } else {
                                    i7 = cmb.G6;
                                }
                                anb.s(imageView2, i7, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                if (!ff6Var.y) {
                                    ff6Var.n(null, null);
                                    return;
                                } else {
                                    ff6Var.n(ff6Var.n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, qoe.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                gt7Var.addView(linearLayout, qoe.c(-2.0f, -1));
            } else {
                gt7Var.addView(this.b[i6], qoe.c(-2.0f, -1));
            }
            gt7Var.e(this.b[i6]);
            addView(gt7Var, qoe.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i6].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i7, KeyEvent keyEvent) {
                    ff6 ff6Var = ff6.this;
                    if (i6 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = ff6Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i7 == 5) {
                        ff6Var.h(null);
                        return true;
                    }
                    return false;
                }
            });
            i6++;
            f2 = f3;
            f = 18.0f;
        }
        float f4 = f2;
        TextView textView3 = this.d;
        if (i == 0) {
            textView3.setText(jb6.M0(2131746942, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            textView3.setText(jb6.M0(2131747173, "PasswordHintTextLogin"));
        }
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(19);
        textView4.setTextSize(1, 15.0f);
        textView4.setLineSpacing(gm.L(f4), 1.0f);
        textView4.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
        textView4.setText(jb6.M0(2131742480, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView4, qoe.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, qoe.r(-1, -1, 80));
        wm9.c(textView4);
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final ff6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i8;
                byte b = r2;
                ff6 ff6Var = this.b;
                switch (b) {
                    case 0:
                        ImageView imageView2 = ff6Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = ff6Var.b;
                        ff6Var.E = !ff6Var.E;
                        for (int i9 = 0; i9 < editTextBoldCursorArr.length; i9++) {
                            int selectionStart = editTextBoldCursorArr[i9].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i9].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i9];
                            if (ff6Var.E) {
                                i8 = 144;
                            } else {
                                i8 = 128;
                            }
                            editTextBoldCursor3.setInputType(i8 | 1);
                            editTextBoldCursorArr[i9].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(ff6Var.E));
                        if (ff6Var.E) {
                            i7 = cmb.k6;
                        } else {
                            i7 = cmb.G6;
                        }
                        anb.s(imageView2, i7, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        if (!ff6Var.y) {
                            ff6Var.n(null, null);
                            return;
                        } else {
                            ff6Var.n(ff6Var.n, null);
                            return;
                        }
                }
            }
        });
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        this.H.y1(true, true);
        this.w = null;
        this.x = false;
        return true;
    }

    @Override
    public final void e() {
        this.x = false;
    }

    @Override
    public String getHeaderName() {
        return jb6.M0(2131748023, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.x) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            mh6 mh6Var = this.H;
            if (length == 0) {
                if (mh6Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    gm.z3(editTextBoldCursorArr[0]);
                }
            } else if (!this.y) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (mh6Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    gm.z3(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.r);
                mh6Var.J1(10, true, bundle, false);
            } else {
                this.x = true;
                mh6Var.B1(0, true);
                n(this.n, obj);
            }
        }
    }

    @Override
    public final void j() {
        gm.d3(new kg5(this, (byte) 26), mh6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("recoveryview_params" + (this.y ? 1 : 0));
        this.w = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        if (this.w != null) {
            bundle.putBundle("recoveryview_params" + (this.y ? 1 : 0), this.w);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (bundle == null) {
            return;
        }
        int i = 0;
        while (true) {
            editTextBoldCursorArr = this.b;
            if (i >= editTextBoldCursorArr.length) {
                break;
            }
            editTextBoldCursorArr[i].setText("");
            i++;
        }
        this.w = bundle;
        this.h = bundle.getString("emailCode");
        String string = this.w.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            TL_account.Password TLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            this.s = TLdeserialize;
            TwoStepVerificationActivity.f0(TLdeserialize);
        }
        this.n = this.w.getString("new_password");
        this.H.M1(editTextBoldCursorArr[0]);
        editTextBoldCursorArr[0].requestFocus();
    }

    public final void n(String str, String str2) {
        String str3;
        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
        tL_auth_recoverPassword.code = this.h;
        if (!TextUtils.isEmpty(str)) {
            tL_auth_recoverPassword.flags |= 1;
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            passwordinputsettings.flags |= 1;
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "";
            }
            passwordinputsettings.hint = str3;
            passwordinputsettings.new_algo = this.s.new_algo;
        }
        Utilities.e.c(new d65(this, str, str2, tL_auth_recoverPassword, (byte) 16));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i;
        this.c.setTextColor(cmb.w0(null, cmb.F6, false));
        this.d.setTextColor(cmb.w0(null, cmb.C6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(cmb.w0(null, cmb.F6, false));
            editTextBoldCursor.setCursorColor(cmb.w0(null, cmb.k6, false));
        }
        for (gt7 gt7Var : this.a) {
            gt7Var.f();
        }
        this.e.setTextColor(cmb.w0(null, cmb.p6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            if (this.E) {
                i = cmb.k6;
            } else {
                i = cmb.G6;
            }
            int w0 = cmb.w0(null, i, false);
            mh6.m1(imageView, w0, this.F, PorterDuff.Mode.SRC_ATOP);
            this.F = w0;
            int themedColor = this.H.getThemedColor(cmb.h6);
            mh6.n1(imageView, themedColor, this.G);
            this.G = themedColor;
        }
    }
}
