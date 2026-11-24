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
public final class oc2 extends d implements gk7 {
    public vy8 E;
    public final ArrayList F;
    public TLRPC.Chat a;
    public TLRPC.ChatFull b;
    public final long c;
    public ArrayList d;
    public FrameLayout e;
    public o39 f;
    public nc2 h;
    public final ArrayList n;
    public LinearLayout r;
    public int s;
    public byte w;
    public vy8 x;
    public vy8 y;

    public oc2(Bundle bundle) {
        super(bundle);
        this.d = new ArrayList();
        this.n = new ArrayList();
        this.s = -1;
        this.F = new ArrayList();
        this.c = bundle.getLong("chat_id", 0L);
    }

    public final void Z(int i, boolean z) {
        if (this.s != i) {
            this.s = i;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.F;
                boolean z2 = true;
                if (i2 >= arrayList.size()) {
                    break;
                }
                vy8 vy8Var = (vy8) arrayList.get(i2);
                if (i != i2) {
                    z2 = false;
                }
                vy8Var.a(z2, z);
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
                nc2 nc2Var = this.h;
                if (nc2Var != null && z) {
                    nc2Var.p(2, arrayList2.size() + 1);
                }
            } else if (!this.d.isEmpty()) {
                this.d.clear();
                nc2 nc2Var2 = this.h;
                if (nc2Var2 != null && z) {
                    nc2Var2.q(2, arrayList2.size() + 1);
                }
            }
            nc2 nc2Var3 = this.h;
            if (nc2Var3 != null && z) {
                nc2Var3.g(1);
            }
            nc2 nc2Var4 = this.h;
            if (nc2Var4 != null && !z) {
                nc2Var4.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(k96.M0(2131746194, null));
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 26));
        FrameLayout frameLayout = new FrameLayout(context);
        this.n.addAll(getMediaDataController().n);
        ld5 ld5Var = new ld5(context);
        ld5Var.setText(k96.M0(2131753756, null));
        LinearLayout linearLayout = new LinearLayout(context);
        this.r = linearLayout;
        linearLayout.setOrientation(1);
        this.r.setClickable(true);
        vy8 vy8Var = new vy8(context, null);
        this.x = vy8Var;
        vy8Var.c(k96.M0(2131754288, null), false, true);
        vy8 vy8Var2 = new vy8(context, null);
        this.y = vy8Var2;
        vy8Var2.c(k96.M0(2131745100, null), false, true);
        vy8 vy8Var3 = new vy8(context, null);
        this.E = vy8Var3;
        vy8Var3.c(k96.M0(2131747983, null), false, false);
        this.r.addView(ld5Var, nme.o(-1, -2));
        this.r.addView(this.x, nme.o(-1, -2));
        this.r.addView(this.y, nme.o(-1, -2));
        this.r.addView(this.E, nme.o(-1, -2));
        ArrayList arrayList = this.F;
        arrayList.clear();
        arrayList.add(this.x);
        arrayList.add(this.y);
        arrayList.add(this.E);
        this.x.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                final oc2 oc2Var = this.b;
                switch (b) {
                    case 0:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.y.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                final oc2 oc2Var = this.b;
                switch (b) {
                    case 0:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final oc2 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                final oc2 oc2Var = this.b;
                switch (b) {
                    case 0:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    case 1:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b2 = r2;
                                oc2 oc2Var2 = oc2Var;
                                switch (b2) {
                                    case 0:
                                        oc2Var2.Z(2, true);
                                        return;
                                    case 1:
                                        oc2Var2.Z(1, true);
                                        return;
                                    default:
                                        oc2Var2.Z(0, true);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        });
        vy8 vy8Var4 = this.x;
        int i = bkb.c6;
        int w0 = bkb.w0(null, i, false);
        int i2 = bkb.h6;
        zkb.R(vy8Var4, bkb.g0(w0, bkb.w0(null, i2, false)), zkb.M(i), zkb.M(i2), null);
        zkb.R(this.y, bkb.g0(bkb.w0(null, i, false), bkb.w0(null, i2, false)), zkb.M(i), zkb.M(i2), null);
        zkb.R(this.E, bkb.g0(bkb.w0(null, i, false), bkb.w0(null, i2, false)), zkb.M(i), zkb.M(i2), null);
        Z(this.w, false);
        o39 o39Var = new o39(context, null);
        this.f = o39Var;
        o39Var.setLayoutManager(new t26());
        o39 o39Var2 = this.f;
        nc2 nc2Var = new nc2(this, context);
        this.h = nc2Var;
        o39Var2.setAdapter(nc2Var);
        this.f.setOnItemClickListener(new u(this, (byte) 11));
        frameLayout.addView(this.f, nme.g());
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
            if (i == kk7.X4) {
                ArrayList arrayList = this.n;
                arrayList.clear();
                arrayList.addAll(getMediaDataController().n);
                this.h.f();
            } else if (i == kk7.x1 && ((Long) objArr[0]).longValue() == (-this.c)) {
                ui5 ui5Var = this.parentLayout;
                if (ui5Var != null && ui5Var.getLastFragment() == this) {
                    finishFragment();
                } else {
                    removeSelfFromStack();
                }
            }
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.f;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return hue.a(new t00(this, (byte) 4), bkb.c6, bkb.F6, bkb.y6, bkb.h6, bkb.Z6, bkb.A6, bkb.o7, bkb.e6, bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        na7 messagesController = getMessagesController();
        long j = this.c;
        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
        this.a = K0;
        if (K0 == null) {
            TLRPC.Chat O = ad7.Y(this.currentAccount).O(j);
            this.a = O;
            if (O != null) {
                getMessagesController().T3(this.a, true);
                if (this.b == null) {
                    TLRPC.ChatFull C0 = ad7.Y(this.currentAccount).C0(this.c, hc2.T(this.a), new CountDownLatch(1), false, false, 0);
                    this.b = C0;
                    if (C0 == null) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        getNotificationCenter().b(this, kk7.X4);
        getNotificationCenter().b(this, kk7.x1);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        na7 messagesController = getMessagesController();
        int i = this.s;
        ArrayList arrayList = this.d;
        messagesController.getClass();
        TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = new TLRPC.TL_messages_setChatAvailableReactions();
        long j = this.c;
        tL_messages_setChatAvailableReactions.peer = messagesController.h1(-j);
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
        messagesController.getConnectionsManager().sendRequest(tL_messages_setChatAvailableReactions, new w47(messagesController, j, tL_messages_setChatAvailableReactions, (byte) 6));
        getNotificationCenter().n(this, kk7.X4);
        getNotificationCenter().n(this, kk7.x1);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
