package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class zd2 extends d implements jm7 {
    public w09 E;
    public final ArrayList F;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public final long c;
    public ArrayList d;
    public FrameLayout e;
    public r59 f;
    public yd2 h;
    public final ArrayList n;
    public LinearLayout r;
    public int s;
    public byte w;
    public w09 x;
    public w09 y;

    public zd2(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.F = new ArrayList();
        this.c = bundle.getLong("chat_id", 0L);
    }

    public final void a0(int i, boolean z) {
        if (this.s != i) {
            this.s = i;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z2 = true;
                if (i2 >= arrayList.size()) {
                    break;
                }
                w09 w09Var = (w09) arrayList.get(i2);
                if (i != i2) {
                    z2 = false;
                }
                w09Var.a(z2, z);
                i2++;
            }
            ArrayList arrayList2 = this.n;
            if (i == 1) {
                if (z) {
                    this.d.clear();
                    int size = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals("👍") || tL_availableReaction.reaction.equals("👎")) {
                            this.d.add(tL_availableReaction.reaction);
                        }
                    }
                    if (this.d.isEmpty() && arrayList2.size() >= 2) {
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(0)).reaction);
                        this.d.add(((TLRPC.TL_availableReaction) arrayList2.get(1)).reaction);
                    }
                }
                yd2 yd2Var = this.h;
                if (yd2Var != null && z) {
                    yd2Var.p(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                yd2 yd2Var2 = this.h;
                if (yd2Var2 != null && z) {
                    yd2Var2.q(2, arrayList2.size() + 1);
                }
            }
            yd2 yd2Var3 = this.h;
            if (yd2Var3 != null && z) {
                yd2Var3.g(1);
            }
            yd2 yd2Var4 = this.h;
            if (yd2Var4 != null && !z) {
                yd2Var4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(jb6.M0(2131746120, null));
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 27));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n.addAll(getMediaDataController().n);
        jf5 jf5Var = new jf5(context);
        jf5Var.setText(jb6.M0(2131753724, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(1);
        this.r.setClickable(true);
        w09 w09Var = new w09(context, null);
        this.x = w09Var;
        w09Var.c(jb6.M0(2131754256, null), false, true);
        w09 w09Var2 = new w09(context, null);
        this.y = w09Var2;
        w09Var2.c(jb6.M0(2131745026, null), false, true);
        w09 w09Var3 = new w09(context, null);
        this.E = w09Var3;
        w09Var3.c(jb6.M0(2131747909, null), false, false);
        this.r.addView(jf5Var, qoe.o(-1, -2));
        this.r.addView(this.x, qoe.o(-1, -2));
        this.r.addView(this.y, qoe.o(-1, -2));
        this.r.addView(this.E, qoe.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.E);
        this.x.setOnClickListener(new View.OnClickListener(this) {
            public final zd2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                final zd2 zd2Var = this.b;
                switch (b) {
                    case 0:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.y.setOnClickListener(new View.OnClickListener(this) {
            public final zd2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                final zd2 zd2Var = this.b;
                switch (b) {
                    case 0:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final zd2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                final zd2 zd2Var = this.b;
                switch (b) {
                    case 0:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        gm.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                zd2 zd2Var2 = zd2Var;
                                switch (b2) {
                                    case 0:
                                        zd2Var2.a0(2, true);
                                        return;
                                    case 1:
                                        zd2Var2.a0(1, true);
                                        return;
                                    default:
                                        zd2Var2.a0(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        w09 w09Var4 = this.x;
        int i = cmb.c6;
        int w0 = cmb.w0(null, i, false);
        int i2 = cmb.h6;
        anb.R(w09Var4, cmb.g0(w0, cmb.w0(null, i2, false)), anb.M(i), anb.M(i2), null);
        anb.R(this.y, cmb.g0(cmb.w0(null, i, false), cmb.w0(null, i2, false)), anb.M(i), anb.M(i2), null);
        anb.R(this.E, cmb.g0(cmb.w0(null, i, false), cmb.w0(null, i2, false)), anb.M(i), anb.M(i2), null);
        a0(this.w, false);
        r59 r59Var = new r59(context, null);
        this.f = r59Var;
        r59Var.setLayoutManager(new u46());
        r59 r59Var2 = this.f;
        yd2 yd2Var = new yd2(this, context);
        this.h = yd2Var;
        r59Var2.setAdapter(yd2Var);
        this.f.setOnItemClickListener(new u(this, (byte) 12));
        frameLayout.addView(this.f, qoe.g());
        this.f.r1();
        this.f.setSectionsDrawBackground(true);
        this.e = frameLayout;
        this.fragmentView = frameLayout;
        this.h.f();
        return this.e;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i2 == this.currentAccount) {
            if (i == nm7.Z4) {
                ArrayList arrayList = this.n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().n);
                this.h.f();
            } else if (i == nm7.y1 && ((Long) objArr[0]).longValue() == (-this.c)) {
                tk5 tk5Var = this.parentLayout;
                if (tk5Var != null && tk5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return kwe.a(new t10(this, (byte) 4), cmb.c6, cmb.F6, cmb.y6, cmb.h6, cmb.Z6, cmb.A6, cmb.o7, cmb.e6, cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        oc7 messagesController = getMessagesController();
        long j = this.c;
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
        this.a = L0;
        if (L0 == null) {
            TLRPC.Chat O = cf7.Y(this.currentAccount).O(j);
            this.a = O;
            if (O != null) {
                getMessagesController().V3(this.a, true);
                if (this.b == null) {
                    TLRPC.ChatFull C0 = cf7.Y(this.currentAccount).C0(this.c, sd2.T(this.a), new CountDownLatch(1), false, false, 0);
                    this.b = C0;
                    if (C0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().b(this, nm7.Z4);
        getNotificationCenter().b(this, nm7.y1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        oc7 messagesController = getMessagesController();
        int i = this.s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j = this.c;
        tL_messages_setChatAvailableReactions.peer = messagesController.i1(-j);
        if (i == 2) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsNone();
        } else if (i == 0) {
            tL_messages_setChatAvailableReactions.available_reactions = new TLRPC.TL_chatReactionsAll();
        } else {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = new TLRPC.TL_chatReactionsSome();
            tL_messages_setChatAvailableReactions.available_reactions = tL_chatReactionsSome;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_reactionEmoji.emoticon = (String) arrayList.get(i2);
                tL_chatReactionsSome.reactions.add(tL_reactionEmoji);
            }
        }
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new jb7(messagesController, j, tL_messages_setChatAvailableReactions, (byte) 6));
        getNotificationCenter().n(this, nm7.Z4);
        getNotificationCenter().n(this, nm7.y1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
