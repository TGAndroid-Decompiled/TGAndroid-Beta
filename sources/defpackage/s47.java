package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public class s47 extends d implements gk7 {
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final rs S;
    public ry8 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull a;
    public final ez3 a0;
    public final long b;
    public FrameLayout b0;
    public final int c;
    public o47 c0;
    public q47 d;
    public mf0 d0;
    public g24 e;
    public final boolean e0;
    public o39 f;
    public rxa f0;
    public t26 h;
    public final k27 n;
    public gxa r;
    public gxa s;
    public final iq w;
    public txa x;
    public final ArrayList y;

    public s47(k27 k27Var) {
        super(null);
        long j;
        this.w = new iq(15);
        this.y = new ArrayList();
        this.H = null;
        this.S = new rs(0);
        this.a0 = new ez3(this, (byte) 29);
        this.n = k27Var;
        if (k27Var.k.fwd_from == null) {
            j = k27Var.x0();
            this.b = j;
            this.c = k27Var.e1();
        } else {
            j = -k27Var.Z0();
            this.b = j;
            this.c = k27Var.k.fwd_msg_id;
        }
        this.a = getMessagesController().L0(j);
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
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.hk));
    }

    public final void b0() {
        View subtitleTextView;
        o39 o39Var;
        o39 o39Var2;
        o39 o39Var3;
        o39 o39Var4;
        o39 o39Var5 = this.f;
        if (o39Var5 != null) {
            int childCount = o39Var5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                o39Var = this.f;
                if (i2 >= childCount) {
                    break;
                }
                i0(o39Var.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = o39Var.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                o39Var2 = this.f;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                i0(o39Var2.W(i3));
                i3++;
            }
            int cachedChildCount = o39Var2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                o39Var3 = this.f;
                if (i4 >= cachedChildCount) {
                    break;
                }
                i0(o39Var3.P(i4));
                i4++;
            }
            int attachedScrapChildCount = o39Var3.getAttachedScrapChildCount();
            while (true) {
                o39Var4 = this.f;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                i0(o39Var4.O(i));
                i++;
            }
            o39Var4.getRecycledViewPool().a();
        }
        mf0 mf0Var = this.d0;
        if (mf0Var != null) {
            mf0Var.b = true;
        }
        o47 o47Var = this.c0;
        if (o47Var == null) {
            subtitleTextView = null;
        } else {
            subtitleTextView = o47Var.getSubtitleTextView();
        }
        if (subtitleTextView instanceof jia) {
            ((jia) subtitleTextView).setLinkTextColor(bkb.v0(bkb.Fj, getResourceProvider()));
        }
    }

    public final boolean c0(k27 k27Var) {
        if (k27Var.w4() && (k27Var.l instanceof TL_stories.TL_storyItemDeleted)) {
            ir2.v(null, 2131744366, u21.b0(this), 2131624231, 36);
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i;
        CharSequence charSequence;
        String str;
        int i2;
        this.actionBar.setBackButtonImage(2131231243);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zkb.h(bkb.Z6, getResourceProvider(), frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        g24 g24Var = new g24(context, null);
        this.e = g24Var;
        g24Var.setText(k96.M0(2131747975, null));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        ?? imageView = new ImageView(context);
        this.T = imageView;
        imageView.setAutoRepeat(true);
        this.T.f(2131624224, 120, 120, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        int i3 = bkb.Ej;
        zkb.X(textView, i3, getResourceProvider());
        textView.setTag(Integer.valueOf(i3));
        textView.setText(k96.M0(2131748585, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i4 = bkb.Fj;
        zkb.X(textView2, i4, getResourceProvider());
        textView2.setTag(Integer.valueOf(i4));
        textView2.setText(k96.M0(2131748584, null));
        textView2.setGravity(1);
        this.U.addView(this.T, nme.t(120, 120, 1, 0, 0, 0, 20));
        this.U.addView(textView, nme.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, nme.r(-2, -2, 1));
        float f = 0.0f;
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, nme.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        o39 o39Var = new o39(context, getResourceProvider());
        this.f = o39Var;
        o39Var.r1();
        o39 o39Var2 = this.f;
        t26 t26Var = new t26(1, false);
        this.h = t26Var;
        o39Var2.setLayoutManager(t26Var);
        ((hia) this.f.getItemAnimator()).m = false;
        o39 o39Var3 = this.f;
        q47 q47Var = new q47(this, context);
        this.d = q47Var;
        o39Var3.setAdapter(q47Var);
        o39 o39Var4 = this.f;
        if (k96.a0) {
            i = 1;
        } else {
            i = 2;
        }
        o39Var4.setVerticalScrollbarPosition(i);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new bf4(this, (byte) 13));
        this.f.setOnItemLongClickListener(new im6(this, (byte) 7));
        this.f.setOnScrollListener(new ao2(this, (byte) 27));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.addView(this.f, nme.c(-1.0f, -1));
        this.b0.addView(this.e, nme.c(-1.0f, -1));
        this.b0.setVisibility(8);
        frameLayout2.addView(this.b0, nme.c(-1.0f, -1));
        gl.e3(this.a0, 300L);
        l0();
        this.f.setEmptyView(this.e);
        this.c0 = new o47(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.p0(this.c0);
        this.X.q0(gl.L(9.0f));
        this.Z = false;
        k27 k27Var = this.n;
        int i5 = 50;
        if (!k27Var.w4()) {
            if (!k27Var.l5() && (k27.R3(k27Var.k) || k27Var.L3() || k27.K4(k27Var.k))) {
                if (k27Var.Y4()) {
                    str = k27Var.k.media.webpage.type;
                } else {
                    str = null;
                }
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w = ba4.w(k27Var.p0, 50, false, null, false);
                    TLRPC.PhotoSize w2 = ba4.w(k27Var.p0, gl.Y0(false), false, null, false);
                    if (w == w2) {
                        w2 = null;
                    }
                    if (w != null) {
                        this.Z = true;
                        this.Y = k27.K4(k27Var.k);
                        String r = ba4.r(null, w2);
                        if (!k27Var.z0 && !up3.q(this.currentAccount).d(k27Var) && !ba4.G(this.currentAccount).S(r)) {
                            this.X.a0(null, null, gl5.f(w, k27Var.n0), "50_50", null, this.n, 0);
                        } else {
                            if (k27Var.D == 1 && w2 != null) {
                                i2 = w2.size;
                            } else {
                                i2 = 0;
                            }
                            this.X.Z(gl5.f(w2, k27Var.n0), "50_50", gl5.f(w, k27Var.n0), "50_50", null, i2, null, this.n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(k27Var.z)) {
                charSequence = k27Var.z;
            } else {
                boolean isEmpty = TextUtils.isEmpty(k27Var.k.message);
                CharSequence charSequence2 = k27Var.v;
                if (!isEmpty) {
                    if (charSequence2.length() > 150) {
                        charSequence2 = charSequence2.subSequence(0, 150);
                    }
                    charSequence = vu3.m(charSequence2, this.c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                } else {
                    charSequence = charSequence2;
                }
            }
            if (!k27.K4(k27Var.k) && !k27.R3(k27Var.k)) {
                this.c0.setSubtitle(charSequence);
            } else {
                o47 o47Var = this.c0;
                if (o47Var.getSubtitleTextView() != null) {
                    o47Var.getSubtitleTextView().setVisibility(8);
                }
            }
        }
        if (!this.Z && !k27Var.w4()) {
            i5 = 56;
        } else {
            this.c0.setRightAvatarPadding(-gl.L(3.0f));
        }
        a aVar = this.actionBar;
        o47 o47Var2 = this.c0;
        if (!this.inPreviewMode) {
            f = i5;
        }
        aVar.addView(o47Var2, 0, nme.d(-2, -1.0f, 51, f, 0.0f, 40.0f, 0.0f));
        j0();
        this.c0.i(bkb.v0(i3, getResourceProvider()), bkb.v0(i4, getResourceProvider()));
        View subtitleTextView = this.c0.getSubtitleTextView();
        if (subtitleTextView instanceof jia) {
            ((jia) subtitleTextView).setLinkTextColor(bkb.v0(i4, getResourceProvider()));
        }
        zkb.l(this.actionBar, 1, bkb.F6, getResourceProvider());
        zkb.l(this.actionBar, 3, bkb.y8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 10));
        this.c0.setOnClickListener(new b95(this, (byte) 27));
        k0();
        return this.fragmentView;
    }

    public final void d0(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                this.H = tL_publicForwards.next_offset;
            } else {
                this.H = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                this.V = i;
            } else if (this.V == 0) {
                this.V = tL_publicForwards.forwards.size();
            }
            if (this.H == null) {
                z = true;
            } else {
                z = false;
            }
            this.W = z;
            getMessagesController().U3(tL_publicForwards.chats, false);
            getMessagesController().a4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                boolean z2 = publicForward2 instanceof TL_stories.TL_publicForwardStory;
                ArrayList arrayList2 = this.y;
                if (z2) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = cf3.n(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    k27 k27Var = new k27(this.currentAccount, storyItem);
                    k27Var.r0(false);
                    arrayList2.add(k27Var);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new k27(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            g24 g24Var = this.e;
            if (g24Var != null) {
                g24Var.c();
            }
        }
        this.G = true;
        this.F = false;
        l0();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a == null && chatFull.id == this.b) {
                j0();
                this.a = chatFull;
                h0();
                g0();
                k0();
            }
        }
    }

    public final void e0(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                this.H = tL_publicForwards.next_offset;
            } else {
                this.H = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                this.V = i;
            } else if (this.V == 0) {
                this.V = tL_publicForwards.forwards.size();
            }
            if (this.H == null) {
                z = true;
            } else {
                z = false;
            }
            this.W = z;
            getMessagesController().U3(tL_publicForwards.chats, false);
            getMessagesController().a4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                boolean z2 = publicForward2 instanceof TL_stories.TL_publicForwardStory;
                ArrayList arrayList2 = this.y;
                if (z2) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = cf3.n(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    k27 k27Var = new k27(this.currentAccount, storyItem);
                    k27Var.r0(false);
                    arrayList2.add(k27Var);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new k27(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            g24 g24Var = this.e;
            if (g24Var != null) {
                g24Var.c();
            }
        }
        this.G = true;
        this.F = false;
        l0();
    }

    public final void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        this.E = true;
        if (tL_error != null) {
            l0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        this.r = uxa.f0(statsGraph, k96.M0(2131743288, null), 1, false);
        this.s = uxa.f0(statsGraph2, k96.M0(2131746192, null), 2, false);
        gxa gxaVar = this.r;
        if (gxaVar != null && gxaVar.d.a.length <= 5) {
            this.E = false;
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            gxa gxaVar2 = this.r;
            tL_loadAsyncGraph.token = gxaVar2.g;
            long[] jArr = gxaVar2.d.a;
            tL_loadAsyncGraph.x = jArr[jArr.length - 1];
            tL_loadAsyncGraph.flags |= 1;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_loadAsyncGraph, new k45(this, this.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, (byte) 14), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        l0();
    }

    public final void g0() {
        if (this.F) {
            return;
        }
        this.F = true;
        q47 q47Var = this.d;
        if (q47Var != null) {
            q47Var.f();
        }
        k27 k27Var = this.n;
        String str = "";
        if (k27Var.w4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = k27Var.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().h1(-this.b);
            String str2 = this.H;
            if (str2 != null) {
                str = str2;
            }
            tL_getStoryPublicForwards.offset = str;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new m47(this, (byte) 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = k27Var.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().f1(-k27Var.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = k27Var.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().f1(-k27.B0(k27Var.k));
        }
        String str3 = this.H;
        if (str3 != null) {
            str = str3;
        }
        tL_getMessagePublicForwards.offset = str;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new m47(this, (byte) 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        jia jiaVar;
        ArrayList arrayList = new ArrayList();
        t00 t00Var = new t00(this, (byte) 11);
        o47 o47Var = this.c0;
        View view = null;
        if (o47Var != null) {
            jiaVar = o47Var.getTitleTextView();
        } else {
            jiaVar = null;
        }
        arrayList.add(new blb(jiaVar, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Ej));
        o47 o47Var2 = this.c0;
        if (o47Var2 != null) {
            view = o47Var2.getSubtitleTextView();
        }
        arrayList.add(new blb(bkb.Fj, view));
        arrayList.add(new blb(this.f, 0, new Class[]{gh6.class}, new String[]{"statusColor"}, (Drawable[]) null, t00Var, bkb.x6));
        arrayList.add(new blb(this.f, 0, new Class[]{gh6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t00Var, bkb.m6));
        arrayList.add(new blb(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F8));
        arrayList.add(new blb(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.D8));
        arrayList.add(new blb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.E8));
        uxa.m0(this.r, arrayList, t00Var);
        uxa.m0(this.s, arrayList, t00Var);
        return arrayList;
    }

    public final void h0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        k27 k27Var = this.n;
        if (k27Var.w4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = k27Var.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().h1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = k27Var.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().f1(-k27Var.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = k27Var.e1();
                tL_getMessageStats2.channel = getMessagesController().f1(-k27.B0(k27Var.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new m47(this, (byte) 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    public final void i0(View view) {
        if (view instanceof gh6) {
            gh6 gh6Var = (gh6) view;
            int v0 = bkb.v0(bkb.x6, getResourceProvider());
            int v02 = bkb.v0(bkb.m6, getResourceProvider());
            gh6Var.P = true;
            gh6Var.I = v0;
            gh6Var.J = v02;
            gh6Var.d(0);
        } else if (view instanceof dxa) {
            ((dxa) view).d();
            zkb.h(bkb.c6, getResourceProvider(), view);
        } else {
            boolean z = view instanceof b9a;
            if (z && (view.getBackground() instanceof fm2) && (((fm2) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((fm2) view.getBackground()).a).setColor(bkb.v0(bkb.Z6, getResourceProvider()));
                view.invalidate();
            } else if (z) {
                fm2 fm2Var = new fm2(new ColorDrawable(bkb.v0(bkb.Z6, getResourceProvider())), bkb.W0(org.telegram.messenger.a.b, 2131231232, bkb.a7), 0, 0);
                fm2Var.x = true;
                view.setBackground(fm2Var);
            } else if (view instanceof hk1) {
                ((hk1) view).a();
            } else if (view instanceof r47) {
                int i = r47.d;
                ((r47) view).a();
                zkb.h(bkb.c6, getResourceProvider(), view);
            }
        }
        if (view instanceof y14) {
            zkb.h(bkb.c6, getResourceProvider(), view);
        }
    }

    @Override
    public boolean isLightStatusBar() {
        if (bm2.h(bkb.v0(bkb.c6, getResourceProvider())) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    public final void j0() {
        k27 k27Var = this.n;
        boolean w4 = k27Var.w4();
        o47 o47Var = this.c0;
        if (w4) {
            o47Var.setTitle(k96.M0(2131744218, null));
            o47 o47Var2 = this.c0;
            if (o47Var2.getSubtitleTextView() != null) {
                o47Var2.getSubtitleTextView().setVisibility(8);
            }
            o47 o47Var3 = this.c0;
            o47Var3.b = true;
            o47Var3.setStoriesForceState(1);
            ArrayList arrayList = k27Var.p0;
            if (arrayList != null) {
                this.c0.getAvatarImageView().h(gl5.f(ba4.w(arrayList, gl.Y0(false), false, null, false), k27Var.n0), "50_50", gl5.f(ba4.w(k27Var.p0, 50, false, null, false), k27Var.n0), "b1", 0, this.n);
                this.c0.setClipChildren(false);
                this.c0.getAvatarImageView().setScaleX(0.96f);
                this.c0.getAvatarImageView().setScaleY(0.96f);
                return;
            }
            return;
        }
        o47Var.setTitle(k96.M0(2131746904, null));
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.b));
        if (K0 != null && !this.Z) {
            this.c0.setChatAvatar(K0);
        }
    }

    public final void k0() {
        TLRPC.ChatFull chatFull;
        if (this.e0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            r6 t = this.actionBar.t();
            ArrayList arrayList = t.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            t.removeAllViews();
            t.a(0, 2131231247).e(1, 2131232383, k96.M0(2131743317, null));
        }
    }

    public final void l0() {
        rs rsVar = this.S;
        rsVar.clear();
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.O = -1;
        this.R = 0;
        if (this.G && this.E) {
            gl.r(this.a0);
            if (this.b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new v85(this, (byte) 18));
                this.b0.setVisibility(0);
                this.b0.setAlpha(0.0f);
                this.b0.animate().alpha(1.0f).start();
            }
            int i = this.R;
            this.P = i;
            this.O = i + 1;
            this.R = i + 3;
            rsVar.add(Integer.valueOf(i + 2));
            if (this.r != null) {
                int i2 = this.R;
                this.M = i2;
                this.R = i2 + 2;
                rsVar.add(Integer.valueOf(i2 + 1));
            }
            if (this.s != null) {
                int i3 = this.R;
                this.N = i3;
                this.R = i3 + 2;
                rsVar.add(Integer.valueOf(i3 + 1));
            }
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                int i4 = this.R;
                int i5 = i4 + 1;
                this.R = i5;
                this.I = i4;
                this.J = i5;
                int size = arrayList.size() + i5;
                this.K = size;
                this.Q = size;
                this.R = size + 2;
                rsVar.add(Integer.valueOf(size + 1));
                if (!this.W) {
                    int i6 = this.R;
                    this.R = i6 + 1;
                    this.L = i6;
                }
            }
        }
        q47 q47Var = this.d;
        if (q47Var != null) {
            q47Var.f();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            h0();
            g0();
        } else {
            na7.q1(this.currentAccount).X2(this.classGuid, this.b, true);
        }
        kk7.f(this.currentAccount).b(this, kk7.S);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.S);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gl.W2(getParentActivity(), this.classGuid);
        q47 q47Var = this.d;
        if (q47Var != null) {
            q47Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            o47 o47Var = this.c0;
            if (o47Var != null) {
                o47Var.i(bkb.v0(bkb.Ej, getResourceProvider()), bkb.v0(bkb.Fj, getResourceProvider()));
            }
            b0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public s47(long j, k27 k27Var, boolean z) {
        super(null);
        this.w = new iq(15);
        this.y = new ArrayList();
        this.H = null;
        this.S = new rs(0);
        this.a0 = new ez3(this, (byte) 29);
        this.n = k27Var;
        this.c = 0;
        this.b = j;
        this.a = getMessagesController().L0(j);
        this.e0 = z;
    }
}
