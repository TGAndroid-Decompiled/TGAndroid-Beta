package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.l;
public final class rw1 implements View.OnClickListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public rw1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i;
        int i2;
        int i3;
        ?? r17;
        byte b;
        ?? r16;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        ChatActivityEnterView chatActivityEnterView;
        float f;
        jz1 jz1Var;
        sy1 sy1Var;
        ChatActivityEnterView.RecordCircle recordCircle;
        String str;
        l49 l49Var;
        s09 s09Var;
        boolean z4;
        float f2;
        float f3;
        int i5;
        int i6;
        int i7;
        float f4;
        float f5;
        float f6;
        uz1 uz1Var;
        TLRPC.Peer peer2 = null;
        int i8 = 0;
        r4 = false;
        boolean z5 = false;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i9 = ChatActivityEnterView.z7;
                gb gbVar = chatActivityEnterView2.V;
                if ((gbVar == null || !gbVar.f) && chatActivityEnterView2.G != 0.0f) {
                    chatActivityEnterView2.P3.O0();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                int i10 = ChatActivityEnterView.z7;
                yv1 yv1Var = chatActivityEnterView3.F3;
                if (!chatActivityEnterView3.w7 ? chatActivityEnterView3.getTranslationY() != 0.0f : chatActivityEnterView3.R0()) {
                    chatActivityEnterView3.s0 = new mw1(chatActivityEnterView3, (byte) 9);
                    if (chatActivityEnterView3.w7) {
                        chatActivityEnterView3.K0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView3.K0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView3.P3.j() > gm.L(20.0f)) {
                    int B0 = chatActivityEnterView3.P3.B0();
                    int j = chatActivityEnterView3.P3.j();
                    if (j <= gm.L(20.0f)) {
                        B0 += j;
                    }
                    if (chatActivityEnterView3.X0) {
                        B0 -= chatActivityEnterView3.getEmojiPadding();
                    }
                    if (B0 < gm.L(200.0f)) {
                        chatActivityEnterView3.v0 = new mw1(chatActivityEnterView3, (byte) 10);
                        chatActivityEnterView3.R();
                        return;
                    }
                }
                if (chatActivityEnterView3.P3.x() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    hy1 hy1Var = chatActivityEnterView3.r0;
                    if (hy1Var != null) {
                        hy1Var.e = false;
                        hy1Var.l(new zna[0]);
                        return;
                    }
                    oc7 r1 = oc7.r1(chatActivityEnterView3.R);
                    if (chatActivityEnterView3.w7) {
                        peer = chatActivityEnterView3.P3.l();
                    } else {
                        oc7.r1(chatActivityEnterView3.R).L0(Long.valueOf(-chatActivityEnterView3.G3));
                        TLRPC.ChatFull M0 = oc7.r1(chatActivityEnterView3.R).M0(-chatActivityEnterView3.G3);
                        if (M0 != null) {
                            peer2 = M0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = M0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView3.P3.x() != null && !chatActivityEnterView3.P3.x().peers.isEmpty()) {
                        peer = chatActivityEnterView3.P3.x().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = sd2.V(r1.L0(Long.valueOf(-chatActivityEnterView3.G3)));
                    if (chatActivityEnterView3.w7) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView3.getParent();
                    } else {
                        yv1Var.getParentLayout().getOverlayContainerView();
                    }
                    hy1 hy1Var2 = new hy1(chatActivityEnterView3, chatActivityEnterView3.getContext(), chatActivityEnterView3.F3, r1, V, peer4, chatActivityEnterView3.P3.x(), new jf(chatActivityEnterView3, peer2, r1, (byte) 19), chatActivityEnterView3.L4);
                    chatActivityEnterView3.r0 = hy1Var2;
                    hy1Var2.e = true;
                    hy1Var2.c = (short) 220;
                    hy1Var2.setOutsideTouchable(true);
                    chatActivityEnterView3.r0.setClippingEnabled(true);
                    chatActivityEnterView3.r0.setFocusable(true);
                    chatActivityEnterView3.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView3.r0.setInputMethodMode(2);
                    chatActivityEnterView3.r0.setSoftInputMode(0);
                    chatActivityEnterView3.r0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView3.r0.b = false;
                    int i11 = -gm.L(4.0f);
                    int[] iArr = new int[2];
                    if (gm.O1() && yv1Var != null) {
                        yv1Var.getFragmentView().getLocationInWindow(iArr);
                        i = iArr[0] + i11;
                    } else {
                        i = i11;
                    }
                    int B02 = chatActivityEnterView3.P3.B0();
                    int measuredHeight = chatActivityEnterView3.r0.getContentView().getMeasuredHeight();
                    int j2 = chatActivityEnterView3.P3.j();
                    if (j2 <= gm.L(20.0f)) {
                        B02 += j2;
                    }
                    if (chatActivityEnterView3.X0) {
                        B02 -= chatActivityEnterView3.getEmojiPadding();
                    }
                    int i12 = (i11 << 1) + B02;
                    if (yv1Var != null && yv1Var.isInBubbleMode()) {
                        i2 = 0;
                    } else {
                        i2 = gm.m;
                    }
                    if (measuredHeight < (i12 - i2) - chatActivityEnterView3.r0.p.getMeasuredHeight()) {
                        chatActivityEnterView3.getLocationInWindow(iArr);
                        i3 = ((iArr[1] - measuredHeight) - i11) - gm.L(2.0f);
                    } else {
                        if (yv1Var != null && yv1Var.isInBubbleMode()) {
                            i3 = 0;
                        } else {
                            i3 = gm.m;
                        }
                        chatActivityEnterView3.r0.o.getLayoutParams().height = ((B02 - i3) - gm.L(14.0f)) - chatActivityEnterView3.getHeightWithTopView();
                    }
                    final hy1 hy1Var3 = chatActivityEnterView3.r0;
                    View view2 = hy1Var3.u;
                    r59 r59Var = hy1Var3.v;
                    TLRPC.Peer peer5 = hy1Var3.r;
                    f6a f6aVar = hy1Var3.o;
                    ne6 ne6Var = hy1Var3.t;
                    ArrayList arrayList = hy1Var3.z;
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = arrayList.get(i13);
                        i13++;
                        ((zna) obj).d();
                    }
                    arrayList.clear();
                    ne6Var.setPivotX(gm.L(8.0f));
                    ne6Var.setPivotY(ne6Var.getMeasuredHeight() - gm.L(8.0f));
                    f6aVar.setPivotX(0.0f);
                    f6aVar.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = hy1Var3.s.peers;
                    if (peer5 != null) {
                        int L = gm.L(54.0f);
                        r17 = 2;
                        int size2 = arrayList2.size() * L;
                        b = 1;
                        r16 = 3;
                        int i14 = 0;
                        while (i14 < arrayList2.size()) {
                            TLRPC.Peer peer6 = arrayList2.get(i14).peer;
                            View view3 = view2;
                            r59 r59Var2 = r59Var;
                            long j3 = peer6.channel_id;
                            if (j3 == 0 || j3 != peer5.channel_id) {
                                long j4 = peer6.user_id;
                                if (j4 == 0 || j4 != peer5.user_id) {
                                    long j5 = peer6.chat_id;
                                    if (j5 == 0 || j5 != peer5.chat_id) {
                                        i14++;
                                        view2 = view3;
                                        r59Var = r59Var2;
                                    }
                                }
                            }
                            if (i14 != arrayList2.size() - 1 && r59Var2.getMeasuredHeight() < size2) {
                                i4 = r59Var2.getMeasuredHeight() % L;
                            } else {
                                i4 = 0;
                            }
                            hy1Var3.w.g1(i14, (size2 - ((arrayList2.size() - 2) * L)) + gm.L(7.0f) + i4);
                            if (r59Var2.computeVerticalScrollOffset() > 0) {
                                view3.animate().cancel();
                                view3.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else {
                        r17 = 2;
                        b = 1;
                        r16 = 3;
                    }
                    ne6Var.setScaleX(0.25f);
                    ne6Var.setScaleY(0.25f);
                    f6aVar.setAlpha(0.25f);
                    zna znaVar = new zna(ne6Var, zna.q);
                    znaVar.m = aq1.j(1.0f, 750.0f, 1.0f);
                    znaVar.b(new it3() {
                        @Override
                        public final void a(zna znaVar2, float f7, float f8) {
                            byte b2 = r2;
                            hy1 hy1Var4 = hy1Var3;
                            switch (b2) {
                                case 0:
                                    hy1Var4.o.setScaleX(1.0f / f7);
                                    return;
                                default:
                                    hy1Var4.o.setScaleY(1.0f / f7);
                                    return;
                            }
                        }
                    });
                    zna znaVar2 = new zna(ne6Var, zna.r);
                    znaVar2.m = aq1.j(1.0f, 750.0f, 1.0f);
                    final byte b2 = b;
                    znaVar2.b(new it3() {
                        @Override
                        public final void a(zna znaVar22, float f7, float f8) {
                            byte b22 = b2;
                            hy1 hy1Var4 = hy1Var3;
                            switch (b22) {
                                case 0:
                                    hy1Var4.o.setScaleX(1.0f / f7);
                                    return;
                                default:
                                    hy1Var4.o.setScaleY(1.0f / f7);
                                    return;
                            }
                        }
                    });
                    gt3 gt3Var = zna.v;
                    zna znaVar3 = new zna(ne6Var, gt3Var);
                    znaVar3.m = aq1.j(1.0f, 750.0f, 1.0f);
                    zna znaVar4 = new zna(f6aVar, gt3Var);
                    znaVar4.m = aq1.j(1.0f, 750.0f, 1.0f);
                    zna[] znaVarArr = new zna[4];
                    znaVarArr[0] = znaVar;
                    znaVarArr[1] = znaVar2;
                    znaVarArr[r17] = znaVar3;
                    znaVarArr[r16] = znaVar4;
                    for (zna znaVar5 : Arrays.asList(znaVarArr)) {
                        arrayList.add(znaVar5);
                        znaVar5.a(new w21(hy1Var3, znaVar5, (byte) 7));
                        znaVar5.h();
                    }
                    hy1 hy1Var4 = chatActivityEnterView3.r0;
                    chatActivityEnterView3.t0 = i;
                    chatActivityEnterView3.u0 = i3;
                    hy1Var4.showAtLocation(view, 51, i, i3);
                    chatActivityEnterView3.q0.setProgress(1.0f);
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                int i15 = ChatActivityEnterView.z7;
                yv1 yv1Var2 = chatActivityEnterView4.F3;
                rx1 rx1Var = chatActivityEnterView4.R0;
                if (chatActivityEnterView4.n0()) {
                    if (chatActivityEnterView4.C6 == null) {
                        chatActivityEnterView4.D6 = true;
                        if (chatActivityEnterView4.B0) {
                            f = 0.5f;
                        } else {
                            f = 1.0f;
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView4.C6 = ofFloat;
                        ofFloat.addUpdateListener(new go1(chatActivityEnterView4, f, (byte) 1));
                        chatActivityEnterView4.C6.addListener(new t7(chatActivityEnterView4, f, (byte) 3));
                        chatActivityEnterView4.C6.setDuration(180L);
                        chatActivityEnterView4.C6.setInterpolator(d53.i);
                        chatActivityEnterView4.C6.start();
                        return;
                    }
                    return;
                }
                gb gbVar2 = chatActivityEnterView4.V;
                if (gbVar2 == null || !gbVar2.f) {
                    if (rx1Var.x) {
                        bu5 bu5Var = chatActivityEnterView4.c7;
                        if (bu5Var != null) {
                            bu5Var.u();
                            chatActivityEnterView4.c7 = null;
                            return;
                        }
                        sy1 sy1Var2 = chatActivityEnterView4.F0;
                        if (sy1Var2 != null && yv1Var2 != null) {
                            sy1Var2.m();
                            ?? r3 = chatActivityEnterView4.c2;
                            if (r3 != null) {
                                chatActivityEnterView = r3;
                            } else {
                                chatActivityEnterView = chatActivityEnterView4;
                            }
                            bu5 bu5Var2 = new bu5(chatActivityEnterView, chatActivityEnterView4.L4, rx1Var, false, false, true);
                            bu5Var2.a0 = gm.L(280.0f);
                            yv1.E6(new t27(bu5Var2, chatActivityEnterView4.F0), yv1Var2.h, true, true, true, true);
                            bu5Var2.X = true;
                            bu5Var2.p = new uj1(chatActivityEnterView4, bu5Var2, (byte) 29);
                            chatActivityEnterView4.c7 = bu5Var2;
                            bu5Var2.a0();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView4.B0) {
                        chatActivityEnterView4.a2();
                        return;
                    } else if (chatActivityEnterView4.R0() && chatActivityEnterView4.V2 == 0) {
                        if (chatActivityEnterView4.H2 != 0) {
                            chatActivityEnterView4.R1(0, true);
                            jz1 jz1Var2 = chatActivityEnterView4.V0;
                            if (jz1Var2 != null) {
                                jz1Var2.r(false);
                            }
                            sy1 sy1Var3 = chatActivityEnterView4.F0;
                            if (sy1Var3 != null) {
                                sy1Var3.requestFocus();
                            }
                        }
                        if (chatActivityEnterView4.p4) {
                            chatActivityEnterView4.S1(false, true, false, true);
                            chatActivityEnterView4.b4 = true;
                            gm.d3(new gx1(chatActivityEnterView4, (byte) 1), 200L);
                            return;
                        }
                        chatActivityEnterView4.k1();
                        return;
                    } else {
                        chatActivityEnterView4.Z1(1, 0, true, true);
                        jz1 jz1Var3 = chatActivityEnterView4.V0;
                        sy1 sy1Var4 = chatActivityEnterView4.F0;
                        if (sy1Var4 != null && sy1Var4.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (yv1Var2 != null) {
                            hg5 hg5Var = yv1Var2.N1;
                            if (hg5Var != null) {
                                if (hg5Var.W) {
                                    hg5Var.f(true);
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            yv1Var2.N1 = null;
                            if (z3) {
                                z2 = true;
                                jz1Var3.A(z, z2);
                                return;
                            }
                        }
                        z2 = false;
                        jz1Var3.A(z, z2);
                        return;
                    }
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                int i16 = ChatActivityEnterView.z7;
                gb gbVar3 = chatActivityEnterView5.V;
                if ((gbVar3 == null || !gbVar3.f) && chatActivityEnterView5.G != 0.0f) {
                    chatActivityEnterView5.P3.R1();
                    return;
                }
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                int i17 = ChatActivityEnterView.z7;
                chatActivityEnterView6.l1();
                return;
            case 5:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                int i18 = ChatActivityEnterView.z7;
                uz1 uz1Var2 = chatActivityEnterView7.P3;
                if (uz1Var2 != null) {
                    uz1Var2.f0();
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                int i19 = ChatActivityEnterView.z7;
                if (chatActivityEnterView8.R2 != null) {
                    if (chatActivityEnterView8.d0 - chatActivityEnterView8.e0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView8.c0;
                        if (numberTextView != null) {
                            gm.A3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView8.c0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    pz1 A = chatActivityEnterView8.A();
                    chatActivityEnterView8.S2 = A;
                    q51 d = q51.d(chatActivityEnterView8.R);
                    String str2 = chatActivityEnterView8.R2.link;
                    String str3 = A.a;
                    ArrayList<TLRPC.MessageEntity> arrayList3 = A.b;
                    gx1 gx1Var = new gx1(chatActivityEnterView8, (byte) 2);
                    TL_account.TL_businessChatLink c = d.c(str2);
                    if (c != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList3;
                        tL_inputBusinessChatLink.title = c.title;
                        d.b(c, tL_inputBusinessChatLink, gx1Var);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                int i20 = ChatActivityEnterView.z7;
                if (chatActivityEnterView9.T0.getVisibility() == 0 && chatActivityEnterView9.T0.getAlpha() == 1.0f && !chatActivityEnterView9.a4) {
                    if (!chatActivityEnterView9.p3 || (sy1Var = chatActivityEnterView9.F0) == null || !sy1Var.isFocused()) {
                        if (chatActivityEnterView9.p4) {
                            if (chatActivityEnterView9.H2 != 0) {
                                chatActivityEnterView9.R1(0, true);
                                chatActivityEnterView9.V0.r(true);
                                chatActivityEnterView9.V0.y();
                                if (chatActivityEnterView9.o4) {
                                    chatActivityEnterView9.M(true);
                                }
                            } else if (!chatActivityEnterView9.u4 && (jz1Var = chatActivityEnterView9.V0) != null) {
                                jz1Var.N(false);
                            }
                        } else if (!chatActivityEnterView9.u4) {
                            chatActivityEnterView9.V0.N(true);
                        }
                        if (!chatActivityEnterView9.u4) {
                            chatActivityEnterView9.S1(!chatActivityEnterView9.p4, true, false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                int i21 = ChatActivityEnterView.z7;
                if (chatActivityEnterView10.g0() && chatActivityEnterView10.v3 && (recordCircle = chatActivityEnterView10.D2) != null && ChatActivityEnterView.this.h5) {
                    chatActivityEnterView10.m0(false, false);
                    un3 un3Var = chatActivityEnterView10.j1;
                    if (un3Var != null && un3Var.q()) {
                        un3 un3Var2 = chatActivityEnterView10.j1;
                        if (un3Var2.o0 && un3Var2.q()) {
                            un3Var2.t();
                        }
                    } else {
                        un3 un3Var3 = chatActivityEnterView10.j1;
                        if (un3Var3 != null && un3Var3.p()) {
                            sy1 sy1Var5 = chatActivityEnterView10.F0;
                            if (sy1Var5 != null) {
                                sy1Var5.setText("");
                            }
                            chatActivityEnterView10.j1.m();
                        }
                    }
                    if (chatActivityEnterView10.v3) {
                        chatActivityEnterView10.v3 = false;
                        chatActivityEnterView10.Y1 = 0L;
                        chatActivityEnterView10.w2(2, true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView11 = this.b;
                int i22 = ChatActivityEnterView.z7;
                sy1 sy1Var6 = chatActivityEnterView11.F0;
                if (sy1Var6 == null) {
                    str = "";
                } else {
                    str = sy1Var6.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView11.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView11.setFieldText("");
                    return;
                }
            case 10:
                ChatActivityEnterView chatActivityEnterView12 = this.b;
                int i23 = ChatActivityEnterView.z7;
                AnimatorSet animatorSet = chatActivityEnterView12.j3;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    int[] iArr2 = chatActivityEnterView12.S1;
                    int[] iArr3 = chatActivityEnterView12.R1;
                    if (chatActivityEnterView12.K1 && !chatActivityEnterView12.U1 && (l49Var = chatActivityEnterView12.i1) != null && chatActivityEnterView12.R3 != null && l49Var.getVisibility() == 0 && chatActivityEnterView12.i1.getWidth() > 0 && (s09Var = chatActivityEnterView12.h1) != null) {
                        if (chatActivityEnterView12.i1.T0 == null) {
                            s09Var.getLocationInWindow(iArr3);
                            chatActivityEnterView12.i1.getLocationInWindow(iArr2);
                            float width = (chatActivityEnterView12.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                            float height = ((chatActivityEnterView12.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - gm.L(3.0f);
                            TLRPC.TL_document tL_document = chatActivityEnterView12.R3;
                            chatActivityEnterView12.y5 = null;
                            gm.d3(new uj1(chatActivityEnterView12, tL_document, (byte) 28), 100L);
                            try {
                                chatActivityEnterView12.h1.performHapticFeedback(3, 2);
                            } catch (Exception unused3) {
                            }
                            l lVar = chatActivityEnterView12.E2;
                            if (lVar != null) {
                                lVar.invalidate();
                            }
                            chatActivityEnterView12.D5 = 0.0f;
                            chatActivityEnterView12.C5 = 0.0f;
                            ValueAnimator valueAnimator = chatActivityEnterView12.B5;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            chatActivityEnterView12.B5 = ofFloat2;
                            ofFloat2.setDuration(160L);
                            chatActivityEnterView12.B5.setInterpolator(d53.g);
                            chatActivityEnterView12.B5.addUpdateListener(new bx1(chatActivityEnterView12, (byte) 9));
                            chatActivityEnterView12.B5.start();
                            l49 l49Var2 = chatActivityEnterView12.i1;
                            wx1 wx1Var = new wx1(chatActivityEnterView12);
                            lta ltaVar = l49Var2.J0;
                            RectF rectF = l49Var2.f0;
                            if (l49Var2.T0 == null && !l49Var2.X0) {
                                int width2 = l49Var2.getWidth();
                                int height2 = l49Var2.getHeight();
                                if (l49Var2.d0 && width2 > 0 && height2 > 0) {
                                    l49Var2.setPlaying(false);
                                    l49Var2.p0 = false;
                                    l49Var2.W = false;
                                    try {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                        float f7 = width2;
                                        rectF.set(0.0f, 0.0f, f7, height2);
                                        l49Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                        int[] iArr4 = new int[width2 * height2];
                                        createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                        int i24 = width2;
                                        int i25 = height2;
                                        l49Var2.a1 = l49Var2.f();
                                        if (width < f7 / 2.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        l49Var2.Z0 = z4;
                                        int max = Math.max(1, Math.round(gm.p * 0.75f));
                                        int i26 = 0;
                                        for (int i27 = 0; i27 < i25; i27 += max) {
                                            for (int i28 = 0; i28 < i24; i28 += max) {
                                                int i29 = iArr4[(i27 * i24) + i28];
                                                int i30 = i8;
                                                if ((i29 >>> 24) > 60) {
                                                    if (l49Var2.e(i29)) {
                                                        i26++;
                                                    } else {
                                                        i8 = i30 + 1;
                                                    }
                                                }
                                                i8 = i30;
                                            }
                                        }
                                        if (i26 > 1100) {
                                            f2 = 1100.0f / i26;
                                        } else {
                                            f2 = 1.0f;
                                        }
                                        if (i8 > 0) {
                                            f3 = Math.min(1.0f, 360.0f / i8);
                                        } else {
                                            f3 = 0.0f;
                                        }
                                        ltaVar.a();
                                        ltaVar.S = 0.0f;
                                        ltaVar.R = 0.0f;
                                        ltaVar.e(l49Var2.a1);
                                        float f8 = gm.p;
                                        int i31 = 0;
                                        int i32 = 0;
                                        int i33 = 0;
                                        while (i31 < i25) {
                                            int i34 = 0;
                                            while (i34 < i24) {
                                                int i35 = i24;
                                                int i36 = iArr4[(i31 * i24) + i34];
                                                float f9 = f2;
                                                int i37 = i25;
                                                if ((i36 >>> 24) > 60) {
                                                    i33++;
                                                    int i38 = i33 * 7;
                                                    float c2 = l49.c(i38 + 3);
                                                    if (l49Var2.e(i36)) {
                                                        f5 = f9;
                                                    } else {
                                                        f5 = f3;
                                                    }
                                                    if (c2 <= f5) {
                                                        if (l49Var2.Z0) {
                                                            f6 = i34 / f7;
                                                        } else {
                                                            f6 = 1.0f - (i34 / f7);
                                                        }
                                                        float c3 = l49.c(i38 + 13) * 0.04f;
                                                        float c4 = l49.c(i38 + 11);
                                                        float f10 = i34;
                                                        float f11 = c4 - 0.5f;
                                                        i6 = i34;
                                                        float f12 = max;
                                                        float f13 = (f11 * f12) + f10;
                                                        i7 = max;
                                                        float f14 = i31;
                                                        i5 = i31;
                                                        float c5 = l49.c(i38 + 12) - 0.5f;
                                                        float f15 = (c5 * f12) + f14;
                                                        f4 = f3;
                                                        l49Var2.J0.i(f13, f15, aq1.g(c4, 0.25f, 0.25f, width - f13, f13), Math.min(f15, height) - (((l49.c(i38 + 14) * 9.0f) + 3.0f) * f8), b10.w(c5, 4.0f, f8, width), b10.w(f11, 4.0f, f8, height), mlb.A(f6, 0.3f, 0.8f, (l49.c(i38 + 15) * 0.2f) + 0.45f), ((c3 + (0.42f * f6)) * 760.0f) / 1000.0f);
                                                        i32++;
                                                        i34 = i6 + i7;
                                                        f2 = f9;
                                                        f3 = f4;
                                                        i24 = i35;
                                                        max = i7;
                                                        i25 = i37;
                                                        i31 = i5;
                                                    }
                                                }
                                                i5 = i31;
                                                i6 = i34;
                                                i7 = max;
                                                f4 = f3;
                                                i34 = i6 + i7;
                                                f2 = f9;
                                                f3 = f4;
                                                i24 = i35;
                                                max = i7;
                                                i25 = i37;
                                                i31 = i5;
                                            }
                                            i31 += max;
                                        }
                                        l49Var2.T0 = createBitmap;
                                        l49Var2.U0 = i32;
                                        l49Var2.W0 = wx1Var;
                                        l49Var2.V0 = SystemClock.uptimeMillis();
                                        l49Var2.invalidate();
                                        return;
                                    } catch (Throwable unused4) {
                                        wx1Var.a();
                                        return;
                                    }
                                }
                                wx1Var.a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    chatActivityEnterView12.t1();
                    return;
                }
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView13 = this.b;
                int i39 = ChatActivityEnterView.z7;
                eq0 eq0Var = chatActivityEnterView13.m0;
                boolean z6 = eq0Var.w;
                eq0Var.setOpened(!z6);
                try {
                    chatActivityEnterView13.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView13.G0()) {
                    if (!z6) {
                        if (!chatActivityEnterView13.X0 && !chatActivityEnterView13.Y0) {
                            chatActivityEnterView13.n1();
                            return;
                        }
                        gm.d3(new gx1(chatActivityEnterView13, (byte) 0), 275L);
                        chatActivityEnterView13.J0(false);
                        return;
                    }
                    return;
                }
                py1 py1Var = chatActivityEnterView13.n0;
                if (!z6) {
                    if (py1Var == null) {
                        py1 py1Var2 = new py1(chatActivityEnterView13, chatActivityEnterView13.getContext());
                        chatActivityEnterView13.n0 = py1Var2;
                        fv fvVar = py1Var2.c;
                        chatActivityEnterView13.getContext();
                        fvVar.setLayoutManager(new u46());
                        ?? r12 = chatActivityEnterView13.n0.c;
                        ?? y59Var = new y59();
                        y59Var.c = new ArrayList();
                        y59Var.d = new ArrayList();
                        y59Var.e = new ArrayList();
                        chatActivityEnterView13.o0 = y59Var;
                        r12.setAdapter(y59Var);
                        chatActivityEnterView13.n0.c.setOnItemClickListener(new ry1(chatActivityEnterView13));
                        chatActivityEnterView13.n0.c.setOnItemLongClickListener(new vx1(chatActivityEnterView13, (byte) 2));
                        chatActivityEnterView13.n0.setClipToPadding(false);
                        chatActivityEnterView13.c2.addView(chatActivityEnterView13.n0, qoe.e(-1, -1, 80));
                        chatActivityEnterView13.n0.setVisibility(8);
                        vh6 vh6Var = chatActivityEnterView13.f7;
                        if (vh6Var != null) {
                            chatActivityEnterView13.o0.E(vh6Var);
                        }
                        chatActivityEnterView13.n2();
                    }
                    py1 py1Var3 = chatActivityEnterView13.n0;
                    if (py1Var3.getVisibility() != 0) {
                        py1Var3.setVisibility(0);
                        py1Var3.c.w0(0);
                        py1Var3.n = true;
                        py1Var3.f = false;
                        return;
                    } else if (py1Var3.f) {
                        py1Var3.f = false;
                        py1Var3.a();
                        py1Var3.d(false);
                        return;
                    } else {
                        return;
                    }
                } else if (py1Var != null) {
                    py1Var.c();
                    return;
                } else {
                    return;
                }
            case 12:
                ChatActivityEnterView chatActivityEnterView14 = this.b;
                int i40 = ChatActivityEnterView.z7;
                j67 j67Var = chatActivityEnterView14.M0;
                if (j67Var == null || j67Var.u0) {
                    AnimatorSet animatorSet2 = chatActivityEnterView14.j3;
                    if ((animatorSet2 == null || !animatorSet2.isRunning()) && chatActivityEnterView14.g0 == null) {
                        chatActivityEnterView14.w1();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView15 = this.b;
                int i41 = ChatActivityEnterView.z7;
                SharedPreferences.Editor edit = oc7.r1(chatActivityEnterView15.R).X3.edit();
                if (ok0.d(chatActivityEnterView15.F3.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivityEnterView15.F3.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView15.F3.a(), false);
                }
                if (oc7.r1(chatActivityEnterView15.R).l4.C0.f && oc7.r1(chatActivityEnterView15.R).l4.B0.f) {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView15.F3.a(), false);
                }
                edit.apply();
                TLRPC.UserFull X1 = oc7.r1(chatActivityEnterView15.R).X1(z8c.h(chatActivityEnterView15.R).e());
                if ((chatActivityEnterView15.getParentFragment().s8 == null || !chatActivityEnterView15.getParentFragment().s8.display_gifts_button) && (X1 == null || !X1.display_gifts_button)) {
                    gm.R3(chatActivityEnterView15.A2, false);
                }
                TLRPC.User h = chatActivityEnterView15.getParentFragment().h();
                if (h != null) {
                    if (chatActivityEnterView15.getParentFragment().s8 != null && ok0.e(chatActivityEnterView15.getParentFragment().s8.birthday)) {
                        z5 = true;
                    }
                    he heVar = new he(3, null, chatActivityEnterView15.getContext());
                    heVar.q(200L);
                    heVar.setOnCancelListener(new fu0(chatActivityEnterView15, oo0.l(chatActivityEnterView15.R, null, new sw1(chatActivityEnterView15, heVar, h, z5)), (byte) 3));
                    return;
                }
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView16 = this.b;
                int i42 = ChatActivityEnterView.z7;
                chatActivityEnterView16.l1();
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView17 = this.b;
                int i43 = ChatActivityEnterView.z7;
                my1 my1Var = chatActivityEnterView17.O0;
                if (my1Var != null && my1Var.isShowing()) {
                    chatActivityEnterView17.O0.dismiss();
                }
                ik.J(chatActivityEnterView17.E3, chatActivityEnterView17.F3.a(), new fy1(chatActivityEnterView17), chatActivityEnterView17.L4);
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView18 = this.b;
                int i44 = ChatActivityEnterView.z7;
                my1 my1Var2 = chatActivityEnterView18.O0;
                if (my1Var2 != null && my1Var2.isShowing()) {
                    chatActivityEnterView18.O0.dismiss();
                }
                chatActivityEnterView18.x1(true, 2147483646, 0, 0L, true);
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView19 = this.b;
                int i45 = ChatActivityEnterView.z7;
                my1 my1Var3 = chatActivityEnterView19.O0;
                if (my1Var3 != null && my1Var3.isShowing()) {
                    chatActivityEnterView19.O0.dismiss();
                }
                chatActivityEnterView19.x1(false, 0, 0, 0L, true);
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView20 = this.b;
                int i46 = ChatActivityEnterView.z7;
                if (chatActivityEnterView20.y7 == 3 && (uz1Var = chatActivityEnterView20.P3) != null) {
                    uz1Var.e1();
                    return;
                }
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView21 = this.b;
                int i47 = ChatActivityEnterView.z7;
                uz1 uz1Var3 = chatActivityEnterView21.P3;
                if (uz1Var3 != null && !uz1Var3.h()) {
                    ?? r13 = chatActivityEnterView21.P3;
                    yz1 yz1Var = chatActivityEnterView21.G0;
                    r13.a1(yz1Var, ((lka) yz1Var.c).getText(), true);
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView22 = this.b;
                int i48 = ChatActivityEnterView.z7;
                if (chatActivityEnterView22.H2 != 0) {
                    chatActivityEnterView22.R1(0, false);
                    chatActivityEnterView22.V0.r(false);
                    sy1 sy1Var7 = chatActivityEnterView22.F0;
                    if (sy1Var7 != null) {
                        sy1Var7.requestFocus();
                    }
                }
                if (chatActivityEnterView22.d3 != null) {
                    if (chatActivityEnterView22.R0() && chatActivityEnterView22.V2 == 1) {
                        if (chatActivityEnterView22.R0() && chatActivityEnterView22.V2 == 1) {
                            chatActivityEnterView22.Z1(0, 1, true, false);
                        }
                    } else {
                        chatActivityEnterView22.Z1(1, 1, true, true);
                    }
                } else if (chatActivityEnterView22.f3) {
                    chatActivityEnterView22.setFieldText("/");
                    sy1 sy1Var8 = chatActivityEnterView22.F0;
                    if (sy1Var8 != null) {
                        sy1Var8.requestFocus();
                    }
                    chatActivityEnterView22.j1();
                }
                if (chatActivityEnterView22.p4) {
                    chatActivityEnterView22.S1(false, false, false, true);
                    return;
                }
                return;
            default:
                ChatActivityEnterView chatActivityEnterView23 = this.b;
                int i49 = ChatActivityEnterView.z7;
                chatActivityEnterView23.t0();
                return;
        }
    }
}
