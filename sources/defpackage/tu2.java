package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
public final class tu2 extends d implements jm7, vn5 {
    public xib E;
    public ru2 F;
    public xib G;
    public xb7 H;
    public long I;
    public boolean J;
    public boolean K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public su2 P;
    public final wn5 Q;
    public TLRPC.FileLocation R;
    public byte S;
    public byte T;
    public TLRPC.Photo U;
    public bf0 V;
    public FrameLayout W;
    public q7c X;
    public boolean Y;
    public boolean Z;
    public uja a;
    public k47 a0;
    public su3 b;
    public su3 c;
    public su3 d;
    public bf0 e;
    public TextView f;
    public TextView h;
    public pc0 n;
    public final ylb r;
    public RadialProgressView s;
    public a91 w;
    public AnimatorSet x;
    public xib y;

    public tu2(Bundle bundle, ylb ylbVar) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.r = ylbVar;
        this.Q = new wn5(0, true, true);
    }

    @Override
    public final void H(float f) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f);
    }

    @Override
    public final void O(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.s;
        if (radialProgressView == null) {
            return;
        }
        this.T = this.S;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void T() {
        gm.c3(new hu2(this, (byte) 0));
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
        gm.c3(new Runnable() {
            @Override
            public final void run() {
                tu2.this.f0(photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.k6));
        hashSet.add(Integer.valueOf(cmb.j6));
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
    }

    public final String b0() {
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        if (W1 != null && !TextUtils.isEmpty(W1.phone)) {
            return W1.phone;
        }
        return this.M;
    }

    @Override
    public final boolean c() {
        if (this.T != 1) {
            return true;
        }
        return false;
    }

    public final void c0(TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.id = getMessagesController().n1(this.I);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_users_suggestBirthday, new tg(this, (byte) 15));
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        int i7;
        float f3;
        float f4;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        boolean z = this.J;
        rja rjaVar = this.simpleActionBar;
        if (z) {
            rjaVar.setTitle(jb6.M0(2131748040, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131751219, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new pu2(this));
        rja rjaVar2 = this.simpleActionBar;
        if (this.J) {
            i = 2131751690;
        } else {
            i = 2131745680;
        }
        this.a = rjaVar2.s(jb6.M0(i, null));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.W = frameLayout2;
        int i8 = cmb.c6;
        ylb ylbVar = this.r;
        anb.h(i8, ylbVar, frameLayout2);
        bf0 bf0Var = new bf0(context);
        this.e = bf0Var;
        bf0Var.setRoundRadius(gm.L(32.0f));
        FrameLayout frameLayout3 = this.W;
        bf0 bf0Var2 = this.e;
        int i9 = 3;
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        frameLayout3.addView(bf0Var2, qoe.d(64, 64.0f, i2 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        a91 a91Var = new a91(this, context, paint, (byte) 6);
        this.w = a91Var;
        FrameLayout frameLayout4 = this.W;
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        frameLayout4.addView(a91Var, qoe.d(64, 64.0f, i3 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.s = radialProgressView;
        radialProgressView.setSize(gm.L(30.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        FrameLayout frameLayout5 = this.W;
        RadialProgressView radialProgressView2 = this.s;
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        frameLayout5.addView(radialProgressView2, qoe.d(64, 64.0f, i4 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        i0(false, false);
        TextView textView = new TextView(context);
        this.f = textView;
        anb.X(textView, cmb.F6, ylbVar);
        this.f.setTextSize(1, 18.0f);
        this.f.setLines(1);
        this.f.setMaxLines(1);
        this.f.setSingleLine(true);
        TextView textView2 = this.f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f;
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        textView3.setGravity(i5);
        this.f.setTypeface(gm.o());
        FrameLayout frameLayout6 = this.W;
        TextView textView4 = this.f;
        boolean z2 = jb6.a0;
        if (z2) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i10 = i6 | 48;
        if (z2) {
            f = 0.0f;
        } else {
            f = 94.0f;
        }
        if (z2) {
            f2 = 94.0f;
        } else {
            f2 = 0.0f;
        }
        TextView l = wi8.l(frameLayout6, textView4, qoe.d(-2, -2.0f, i10, f, 25.66f, f2, 0.0f), context);
        this.h = l;
        anb.X(l, cmb.z6, ylbVar);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (jb6.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView5.setGravity(i7);
        FrameLayout frameLayout7 = this.W;
        TextView textView6 = this.h;
        boolean z3 = jb6.a0;
        if (z3) {
            i9 = 5;
        }
        int i11 = i9 | 48;
        if (z3) {
            f3 = 0.0f;
        } else {
            f3 = 94.0f;
        }
        if (z3) {
            f4 = 94.0f;
        } else {
            f4 = 0.0f;
        }
        frameLayout7.addView(textView6, qoe.d(-2, -2.0f, i11, f3, 49.66f, f4, 0.0f));
        su3 su3Var = new su3(context, jb6.M0(2131750626, null), false, false, -1, this.r);
        this.b = su3Var;
        su3Var.d.setImeOptions(5);
        anb.h(i8, ylbVar, this.b);
        this.b.setDivider(true);
        this.b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tu2 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i12, KeyEvent keyEvent) {
                byte b = r2;
                tu2 tu2Var = this.b;
                switch (b) {
                    case 0:
                        if (i12 != 5) {
                            return false;
                        }
                        tu2Var.c.d.requestFocus();
                        ru3 ru3Var = tu2Var.c.d;
                        ru3Var.setSelection(ru3Var.length());
                        return true;
                    case 1:
                        if (i12 == 6) {
                            tu2Var.a.performClick();
                        } else if (i12 != 5) {
                            return false;
                        } else {
                            tu2Var.d.d.requestFocus();
                            tu2Var.d.d.setSelection(tu2Var.c.d.length());
                        }
                        return true;
                    default:
                        if (i12 != 6) {
                            return false;
                        }
                        tu2Var.a.performClick();
                        return true;
                }
            }
        });
        this.b.d.setOnFocusChangeListener(new Object());
        this.b.setText(this.N);
        su3 su3Var2 = new su3(context, jb6.M0(2131748789, null), false, false, -1, this.r);
        this.c = su3Var2;
        su3Var2.d.setImeOptions(5);
        anb.h(i8, ylbVar, this.c);
        this.c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tu2 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i12, KeyEvent keyEvent) {
                byte b = r2;
                tu2 tu2Var = this.b;
                switch (b) {
                    case 0:
                        if (i12 != 5) {
                            return false;
                        }
                        tu2Var.c.d.requestFocus();
                        ru3 ru3Var = tu2Var.c.d;
                        ru3Var.setSelection(ru3Var.length());
                        return true;
                    case 1:
                        if (i12 == 6) {
                            tu2Var.a.performClick();
                        } else if (i12 != 5) {
                            return false;
                        } else {
                            tu2Var.d.d.requestFocus();
                            tu2Var.d.d.setSelection(tu2Var.c.d.length());
                        }
                        return true;
                    default:
                        if (i12 != 6) {
                            return false;
                        }
                        tu2Var.a.performClick();
                        return true;
                }
            }
        });
        this.c.setText(this.O);
        su3 su3Var3 = new su3(context, jb6.M0(2131754392, null), true, true, getMessagesController().l4.C.f(), this.r);
        this.d = su3Var3;
        anb.G(su3Var3.d, cmb.Wc, ylbVar);
        this.d.d.setImeOptions(6);
        anb.h(i8, ylbVar, this.d);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final tu2 b;

            {
                this.b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i12, KeyEvent keyEvent) {
                byte b = r2;
                tu2 tu2Var = this.b;
                switch (b) {
                    case 0:
                        if (i12 != 5) {
                            return false;
                        }
                        tu2Var.c.d.requestFocus();
                        ru3 ru3Var = tu2Var.c.d;
                        ru3Var.setSelection(ru3Var.length());
                        return true;
                    case 1:
                        if (i12 == 6) {
                            tu2Var.a.performClick();
                        } else if (i12 != 5) {
                            return false;
                        } else {
                            tu2Var.d.d.requestFocus();
                            tu2Var.d.d.setSelection(tu2Var.c.d.length());
                        }
                        return true;
                    default:
                        if (i12 != 6) {
                            return false;
                        }
                        tu2Var.a.performClick();
                        return true;
                }
            }
        });
        if (!this.J) {
            final TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
            xib xibVar = new xib(context, ylbVar);
            this.y = xibVar;
            xibVar.o(2131232053, jb6.a0(null, null, 2131744083, W1.first_name), true);
            this.y.setBackground(cmb.K0(ylbVar, true));
            xib xibVar2 = this.y;
            int i12 = cmb.u6;
            int i13 = cmb.t6;
            xibVar2.g(i12, i13);
            final p09 p09Var = new p09(2131624133, gm.L(50.0f), gm.L(50.0f), false, null);
            this.y.e.setTranslationX(-gm.L(8.0f));
            this.y.e.setAnimation(p09Var);
            this.y.setOnClickListener(new View.OnClickListener(this) {
                public final tu2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    boolean z4;
                    boolean z5;
                    byte b = r4;
                    TLRPC.FileLocation fileLocation = null;
                    final p09 p09Var2 = p09Var;
                    TLRPC.User user = W1;
                    final tu2 tu2Var = this.b;
                    switch (b) {
                        case 0:
                            tu2Var.S = (byte) 1;
                            wn5 wn5Var = tu2Var.Q;
                            wn5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            wn5Var.n(z4, new jd((byte) 10), new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b2 = r3;
                                    p09 p09Var3 = p09Var2;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b2) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            p09Var2.H(0);
                            p09Var2.K(43);
                            tu2Var.y.e.d();
                            return;
                        default:
                            tu2Var.S = (byte) 2;
                            wn5 wn5Var2 = tu2Var.Q;
                            wn5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            if (userProfilePhoto2 != null) {
                                fileLocation = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            wn5Var2.n(z5, new jd((byte) 10), new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b2 = r3;
                                    p09 p09Var3 = p09Var2;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b2) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            p09Var2.H(0);
                            p09Var2.K(43);
                            tu2Var.E.e.d();
                            return;
                    }
                }
            });
            xib xibVar3 = new xib(context, ylbVar);
            this.E = xibVar3;
            xibVar3.o(2131232053, jb6.a0(null, null, 2131743366, W1.first_name), false);
            this.E.setBackground(cmb.K0(ylbVar, true));
            this.E.g(i12, i13);
            final p09 p09Var2 = new p09(2131623965, gm.L(50.0f), gm.L(50.0f), false, null);
            this.E.e.setTranslationX(-gm.L(8.0f));
            this.E.e.setAnimation(p09Var2);
            this.E.setOnClickListener(new View.OnClickListener(this) {
                public final tu2 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    boolean z4;
                    boolean z5;
                    byte b = r4;
                    TLRPC.FileLocation fileLocation = null;
                    final p09 p09Var22 = p09Var2;
                    TLRPC.User user = W1;
                    final tu2 tu2Var = this.b;
                    switch (b) {
                        case 0:
                            tu2Var.S = (byte) 1;
                            wn5 wn5Var = tu2Var.Q;
                            wn5Var.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto != null) {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation != null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            wn5Var.n(z4, new jd((byte) 10), new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b2 = r3;
                                    p09 p09Var3 = p09Var22;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b2) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            p09Var22.H(0);
                            p09Var22.K(43);
                            tu2Var.y.e.d();
                            return;
                        default:
                            tu2Var.S = (byte) 2;
                            wn5 wn5Var2 = tu2Var.Q;
                            wn5Var2.M = user;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user.photo;
                            if (userProfilePhoto2 != null) {
                                fileLocation = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation != null) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            wn5Var2.n(z5, new jd((byte) 10), new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    byte b2 = r3;
                                    p09 p09Var3 = p09Var22;
                                    tu2 tu2Var2 = tu2Var;
                                    switch (b2) {
                                        case 0:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(86);
                                                tu2Var2.E.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                        default:
                                            if (!tu2Var2.Q.g()) {
                                                p09Var3.K(85);
                                                tu2Var2.y.e.d();
                                                return;
                                            }
                                            p09Var3.I(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            p09Var22.H(0);
                            p09Var22.K(43);
                            tu2Var.E.e.d();
                            return;
                    }
                }
            });
            this.V = new bf0(context);
            this.F = new ru2(this, context, ylbVar);
            pc0 pc0Var = this.n;
            if (pc0Var == null) {
                pc0Var = new pc0(0, W1);
                this.n = pc0Var;
            }
            this.V.f(W1.photo, pc0Var);
            this.F.addView(this.V, qoe.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.F.k(jb6.M0(2131745821, null), false);
            this.F.getImageView().setVisibility(0);
            this.F.setBackground(cmb.K0(ylbVar, true));
            this.F.g(i12, i13);
            this.F.setOnClickListener(new b0(this, context, W1, (byte) 26));
            xib xibVar4 = new xib(context, ylbVar);
            this.G = xibVar4;
            xibVar4.o(2131231772, jb6.a0(null, null, 2131743365, new Object[0]), false);
            this.G.setBackground(cmb.K0(ylbVar, true));
            this.G.g(i12, i13);
            this.G.setNeedDivider(true);
            this.G.e.setTranslationX(gm.L(4.0f));
            this.G.setOnClickListener(new rc1(this, W1, (byte) 23));
            TLRPC.UserFull X1 = getMessagesController().X1(this.I);
            if (X1 != null) {
                TLRPC.Photo photo = X1.profile_photo;
                this.U = photo;
                if (photo == null) {
                    this.U = X1.fallback_photo;
                }
            }
            k0();
        }
        q7c q7cVar = new q7c(this, new h92(this, (byte) 10), new wm2(this, (byte) 2), null);
        this.X = q7cVar;
        q7cVar.r1();
        this.X.setSectionsDrawBackground(true);
        this.X.setOnScrollListener(new bk1(this, frameLayout, (byte) 2));
        frameLayout.addView(this.X, qoe.e(-1, -1, 119));
        if (this.J && this.L) {
            this.Y = true;
        }
        this.X.g3.O(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.User user) {
        this.R = null;
        h0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        W1.photo.personal = false;
        TLRPC.UserFull X1 = oc7.r1(this.currentAccount).X1(this.I);
        if (X1 != null) {
            X1.personal_photo = null;
            X1.flags &= -2097153;
            getMessagesStorage().g2(X1, true);
        }
        TLRPC.Photo photo = this.U;
        if (photo != null) {
            W1.photo.photo_id = photo.id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, 100, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 1000, false, null, false);
            if (w != null) {
                W1.photo.photo_small = w.location;
            }
            if (w2 != null) {
                W1.photo.photo_big = w2.location;
            }
        } else {
            W1.photo = null;
            W1.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        getMessagesStorage().j1(arrayList2, null, false, true);
        k0();
        getNotificationCenter().k(nm7.c0, new Object[0]);
        getNotificationCenter().k(2, 2);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        xb7 xb7Var;
        if (i == 2) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i3 = oc7.s5;
            if ((intValue & 2) != 0 || (intValue & 4) != 0) {
                j0();
            }
        } else if (i == nm7.g3 && (xb7Var = (xb7) objArr[0]) == this.H) {
            ArrayList arrayList = new ArrayList(xb7Var.b);
            int i4 = 0;
            while (i4 < arrayList.size()) {
                if (arrayList.get(i4) == null) {
                    arrayList.remove(i4);
                    i4--;
                }
                i4++;
            }
            if (arrayList.size() > 0) {
                this.U = (TLRPC.Photo) arrayList.get(0);
                k0();
            }
        }
    }

    public final void e0() {
        if (this.a0 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.a0.e1()));
            nm7.f(this.currentAccount).k(nm7.v, arrayList, 0L, Boolean.FALSE);
        }
    }

    public final void f0(TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z) {
        boolean z2;
        wn5 wn5Var = this.Q;
        if (wn5Var.U) {
            return;
        }
        byte b = this.T;
        if (b == 2) {
            this.R = photoSize.location;
        } else if (b == 1 && getParentLayout() != null) {
            tk5 parentLayout = getParentLayout();
            d lastFragment = getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = (d) fragmentStack.get(size);
                if (dVar instanceof yv1) {
                    yv1 yv1Var = (yv1) dVar;
                    d dVar2 = lastFragment;
                    if (yv1Var.a() == this.I && yv1Var.g4 == 0) {
                        yv1Var.rb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            d dVar3 = dVar2;
                            if (arrayList.get(size2) != dVar3) {
                                ((d) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            dVar2 = dVar3;
                        }
                        dVar2.finishFragment();
                    } else {
                        lastFragment = dVar2;
                    }
                }
                arrayList.add((d) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            this.e.m(gn5.e(this.R), "50_50", this.n, getMessagesController().W1(Long.valueOf(this.I)));
            if (this.T == 2) {
                i0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                a6a.B(this.currentAccount);
                tL_messageService.random_id = a6a.D();
                tL_messageService.dialog_id = this.I;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int i = getUserConfig().i();
                tL_messageService.id = i;
                tL_messageService.local_id = i;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = getUserConfig().e();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = this.I;
                tL_messageService.date = getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList arrayList2 = new ArrayList();
                k47 k47Var = new k47(this.currentAccount, tL_messageService, false, false);
                this.a0 = k47Var;
                arrayList2.add(k47Var);
                new ArrayList().add(tL_messageService);
                oc7.r1(this.currentAccount).t5(0, this.I, arrayList2);
                getMessagesController().n4.put(tL_messageService.local_id, wn5Var);
            }
        } else {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
            if (this.a0 == null && W1 != null) {
                if (inputFile2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                W1.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                W1.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z2;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(W1);
                getMessagesStorage().j1(arrayList3, null, false, true);
                getNotificationCenter().k(nm7.c0, new Object[0]);
                nm7 notificationCenter = getNotificationCenter();
                int i2 = oc7.s5;
                notificationCenter.k(2, 2);
            }
            h0(this.R, photoSize2.location, inputFile, inputFile2, videoSize, d, this.T);
            i0(false, true);
        }
        k0();
    }

    public final void g0(TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        if (this.a0 == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
                TLRPC.UserFull X1 = oc7.r1(this.currentAccount).X1(this.I);
                if (X1 != null) {
                    X1.personal_photo = tL_photos_photo.photo;
                    X1.flags |= 2097152;
                    getMessagesStorage().g2(X1, true);
                }
                if (W1 != null) {
                    TLRPC.PhotoSize w = bc4.w(arrayList, 100, false, null, false);
                    TLRPC.PhotoSize w2 = bc4.w(arrayList, 1000, false, null, false);
                    if (w != null && fileLocation != null) {
                        bc4.G(this.currentAccount);
                        File J = bc4.J(w, null, true, true);
                        bc4.G(this.currentAccount);
                        bc4.J(fileLocation, null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocation.volume_id);
                        sb.append("_");
                        String k = hg9.k(sb, fileLocation.local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@50_50"), gn5.l(this.currentAccount, 1, W1));
                    }
                    if (w2 != null && fileLocation2 != null) {
                        bc4.G(this.currentAccount);
                        File J2 = bc4.J(w2, null, true, true);
                        bc4.G(this.currentAccount);
                        bc4.J(fileLocation2, null, true, true).renameTo(J2);
                    }
                    f88.a(tL_photos_photo.photo, W1, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(W1);
                    getMessagesStorage().j1(arrayList2, null, false, true);
                    getMessagesController().T0(this.I);
                    getNotificationCenter().k(nm7.c0, new Object[0]);
                    getNotificationCenter().k(2, 2);
                    if (getParentActivity() != null) {
                        if (i == 2) {
                            c41.b0(this).V(arrayList2, gm.S2(jb6.a0("UserCustomPhotoSeted", null, 2131743430, W1.first_name)), null, null).j();
                        } else {
                            c41.b0(this).V(arrayList2, gm.S2(jb6.a0("UserCustomPhotoSeted", null, 2131743430, W1.first_name)), null, null).j();
                        }
                    }
                }
                this.R = null;
                k0();
            }
        }
    }

    @Override
    public final qb8 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.X;
    }

    @Override
    public final ylb getResourceProvider() {
        return this.r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    public final void h0(final TLRPC.FileLocation fileLocation, final TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final int i) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().n1(this.I);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i2 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i2 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                gm.c3(new nu2(tu2.this, fileLocation, inputFile2, tLObject, fileLocation2, i));
            }
        });
    }

    public final void i0(boolean z, boolean z2) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.x;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.x = null;
        }
        if (z2) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.x = animatorSet2;
            RadialProgressView radialProgressView = this.s;
            if (z) {
                radialProgressView.setVisibility(0);
                this.w.setVisibility(0);
                AnimatorSet animatorSet3 = this.x;
                RadialProgressView radialProgressView2 = this.s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property, 1.0f), ObjectAnimator.ofFloat(this.w, property, 1.0f));
            } else {
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, property2, 0.0f), ObjectAnimator.ofFloat(this.w, property2, 0.0f));
            }
            this.x.setDuration(180L);
            this.x.addListener(new y7((byte) 24, this, z));
            this.x.start();
            return;
        }
        RadialProgressView radialProgressView3 = this.s;
        if (z) {
            radialProgressView3.setAlpha(1.0f);
            this.s.setVisibility(0);
            this.w.setAlpha(1.0f);
            this.w.setVisibility(0);
            return;
        }
        radialProgressView3.setAlpha(0.0f);
        this.s.setVisibility(4);
        this.w.setAlpha(0.0f);
        this.w.setVisibility(4);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        TLRPC.User W1;
        if (this.f != null && (W1 = getMessagesController().W1(Long.valueOf(this.I))) != null) {
            boolean isEmpty = TextUtils.isEmpty(b0());
            TextView textView = this.f;
            if (isEmpty) {
                textView.setText(jb6.M0(2131748167, null));
            } else {
                r58 f = r58.f();
                textView.setText(f.e("+" + b0()));
            }
            this.h.setText(jb6.d0(this.currentAccount, W1, null, null));
            if (this.R == null) {
                bf0 bf0Var = this.e;
                pc0 pc0Var = new pc0(0, W1);
                this.n = pc0Var;
                bf0Var.f(W1, pc0Var);
            }
        }
    }

    public final void k0() {
        TLRPC.Photo photo;
        if (this.J) {
            return;
        }
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.I));
        TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.U) != null) {
            this.V.m(gn5.i(bc4.w(photo.sizes, 1000, false, null, false), this.U), "50_50", this.n, null);
        }
        pc0 pc0Var = this.n;
        if (pc0Var == null) {
            pc0Var = new pc0(0, W1);
            this.n = pc0Var;
        }
        TLRPC.FileLocation fileLocation = this.R;
        bf0 bf0Var = this.e;
        if (fileLocation == null) {
            bf0Var.f(W1, pc0Var);
        } else {
            bf0Var.m(gn5.e(fileLocation), "50_50", this.n, getMessagesController().W1(Long.valueOf(this.I)));
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.g3);
        this.I = getArguments().getLong("user_id", 0L);
        this.M = getArguments().getString("phone");
        this.N = getArguments().getString("first_name_card");
        this.O = getArguments().getString("last_name_card");
        this.J = getArguments().getBoolean("addContact", false);
        this.K = getArguments().getBoolean("focus_notes", false);
        SharedPreferences sharedPreferences = oc7.r1(this.currentAccount).W3;
        this.L = sharedPreferences.getBoolean("dialog_bar_exception" + this.I, false);
        if (this.I != 0) {
            user = getMessagesController().W1(Long.valueOf(this.I));
        } else {
            user = null;
        }
        wn5 wn5Var = this.Q;
        if (wn5Var != null) {
            wn5Var.a = this;
            wn5Var.b = this;
        }
        this.H = oc7.r1(this.currentAccount).T0(this.I);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.g3);
        wn5 wn5Var = this.Q;
        if (wn5Var != null) {
            wn5Var.c();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.Q.i();
    }

    @Override
    public final void onResume() {
        super.onResume();
        j0();
        this.Q.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        TLRPC.User W1;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (W1 = getMessagesController().W1(Long.valueOf(this.I))) != null) {
                this.n.q(W1);
                this.e.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean w() {
        return false;
    }

    public tu2(Bundle bundle) {
        super(bundle);
        this.Y = false;
        this.Z = true;
        this.Q = new wn5(0, true, true);
    }
}
