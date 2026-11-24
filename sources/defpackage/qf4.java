package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.UsersSelectActivity;
public final class qf4 extends d {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public ef4 J;
    public ff4 K;
    public lf4 L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public hg5 S;
    public boolean T;
    public i74 U;
    public int V;
    public int W;
    public int X;
    public fv a;
    public nf4 b;
    public uja c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ub7 r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public qf4(ub7 ub7Var, ArrayList arrayList) {
        super(null);
        ub7 ub7Var2;
        this.d = -1;
        this.y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.r = ub7Var;
        if (ub7Var == null) {
            ub7 ub7Var3 = new ub7();
            this.r = ub7Var3;
            ub7Var3.a = 2;
            while (true) {
                Object obj = getMessagesController().J0.get(this.r.a);
                ub7Var2 = this.r;
                if (obj == null) {
                    break;
                }
                ub7Var2.a++;
            }
            ub7Var2.b = "";
            ub7Var2.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(gm.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m = gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m;
        this.x = k47.A5(m, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z = !this.r.n;
        this.y = z;
        vm.r(this.currentAccount, z);
        ub7 ub7Var4 = this.r;
        this.E = ub7Var4.g;
        this.F = ub7Var4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.r.i);
        this.I = this.r.j.clone();
    }

    public static CharSequence E0(int i, String str, boolean z) {
        Context context;
        if (i >= 0) {
            SharedPreferences d1 = oc7.d1();
            if (!d1.getBoolean("n_" + i, false) && (context = a.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z) {
                    Drawable d = b10.d(context, 2131232275);
                    d.setBounds(0, -gm.L(8.0f), d.getIntrinsicWidth(), d.getIntrinsicHeight() - gm.L(8.0f));
                    spannableString.setSpan(new ImageSpan(d, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable d2 = b10.d(context, 2131232273);
                    Drawable d3 = b10.d(context, 2131232274);
                    int w0 = cmb.w0(null, cmb.Ji, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    d2.setColorFilter(new PorterDuffColorFilter(w0, mode));
                    d3.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, cmb.Ii, false), mode));
                    sn2 sn2Var = new sn2(d2, d3);
                    sn2Var.setBounds(0, 0, sn2Var.getIntrinsicWidth(), sn2Var.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(sn2Var, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return str;
    }

    public static rja Z(qf4 qf4Var) {
        return qf4Var.simpleActionBar;
    }

    public static rja a0(qf4 qf4Var) {
        return qf4Var.simpleActionBar;
    }

    public static rja b0(qf4 qf4Var) {
        return qf4Var.simpleActionBar;
    }

    public static ylb f0(qf4 qf4Var) {
        return qf4Var.resourceProvider;
    }

    public static boolean j0(TLRPC.Chat chat) {
        if (!sd2.y(3, chat)) {
            if (!sd2.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean n0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            gn[] gnVarArr = (gn[]) spanned.getSpans(0, spanned.length(), gn.class);
            if (gnVarArr != null && gnVarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(ub7 ub7Var, int i, String str, ArrayList arrayList, boolean z, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z2, boolean z3, boolean z4, boolean z5, d dVar, Runnable runnable) {
        if (ub7Var.g != i || z4) {
            ub7Var.e = -1;
            if (z5) {
                ub7Var.d = -1;
            }
        }
        ub7Var.g = i;
        ub7Var.b = str;
        ub7Var.c = arrayList;
        ub7Var.m = i2;
        ub7Var.i = arrayList3;
        ub7Var.h = arrayList2;
        ub7Var.n = z;
        if (z2) {
            oc7 messagesController = dVar.getMessagesController();
            HashSet hashSet = messagesController.o4;
            ArrayList arrayList4 = messagesController.G0;
            if (z3) {
                int size = arrayList4.size();
                int i3 = 254;
                for (int i4 = 0; i4 < size; i4++) {
                    i3 = Math.min(i3, ((ub7) messagesController.G0.get(i4)).f);
                }
                ub7Var.f = i3 - 1;
                boolean d = ((ub7) messagesController.G0.get(0)).d();
                ArrayList arrayList5 = messagesController.G0;
                if (d) {
                    arrayList5.add(1, ub7Var);
                } else {
                    arrayList5.add(0, ub7Var);
                }
            } else {
                int size2 = arrayList4.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size2; i6++) {
                    i5 = Math.max(i5, ((ub7) messagesController.G0.get(i6)).f);
                }
                ub7Var.f = i5 + 1;
                messagesController.G0.add(ub7Var);
            }
            messagesController.J0.put(ub7Var.a, ub7Var);
            int i7 = ub7Var.a;
            if (i7 != 0 && hashSet.remove(Integer.valueOf(i7))) {
                messagesController.E4();
            }
            if (hashSet.contains(0)) {
                messagesController.b5(null);
            }
            if (messagesController.G0.size() == 1 && gda.m(messagesController.currentAccount) != 5) {
                gda.n1 = 5;
                a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gda.n1).apply();
            }
            messagesController.m3();
        } else {
            dVar.getMessagesController().A3(ub7Var);
        }
        cf7 messagesStorage = dVar.getMessagesStorage();
        messagesStorage.a.c(new yl6(messagesStorage, ub7Var, z3, (byte) 4));
        if (z3) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = dVar.getMessagesController().S0();
            int size3 = S0.size();
            for (int i8 = 0; i8 < size3; i8 = td4.g(((ub7) S0.get(i8)).a, i8, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            dVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, d dVar, c41 c41Var) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new i46(4, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                mlb.y(null, 2131750585, c41Var, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                mlb.y(null, 2131750584, c41Var, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new i46(5, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new i46(12, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new i46(13, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                mlb.y(null, 2131747943, c41Var, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new i46(4, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new i46(3, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else {
                mlb.y(null, 2131743566, c41Var, null);
            }
        }
    }

    public static void z0(final ub7 ub7Var, final int i, final String str, final ArrayList arrayList, final boolean z, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final d dVar, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        he heVar = null;
        int i3 = 3;
        int i4 = 0;
        if (z6) {
            he heVar2 = new he(3, null, dVar.getParentActivity());
            heVar2.j0 = false;
            heVar2.show();
            heVar = heVar2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = ub7Var.a;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i5 = oc7.s5;
        tL_dialogFilter.contacts = (i & 1) != 0;
        tL_dialogFilter.non_contacts = (i & 2) != 0;
        tL_dialogFilter.groups = (i & 4) != 0;
        tL_dialogFilter.broadcasts = (i & 8) != 0;
        tL_dialogFilter.bots = (i & 16) != 0;
        tL_dialogFilter.exclude_muted = (i & 32) != 0;
        tL_dialogFilter.exclude_read = (i & 64) != 0;
        tL_dialogFilter.exclude_archived = (i & 128) != 0;
        tL_dialogFilter.id = ub7Var.a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z;
        int i6 = tL_dialogFilter2.flags;
        if (i2 < 0) {
            tL_dialogFilter2.flags = i6 & (-134217729);
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags = i6 | 134217728;
            tL_dialogFilter2.color = i2;
        }
        oc7 messagesController = dVar.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                long keyAt = longSparseIntArray.keyAt(i7);
                if (!pg3.B(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new ne4(longSparseIntArray, (byte) 0));
        }
        int i8 = 0;
        while (i8 < i3) {
            TLRPC.TL_dialogFilter tL_dialogFilter3 = tL_messages_updateDialogFilter.filter;
            if (i8 == 0) {
                arrayList4 = tL_dialogFilter3.include_peers;
                arrayList5 = arrayList2;
            } else if (i8 == 1) {
                arrayList4 = tL_dialogFilter3.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_dialogFilter3.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i4 < size2) {
                ArrayList arrayList7 = arrayList5;
                Long l = (Long) arrayList7.get(i4);
                he heVar3 = heVar;
                int i9 = size2;
                long longValue = l.longValue();
                if ((i8 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !pg3.B(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User W1 = messagesController.W1(l);
                        if (W1 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = W1.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j = -longValue;
                        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j));
                        if (L0 != null) {
                            if (sd2.T(L0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j;
                                tL_inputPeerChannel.access_hash = L0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i4++;
                heVar = heVar3;
                size2 = i9;
                arrayList5 = arrayList7;
            }
            i8++;
            i3 = 3;
            i4 = 0;
        }
        final he heVar4 = heVar;
        dVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z7 = z6;
                final he heVar5 = heVar4;
                final ub7 ub7Var2 = ub7Var;
                final int i10 = i;
                final String str2 = str;
                final ArrayList arrayList8 = arrayList;
                final boolean z8 = z;
                final int i11 = i2;
                final ArrayList arrayList9 = arrayList2;
                final ArrayList arrayList10 = arrayList3;
                final boolean z9 = z2;
                final boolean z10 = z3;
                final boolean z11 = z4;
                final boolean z12 = z5;
                final d dVar2 = dVar;
                final Runnable runnable2 = runnable;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z13 = z7;
                        Runnable runnable3 = runnable2;
                        if (z13) {
                            he heVar6 = heVar5;
                            if (heVar6 != null) {
                                try {
                                    heVar6.dismiss();
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                }
                            }
                            qf4.v0(ub7Var2, i10, str2, arrayList8, z8, i11, arrayList9, arrayList10, z9, z10, z11, z12, dVar2, runnable3);
                        } else if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                });
            }
        });
        if (z6) {
            return;
        }
        v0(ub7Var, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, dVar, null);
    }

    public final void A0(boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, arrayList, z);
        usersSelectActivity.G = this.r.c();
        usersSelectActivity.n = new s51((byte) 6, this, z);
        presentFragment(usersSelectActivity);
    }

    public final void B0(gf4 gf4Var, CharSequence charSequence, Object obj, boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131750644, null);
            if (obj instanceof String) {
                heVar.U = jb6.a0(null, null, 2131750645, charSequence);
            } else if (obj instanceof TLRPC.User) {
                heVar.U = jb6.a0(null, null, 2131750643, charSequence);
            } else {
                heVar.U = jb6.a0(null, null, 2131750646, charSequence);
            }
        } else {
            heVar.S = jb6.M0(2131750649, null);
            if (obj instanceof String) {
                heVar.U = jb6.a0(null, null, 2131750650, charSequence);
            } else if (obj instanceof TLRPC.User) {
                heVar.U = jb6.a0(null, null, 2131750648, charSequence);
            } else {
                heVar.U = jb6.a0(null, null, 2131750651, charSequence);
            }
        }
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        alertDialog$Builder.j(jb6.M0(2131744544, null), new ci(this, gf4Var, z, (byte) 8));
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public final void C0() {
        String str;
        int i;
        String M0;
        int size;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i2;
        ArrayList arrayList3 = this.P;
        arrayList3.clear();
        ArrayList arrayList4 = this.Q;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        String M02 = jb6.M0(2131750670, null);
        if (n0(this.x)) {
            if (this.y) {
                i2 = 2131750672;
            } else {
                i2 = 2131750671;
            }
            str = jb6.M0(i2, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final qf4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                qf4 qf4Var = this.b;
                switch (b) {
                    case 0:
                        ub7 ub7Var = qf4Var.r;
                        if (ub7Var != null && ub7Var.c()) {
                            ln4.b1(qf4Var, ub7Var.a, new re4(qf4Var, (byte) 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                        String M03 = jb6.M0(2131750727, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M03;
                        heVar.U = jb6.M0(2131750726, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, (byte) 1));
                        qf4Var.showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, null);
                            return;
                        }
                        return;
                    case 1:
                        qf4Var.q0();
                        return;
                    case 2:
                        qf4Var.A0(true);
                        return;
                    case 3:
                        qf4Var.e = true;
                        qf4Var.C0();
                        return;
                    case 4:
                        qf4Var.A0(false);
                        return;
                    default:
                        qf4Var.f = true;
                        qf4Var.C0();
                        return;
                }
            }
        };
        ?? jaVar = new ja(11, false);
        jaVar.d = M02;
        jaVar.e = str;
        jaVar.c = onClickListener;
        arrayList4.add(jaVar);
        this.d = arrayList4.size();
        arrayList4.add(new ja(2, false));
        arrayList4.add(gf4.d(null));
        String M03 = jb6.M0(2131750710, null);
        ?? jaVar2 = new ja(0, false);
        jaVar2.d = M03;
        arrayList4.add(jaVar2);
        gf4 b = gf4.b(2131232027, jb6.M0(2131750750, null), false);
        b.c = new View.OnClickListener(this) {
            public final qf4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r2;
                qf4 qf4Var = this.b;
                switch (b2) {
                    case 0:
                        ub7 ub7Var = qf4Var.r;
                        if (ub7Var != null && ub7Var.c()) {
                            ln4.b1(qf4Var, ub7Var.a, new re4(qf4Var, (byte) 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                        String M032 = jb6.M0(2131750727, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M032;
                        heVar.U = jb6.M0(2131750726, null);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, (byte) 1));
                        qf4Var.showDialog(heVar);
                        TextView textView = (TextView) heVar.c(-1);
                        if (textView != null) {
                            anb.X(textView, cmb.p7, null);
                            return;
                        }
                        return;
                    case 1:
                        qf4Var.q0();
                        return;
                    case 2:
                        qf4Var.A0(true);
                        return;
                    case 3:
                        qf4Var.e = true;
                        qf4Var.C0();
                        return;
                    case 4:
                        qf4Var.A0(false);
                        return;
                    default:
                        qf4Var.f = true;
                        qf4Var.C0();
                        return;
                }
            }
        };
        arrayList4.add(b);
        int i3 = this.E;
        int i4 = oc7.s5;
        if ((i3 & 1) != 0) {
            arrayList4.add(gf4.c(1, jb6.M0(2131750728, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList4.add(gf4.c(2, jb6.M0(2131750655, null), "non_contacts", true));
        }
        if ((this.E & 4) != 0) {
            arrayList4.add(gf4.c(4, jb6.M0(2131750711, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList4.add(gf4.c(8, jb6.M0(2131750737, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList4.add(gf4.c(16, jb6.M0(2131750738, null), "bots", true));
        }
        int i5 = 5;
        if (!this.G.isEmpty()) {
            if (!this.e && this.G.size() >= 8) {
                size2 = Math.min(5, this.G.size());
            } else {
                size2 = this.G.size();
            }
            int i6 = 0;
            while (true) {
                arrayList2 = this.G;
                if (i6 >= size2) {
                    break;
                }
                long longValue = ((Long) arrayList2.get(i6)).longValue();
                int i7 = i5;
                ?? jaVar3 = new ja(1, false);
                jaVar3.g = true;
                jaVar3.h = longValue;
                arrayList4.add(jaVar3);
                i6++;
                i5 = i7;
            }
            i = i5;
            if (size2 != arrayList2.size()) {
                gf4 b2 = gf4.b(2131230872, jb6.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b2.c = new View.OnClickListener(this) {
                    public final qf4 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b22 = r2;
                        qf4 qf4Var = this.b;
                        switch (b22) {
                            case 0:
                                ub7 ub7Var = qf4Var.r;
                                if (ub7Var != null && ub7Var.c()) {
                                    ln4.b1(qf4Var, ub7Var.a, new re4(qf4Var, (byte) 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                                String M032 = jb6.M0(2131750727, null);
                                he heVar = alertDialog$Builder.a;
                                heVar.S = M032;
                                heVar.U = jb6.M0(2131750726, null);
                                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, (byte) 1));
                                qf4Var.showDialog(heVar);
                                TextView textView = (TextView) heVar.c(-1);
                                if (textView != null) {
                                    anb.X(textView, cmb.p7, null);
                                    return;
                                }
                                return;
                            case 1:
                                qf4Var.q0();
                                return;
                            case 2:
                                qf4Var.A0(true);
                                return;
                            case 3:
                                qf4Var.e = true;
                                qf4Var.C0();
                                return;
                            case 4:
                                qf4Var.A0(false);
                                return;
                            default:
                                qf4Var.f = true;
                                qf4Var.C0();
                                return;
                        }
                    }
                };
                arrayList4.add(b2);
            }
        } else {
            i = 5;
        }
        arrayList4.add(gf4.d(jb6.M0(2131750709, null)));
        ub7 ub7Var = this.r;
        if (!ub7Var.c()) {
            String M04 = jb6.M0(2131750715, null);
            ?? jaVar4 = new ja(0, false);
            jaVar4.d = M04;
            arrayList4.add(jaVar4);
            gf4 b3 = gf4.b(2131232027, jb6.M0(2131750652, null), false);
            b3.c = new View.OnClickListener(this) {
                public final qf4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b22 = r2;
                    qf4 qf4Var = this.b;
                    switch (b22) {
                        case 0:
                            ub7 ub7Var2 = qf4Var.r;
                            if (ub7Var2 != null && ub7Var2.c()) {
                                ln4.b1(qf4Var, ub7Var2.a, new re4(qf4Var, (byte) 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                            String M032 = jb6.M0(2131750727, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M032;
                            heVar.U = jb6.M0(2131750726, null);
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, (byte) 1));
                            qf4Var.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                return;
                            }
                            return;
                        case 1:
                            qf4Var.q0();
                            return;
                        case 2:
                            qf4Var.A0(true);
                            return;
                        case 3:
                            qf4Var.e = true;
                            qf4Var.C0();
                            return;
                        case 4:
                            qf4Var.A0(false);
                            return;
                        default:
                            qf4Var.f = true;
                            qf4Var.C0();
                            return;
                    }
                }
            };
            arrayList4.add(b3);
            int i8 = this.E;
            int i9 = oc7.s5;
            if ((i8 & 32) != 0) {
                arrayList4.add(gf4.c(32, jb6.M0(2131750673, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList4.add(gf4.c(64, jb6.M0(2131750654, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList4.add(gf4.c(128, jb6.M0(2131750741, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                if (!this.f && this.H.size() >= 8) {
                    size = Math.min(i, this.H.size());
                } else {
                    size = this.H.size();
                }
                int i10 = 0;
                while (true) {
                    arrayList = this.H;
                    if (i10 >= size) {
                        break;
                    }
                    long longValue2 = ((Long) arrayList.get(i10)).longValue();
                    ?? jaVar5 = new ja(1, false);
                    jaVar5.g = false;
                    jaVar5.h = longValue2;
                    arrayList4.add(jaVar5);
                    i10++;
                }
                if (size != arrayList.size()) {
                    gf4 b4 = gf4.b(2131230872, jb6.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b4.c = new View.OnClickListener(this) {
                        public final qf4 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b22 = r2;
                            qf4 qf4Var = this.b;
                            switch (b22) {
                                case 0:
                                    ub7 ub7Var2 = qf4Var.r;
                                    if (ub7Var2 != null && ub7Var2.c()) {
                                        ln4.b1(qf4Var, ub7Var2.a, new re4(qf4Var, (byte) 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                                    String M032 = jb6.M0(2131750727, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M032;
                                    heVar.U = jb6.M0(2131750726, null);
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, (byte) 1));
                                    qf4Var.showDialog(heVar);
                                    TextView textView = (TextView) heVar.c(-1);
                                    if (textView != null) {
                                        anb.X(textView, cmb.p7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    qf4Var.q0();
                                    return;
                                case 2:
                                    qf4Var.A0(true);
                                    return;
                                case 3:
                                    qf4Var.e = true;
                                    qf4Var.C0();
                                    return;
                                case 4:
                                    qf4Var.A0(false);
                                    return;
                                default:
                                    qf4Var.f = true;
                                    qf4Var.C0();
                                    return;
                            }
                        }
                    };
                    arrayList4.add(b4);
                }
            }
            arrayList4.add(gf4.d(jb6.M0(2131750714, null)));
        }
        if (getMessagesController().m4 || !getUserConfig().p()) {
            arrayList4.add(new ja(9, false));
            arrayList4.add(new ja(10, false));
            arrayList4.add(gf4.d(jb6.M0(2131750553, null)));
        }
        ArrayList arrayList5 = this.M;
        if (arrayList5.isEmpty()) {
            String M05 = jb6.M0(2131750640, null);
            ?? jaVar6 = new ja(0, false);
            jaVar6.d = M05;
            jaVar6.f = true;
            arrayList4.add(jaVar6);
            arrayList4.add(gf4.b(2131232036, jb6.M0(2131750639, null), false));
            arrayList4.add(gf4.d(jb6.M0(2131750680, null)));
        } else {
            String M06 = jb6.M0(2131750682, null);
            ?? jaVar7 = new ja(0, false);
            jaVar7.d = M06;
            jaVar7.f = true;
            arrayList4.add(jaVar7);
            arrayList4.add(new ja(8, false));
            for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                ?? jaVar8 = new ja(7, false);
                jaVar8.m = (TL_chatlists.TL_exportedChatlistInvite) arrayList5.get(i11);
                arrayList4.add(jaVar8);
            }
            if (ub7Var.c()) {
                M0 = jb6.M0(2131750680, null);
            } else {
                M0 = jb6.M0(2131750681, null);
            }
            arrayList4.add(gf4.d(M0));
        }
        if (!this.s) {
            gf4 b5 = gf4.b(0, jb6.M0(2131750727, null), true);
            b5.c = new View.OnClickListener(this) {
                public final qf4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b22 = r2;
                    qf4 qf4Var = this.b;
                    switch (b22) {
                        case 0:
                            ub7 ub7Var2 = qf4Var.r;
                            if (ub7Var2 != null && ub7Var2.c()) {
                                ln4.b1(qf4Var, ub7Var2.a, new re4(qf4Var, (byte) 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qf4Var.getParentActivity());
                            String M032 = jb6.M0(2131750727, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M032;
                            heVar.U = jb6.M0(2131750726, null);
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.j(jb6.M0(2131751535, null), new qe4(qf4Var, (byte) 1));
                            qf4Var.showDialog(heVar);
                            TextView textView = (TextView) heVar.c(-1);
                            if (textView != null) {
                                anb.X(textView, cmb.p7, null);
                                return;
                            }
                            return;
                        case 1:
                            qf4Var.q0();
                            return;
                        case 2:
                            qf4Var.A0(true);
                            return;
                        case 3:
                            qf4Var.e = true;
                            qf4Var.C0();
                            return;
                        case 4:
                            qf4Var.A0(false);
                            return;
                        default:
                            qf4Var.f = true;
                            qf4Var.C0();
                            return;
                    }
                }
            };
            arrayList4.add(b5);
            arrayList4.add(gf4.d(null));
        }
        nf4 nf4Var = this.b;
        if (nf4Var != null) {
            nf4Var.E(arrayList3, arrayList4);
        }
    }

    public final void D0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.a != null) {
                int w0 = cmb.w0(null, cmb.x6, false);
                int w02 = cmb.w0(null, cmb.Yl, false);
                if (w0 != this.W || w02 != this.X) {
                    this.W = w0;
                    this.X = w02;
                    for (int i = 0; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.a.getChildCount();
                        } else {
                            fv fvVar = this.a;
                            if (i == 1) {
                                attachedScrapChildCount = fvVar.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = fvVar.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = fvVar.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                O = this.a.getChildAt(i2);
                            } else {
                                fv fvVar2 = this.a;
                                if (i == 1) {
                                    O = fvVar2.W(i2);
                                } else if (i == 2) {
                                    O = fvVar2.P(i2);
                                } else {
                                    O = fvVar2.O(i2);
                                }
                            }
                            if (O instanceof w8c) {
                                w8c w8cVar = (w8c) O;
                                w8cVar.b0 = true;
                                w8cVar.R = w0;
                                w8cVar.S = w02;
                                if (i != 0) {
                                    ((w8c) O).i(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
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
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.ki));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override
    public final boolean canBeginSlide() {
        return k0(true);
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        boolean z = this.s;
        rja rjaVar = this.simpleActionBar;
        ub7 ub7Var = this.r;
        if (z) {
            rjaVar.setTitle(jb6.M0(2131750665, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = rjaVar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(k47.A5(gw3.m(ub7Var.b, titleFontMetricsInt, false, null, 0), ub7Var.c, titleFontMetricsInt, false));
            rja rjaVar2 = this.simpleActionBar;
            if (rjaVar2 != null) {
                int i3 = 26;
                if (rjaVar2.getTitleTextView() != null) {
                    lka titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.y) {
                        i = 0;
                    } else {
                        i = 26;
                    }
                    titleTextView.setEmojiCacheType(i);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    lka titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.y) {
                        i3 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i3);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 17));
        rja rjaVar3 = this.simpleActionBar;
        if (this.s) {
            i2 = 2131751690;
        } else {
            i2 = 2131745680;
        }
        this.c = rjaVar3.s(jb6.M0(i2, null));
        w91 w91Var = new w91((byte) 2, context, this);
        this.fragmentView = w91Var;
        fv fvVar = new fv((byte) 17, context, this);
        this.a = fvVar;
        fvVar.r1();
        this.a.setLayoutManager(new u46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        w91Var.addView(this.a, qoe.c(-1.0f, -1));
        fv fvVar2 = this.a;
        nf4 nf4Var = new nf4(this, context);
        this.b = nf4Var;
        fvVar2.setAdapter(nf4Var);
        this.a.setOnItemClickListener(new u(this, (byte) 28));
        this.a.setOnItemLongClickListener(new qe4(this, (byte) 0));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.a.setItemAnimator(sc3Var);
        this.a.setOnScrollListener(new ip2(this, (byte) 11));
        l0(false);
        if (!this.O && ub7Var != null && ub7Var.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = ub7Var.a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ue4(this, (byte) 0));
        }
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 4);
        arrayList.add(new cnb(this.a, 16, new Class[]{jf5.class, xib.class, w8c.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.p6));
        arrayList.add(new cnb(this.a, 262144, new Class[]{xib.class}, new String[]{"ImageView"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.a, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean k0(boolean z) {
        if (this.c.x.f) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z2 = this.s;
                he heVar = alertDialog$Builder.a;
                if (z2) {
                    heVar.S = jb6.M0(2131750720, null);
                    heVar.U = jb6.M0(2131750722, null);
                    alertDialog$Builder.j(jb6.M0(2131750721, null), new qe4(this, (byte) 2));
                } else {
                    heVar.S = jb6.M0(2131750719, null);
                    heVar.U = jb6.M0(2131750723, null);
                    alertDialog$Builder.j(jb6.M0(2131754181, null), new qe4(this, (byte) 3));
                }
                alertDialog$Builder.g(jb6.M0(2131747313, null), new qe4(this, (byte) 4));
                showDialog(heVar);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void l0(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (!TextUtils.isEmpty(this.x) && this.x.length() <= 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((this.E & oc7.t5) == 0 && this.G.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && !this.s) {
                this.h = false;
                ub7 ub7Var = this.r;
                if (ub7Var.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (ub7Var.i.size() != this.H.size()) {
                    this.h = true;
                }
                if (ub7Var.m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(ub7Var.h);
                    Collections.sort(this.G);
                    if (!ub7Var.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(ub7Var.i);
                    Collections.sort(this.H);
                    if (!ub7Var.i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (ub7Var.n == (!this.y) && TextUtils.equals(ub7Var.b, this.x) && ub7Var.g == this.E) {
                    z3 = this.h;
                }
                z2 = z3;
            }
        }
        this.c.a(z2, z);
    }

    public final void m0() {
        String M0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i = this.E;
                int i2 = oc7.t5;
                int i3 = i & i2;
                String str = "";
                if ((i3 & i2) == i2) {
                    if ((i & 64) != 0) {
                        M0 = jb6.M0(2131750667, null);
                    } else {
                        if ((i & 32) != 0) {
                            M0 = jb6.M0(2131750668, null);
                        }
                        M0 = "";
                    }
                } else if ((i3 & 1) != 0) {
                    if ((i3 & (-2)) == 0) {
                        M0 = jb6.M0(2131750728, null);
                    }
                    M0 = "";
                } else if ((i3 & 2) != 0) {
                    if ((i3 & (-3)) == 0) {
                        M0 = jb6.M0(2131750655, null);
                    }
                    M0 = "";
                } else if ((i3 & 4) != 0) {
                    if ((i3 & (-5)) == 0) {
                        M0 = jb6.M0(2131750711, null);
                    }
                    M0 = "";
                } else if ((i3 & 16) != 0) {
                    if ((i3 & (-17)) == 0) {
                        M0 = jb6.M0(2131750738, null);
                    }
                    M0 = "";
                } else {
                    if ((i3 & 8) != 0 && (i3 & (-9)) == 0) {
                        M0 = jb6.M0(2131750737, null);
                    }
                    M0 = "";
                }
                if (M0.length() <= 12) {
                    str = M0;
                }
                this.x = str;
                ef4 ef4Var = this.J;
                if (ef4Var != null) {
                    ef4Var.e(gn.cloneSpans(str, -1, ef4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                u69 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    public final void o0() {
        vs2 vs2Var;
        oc7 messagesController = getMessagesController();
        ub7 ub7Var = this.r;
        messagesController.s5(ub7Var);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i = 0; i < ub7Var.h.size(); i++) {
            long longValue = ((Long) ub7Var.h.get(i)).longValue();
            if (longValue < 0 && j0(getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(getMessagesController().i1(longValue));
            }
        }
        if (getUserConfig().p()) {
            vs2Var = getMessagesController().l4.c1;
        } else {
            vs2Var = getMessagesController().l4.b1;
        }
        if (arrayList.size() > vs2Var.f()) {
            showDialog(new i46(4, this.currentAccount, null, getParentActivity(), this));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = ub7Var.a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new ue4(this, (byte) 1));
        } else {
            me4 me4Var = new me4(ub7Var, null);
            me4Var.y = new re4(this, (byte) 3);
            me4Var.x = new re4(this, (byte) 4);
            presentFragment(me4Var);
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        du3 du3Var;
        lf4 lf4Var = this.L;
        if (lf4Var != null && (du3Var = lf4Var.b) != null && du3Var.e) {
            if (z) {
                du3Var.k(true);
                return false;
            }
            return false;
        }
        return k0(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        C0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.N != 0) {
            getConnectionsManager().cancelRequest(this.N, true);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        lf4 lf4Var;
        View view = this.fragmentView;
        if (view != null && (lf4Var = this.L) != null && lf4Var.b.e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        C0();
        i74 i74Var = this.U;
        if (i74Var != null) {
            i74Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        du3 du3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                lf4 lf4Var = this.L;
                if (lf4Var != null && (du3Var = lf4Var.b) != null && du3Var.getEditText() != null && (themedColor = getThemedColor(cmb.Ei)) != this.V) {
                    this.V = themedColor;
                    this.L.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    public final void p0() {
        if (this.w) {
            this.w = false;
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            ub7 ub7Var = this.r;
            Spannable A5 = k47.A5(gw3.m(ub7Var.b, titleFontMetricsInt, false, null, 0), ub7Var.c, titleFontMetricsInt, false);
            rja rjaVar = this.simpleActionBar;
            rjaVar.getClass();
            rjaVar.I(A5, true, 220L, d53.h);
            return;
        }
        finishFragment();
    }

    public final void q0() {
        int i;
        int i2;
        this.y = !this.y;
        ff4 ff4Var = this.K;
        if (ff4Var != null) {
            rj rjVar = ff4Var.r;
            String str = null;
            if (n0(this.x)) {
                if (this.y) {
                    i2 = 2131750672;
                } else {
                    i2 = 2131750671;
                }
                str = jb6.M0(i2, null);
            }
            rjVar.setText(str);
        }
        vm.r(this.currentAccount, this.y);
        l0(true);
        rja rjaVar = this.simpleActionBar;
        if (rjaVar != null) {
            int i3 = 26;
            if (rjaVar.getTitleTextView() != null) {
                lka titleTextView = this.simpleActionBar.getTitleTextView();
                if (this.y) {
                    i = 0;
                } else {
                    i = 26;
                }
                titleTextView.setEmojiCacheType(i);
            }
            if (this.simpleActionBar.getTitleTextView2() != null) {
                lka titleTextView2 = this.simpleActionBar.getTitleTextView2();
                if (this.y) {
                    i3 = 0;
                }
                titleTextView2.setEmojiCacheType(i3);
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i = 0;
            while (true) {
                arrayList = this.M;
                if (i < arrayList.size()) {
                    if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ub7 ub7Var = this.r;
                    int i2 = ub7Var.g;
                    int i3 = oc7.s5;
                    ub7Var.g = i2 & (-513);
                }
                C0();
            }
        }
    }

    public final void s0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            arrayList = this.M;
            if (i < arrayList.size()) {
                if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i, boolean z) {
        ub7 ub7Var;
        if (!this.T && (ub7Var = this.r) != null && ub7Var.c() && ub7Var.e()) {
            this.T = true;
            this.U = new i74(this, z, i, (byte) 1);
            if (getLayoutContainer() != null) {
                this.U.run();
                this.U = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        int size;
        int i;
        if (arrayList != null) {
            i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!arrayList2.contains(arrayList.get(i2))) {
                    i++;
                }
            }
            size = 0;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (!arrayList.contains(arrayList2.get(i3))) {
                    size++;
                }
            }
        } else {
            size = arrayList2.size();
            i = 0;
        }
        if (z) {
            if (size > 0 && size > i) {
                t0(size, true);
            } else if (i > 0) {
                t0(i, false);
            }
        } else if (size > 0) {
            t0(size, false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        hg5 hg5Var = this.S;
        if (hg5Var != null) {
            hg5Var.f(true);
            this.S = null;
        }
        y0(new se4(this, (byte) 0), true);
    }

    public final void y0(Runnable runnable, boolean z) {
        CharSequence[] charSequenceArr = {this.x};
        z0(this.r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), !this.y, this.F, this.G, this.H, this.I, this.s, false, this.h, true, z, this, new ve4(this, runnable, (byte) 1));
    }
}
