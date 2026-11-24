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
public final class pd4 extends d {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public ed4 J;
    public fd4 K;
    public kd4 L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public je5 S;
    public boolean T;
    public z54 U;
    public int V;
    public int W;
    public int X;
    public fu a;
    public md4 b;
    public sha c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final t97 r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public pd4(t97 t97Var, ArrayList arrayList) {
        super(null);
        t97 t97Var2;
        this.d = -1;
        this.y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.r = t97Var;
        if (t97Var == null) {
            t97 t97Var3 = new t97();
            this.r = t97Var3;
            t97Var3.a = 2;
            while (true) {
                Object obj = getMessagesController().J0.get(this.r.a);
                t97Var2 = this.r;
                if (obj == null) {
                    break;
                }
                t97Var2.a++;
            }
            t97Var2.b = "";
            t97Var2.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(gl.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m = vu3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m;
        this.x = k27.A5(m, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z = !this.r.n;
        this.y = z;
        vl.r(this.currentAccount, z);
        t97 t97Var4 = this.r;
        this.E = t97Var4.g;
        this.F = t97Var4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.r.i);
        this.I = this.r.j.clone();
    }

    public static CharSequence D0(int i, String str, boolean z) {
        Context context;
        if (i >= 0) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("n_" + i, false) && (context = a.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z) {
                    Drawable d = b00.d(context, 2131232274);
                    d.setBounds(0, -gl.L(8.0f), d.getIntrinsicWidth(), d.getIntrinsicHeight() - gl.L(8.0f));
                    spannableString.setSpan(new ImageSpan(d, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable d2 = b00.d(context, 2131232272);
                    Drawable d3 = b00.d(context, 2131232273);
                    int w0 = bkb.w0(null, bkb.Ji, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    d2.setColorFilter(new PorterDuffColorFilter(w0, mode));
                    d3.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, bkb.Ii, false), mode));
                    fm2 fm2Var = new fm2(d2, d3);
                    fm2Var.setBounds(0, 0, fm2Var.getIntrinsicWidth(), fm2Var.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(fm2Var, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return str;
    }

    public static boolean i0(TLRPC.Chat chat) {
        if (!hc2.y(3, chat)) {
            if (!hc2.t0(chat) || chat.join_request) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static boolean m0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            gm[] gmVarArr = (gm[]) spanned.getSpans(0, spanned.length(), gm.class);
            if (gmVarArr != null && gmVarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void u0(t97 t97Var, int i, String str, ArrayList arrayList, boolean z, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z2, boolean z3, boolean z4, boolean z5, d dVar, Runnable runnable) {
        if (t97Var.g != i || z4) {
            t97Var.e = -1;
            if (z5) {
                t97Var.d = -1;
            }
        }
        t97Var.g = i;
        t97Var.b = str;
        t97Var.c = arrayList;
        t97Var.m = i2;
        t97Var.i = arrayList3;
        t97Var.h = arrayList2;
        t97Var.n = z;
        if (z2) {
            na7 messagesController = dVar.getMessagesController();
            HashSet hashSet = messagesController.n4;
            ArrayList arrayList4 = messagesController.G0;
            if (z3) {
                int size = arrayList4.size();
                int i3 = 254;
                for (int i4 = 0; i4 < size; i4++) {
                    i3 = Math.min(i3, ((t97) messagesController.G0.get(i4)).f);
                }
                t97Var.f = i3 - 1;
                boolean d = ((t97) messagesController.G0.get(0)).d();
                ArrayList arrayList5 = messagesController.G0;
                if (d) {
                    arrayList5.add(1, t97Var);
                } else {
                    arrayList5.add(0, t97Var);
                }
            } else {
                int size2 = arrayList4.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size2; i6++) {
                    i5 = Math.max(i5, ((t97) messagesController.G0.get(i6)).f);
                }
                t97Var.f = i5 + 1;
                messagesController.G0.add(t97Var);
            }
            messagesController.J0.put(t97Var.a, t97Var);
            int i7 = t97Var.a;
            if (i7 != 0 && hashSet.remove(Integer.valueOf(i7))) {
                messagesController.B4();
            }
            if (hashSet.contains(0)) {
                messagesController.Y4(null);
            }
            if (messagesController.G0.size() == 1 && gba.m(messagesController.currentAccount) != 5) {
                gba.o1 = 5;
                a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", gba.o1).apply();
            }
            messagesController.j3();
        } else {
            dVar.getMessagesController().x3(t97Var);
        }
        ad7 messagesStorage = dVar.getMessagesStorage();
        messagesStorage.a.c(new vj6(messagesStorage, t97Var, z3, (byte) 4));
        if (z3) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList R0 = dVar.getMessagesController().R0();
            int size3 = R0.size();
            for (int i8 = 0; i8 < size3; i8 = tb4.g(((t97) R0.get(i8)).a, i8, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            dVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void w0(TLRPC.TL_error tL_error, d dVar, u21 u21Var) {
        if (tL_error != null && !TextUtils.isEmpty(tL_error.text)) {
            if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
                new h26(4, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
                yjb.x(null, 2131750636, u21Var, null);
            } else if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                yjb.x(null, 2131750635, u21Var, null);
            } else if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
                new h26(5, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
                new h26(12, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
                new h26(13, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
                yjb.x(null, 2131748017, u21Var, null);
            } else if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
                new h26(4, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else if ("DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
                new h26(3, dVar.getCurrentAccount(), null, dVar.getContext(), dVar).show();
            } else {
                yjb.x(null, 2131743640, u21Var, null);
            }
        }
    }

    public static void y0(final t97 t97Var, final int i, final String str, final ArrayList arrayList, final boolean z, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final d dVar, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        hd hdVar = null;
        int i3 = 3;
        int i4 = 0;
        if (z6) {
            hd hdVar2 = new hd(3, null, dVar.getParentActivity());
            hdVar2.j0 = false;
            hdVar2.show();
            hdVar = hdVar2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = t97Var.a;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i5 = na7.q5;
        tL_dialogFilter.contacts = (i & 1) != 0;
        tL_dialogFilter.non_contacts = (i & 2) != 0;
        tL_dialogFilter.groups = (i & 4) != 0;
        tL_dialogFilter.broadcasts = (i & 8) != 0;
        tL_dialogFilter.bots = (i & 16) != 0;
        tL_dialogFilter.exclude_muted = (i & 32) != 0;
        tL_dialogFilter.exclude_read = (i & 64) != 0;
        tL_dialogFilter.exclude_archived = (i & 128) != 0;
        tL_dialogFilter.id = t97Var.a;
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
        na7 messagesController = dVar.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                long keyAt = longSparseIntArray.keyAt(i7);
                if (!cf3.B(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new nc4(longSparseIntArray, (byte) 0));
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
                hd hdVar3 = hdVar;
                int i9 = size2;
                long longValue = l.longValue();
                if ((i8 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !cf3.B(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User V1 = messagesController.V1(l);
                        if (V1 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = V1.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j = -longValue;
                        TLRPC.Chat K0 = messagesController.K0(Long.valueOf(j));
                        if (K0 != null) {
                            if (hc2.T(K0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j;
                                tL_inputPeerChannel.access_hash = K0.access_hash;
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
                hdVar = hdVar3;
                size2 = i9;
                arrayList5 = arrayList7;
            }
            i8++;
            i3 = 3;
            i4 = 0;
        }
        final hd hdVar4 = hdVar;
        dVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z7 = z6;
                final hd hdVar5 = hdVar4;
                final t97 t97Var2 = t97Var;
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
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z13 = z7;
                        Runnable runnable3 = runnable2;
                        if (z13) {
                            hd hdVar6 = hdVar5;
                            if (hdVar6 != null) {
                                try {
                                    hdVar6.dismiss();
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                }
                            }
                            pd4.u0(t97Var2, i10, str2, arrayList8, z8, i11, arrayList9, arrayList10, z9, z10, z11, z12, dVar2, runnable3);
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
        u0(t97Var, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, dVar, null);
    }

    public final void A0(gd4 gd4Var, CharSequence charSequence, Object obj, boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        hd hdVar = alertDialog$Builder.a;
        if (z) {
            hdVar.S = k96.M0(2131750695, null);
            if (obj instanceof String) {
                hdVar.U = k96.a0(null, null, 2131750696, charSequence);
            } else if (obj instanceof TLRPC.User) {
                hdVar.U = k96.a0(null, null, 2131750694, charSequence);
            } else {
                hdVar.U = k96.a0(null, null, 2131750697, charSequence);
            }
        } else {
            hdVar.S = k96.M0(2131750700, null);
            if (obj instanceof String) {
                hdVar.U = k96.a0(null, null, 2131750701, charSequence);
            } else if (obj instanceof TLRPC.User) {
                hdVar.U = k96.a0(null, null, 2131750699, charSequence);
            } else {
                hdVar.U = k96.a0(null, null, 2131750702, charSequence);
            }
        }
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        alertDialog$Builder.j(k96.M0(2131744618, null), new ch(this, gd4Var, z, (byte) 8));
        showDialog(hdVar);
        TextView textView = (TextView) hdVar.c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, null);
        }
    }

    public final void B0() {
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
        String M02 = k96.M0(2131750721, null);
        if (m0(this.x)) {
            if (this.y) {
                i2 = 2131750723;
            } else {
                i2 = 2131750722;
            }
            str = k96.M0(i2, null);
        } else {
            str = null;
        }
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final pd4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                pd4 pd4Var = this.b;
                switch (b) {
                    case 0:
                        t97 t97Var = pd4Var.r;
                        if (t97Var != null && t97Var.c()) {
                            ll4.b1(pd4Var, t97Var.a, new rc4(pd4Var, (byte) 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd4Var.getParentActivity());
                        String M03 = k96.M0(2131750778, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M03;
                        hdVar.U = k96.M0(2131750777, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new qc4(pd4Var, (byte) 1));
                        pd4Var.showDialog(hdVar);
                        TextView textView = (TextView) hdVar.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, null);
                            return;
                        }
                        return;
                    case 1:
                        pd4Var.p0();
                        return;
                    case 2:
                        pd4Var.z0(true);
                        return;
                    case 3:
                        pd4Var.e = true;
                        pd4Var.B0();
                        return;
                    case 4:
                        pd4Var.z0(false);
                        return;
                    default:
                        pd4Var.f = true;
                        pd4Var.B0();
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
        arrayList4.add(gd4.d(null));
        String M03 = k96.M0(2131750761, null);
        ?? jaVar2 = new ja(0, false);
        jaVar2.d = M03;
        arrayList4.add(jaVar2);
        gd4 b = gd4.b(2131232026, k96.M0(2131750801, null), false);
        b.c = new View.OnClickListener(this) {
            public final pd4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b2 = r2;
                pd4 pd4Var = this.b;
                switch (b2) {
                    case 0:
                        t97 t97Var = pd4Var.r;
                        if (t97Var != null && t97Var.c()) {
                            ll4.b1(pd4Var, t97Var.a, new rc4(pd4Var, (byte) 0));
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd4Var.getParentActivity());
                        String M032 = k96.M0(2131750778, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M032;
                        hdVar.U = k96.M0(2131750777, null);
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new qc4(pd4Var, (byte) 1));
                        pd4Var.showDialog(hdVar);
                        TextView textView = (TextView) hdVar.c(-1);
                        if (textView != null) {
                            zkb.X(textView, bkb.p7, null);
                            return;
                        }
                        return;
                    case 1:
                        pd4Var.p0();
                        return;
                    case 2:
                        pd4Var.z0(true);
                        return;
                    case 3:
                        pd4Var.e = true;
                        pd4Var.B0();
                        return;
                    case 4:
                        pd4Var.z0(false);
                        return;
                    default:
                        pd4Var.f = true;
                        pd4Var.B0();
                        return;
                }
            }
        };
        arrayList4.add(b);
        int i3 = this.E;
        int i4 = na7.q5;
        if ((i3 & 1) != 0) {
            arrayList4.add(gd4.c(1, k96.M0(2131750779, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList4.add(gd4.c(2, k96.M0(2131750706, null), "non_contacts", true));
        }
        if ((this.E & 4) != 0) {
            arrayList4.add(gd4.c(4, k96.M0(2131750762, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList4.add(gd4.c(8, k96.M0(2131750788, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList4.add(gd4.c(16, k96.M0(2131750789, null), "bots", true));
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
                gd4 b2 = gd4.b(2131230871, k96.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b2.c = new View.OnClickListener(this) {
                    public final pd4 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b22 = r2;
                        pd4 pd4Var = this.b;
                        switch (b22) {
                            case 0:
                                t97 t97Var = pd4Var.r;
                                if (t97Var != null && t97Var.c()) {
                                    ll4.b1(pd4Var, t97Var.a, new rc4(pd4Var, (byte) 0));
                                    return;
                                }
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd4Var.getParentActivity());
                                String M032 = k96.M0(2131750778, null);
                                hd hdVar = alertDialog$Builder.a;
                                hdVar.S = M032;
                                hdVar.U = k96.M0(2131750777, null);
                                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                alertDialog$Builder.j(k96.M0(2131751586, null), new qc4(pd4Var, (byte) 1));
                                pd4Var.showDialog(hdVar);
                                TextView textView = (TextView) hdVar.c(-1);
                                if (textView != null) {
                                    zkb.X(textView, bkb.p7, null);
                                    return;
                                }
                                return;
                            case 1:
                                pd4Var.p0();
                                return;
                            case 2:
                                pd4Var.z0(true);
                                return;
                            case 3:
                                pd4Var.e = true;
                                pd4Var.B0();
                                return;
                            case 4:
                                pd4Var.z0(false);
                                return;
                            default:
                                pd4Var.f = true;
                                pd4Var.B0();
                                return;
                        }
                    }
                };
                arrayList4.add(b2);
            }
        } else {
            i = 5;
        }
        arrayList4.add(gd4.d(k96.M0(2131750760, null)));
        t97 t97Var = this.r;
        if (!t97Var.c()) {
            String M04 = k96.M0(2131750766, null);
            ?? jaVar4 = new ja(0, false);
            jaVar4.d = M04;
            arrayList4.add(jaVar4);
            gd4 b3 = gd4.b(2131232026, k96.M0(2131750703, null), false);
            b3.c = new View.OnClickListener(this) {
                public final pd4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b22 = r2;
                    pd4 pd4Var = this.b;
                    switch (b22) {
                        case 0:
                            t97 t97Var2 = pd4Var.r;
                            if (t97Var2 != null && t97Var2.c()) {
                                ll4.b1(pd4Var, t97Var2.a, new rc4(pd4Var, (byte) 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd4Var.getParentActivity());
                            String M032 = k96.M0(2131750778, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M032;
                            hdVar.U = k96.M0(2131750777, null);
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.j(k96.M0(2131751586, null), new qc4(pd4Var, (byte) 1));
                            pd4Var.showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        case 1:
                            pd4Var.p0();
                            return;
                        case 2:
                            pd4Var.z0(true);
                            return;
                        case 3:
                            pd4Var.e = true;
                            pd4Var.B0();
                            return;
                        case 4:
                            pd4Var.z0(false);
                            return;
                        default:
                            pd4Var.f = true;
                            pd4Var.B0();
                            return;
                    }
                }
            };
            arrayList4.add(b3);
            int i8 = this.E;
            int i9 = na7.q5;
            if ((i8 & 32) != 0) {
                arrayList4.add(gd4.c(32, k96.M0(2131750724, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList4.add(gd4.c(64, k96.M0(2131750705, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList4.add(gd4.c(128, k96.M0(2131750792, null), "archived", false));
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
                    gd4 b4 = gd4.b(2131230871, k96.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b4.c = new View.OnClickListener(this) {
                        public final pd4 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            byte b22 = r2;
                            pd4 pd4Var = this.b;
                            switch (b22) {
                                case 0:
                                    t97 t97Var2 = pd4Var.r;
                                    if (t97Var2 != null && t97Var2.c()) {
                                        ll4.b1(pd4Var, t97Var2.a, new rc4(pd4Var, (byte) 0));
                                        return;
                                    }
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd4Var.getParentActivity());
                                    String M032 = k96.M0(2131750778, null);
                                    hd hdVar = alertDialog$Builder.a;
                                    hdVar.S = M032;
                                    hdVar.U = k96.M0(2131750777, null);
                                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                                    alertDialog$Builder.j(k96.M0(2131751586, null), new qc4(pd4Var, (byte) 1));
                                    pd4Var.showDialog(hdVar);
                                    TextView textView = (TextView) hdVar.c(-1);
                                    if (textView != null) {
                                        zkb.X(textView, bkb.p7, null);
                                        return;
                                    }
                                    return;
                                case 1:
                                    pd4Var.p0();
                                    return;
                                case 2:
                                    pd4Var.z0(true);
                                    return;
                                case 3:
                                    pd4Var.e = true;
                                    pd4Var.B0();
                                    return;
                                case 4:
                                    pd4Var.z0(false);
                                    return;
                                default:
                                    pd4Var.f = true;
                                    pd4Var.B0();
                                    return;
                            }
                        }
                    };
                    arrayList4.add(b4);
                }
            }
            arrayList4.add(gd4.d(k96.M0(2131750765, null)));
        }
        if (getMessagesController().l4 || !getUserConfig().p()) {
            arrayList4.add(new ja(9, false));
            arrayList4.add(new ja(10, false));
            arrayList4.add(gd4.d(k96.M0(2131750604, null)));
        }
        ArrayList arrayList5 = this.M;
        if (arrayList5.isEmpty()) {
            String M05 = k96.M0(2131750691, null);
            ?? jaVar6 = new ja(0, false);
            jaVar6.d = M05;
            jaVar6.f = true;
            arrayList4.add(jaVar6);
            arrayList4.add(gd4.b(2131232035, k96.M0(2131750690, null), false));
            arrayList4.add(gd4.d(k96.M0(2131750731, null)));
        } else {
            String M06 = k96.M0(2131750733, null);
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
            if (t97Var.c()) {
                M0 = k96.M0(2131750731, null);
            } else {
                M0 = k96.M0(2131750732, null);
            }
            arrayList4.add(gd4.d(M0));
        }
        if (!this.s) {
            gd4 b5 = gd4.b(0, k96.M0(2131750778, null), true);
            b5.c = new View.OnClickListener(this) {
                public final pd4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b22 = r2;
                    pd4 pd4Var = this.b;
                    switch (b22) {
                        case 0:
                            t97 t97Var2 = pd4Var.r;
                            if (t97Var2 != null && t97Var2.c()) {
                                ll4.b1(pd4Var, t97Var2.a, new rc4(pd4Var, (byte) 0));
                                return;
                            }
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pd4Var.getParentActivity());
                            String M032 = k96.M0(2131750778, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M032;
                            hdVar.U = k96.M0(2131750777, null);
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.j(k96.M0(2131751586, null), new qc4(pd4Var, (byte) 1));
                            pd4Var.showDialog(hdVar);
                            TextView textView = (TextView) hdVar.c(-1);
                            if (textView != null) {
                                zkb.X(textView, bkb.p7, null);
                                return;
                            }
                            return;
                        case 1:
                            pd4Var.p0();
                            return;
                        case 2:
                            pd4Var.z0(true);
                            return;
                        case 3:
                            pd4Var.e = true;
                            pd4Var.B0();
                            return;
                        case 4:
                            pd4Var.z0(false);
                            return;
                        default:
                            pd4Var.f = true;
                            pd4Var.B0();
                            return;
                    }
                }
            };
            arrayList4.add(b5);
            arrayList4.add(gd4.d(null));
        }
        md4 md4Var = this.b;
        if (md4Var != null) {
            md4Var.E(arrayList3, arrayList4);
        }
    }

    public final void C0() {
        int attachedScrapChildCount;
        View O;
        try {
            if (this.a != null) {
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.Yl, false);
                if (w0 != this.W || w02 != this.X) {
                    this.W = w0;
                    this.X = w02;
                    for (int i = 0; i < 4; i++) {
                        if (i == 0) {
                            attachedScrapChildCount = this.a.getChildCount();
                        } else {
                            fu fuVar = this.a;
                            if (i == 1) {
                                attachedScrapChildCount = fuVar.getHiddenChildCount();
                            } else if (i == 2) {
                                attachedScrapChildCount = fuVar.getCachedChildCount();
                            } else {
                                attachedScrapChildCount = fuVar.getAttachedScrapChildCount();
                            }
                        }
                        for (int i2 = 0; i2 < attachedScrapChildCount; i2++) {
                            if (i == 0) {
                                O = this.a.getChildAt(i2);
                            } else {
                                fu fuVar2 = this.a;
                                if (i == 1) {
                                    O = fuVar2.W(i2);
                                } else if (i == 2) {
                                    O = fuVar2.P(i2);
                                } else {
                                    O = fuVar2.O(i2);
                                }
                            }
                            if (O instanceof v6c) {
                                v6c v6cVar = (v6c) O;
                                v6cVar.b0 = true;
                                v6cVar.R = w0;
                                v6cVar.S = w02;
                                if (i != 0) {
                                    ((v6c) O).i(0);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.ki));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    @Override
    public final boolean canBeginSlide() {
        return j0(true);
    }

    @Override
    public final View createView(Context context) {
        int i;
        int i2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        boolean z = this.s;
        pha phaVar = this.simpleActionBar;
        t97 t97Var = this.r;
        if (z) {
            phaVar.setTitle(k96.M0(2131750716, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = phaVar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(k27.A5(vu3.m(t97Var.b, titleFontMetricsInt, false, null, 0), t97Var.c, titleFontMetricsInt, false));
            pha phaVar2 = this.simpleActionBar;
            if (phaVar2 != null) {
                int i3 = 26;
                if (phaVar2.getTitleTextView() != null) {
                    jia titleTextView = this.simpleActionBar.getTitleTextView();
                    if (this.y) {
                        i = 0;
                    } else {
                        i = 26;
                    }
                    titleTextView.setEmojiCacheType(i);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    jia titleTextView2 = this.simpleActionBar.getTitleTextView2();
                    if (this.y) {
                        i3 = 0;
                    }
                    titleTextView2.setEmojiCacheType(i3);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new vm2(this, (byte) 16));
        pha phaVar3 = this.simpleActionBar;
        if (this.s) {
            i2 = 2131751741;
        } else {
            i2 = 2131745754;
        }
        this.c = phaVar3.s(k96.M0(i2, null));
        n81 n81Var = new n81((byte) 2, context, this);
        this.fragmentView = n81Var;
        fu fuVar = new fu((byte) 17, context, this);
        this.a = fuVar;
        fuVar.r1();
        this.a.setLayoutManager(new t26(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        n81Var.addView(this.a, nme.c(-1.0f, -1));
        fu fuVar2 = this.a;
        md4 md4Var = new md4(this, context);
        this.b = md4Var;
        fuVar2.setAdapter(md4Var);
        this.a.setOnItemClickListener(new u(this, (byte) 27));
        this.a.setOnItemLongClickListener(new qc4(this, (byte) 0));
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.a.setItemAnimator(gb3Var);
        this.a.setOnScrollListener(new ao2(this, (byte) 10));
        k0(false);
        if (!this.O && t97Var != null && t97Var.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = t97Var.a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new uc4(this, (byte) 0));
        }
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 4);
        arrayList.add(new blb(this.a, 16, new Class[]{ld5.class, wgb.class, v6c.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.o7));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"textView"}, (Drawable[]) null, (alb) null, bkb.p6));
        arrayList.add(new blb(this.a, 262144, new Class[]{wgb.class}, new String[]{"ImageView"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.a, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z) {
        if (this.c.x.f) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                boolean z2 = this.s;
                hd hdVar = alertDialog$Builder.a;
                if (z2) {
                    hdVar.S = k96.M0(2131750771, null);
                    hdVar.U = k96.M0(2131750773, null);
                    alertDialog$Builder.j(k96.M0(2131750772, null), new qc4(this, (byte) 2));
                } else {
                    hdVar.S = k96.M0(2131750770, null);
                    hdVar.U = k96.M0(2131750774, null);
                    alertDialog$Builder.j(k96.M0(2131754213, null), new qc4(this, (byte) 3));
                }
                alertDialog$Builder.g(k96.M0(2131747387, null), new qc4(this, (byte) 4));
                showDialog(hdVar);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void k0(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (!TextUtils.isEmpty(this.x) && this.x.length() <= 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((this.E & na7.r5) == 0 && this.G.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && !this.s) {
                this.h = false;
                t97 t97Var = this.r;
                if (t97Var.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (t97Var.i.size() != this.H.size()) {
                    this.h = true;
                }
                if (t97Var.m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(t97Var.h);
                    Collections.sort(this.G);
                    if (!t97Var.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(t97Var.i);
                    Collections.sort(this.H);
                    if (!t97Var.i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (t97Var.n == (!this.y) && TextUtils.equals(t97Var.b, this.x) && t97Var.g == this.E) {
                    z3 = this.h;
                }
                z2 = z3;
            }
        }
        this.c.a(z2, z);
    }

    public final void l0() {
        String M0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i = this.E;
                int i2 = na7.r5;
                int i3 = i & i2;
                String str = "";
                if ((i3 & i2) == i2) {
                    if ((i & 64) != 0) {
                        M0 = k96.M0(2131750718, null);
                    } else {
                        if ((i & 32) != 0) {
                            M0 = k96.M0(2131750719, null);
                        }
                        M0 = "";
                    }
                } else if ((i3 & 1) != 0) {
                    if ((i3 & (-2)) == 0) {
                        M0 = k96.M0(2131750779, null);
                    }
                    M0 = "";
                } else if ((i3 & 2) != 0) {
                    if ((i3 & (-3)) == 0) {
                        M0 = k96.M0(2131750706, null);
                    }
                    M0 = "";
                } else if ((i3 & 4) != 0) {
                    if ((i3 & (-5)) == 0) {
                        M0 = k96.M0(2131750762, null);
                    }
                    M0 = "";
                } else if ((i3 & 16) != 0) {
                    if ((i3 & (-17)) == 0) {
                        M0 = k96.M0(2131750789, null);
                    }
                    M0 = "";
                } else {
                    if ((i3 & 8) != 0 && (i3 & (-9)) == 0) {
                        M0 = k96.M0(2131750788, null);
                    }
                    M0 = "";
                }
                if (M0.length() <= 12) {
                    str = M0;
                }
                this.x = str;
                ed4 ed4Var = this.J;
                if (ed4Var != null) {
                    ed4Var.e(gm.cloneSpans(str, -1, ed4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s49 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    public final void n0() {
        kr2 kr2Var;
        na7 messagesController = getMessagesController();
        t97 t97Var = this.r;
        messagesController.p5(t97Var);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i = 0; i < t97Var.h.size(); i++) {
            long longValue = ((Long) t97Var.h.get(i)).longValue();
            if (longValue < 0 && i0(getMessagesController().K0(Long.valueOf(-longValue)))) {
                arrayList.add(getMessagesController().h1(longValue));
            }
        }
        if (getUserConfig().p()) {
            kr2Var = getMessagesController().k4.c1;
        } else {
            kr2Var = getMessagesController().k4.b1;
        }
        if (arrayList.size() > kr2Var.f()) {
            showDialog(new h26(4, this.currentAccount, null, getParentActivity(), this));
        } else if (!arrayList.isEmpty()) {
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = t97Var.a;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new uc4(this, (byte) 1));
        } else {
            mc4 mc4Var = new mc4(t97Var, null);
            mc4Var.y = new rc4(this, (byte) 3);
            mc4Var.x = new rc4(this, (byte) 4);
            presentFragment(mc4Var);
        }
    }

    public final void o0() {
        if (this.w) {
            this.w = false;
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            t97 t97Var = this.r;
            Spannable A5 = k27.A5(vu3.m(t97Var.b, titleFontMetricsInt, false, null, 0), t97Var.c, titleFontMetricsInt, false);
            pha phaVar = this.simpleActionBar;
            phaVar.getClass();
            phaVar.I(A5, true, 220L, s33.h);
            return;
        }
        finishFragment();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        ts3 ts3Var;
        kd4 kd4Var = this.L;
        if (kd4Var != null && (ts3Var = kd4Var.b) != null && ts3Var.e) {
            if (z) {
                ts3Var.k(true);
                return false;
            }
            return false;
        }
        return j0(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        B0();
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
        kd4 kd4Var;
        View view = this.fragmentView;
        if (view != null && (kd4Var = this.L) != null && kd4Var.b.e) {
            view.requestLayout();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        B0();
        z54 z54Var = this.U;
        if (z54Var != null) {
            z54Var.run();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        ts3 ts3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            C0();
            try {
                kd4 kd4Var = this.L;
                if (kd4Var != null && (ts3Var = kd4Var.b) != null && ts3Var.getEditText() != null && (themedColor = getThemedColor(bkb.Ei)) != this.V) {
                    this.V = themedColor;
                    this.L.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    public final void p0() {
        int i;
        int i2;
        this.y = !this.y;
        fd4 fd4Var = this.K;
        if (fd4Var != null) {
            ri riVar = fd4Var.r;
            String str = null;
            if (m0(this.x)) {
                if (this.y) {
                    i2 = 2131750723;
                } else {
                    i2 = 2131750722;
                }
                str = k96.M0(i2, null);
            }
            riVar.setText(str);
        }
        vl.r(this.currentAccount, this.y);
        k0(true);
        pha phaVar = this.simpleActionBar;
        if (phaVar != null) {
            int i3 = 26;
            if (phaVar.getTitleTextView() != null) {
                jia titleTextView = this.simpleActionBar.getTitleTextView();
                if (this.y) {
                    i = 0;
                } else {
                    i = 26;
                }
                titleTextView.setEmojiCacheType(i);
            }
            if (this.simpleActionBar.getTitleTextView2() != null) {
                jia titleTextView2 = this.simpleActionBar.getTitleTextView2();
                if (this.y) {
                    i3 = 0;
                }
                titleTextView2.setEmojiCacheType(i3);
            }
        }
    }

    public final void q0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
                    t97 t97Var = this.r;
                    int i2 = t97Var.g;
                    int i3 = na7.q5;
                    t97Var.g = i2 & (-513);
                }
                B0();
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        B0();
    }

    public final void s0(int i, boolean z) {
        t97 t97Var;
        if (!this.T && (t97Var = this.r) != null && t97Var.c() && t97Var.e()) {
            this.T = true;
            this.U = new z54(this, z, i, (byte) 1);
            if (getLayoutContainer() != null) {
                this.U.run();
                this.U = null;
            }
        }
    }

    public final void t0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
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
                s0(size, true);
            } else if (i > 0) {
                s0(i, false);
            }
        } else if (size > 0) {
            s0(size, false);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        je5 je5Var = this.S;
        if (je5Var != null) {
            je5Var.f(true);
            this.S = null;
        }
        x0(new sc4(this, (byte) 0), true);
    }

    public final void x0(Runnable runnable, boolean z) {
        CharSequence[] charSequenceArr = {this.x};
        y0(this.r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), true ^ this.y, this.F, this.G, this.H, this.I, this.s, false, this.h, true, z, this, new vc4(this, runnable, (byte) 0));
    }

    public final void z0(boolean z) {
        ArrayList arrayList;
        if (z) {
            arrayList = this.G;
        } else {
            arrayList = this.H;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, arrayList, z);
        usersSelectActivity.G = this.r.c();
        usersSelectActivity.n = new l41((byte) 6, this, z);
        presentFragment(usersSelectActivity);
    }
}
