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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class mg2 extends e {
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
    public final fg2 G;
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
    public nla a;
    public lg2 b;
    public q9c c;
    public sv9 d;
    public FrameLayout e;
    public EditTextBoldCursor f;
    public View h;
    public b6 n;
    public TextView r;
    public ImageView s;
    public u41 w;
    public boolean x;
    public boolean y;

    public mg2() {
        super(null);
        this.F = 0;
        this.G = new fg2(this, (byte) 4);
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
            String M0 = ob6.M0(2131752768, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = hl.S2(ob6.a0(null, null, 2131752769, lbc.p(this.N)));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder.j(ob6.M0(2131754277, null), new fd(this) {
                public final mg2 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i2) {
                    byte b = r3;
                    Runnable runnable2 = runnable;
                    mg2 mg2Var = this.b;
                    switch (b) {
                        case 0:
                            mg2Var.L = true;
                            runnable2.run();
                            return;
                        default:
                            mg2Var.M = true;
                            runnable2.run();
                            return;
                    }
                }
            });
            alertDialog$Builder.c(-1);
            alertDialog$Builder.o();
        } else if (!this.M && z && (i == k0 || i == l0 || i == m0 || i == n0)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, getResourceProvider(), getParentActivity());
            String M02 = ob6.M0(2131752768, null);
            id idVar2 = alertDialog$Builder2.a;
            idVar2.S = M02;
            idVar2.U = hl.S2(ob6.a0(null, null, 2131752782, lbc.p(this.N)));
            alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
            alertDialog$Builder2.j(ob6.M0(2131754277, null), new fd(this) {
                public final mg2 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar22, int i2) {
                    byte b = r3;
                    Runnable runnable2 = runnable;
                    mg2 mg2Var = this.b;
                    switch (b) {
                        case 0:
                            mg2Var.L = true;
                            runnable2.run();
                            return;
                        default:
                            mg2Var.M = true;
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
        u41 u41Var;
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
                if (j != j2 || (user != null && (!this.K.equals(tL_connectedBot.rights) || ((u41Var = this.w) != null && u41Var.g())))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void b0(TLObject tLObject) {
        uc7.s1(this.currentAccount).Y3((TLRPC.Updates) tLObject, false);
    }

    public final void c0(TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        e S;
        if (tL_error != null) {
            this.a.b(false);
            d31.e0(tL_error);
        } else if (tLObject instanceof TLRPC.TL_boolFalse) {
            this.a.b(false);
            xnb.x(null, 2131743534, d31.b0(this), null);
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                Utilities.d.c(new ea2(this, tLObject, (byte) 18));
            }
            int i = iArr[0] + 1;
            iArr[0] = i;
            if (i == arrayList.size()) {
                y31.a(this.currentAccount).b();
                uc7 messagesController = getMessagesController();
                messagesController.i1.clear();
                messagesController.p1.clear();
                finishFragment();
                if (z && user != null) {
                    e S2 = LaunchActivity.S();
                    if (S2 != null) {
                        d31.b0(S2).Q(2131623990, 36, ob6.a0(null, null, 2131752798, lbc.r(user))).j();
                    }
                } else if (user != null && (S = LaunchActivity.S()) != null) {
                    d31.b0(S).Q(2131623990, 36, ob6.a0(null, null, 2131752765, lbc.r(user))).j();
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        int i3;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 0));
        this.a = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        new LinearLayout(getParentActivity()).setOrientation(0);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getParentActivity());
        this.f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 17.0f);
        yob.D(this.f, aob.H6, null);
        EditTextBoldCursor editTextBoldCursor2 = this.f;
        int i4 = aob.G6;
        yob.X(editTextBoldCursor2, i4, null);
        this.f.setBackgroundDrawable(null);
        this.f.setMaxLines(1);
        this.f.setLines(1);
        this.f.setPadding(0, 0, 0, 0);
        this.f.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor3 = this.f;
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        editTextBoldCursor3.setGravity(i | 48);
        this.f.setInputType(180224);
        this.f.setImeOptions(6);
        this.f.setHint(ob6.M0(2131752797, null));
        yob.v(this.f, i4, null);
        this.f.setCursorSize(hl.L(19.0f));
        this.f.setCursorWidth(1.5f);
        this.f.setOnEditorActionListener(new j(this, (byte) 8));
        this.f.addTextChangedListener(new c7(this, (byte) 13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        frameLayout2.addView(this.f, tre.d(-1, -1.0f, 48, 21.0f, 15.0f, 21.0f, 15.0f));
        FrameLayout frameLayout3 = this.e;
        int i5 = aob.d6;
        yob.h(i5, getResourceProvider(), frameLayout3);
        View view = new View(context);
        this.h = view;
        yob.h(aob.d7, getResourceProvider(), view);
        FrameLayout frameLayout4 = this.e;
        View view2 = this.h;
        float f = 1.0f / hl.p;
        boolean z = ob6.a0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 21;
        }
        float f2 = i2;
        if (z) {
            i3 = 21;
        } else {
            i3 = 0;
        }
        frameLayout4.addView(view2, tre.d(-1, f, 87, f2, 0.0f, i3, 0.0f));
        b6 b6Var = new b6(context, (byte) 6);
        this.n = b6Var;
        yob.h(i5, getResourceProvider(), b6Var);
        TextView textView = new TextView(context);
        this.r = textView;
        textView.setText(ob6.M0(2131752792, null));
        this.r.setTextSize(1, 14.0f);
        TextView textView2 = this.r;
        int i6 = aob.z6;
        yob.X(textView2, i6, getResourceProvider());
        this.n.addView(this.r, tre.e(-2, -2, 17));
        this.s = new ImageView(context);
        lg2 lg2Var = new lg2(getThemedColor(i6));
        this.s.setScaleType(ImageView.ScaleType.CENTER);
        this.s.setImageDrawable(lg2Var);
        this.b = lg2Var;
        this.n.addView(this.s, tre.e(-2, -2, 17));
        this.s.setAlpha(0.0f);
        this.s.setTranslationY(hl.L(8.0f));
        sv9 sv9Var = new sv9(true);
        this.d = sv9Var;
        sv9Var.a = new z8d(this, (byte) 21);
        u41 u41Var = new u41(this, new fg2(this, (byte) 3));
        this.w = u41Var;
        TL_account.TL_connectedBot tL_connectedBot = this.I;
        if (tL_connectedBot == null) {
            tL_businessBotRecipients = null;
        } else {
            tL_businessBotRecipients = tL_connectedBot.recipients;
        }
        u41Var.i(tL_businessBotRecipients);
        q9c q9cVar = new q9c(this, new n82(this, (byte) 5), new ig2(this, (byte) 3), null);
        this.c = q9cVar;
        q9cVar.s1();
        this.c.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.c;
        q9cVar2.g3.r = false;
        frameLayout.addView(q9cVar2, tre.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(b8c b8cVar, final View view) {
        if (b8cVar.g && !this.w.h(b8cVar)) {
            int i = b8cVar.d;
            if (i == -1) {
                u41 u41Var = this.w;
                this.J = true;
                u41Var.h = true;
                this.c.g3.O(true);
                Z(true);
            } else if (i == V) {
                u41 u41Var2 = this.w;
                this.J = false;
                u41Var2.h = false;
                this.c.g3.O(true);
                Z(true);
            } else if (i == W) {
                this.N = null;
                this.c.g3.O(true);
                Z(true);
            } else if (b8cVar.a == 13) {
                TLRPC.User user = (TLRPC.User) this.O.get(b8cVar.y);
                if (user != null) {
                    if (!user.bot_business) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                        String M0 = ob6.M0(2131752790, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        idVar.U = hl.S2(ob6.M0(2131752791, null));
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        showDialog(idVar);
                        return;
                    }
                    this.N = user;
                    hl.t1(this.f);
                    this.c.g3.O(true);
                    Z(true);
                }
            } else if (i == X) {
                boolean z = !this.Q;
                this.Q = z;
                ((vkb) view).setChecked(z);
                this.c.g3.O(true);
            } else if (i == Y) {
                int i2 = -this.P;
                this.P = i2;
                hl.A3(i2, view, null);
            } else if (i == Z) {
                TL_account.TL_businessBotRights tL_businessBotRights = this.K;
                boolean z2 = !tL_businessBotRights.reply;
                tL_businessBotRights.reply = z2;
                ((sg2) view).c(z2, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == a0) {
                TL_account.TL_businessBotRights tL_businessBotRights2 = this.K;
                boolean z3 = !tL_businessBotRights2.read_messages;
                tL_businessBotRights2.read_messages = z3;
                ((sg2) view).c(z3, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == b0) {
                TL_account.TL_businessBotRights tL_businessBotRights3 = this.K;
                boolean z4 = !tL_businessBotRights3.delete_sent_messages;
                tL_businessBotRights3.delete_sent_messages = z4;
                ((sg2) view).c(z4, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == c0) {
                TL_account.TL_businessBotRights tL_businessBotRights4 = this.K;
                boolean z5 = !tL_businessBotRights4.delete_received_messages;
                tL_businessBotRights4.delete_received_messages = z5;
                ((sg2) view).c(z5, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == d0) {
                boolean z6 = !this.R;
                this.R = z6;
                ((vkb) view).setChecked(z6);
                this.c.g3.O(true);
            } else if (i == e0) {
                TL_account.TL_businessBotRights tL_businessBotRights5 = this.K;
                boolean z7 = !tL_businessBotRights5.edit_name;
                tL_businessBotRights5.edit_name = z7;
                ((sg2) view).c(z7, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == f0) {
                TL_account.TL_businessBotRights tL_businessBotRights6 = this.K;
                boolean z8 = !tL_businessBotRights6.edit_bio;
                tL_businessBotRights6.edit_bio = z8;
                ((sg2) view).c(z8, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == g0) {
                TL_account.TL_businessBotRights tL_businessBotRights7 = this.K;
                boolean z9 = !tL_businessBotRights7.edit_profile_photo;
                tL_businessBotRights7.edit_profile_photo = z9;
                ((sg2) view).c(z9, true);
                this.c.g3.O(true);
                Z(true);
            } else if (i == h0) {
                Y(i, !this.K.edit_username, new Runnable(this) {
                    public final mg2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        mg2 mg2Var = this.b;
                        mg2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = mg2Var.K;
                                boolean z10 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z10;
                                ((sg2) view2).c(z10, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = mg2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((sg2) view2).c(z11, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = mg2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((sg2) view2).c(z12, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = mg2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((sg2) view2).c(z13, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = mg2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((sg2) view2).c(z14, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = mg2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((sg2) view2).c(z15, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == i0) {
                boolean z10 = !this.S;
                this.S = z10;
                ((vkb) view).setChecked(z10);
                this.c.g3.O(true);
            } else if (i == j0) {
                Y(i, !this.K.view_gifts, new Runnable(this) {
                    public final mg2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        mg2 mg2Var = this.b;
                        mg2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = mg2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((sg2) view2).c(z102, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = mg2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((sg2) view2).c(z11, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = mg2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((sg2) view2).c(z12, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = mg2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((sg2) view2).c(z13, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = mg2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((sg2) view2).c(z14, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = mg2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((sg2) view2).c(z15, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == k0) {
                Y(i, !this.K.sell_gifts, new Runnable(this) {
                    public final mg2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        mg2 mg2Var = this.b;
                        mg2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = mg2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((sg2) view2).c(z102, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = mg2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((sg2) view2).c(z11, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = mg2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((sg2) view2).c(z12, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = mg2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((sg2) view2).c(z13, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = mg2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((sg2) view2).c(z14, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = mg2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((sg2) view2).c(z15, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == l0) {
                Y(i, !this.K.change_gift_settings, new Runnable(this) {
                    public final mg2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        mg2 mg2Var = this.b;
                        mg2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = mg2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((sg2) view2).c(z102, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = mg2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((sg2) view2).c(z11, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = mg2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((sg2) view2).c(z12, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = mg2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((sg2) view2).c(z13, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = mg2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((sg2) view2).c(z14, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = mg2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((sg2) view2).c(z15, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == m0) {
                Y(i, !this.K.transfer_and_upgrade_gifts, new Runnable(this) {
                    public final mg2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        mg2 mg2Var = this.b;
                        mg2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = mg2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((sg2) view2).c(z102, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = mg2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((sg2) view2).c(z11, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = mg2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((sg2) view2).c(z12, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = mg2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((sg2) view2).c(z13, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = mg2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((sg2) view2).c(z14, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = mg2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((sg2) view2).c(z15, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == n0) {
                Y(i, !this.K.transfer_stars, new Runnable(this) {
                    public final mg2 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b = r3;
                        View view2 = view;
                        mg2 mg2Var = this.b;
                        mg2Var.getClass();
                        switch (b) {
                            case 0:
                                TL_account.TL_businessBotRights tL_businessBotRights8 = mg2Var.K;
                                boolean z102 = !tL_businessBotRights8.view_gifts;
                                tL_businessBotRights8.view_gifts = z102;
                                ((sg2) view2).c(z102, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 1:
                                TL_account.TL_businessBotRights tL_businessBotRights9 = mg2Var.K;
                                boolean z11 = !tL_businessBotRights9.sell_gifts;
                                tL_businessBotRights9.sell_gifts = z11;
                                ((sg2) view2).c(z11, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 2:
                                TL_account.TL_businessBotRights tL_businessBotRights10 = mg2Var.K;
                                boolean z12 = !tL_businessBotRights10.change_gift_settings;
                                tL_businessBotRights10.change_gift_settings = z12;
                                ((sg2) view2).c(z12, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 3:
                                TL_account.TL_businessBotRights tL_businessBotRights11 = mg2Var.K;
                                boolean z13 = !tL_businessBotRights11.transfer_and_upgrade_gifts;
                                tL_businessBotRights11.transfer_and_upgrade_gifts = z13;
                                ((sg2) view2).c(z13, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            case 4:
                                TL_account.TL_businessBotRights tL_businessBotRights12 = mg2Var.K;
                                boolean z14 = !tL_businessBotRights12.transfer_stars;
                                tL_businessBotRights12.transfer_stars = z14;
                                ((sg2) view2).c(z14, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                            default:
                                TL_account.TL_businessBotRights tL_businessBotRights13 = mg2Var.K;
                                boolean z15 = !tL_businessBotRights13.edit_username;
                                tL_businessBotRights13.edit_username = z15;
                                ((sg2) view2).c(z15, true);
                                mg2Var.c.g3.O(true);
                                mg2Var.Z(true);
                                return;
                        }
                    }
                });
            } else if (i == o0) {
                Y(i, !this.K.manage_stories, new fg2(this, (byte) 0));
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
                    updateconnectedbot.bot = getMessagesController().o1(this.I.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    arrayList.add(updateconnectedbot);
                }
                if (this.N != null) {
                    TL_account.updateConnectedBot updateconnectedbot2 = new TL_account.updateConnectedBot();
                    updateconnectedbot2.deleted = false;
                    updateconnectedbot2.rights = this.K;
                    updateconnectedbot2.bot = getMessagesController().q1(this.N);
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
                    getConnectionsManager().sendRequest((TLObject) arrayList.get(i), new gg2(this, iArr, arrayList, z, user2));
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
                f2 = -hl.L(8.0f);
            } else {
                f2 = 0.0f;
            }
            ViewPropertyAnimator duration = alpha.translationY(f2).setDuration(320L);
            k43 k43Var = k43.h;
            duration.setInterpolator(k43Var).start();
            ViewPropertyAnimator animate2 = this.s.animate();
            if (!z3) {
                f3 = 0.0f;
            }
            ViewPropertyAnimator alpha2 = animate2.alpha(f3);
            if (!z3) {
                f4 = hl.L(8.0f);
            }
            alpha2.translationY(f4).setDuration(320L).setInterpolator(k43Var).start();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
                String M0 = ob6.M0(2131743490, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752767, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new ig2(this, (byte) 0));
                alertDialog$Builder.g(ob6.M0(2131747307, null), new ig2(this, (byte) 1));
                showDialog(idVar);
                return false;
            }
        } else if (this.N != null || a0() || (this.d.d.isEmpty() && this.d.e.isEmpty())) {
            return super.onBackPressed(z);
        } else {
            if (z) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = ob6.M0(2131752793, null);
                id idVar2 = alertDialog$Builder2.a;
                idVar2.S = M02;
                idVar2.U = ob6.M0(2131752794, null);
                alertDialog$Builder2.j(ob6.M0(2131752795, null), new ig2(this, (byte) 2));
                alertDialog$Builder2.g(ob6.M0(2131752570, null), null);
                showDialog(idVar2);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        if (!this.T && !this.U) {
            this.T = true;
            y31.a(this.currentAccount).c(new te2(this, (byte) 24));
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            lg2 lg2Var = this.b;
            if (lg2Var != null) {
                lg2Var.b(getThemedColor(aob.z6));
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            super.onThemeColorsChanged();
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
