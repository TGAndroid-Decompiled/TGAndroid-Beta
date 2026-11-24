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
public final class gd6 extends jja {
    public boolean E;
    public int F;
    public int G;
    public final mf6 H;
    public final er7[] a;
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

    public gd6(mf6 mf6Var, Context context, int i) {
        super(context);
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        this.H = mf6Var;
        this.y = i;
        setOrientation(1);
        if (i == 1) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.b = new EditTextBoldCursor[i2];
        this.a = new er7[i2];
        TextView textView = new TextView(context);
        this.c = textView;
        float f = 18.0f;
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(gl.o());
        float f2 = 2.0f;
        textView.setLineSpacing(gl.L(2.0f), 1.0f);
        textView.setGravity(49);
        textView.setText(k96.M0(2131745330, null));
        if (gl.M1()) {
            i3 = 16;
        } else {
            i3 = 72;
        }
        addView(textView, nme.t(-2, -2, 1, 8, i3, 8, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity(1);
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.t(-2, -2, 1, 8, 6, 8, 16));
        final int i6 = 0;
        while (i6 < this.b.length) {
            er7 er7Var = new er7(context, null);
            this.a[i6] = er7Var;
            if (i == 0) {
                if (i6 == 0) {
                    i4 = 2131747017;
                } else {
                    i4 = 2131747015;
                }
            } else {
                i4 = 2131747249;
            }
            er7Var.setText(k96.M0(i4, null));
            this.b[i6] = new EditTextBoldCursor(context);
            this.b[i6].setCursorSize(gl.L(20.0f));
            this.b[i6].setCursorWidth(1.5f);
            this.b[i6].setImeOptions(268435461);
            this.b[i6].setTextSize(1, f);
            this.b[i6].setMaxLines(1);
            this.b[i6].setBackground(null);
            int L = gl.L(16.0f);
            this.b[i6].setPadding(L, L, L, L);
            if (i == 0) {
                this.b[i6].setInputType(129);
                this.b[i6].setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.b[i6].setTypeface(Typeface.DEFAULT);
            EditTextBoldCursor editTextBoldCursor = this.b[i6];
            if (k96.a0) {
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
            editTextBoldCursor2.addTextChangedListener(new fd6(this, z));
            float f3 = f2;
            this.b[i6].setOnFocusChangeListener(new ls0(er7Var, (byte) 7));
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(16);
                linearLayout.addView(this.b[i6], nme.l(1.0f, 0, -2));
                ImageView imageView = new ImageView(context);
                this.f = imageView;
                imageView.setImageResource(2131232229);
                gl.T3(imageView, true, 0.1f, true, false);
                imageView.setOnClickListener(new View.OnClickListener(this) {
                    public final gd6 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i7;
                        int i8;
                        byte b = r2;
                        gd6 gd6Var = this.b;
                        switch (b) {
                            case 0:
                                ImageView imageView2 = gd6Var.f;
                                EditTextBoldCursor[] editTextBoldCursorArr = gd6Var.b;
                                gd6Var.E = !gd6Var.E;
                                for (int i9 = 0; i9 < editTextBoldCursorArr.length; i9++) {
                                    int selectionStart = editTextBoldCursorArr[i9].getSelectionStart();
                                    int selectionEnd = editTextBoldCursorArr[i9].getSelectionEnd();
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i9];
                                    if (gd6Var.E) {
                                        i8 = 144;
                                    } else {
                                        i8 = 128;
                                    }
                                    editTextBoldCursor3.setInputType(i8 | 1);
                                    editTextBoldCursorArr[i9].setSelection(selectionStart, selectionEnd);
                                }
                                imageView2.setTag(Boolean.valueOf(gd6Var.E));
                                if (gd6Var.E) {
                                    i7 = bkb.k6;
                                } else {
                                    i7 = bkb.G6;
                                }
                                zkb.s(imageView2, i7, null, PorterDuff.Mode.SRC_ATOP);
                                return;
                            default:
                                if (!gd6Var.y) {
                                    gd6Var.n(null, null);
                                    return;
                                } else {
                                    gd6Var.n(gd6Var.n, null);
                                    return;
                                }
                        }
                    }
                });
                linearLayout.addView(imageView, nme.u(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                er7Var.addView(linearLayout, nme.c(-2.0f, -1));
            } else {
                er7Var.addView(this.b[i6], nme.c(-2.0f, -1));
            }
            er7Var.e(this.b[i6]);
            addView(er7Var, nme.t(-1, -2, 1, 16, 16, 16, 0));
            this.b[i6].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i7, KeyEvent keyEvent) {
                    gd6 gd6Var = gd6.this;
                    if (i6 == 0) {
                        EditTextBoldCursor[] editTextBoldCursorArr = gd6Var.b;
                        if (editTextBoldCursorArr.length == 2) {
                            editTextBoldCursorArr[1].requestFocus();
                            return true;
                        }
                    }
                    if (i7 == 5) {
                        gd6Var.h(null);
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
            textView3.setText(k96.M0(2131747016, "PleaseEnterNewFirstPasswordLogin"));
        } else {
            textView3.setText(k96.M0(2131747247, "PasswordHintTextLogin"));
        }
        TextView textView4 = new TextView(context);
        this.e = textView4;
        textView4.setGravity(19);
        textView4.setTextSize(1, 15.0f);
        textView4.setLineSpacing(gl.L(f4), 1.0f);
        textView4.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        textView4.setText(k96.M0(2131742554, null));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(textView4, nme.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
        addView(frameLayout, nme.r(-1, -1, 80));
        vk9.c(textView4);
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final gd6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                int i7;
                int i8;
                byte b = r2;
                gd6 gd6Var = this.b;
                switch (b) {
                    case 0:
                        ImageView imageView2 = gd6Var.f;
                        EditTextBoldCursor[] editTextBoldCursorArr = gd6Var.b;
                        gd6Var.E = !gd6Var.E;
                        for (int i9 = 0; i9 < editTextBoldCursorArr.length; i9++) {
                            int selectionStart = editTextBoldCursorArr[i9].getSelectionStart();
                            int selectionEnd = editTextBoldCursorArr[i9].getSelectionEnd();
                            EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[i9];
                            if (gd6Var.E) {
                                i8 = 144;
                            } else {
                                i8 = 128;
                            }
                            editTextBoldCursor3.setInputType(i8 | 1);
                            editTextBoldCursorArr[i9].setSelection(selectionStart, selectionEnd);
                        }
                        imageView2.setTag(Boolean.valueOf(gd6Var.E));
                        if (gd6Var.E) {
                            i7 = bkb.k6;
                        } else {
                            i7 = bkb.G6;
                        }
                        zkb.s(imageView2, i7, null, PorterDuff.Mode.SRC_ATOP);
                        return;
                    default:
                        if (!gd6Var.y) {
                            gd6Var.n(null, null);
                            return;
                        } else {
                            gd6Var.n(gd6Var.n, null);
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
        this.H.x1(true, true);
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
        return k96.M0(2131748074, "NewPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.x) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.b;
            String obj = editTextBoldCursorArr[0].getText().toString();
            int length = obj.length();
            mf6 mf6Var = this.H;
            if (length == 0) {
                if (mf6Var.getParentActivity() != null) {
                    try {
                        editTextBoldCursorArr[0].performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    gl.z3(editTextBoldCursorArr[0]);
                }
            } else if (!this.y) {
                if (!obj.equals(editTextBoldCursorArr[1].getText().toString())) {
                    if (mf6Var.getParentActivity() == null) {
                        return;
                    }
                    try {
                        editTextBoldCursorArr[1].performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    gl.z3(editTextBoldCursorArr[1]);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.h);
                bundle.putString("new_password", obj);
                bundle.putString("password", this.r);
                mf6Var.I1(10, true, bundle, false);
            } else {
                this.x = true;
                mf6Var.A1(0, true);
                n(this.n, obj);
            }
        }
    }

    @Override
    public final void j() {
        gl.d3(new tp5(this, (byte) 19), mf6.A0);
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
            TwoStepVerificationActivity.e0(TLdeserialize);
        }
        this.n = this.w.getString("new_password");
        this.H.L1(editTextBoldCursorArr[0]);
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
        Utilities.e.c(new e45(this, str, str2, tL_auth_recoverPassword, (byte) 16));
    }

    @Override
    public final void updateColors() {
        EditTextBoldCursor[] editTextBoldCursorArr;
        int i;
        this.c.setTextColor(bkb.w0(null, bkb.F6, false));
        this.d.setTextColor(bkb.w0(null, bkb.C6, false));
        for (EditTextBoldCursor editTextBoldCursor : this.b) {
            editTextBoldCursor.setTextColor(bkb.w0(null, bkb.F6, false));
            editTextBoldCursor.setCursorColor(bkb.w0(null, bkb.k6, false));
        }
        for (er7 er7Var : this.a) {
            er7Var.f();
        }
        this.e.setTextColor(bkb.w0(null, bkb.p6, false));
        ImageView imageView = this.f;
        if (imageView != null) {
            if (this.E) {
                i = bkb.k6;
            } else {
                i = bkb.G6;
            }
            int w0 = bkb.w0(null, i, false);
            mf6.l1(imageView, w0, this.F, PorterDuff.Mode.SRC_ATOP);
            this.F = w0;
            int themedColor = this.H.getThemedColor(bkb.h6);
            mf6.m1(imageView, themedColor, this.G);
            this.G = themedColor;
        }
    }
}
