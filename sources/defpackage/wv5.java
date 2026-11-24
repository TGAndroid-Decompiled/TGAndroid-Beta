package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
public final class wv5 extends my0 {
    public static ArrayList C1;
    public static long D1;
    public static long E1;
    public static int F1;
    public boolean A1;
    public uv5 B1;
    public Drawable l1;
    public boolean m1;
    public int n1;
    public kb2 o1;
    public sv5 p1;
    public TextView q1;
    public TextView r1;
    public ArrayList s1;
    public boolean t1;
    public int u1;
    public int v1;
    public TLRPC.Peer w1;
    public TLRPC.Peer x1;
    public TLRPC.InputPeer y1;
    public boolean z1;

    public static void D0(Activity activity, long j, j5 j5Var, ue7 ue7Var) {
        int i = F1;
        int i2 = j5Var.a;
        boolean z = true;
        if (i == i2 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 240000) {
            if (C1.size() != 1) {
                z = false;
            }
            ue7Var.z(z);
            return;
        }
        he heVar = new he(3, null, activity);
        TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
        getgroupcalljoinas.peer = oc7.r1(i2).i1(j);
        heVar.setOnCancelListener(new pv5(j5Var, ConnectionsManager.getInstance(i2).sendRequest(getgroupcalljoinas, new eu0(heVar, j, j5Var, ue7Var)), (byte) 1));
        try {
            heVar.q(500L);
        } catch (Exception unused) {
        }
    }

    public static void E0(Context context, long j, j5 j5Var, d dVar, int i, TLRPC.Peer peer, uv5 uv5Var) {
        if (context != null) {
            int i2 = F1;
            int i3 = j5Var.a;
            if (i2 == i3 && E1 == j && C1 != null && SystemClock.elapsedRealtime() - D1 < 300000) {
                if (C1.size() == 1 && i != 0) {
                    uv5Var.a(oc7.r1(i3).i1(k47.B1((TLRPC.Peer) C1.get(0))), false, false, false);
                    return;
                } else {
                    F0(context, j, C1, dVar, i, peer, uv5Var);
                    return;
                }
            }
            he heVar = new he(3, null, context);
            TL_phone.getGroupCallJoinAs getgroupcalljoinas = new TL_phone.getGroupCallJoinAs();
            getgroupcalljoinas.peer = oc7.r1(i3).i1(j);
            heVar.setOnCancelListener(new pv5(j5Var, ConnectionsManager.getInstance(i3).sendRequest(getgroupcalljoinas, new l15(heVar, j5Var, uv5Var, j, context, dVar, i, peer)), (byte) 0));
            try {
                heVar.q(500L);
            } catch (Exception unused) {
            }
        }
    }

    public static void F0(Context context, long j, ArrayList arrayList, d dVar, int i, TLRPC.Peer peer, uv5 uv5Var) {
        int i2;
        rv5 rv5Var;
        boolean z;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                return;
            }
            a23 a23Var = new a23(dVar, arrayList, j, uv5Var);
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(a23Var);
                return;
            } else {
                a23Var.show();
                return;
            }
        }
        ?? my0Var = new my0(context, false);
        my0Var.w0 = false;
        ArrayList arrayList2 = new ArrayList(arrayList);
        my0Var.s1 = arrayList2;
        my0Var.B1 = uv5Var;
        my0Var.v1 = i;
        Drawable d = b10.d(context, 2131232745);
        my0Var.l1 = d;
        if (i == 2) {
            if (VoIPService.getSharedInstance() != null) {
                long selfId = VoIPService.getSharedInstance().getSelfId();
                int size = arrayList2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    TLRPC.Peer peer2 = (TLRPC.Peer) my0Var.s1.get(i3);
                    if (k47.B1(peer2) == selfId) {
                        my0Var.x1 = peer2;
                        my0Var.w1 = peer2;
                        break;
                    }
                    i3++;
                }
            } else if (peer != null) {
                long B1 = k47.B1(peer);
                int size2 = arrayList2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size2) {
                        break;
                    }
                    TLRPC.Peer peer3 = (TLRPC.Peer) my0Var.s1.get(i4);
                    if (k47.B1(peer3) == B1) {
                        my0Var.x1 = peer3;
                        my0Var.w1 = peer3;
                        break;
                    }
                    i4++;
                }
            } else {
                my0Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            }
            Drawable drawable = my0Var.l1;
            i2 = cmb.w0(null, cmb.Vg, false);
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        } else {
            int w0 = cmb.w0(null, cmb.g5, false);
            d.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
            my0Var.m1 = true;
            my0Var.n1 = w0;
            my0Var.w1 = (TLRPC.Peer) arrayList2.get(0);
            i2 = w0;
        }
        my0Var.K(i2);
        if (my0Var.v1 == 0) {
            ?? qv5Var = new qv5(my0Var, context);
            qv5Var.setOrientation(1);
            ?? nestedScrollView = new NestedScrollView(context);
            nestedScrollView.addView(qv5Var);
            my0Var.O = nestedScrollView;
            rv5Var = qv5Var;
        } else {
            rv5 rv5Var2 = new rv5(my0Var, context);
            my0Var.b = rv5Var2;
            rv5Var2.setWillNotDraw(false);
            ViewGroup viewGroup = my0Var.b;
            int i5 = my0Var.u0;
            viewGroup.setPadding(i5, 0, i5, 0);
            rv5Var = rv5Var2;
        }
        TLRPC.Chat L0 = oc7.r1(my0Var.a).L0(Long.valueOf(-j));
        sv5 sv5Var = new sv5(my0Var, context);
        my0Var.p1 = sv5Var;
        my0Var.getContext();
        sv5Var.setLayoutManager(new u46(my0Var.v1 == 0 ? 0 : 1, false));
        sv5Var.setAdapter(new vv5(my0Var, context));
        sv5Var.setVerticalScrollBarEnabled(false);
        sv5Var.setClipToPadding(false);
        sv5Var.setEnabled(true);
        sv5Var.setSelectorDrawableColor(0);
        anb.l(sv5Var, 21, cmb.z5, null);
        sv5Var.setOnScrollListener(new tv5(my0Var));
        sv5Var.setOnItemClickListener(new k0(my0Var, L0, (byte) 14));
        if (i != 0) {
            rv5Var.addView(sv5Var, qoe.d(-1, -1.0f, 51, 0.0f, 100.0f, 0.0f, 80.0f));
        } else {
            sv5Var.setSelectorDrawableColor(0);
            sv5Var.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
            ?? imageView = new ImageView(context);
            imageView.setAutoRepeat(true);
            imageView.f(2131624323, 120, 120, null);
            imageView.d();
            rv5Var.addView(imageView, qoe.t(160, 160, 49, 17, 8, 17, 0));
        }
        TextView textView = new TextView(context);
        my0Var.q1 = textView;
        wi8.v(textView, 1, 20.0f);
        if (i == 2) {
            anb.X(textView, cmb.dh, null);
        } else {
            anb.X(textView, cmb.i5, null);
        }
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (i == 0) {
            if (sd2.W(L0)) {
                textView.setText(jb6.M0(2131744592, null));
            } else {
                textView.setText(jb6.M0(2131744589, null));
            }
            rv5Var.addView(textView, qoe.t(-2, -2, 49, 23, 16, 23, 0));
        } else {
            if (i == 2) {
                textView.setText(jb6.M0(2131743070, null));
            } else if (sd2.W(L0)) {
                textView.setText(jb6.M0(2131743160, null));
            } else {
                textView.setText(jb6.M0(2131743052, null));
            }
            rv5Var.addView(textView, qoe.d(-2, -2.0f, 51, 23.0f, 8.0f, 23.0f, 0.0f));
        }
        TextView textView2 = new TextView(my0Var.getContext());
        my0Var.r1 = textView2;
        if (i == 2) {
            anb.X(textView2, cmb.eh, null);
        } else {
            anb.X(textView2, cmb.q5, null);
        }
        textView2.setTextSize(1, 14.0f);
        int size3 = my0Var.s1.size();
        for (int i6 = 0; i6 < size3; i6++) {
            long B12 = k47.B1((TLRPC.Peer) my0Var.s1.get(i6));
            if (B12 < 0) {
                TLRPC.Chat L02 = oc7.r1(my0Var.a).L0(Long.valueOf(-B12));
                if (!sd2.T(L02) || L02.megagroup) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        my0Var.r1.setMovementMethod(new cm((byte) 0));
        anb.G(my0Var.r1, cmb.j5, null);
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            if (sd2.T(L0) && !L0.megagroup) {
                sb.append(jb6.M0(2131743142, null));
            } else {
                sb.append(jb6.M0(2131743017, null));
            }
            if (my0Var.s1.size() > 1) {
                sb.append("\n\n");
                sb.append(jb6.M0(2131743127, null));
            } else {
                my0Var.p1.setVisibility(8);
            }
            my0Var.r1.setText(sb);
            my0Var.r1.setGravity(49);
            rv5Var.addView(my0Var.r1, qoe.t(-2, -2, 49, 23, 0, 23, 5));
        } else {
            TextView textView3 = my0Var.r1;
            if (z) {
                textView3.setText(jb6.M0(2131743015, null));
            } else {
                textView3.setText(jb6.M0(2131743016, null));
            }
            my0Var.r1.setGravity((jb6.a0 ? 5 : 3) | 48);
            rv5Var.addView(my0Var.r1, qoe.d(-2, -2.0f, 51, 23.0f, 0.0f, 23.0f, 5.0f));
        }
        if (i == 0) {
            rv5Var.addView(my0Var.p1, qoe.t(my0Var.s1.size() < 5 ? -2 : -1, 95, 49, 0, 6, 0, 0));
        }
        kb2 kb2Var = new kb2(my0Var, context, false);
        my0Var.o1 = kb2Var;
        ((View) kb2Var.d).setOnClickListener(new tf3(my0Var, uv5Var, (byte) 28));
        if (my0Var.v1 == 0) {
            rv5Var.addView(kb2Var, qoe.t(-1, 50, 51, 0, 0, 0, 0));
            kb2 kb2Var2 = new kb2(my0Var, context, true);
            if (sd2.W(L0)) {
                kb2Var2.a(jb6.M0(2131743146, null), false);
            } else {
                kb2Var2.a(jb6.M0(2131743025, null), false);
            }
            ((View) kb2Var2.d).setOnClickListener(new ca5(my0Var, (byte) 14));
            rv5Var.addView(kb2Var2, qoe.t(-1, 50, 51, 0, 0, 0, 0));
        } else {
            rv5Var.addView(kb2Var, qoe.d(-1, 50.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        my0Var.G0(L0, false);
        if (dVar != 0) {
            if (dVar.getParentActivity() != null) {
                dVar.showDialog(my0Var);
                return;
            }
            return;
        }
        my0Var.show();
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void G0(TLRPC.Chat chat, boolean z) {
        String str;
        kb2 kb2Var = this.o1;
        if (this.v1 == 0) {
            if (sd2.W(chat)) {
                kb2Var.a(jb6.a0("VoipChannelStartVoiceChat", null, 2131743139, new Object[0]), z);
                return;
            } else {
                kb2Var.a(jb6.a0("VoipGroupStartVoiceChat", null, 2131743008, new Object[0]), z);
                return;
            }
        }
        long B1 = k47.B1(this.w1);
        boolean D = pg3.D(B1);
        int i = this.a;
        if (D) {
            kb2Var.a(jb6.a0("VoipGroupContinueAs", null, 2131743075, m9c.k(oc7.r1(i).W1(Long.valueOf(B1)), true)), z);
            return;
        }
        TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-B1));
        if (L0 != null) {
            str = L0.title;
        } else {
            str = "";
        }
        kb2Var.a(jb6.a0("VoipGroupContinueAs", null, 2131743075, str), z);
    }

    @Override
    public final void H() {
        super.H();
        TLRPC.InputPeer inputPeer = this.y1;
        if (inputPeer != null) {
            uv5 uv5Var = this.B1;
            boolean z = true;
            if (this.s1.size() <= 1) {
                z = false;
            }
            uv5Var.a(inputPeer, z, this.z1, false);
        }
    }

    public final void H0() {
        sv5 sv5Var = this.p1;
        if (this.v1 != 0) {
            if (sv5Var.getChildCount() <= 0) {
                int paddingTop = sv5Var.getPaddingTop();
                this.u1 = paddingTop;
                sv5Var.setTopGlowOffset(paddingTop);
                this.b.invalidate();
                return;
            }
            int i = 0;
            View childAt = sv5Var.getChildAt(0);
            b59 b59Var = (b59) sv5Var.G(childAt);
            int top = childAt.getTop() - gm.L(9.0f);
            if (top > 0 && b59Var != null && b59Var.b() == 0) {
                i = top;
            }
            if (this.u1 != i) {
                this.q1.setTranslationY(gm.L(19.0f) + top);
                this.r1.setTranslationY(gm.L(56.0f) + top);
                this.u1 = i;
                sv5Var.setTopGlowOffset(i);
                this.b.invalidate();
            }
        }
    }

    @Override
    public final void p0() {
        Drawable drawable;
        super.p0();
        try {
            int w0 = cmb.w0(null, cmb.g5, false);
            if (this.m1 && (drawable = this.l1) != null && w0 != this.n1) {
                this.n1 = w0;
                drawable.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.MULTIPLY));
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
