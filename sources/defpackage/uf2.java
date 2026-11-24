package defpackage;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class uf2 extends d {
    public static final int V = -2;
    public static final int W = -3;
    public static final int X = -4;
    public static final int Y = -5;
    public static final int Z = -6;
    public static final int a0 = -7;
    public static final int b0 = -8;
    public static final int c0 = -9;
    public static final int d0 = -10;
    public static final int e0 = -11;
    public static final int f0 = -12;
    public static final int g0 = -13;
    public static final int h0 = -14;
    public static final int i0 = -15;
    public static final int j0 = -16;
    public static final int k0 = -17;
    public static final int l0 = -18;
    public static final int m0 = -19;
    public static final int n0 = -20;
    public static final int o0 = -21;
    public String E;
    public int F;
    public final of2 G;
    public TL_account.connectedBots H;
    public TL_account.TL_connectedBot I;
    public boolean J;
    public TL_account.TL_businessBotRights K;
    public boolean L;
    public boolean M;
    public TLRPC.User N;
    public final LongSparseArray O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public sha a;
    public tf2 b;
    public q5c c;
    public zr9 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public a6 n;
    public TextView r;
    public ImageView s;
    public m41 w;
    public boolean x;
    public boolean y;

    public uf2() {
        super(null);
        this.F = 0;
        this.G = new of2(this, (byte) 4);
        this.K = TL_account.TL_businessBotRights.makeDefault();
        this.N = null;
        this.O = new LongSparseArray();
        this.P = -4;
        this.Q = true;
        this.R = false;
        this.S = false;
    }

    public final void Y(int i, boolean z, final Runnable runnable) {
        if (!this.L && i == h0 && z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M0 = k96.M0(2131752775, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = gl.S2(k96.a0(null, null, 2131752776, l7c.p(this.N)));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            alertDialog$Builder.j(k96.M0(2131754281, null), new ed(this) {
                public final uf2 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i2) {
                    byte b = r3;
                    Runnable runnable2 = runnable;
                    uf2 uf2Var = this.b;
                    switch (b) {
                        case 0:
                            uf2Var.L = true;
                            runnable2.run();
                            return;
                        default:
                            uf2Var.M = true;
                            runnable2.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        } else if (!this.M && z && (i == k0 || i == l0 || i == m0 || i == n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M02 = k96.M0(2131752775, null);
            hd hdVar2 = alertDialog$Builder2.a;
            hdVar2.S = M02;
            hdVar2.U = gl.S2(k96.a0(null, null, 2131752789, l7c.p(this.N)));
            alertDialog$Builder2.g(k96.M0(2131752577, null), null);
            alertDialog$Builder2.j(k96.M0(2131754281, null), new ed(this) {
                public final uf2 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar22, int i2) {
                    byte b = r3;
                    Runnable runnable2 = runnable;
                    uf2 uf2Var = this.b;
                    switch (b) {
                        case 0:
                            uf2Var.L = true;
                            runnable2.run();
                            return;
                        default:
                            uf2Var.M = true;
                            runnable2.run();
                            return;
                    }
                }
            });
            alertDialog$Builder2.c(-1);
            alertDialog$Builder2.o();
        } else {
            runnable.run();
        }
    }

    public final void Z(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z);
    }

    public final boolean a0() {
        boolean z;
        boolean z2;
        long j;
        m41 m41Var;
        if (this.U) {
            TLRPC.User user = this.N;
            if (user != null) {
                z = true;
            } else {
                z = false;
            }
            TL_account.TL_connectedBot tL_connectedBot = this.I;
            if (tL_connectedBot != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2) {
                long j2 = 0;
                if (user == null) {
                    j = 0;
                } else {
                    j = user.id;
                }
                if (tL_connectedBot != null) {
                    j2 = tL_connectedBot.bot_id;
                }
                if (j != j2 || (user != null && (!this.K.equals(tL_connectedBot.rights) || ((m41Var = this.w) != null && m41Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b0(TLObject tLObject) {
        na7.q1(this.currentAccount).R3((TLRPC.Updates) tLObject, false);
    }

    public final void c0(TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        d S;
        if (tL_error != null) {
            this.a.b(false);
            u21.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            this.a.b(false);
            yjb.x(null, 2131743640, u21.b0(this), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new n92(this, tLObject, (byte) 19));
            }
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == arrayList.size()) {
                p31.a(this.currentAccount).b();
                na7 messagesController = getMessagesController();
                messagesController.i1.clear();
                messagesController.p1.clear();
                finishFragment();
                if (z && user != null) {
                    d S2 = LaunchActivity.S();
                    if (S2 != null) {
                        u21.b0(S2).Q(2131623990, 36, k96.a0(null, null, 2131752805, l7c.r(user))).j();
                    }
                } else if (user != null && (S = LaunchActivity.S()) != null) {
                    u21.b0(S).Q(2131623990, 36, k96.a0(null, null, 2131752772, l7c.r(user))).j();
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131752771, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 29));
        this.a = this.simpleActionBar.s(k96.M0(2131745754, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        zkb.D(this.f, bkb.G6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i3 = bkb.F6;
        zkb.X(editTextBoldCursor2, i3, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f;
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor3.setGravity(i | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(k96.M0(2131752804, null));
        zkb.v(this.f, i3, null);
        this.f.setCursorSize(gl.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new j(this, (byte) 8));
        this.f.addTextChangedListener(new b7(this, (byte) 13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, nme.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i4 = bkb.c6;
        zkb.h(i4, getResourceProvider(), frameLayout3);
        View view = new View(context);
        this.h = view;
        zkb.h(bkb.c7, getResourceProvider(), view);
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f = 1.0f / gl.p;
        boolean z = k96.a0;
        int i5 = 21;
        if (z) {
            i2 = 0;
        } else {
            i2 = 21;
        }
        float f2 = i2;
        if (!z) {
            i5 = 0;
        }
        frameLayout4.addView(view2, nme.d(-1, f, 87, f2, 0.0f, i5, 0.0f));
        a6 a6Var = new a6(context, (byte) 6);
        this.n = a6Var;
        zkb.h(i4, getResourceProvider(), a6Var);
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(k96.M0(2131752799, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i6 = bkb.y6;
        zkb.X(textView2, i6, getResourceProvider());
        this.n.addView(this.r, nme.e(-2, -2, 17));
        this.s = new ImageView(context);
        tf2 tf2Var = new tf2(getThemedColor(i6));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(tf2Var);
        this.b = tf2Var;
        this.n.addView(this.s, nme.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(gl.L(8.0f));
        zr9 zr9Var = new zr9(true);
        this.d = zr9Var;
        zr9Var.a = new l69(this, (byte) 22);
        m41 m41Var = new m41(this, new of2(this, (byte) 3));
        this.w = m41Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        m41Var.i(tL_businessBotRecipients);
        q5c q5cVar = new q5c(this, new w72(this, (byte) 5), new rf2(this, (byte) 3), null);
        this.c = q5cVar;
        q5cVar.r1();
        this.c.setSectionsDrawBackground(true);
        q5c q5cVar2 = this.c;
        q5cVar2.g3.r = false;
        frameLayout.addView(q5cVar2, nme.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(c4c c4cVar, final View view) {
        if (c4cVar.g && !this.w.h(c4cVar)) {
            int i = c4cVar.d;
            if (i == -1) {
                m41 m41Var = this.w;
                this.J = true;
                m41Var.h = true;
                this.c.g3.O(true);
                Z(true);
            } else if (i == V) {
                m41 m41Var2 = this.w;
                this.J = false;
                m41Var2.h = false;
                this.c.g3.O(true);
                Z(true);
            } else if (i == W) {
                this.N = null;
                this.c.g3.O(true);
                Z(true);
            } else if (c4cVar.a == 13) {
                TLRPC.User user = (TLRPC.User) this.O.get(c4cVar.y);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                        String M0 = k96.M0(2131752797, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = gl.S2(k96.M0(2131752798, null));
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        showDialog(hdVar);
                        return;
                    }
                    this.N = user;
                    gl.t1(this.f);
                    this.c.g3.O(true);
                    Z(true);
                }
            } else if (i == X) {
                boolean z = !this.Q;
                this.Q = z;
                ((zgb) view).setChecked(z);
                this.c.g3.O(true);
            } else if (i == Y) {
                int i2 = -this.P;
                this.P = i2;
                gl.A3(i2, view, null);
            } else if (i == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = this.K;
                boolean z2 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z2;
                ((ag2) view).c(z2, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = this.K;
                boolean z3 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z3;
                ((ag2) view).c(z3, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = this.K;
                boolean z4 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z4;
                ((ag2) view).c(z4, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = this.K;
                boolean z5 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z5;
                ((ag2) view).c(z5, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == d0) {
                boolean z6 = !this.R;
                this.R = z6;
                ((zgb) view).setChecked(z6);
                this.c.g3.O(true);
            } else if (i == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = this.K;
                boolean z7 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z7;
                ((ag2) view).c(z7, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = this.K;
                boolean z8 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z8;
                ((ag2) view).c(z8, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = this.K;
                boolean z9 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z9;
                ((ag2) view).c(z9, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == h0) {
                Y(i, !this.K.edit_username, new Runnable(this) {
                    public final uf2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        uf2 uf2Var = this.b;
                        uf2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = uf2Var.K;
                                boolean z10 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z10;
                                ((ag2) view2).c(z10, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = uf2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((ag2) view2).c(z11, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = uf2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((ag2) view2).c(z12, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = uf2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((ag2) view2).c(z13, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = uf2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((ag2) view2).c(z14, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = uf2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((ag2) view2).c(z15, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == i0) {
                boolean z10 = !this.S;
                this.S = z10;
                ((zgb) view).setChecked(z10);
                this.c.g3.O(true);
            } else if (i == j0) {
                Y(i, !this.K.view_gifts, new Runnable(this) {
                    public final uf2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        uf2 uf2Var = this.b;
                        uf2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = uf2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((ag2) view2).c(z102, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = uf2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((ag2) view2).c(z11, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = uf2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((ag2) view2).c(z12, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = uf2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((ag2) view2).c(z13, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = uf2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((ag2) view2).c(z14, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = uf2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((ag2) view2).c(z15, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == k0) {
                Y(i, !this.K.sell_gifts, new Runnable(this) {
                    public final uf2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        uf2 uf2Var = this.b;
                        uf2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = uf2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((ag2) view2).c(z102, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = uf2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((ag2) view2).c(z11, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = uf2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((ag2) view2).c(z12, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = uf2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((ag2) view2).c(z13, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = uf2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((ag2) view2).c(z14, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = uf2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((ag2) view2).c(z15, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == l0) {
                Y(i, !this.K.change_gift_settings, new Runnable(this) {
                    public final uf2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        uf2 uf2Var = this.b;
                        uf2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = uf2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((ag2) view2).c(z102, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = uf2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((ag2) view2).c(z11, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = uf2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((ag2) view2).c(z12, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = uf2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((ag2) view2).c(z13, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = uf2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((ag2) view2).c(z14, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = uf2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((ag2) view2).c(z15, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == m0) {
                Y(i, !this.K.transfer_and_upgrade_gifts, new Runnable(this) {
                    public final uf2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        uf2 uf2Var = this.b;
                        uf2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = uf2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((ag2) view2).c(z102, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = uf2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((ag2) view2).c(z11, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = uf2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((ag2) view2).c(z12, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = uf2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((ag2) view2).c(z13, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = uf2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((ag2) view2).c(z14, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = uf2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((ag2) view2).c(z15, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == n0) {
                Y(i, !this.K.transfer_stars, new Runnable(this) {
                    public final uf2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        uf2 uf2Var = this.b;
                        uf2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = uf2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((ag2) view2).c(z102, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = uf2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((ag2) view2).c(z11, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = uf2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((ag2) view2).c(z12, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = uf2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((ag2) view2).c(z13, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = uf2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((ag2) view2).c(z14, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = uf2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((ag2) view2).c(z15, true);
                                uf2Var.c.g3.O(true);
                                uf2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == o0) {
                Y(i, !this.K.manage_stories, new of2(this, (byte) 0));
            }
        }
    }

    public final void e0() {
        boolean z;
        TLRPC.User user;
        TL_account.TL_connectedBot tL_connectedBot;
        if (!this.a.y.f) {
            if (!a0()) {
                finishFragment();
            } else if (this.w.k(this.c)) {
                TLRPC.User user2 = this.N;
                if (user2 != null && ((tL_connectedBot = this.I) == null || tL_connectedBot.bot_id != user2.id)) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList arrayList = new ArrayList();
                TL_account.TL_connectedBot tL_connectedBot2 = this.I;
                if (tL_connectedBot2 != null && ((user = this.N) == null || tL_connectedBot2.bot_id != user.id)) {
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = getMessagesController().m1(this.I.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.N != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.K;
                    updateconnectedbot2.bot = getMessagesController().o1(this.N);
                    updateconnectedbot2.recipients = this.w.b();
                    arrayList.add(updateconnectedbot2);
                    TL_account.TL_connectedBot tL_connectedBot3 = this.I;
                    if (tL_connectedBot3 != null) {
                        tL_connectedBot3.bot_id = this.N.id;
                        tL_connectedBot3.recipients = this.w.c();
                        this.I.rights = this.K;
                    }
                }
                if (arrayList.isEmpty()) {
                    finishFragment();
                    return;
                }
                int[] iArr = {0};
                for (int i = 0; i < arrayList.size(); i++) {
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i), new pf2(this, iArr, arrayList, z, user2));
                }
            }
        }
    }

    public final void f0() {
        boolean z;
        float f;
        float f2;
        boolean z2 = this.x;
        boolean e = this.d.e();
        boolean z3 = true;
        LongSparseArray longSparseArray = this.O;
        if (!e && !this.y && longSparseArray.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z2 != z) {
            if (!this.d.e() && !this.y && longSparseArray.size() <= 0) {
                z3 = false;
            }
            this.x = z3;
            ViewPropertyAnimator animate = this.r.animate();
            float f3 = 1.0f;
            float f4 = 0.0f;
            if (z3) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            if (z3) {
                f2 = -gl.L(8.0f);
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f2).setDuration(320L);
            s33 s33Var = s33.h;
            duration.setInterpolator(s33Var).start();
            ViewPropertyAnimator animate2 = this.s.animate();
            if (!z3) {
                f3 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f3);
            if (!z3) {
                f4 = gl.L(8.0f);
            }
            alpha2.translationY(f4).setDuration(320L).setInterpolator(s33Var).start();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (a0()) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131743596, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131752774, null);
                alertDialog$Builder.j(k96.M0(2131754213, null), new rf2(this, (byte) 0));
                alertDialog$Builder.g(k96.M0(2131747387, null), new rf2(this, (byte) 1));
                showDialog(hdVar);
                return false;
            }
        } else if (this.N != null || a0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z);
        } else {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = k96.M0(2131752800, null);
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M02;
                hdVar2.U = k96.M0(2131752801, null);
                alertDialog$Builder2.j(k96.M0(2131752802, null), new rf2(this, (byte) 2));
                alertDialog$Builder2.g(k96.M0(2131752577, null), null);
                showDialog(hdVar2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            p31.a(this.currentAccount).c(new be2(this, (byte) 24));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            tf2 tf2Var = this.b;
            if (tf2Var != null) {
                tf2Var.b(getThemedColor(bkb.y6));
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
