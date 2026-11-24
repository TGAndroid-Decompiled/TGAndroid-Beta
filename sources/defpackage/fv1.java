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
public final class fv1 implements View.OnClickListener {
    public final byte a;
    public final ChatActivityEnterView b;

    public fv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override
    public final void onClick(View view) {
        TLRPC.Peer peer;
        int i;
        int i2;
        int i3;
        byte b;
        ?? r18;
        int i4;
        String str;
        wx1 wx1Var;
        ex1 ex1Var;
        ChatActivityEnterView.RecordCircle recordCircle;
        i29 i29Var;
        ry8 ry8Var;
        boolean z;
        float f;
        float f2;
        int i5;
        int i6;
        int i7;
        float f3;
        float f4;
        float f5;
        hy1 hy1Var;
        boolean z2;
        ?? r3;
        ChatActivityEnterView chatActivityEnterView;
        float f6 = 1.0f;
        TLRPC.Peer peer2 = null;
        int i8 = 0;
        r4 = false;
        boolean z3 = false;
        r4 = false;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                ChatActivityEnterView chatActivityEnterView2 = this.b;
                int i9 = ChatActivityEnterView.r7;
                gb gbVar = chatActivityEnterView2.V;
                if ((gbVar == null || !gbVar.f) && chatActivityEnterView2.G != 0.0f) {
                    chatActivityEnterView2.P3.I0();
                    return;
                }
                return;
            case 1:
                ChatActivityEnterView chatActivityEnterView3 = this.b;
                int i10 = ChatActivityEnterView.r7;
                gb gbVar2 = chatActivityEnterView3.V;
                if ((gbVar2 == null || !gbVar2.f) && chatActivityEnterView3.G != 0.0f) {
                    chatActivityEnterView3.P3.s1();
                    return;
                }
                return;
            case 2:
                ChatActivityEnterView chatActivityEnterView4 = this.b;
                int i11 = ChatActivityEnterView.r7;
                mu1 mu1Var = chatActivityEnterView4.F3;
                if (!chatActivityEnterView4.o7 ? chatActivityEnterView4.getTranslationY() != 0.0f : chatActivityEnterView4.Q0()) {
                    chatActivityEnterView4.s0 = new av1(chatActivityEnterView4, (byte) 6);
                    if (chatActivityEnterView4.o7) {
                        chatActivityEnterView4.K0(true, false, true);
                        return;
                    } else {
                        chatActivityEnterView4.K0(true, true, true);
                        return;
                    }
                }
                if (chatActivityEnterView4.P3.h() > gl.L(20.0f)) {
                    int o0 = chatActivityEnterView4.P3.o0();
                    int h = chatActivityEnterView4.P3.h();
                    if (h <= gl.L(20.0f)) {
                        o0 += h;
                    }
                    if (chatActivityEnterView4.X0) {
                        o0 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    if (o0 < gl.L(200.0f)) {
                        chatActivityEnterView4.v0 = new av1(chatActivityEnterView4, (byte) 7);
                        chatActivityEnterView4.S();
                        return;
                    }
                }
                if (chatActivityEnterView4.P3.v() != null) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    uw1 uw1Var = chatActivityEnterView4.r0;
                    if (uw1Var != null) {
                        uw1Var.e = false;
                        uw1Var.l(new yla[0]);
                        return;
                    }
                    na7 q1 = na7.q1(chatActivityEnterView4.R);
                    if (chatActivityEnterView4.o7) {
                        peer = chatActivityEnterView4.P3.i();
                    } else {
                        na7.q1(chatActivityEnterView4.R).K0(Long.valueOf(-chatActivityEnterView4.G3));
                        TLRPC.ChatFull L0 = na7.q1(chatActivityEnterView4.R).L0(-chatActivityEnterView4.G3);
                        if (L0 != null) {
                            peer2 = L0.default_send_as;
                        }
                        TLRPC.Peer peer3 = peer2;
                        peer2 = L0;
                        peer = peer3;
                    }
                    if (peer == null && chatActivityEnterView4.P3.v() != null && !chatActivityEnterView4.P3.v().peers.isEmpty()) {
                        peer = chatActivityEnterView4.P3.v().peers.get(0).peer;
                    }
                    TLRPC.Peer peer4 = peer;
                    boolean V = hc2.V(q1.K0(Long.valueOf(-chatActivityEnterView4.G3)));
                    if (chatActivityEnterView4.o7) {
                        ViewGroup viewGroup = (ViewGroup) chatActivityEnterView4.getParent();
                    } else {
                        mu1Var.getParentLayout().getOverlayContainerView();
                    }
                    uw1 uw1Var2 = new uw1(chatActivityEnterView4, chatActivityEnterView4.getContext(), chatActivityEnterView4.F3, q1, V, peer4, chatActivityEnterView4.P3.v(), new ie(chatActivityEnterView4, peer2, q1, (byte) 19), chatActivityEnterView4.L4);
                    chatActivityEnterView4.r0 = uw1Var2;
                    uw1Var2.e = true;
                    uw1Var2.c = (short) 220;
                    uw1Var2.setOutsideTouchable(true);
                    chatActivityEnterView4.r0.setClippingEnabled(true);
                    chatActivityEnterView4.r0.setFocusable(true);
                    chatActivityEnterView4.r0.getContentView().measure(View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(gl.L(1000.0f), Integer.MIN_VALUE));
                    chatActivityEnterView4.r0.setInputMethodMode(2);
                    chatActivityEnterView4.r0.setSoftInputMode(0);
                    chatActivityEnterView4.r0.getContentView().setFocusableInTouchMode(true);
                    chatActivityEnterView4.r0.b = false;
                    int i12 = -gl.L(4.0f);
                    int[] iArr = new int[2];
                    if (gl.O1() && mu1Var != null) {
                        mu1Var.getFragmentView().getLocationInWindow(iArr);
                        i = iArr[0] + i12;
                    } else {
                        i = i12;
                    }
                    int o02 = chatActivityEnterView4.P3.o0();
                    int measuredHeight = chatActivityEnterView4.r0.getContentView().getMeasuredHeight();
                    int h2 = chatActivityEnterView4.P3.h();
                    if (h2 <= gl.L(20.0f)) {
                        o02 += h2;
                    }
                    if (chatActivityEnterView4.X0) {
                        o02 -= chatActivityEnterView4.getEmojiPadding();
                    }
                    int i13 = (i12 << 1) + o02;
                    if (mu1Var != null && mu1Var.isInBubbleMode()) {
                        i2 = 0;
                    } else {
                        i2 = gl.m;
                    }
                    if (measuredHeight < (i13 - i2) - chatActivityEnterView4.r0.p.getMeasuredHeight()) {
                        chatActivityEnterView4.getLocationInWindow(iArr);
                        i3 = ((iArr[1] - measuredHeight) - i12) - gl.L(2.0f);
                    } else {
                        if (mu1Var != null && mu1Var.isInBubbleMode()) {
                            i3 = 0;
                        } else {
                            i3 = gl.m;
                        }
                        chatActivityEnterView4.r0.o.getLayoutParams().height = ((o02 - i3) - gl.L(14.0f)) - chatActivityEnterView4.getHeightWithTopView();
                    }
                    final uw1 uw1Var3 = chatActivityEnterView4.r0;
                    View view2 = uw1Var3.u;
                    o39 o39Var = uw1Var3.v;
                    TLRPC.Peer peer5 = uw1Var3.r;
                    d4a d4aVar = uw1Var3.o;
                    oc6 oc6Var = uw1Var3.t;
                    ArrayList arrayList = uw1Var3.z;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        ((yla) obj).d();
                    }
                    arrayList.clear();
                    oc6Var.setPivotX(gl.L(8.0f));
                    oc6Var.setPivotY(oc6Var.getMeasuredHeight() - gl.L(8.0f));
                    d4aVar.setPivotX(0.0f);
                    d4aVar.setPivotY(0.0f);
                    ArrayList<TLRPC.TL_sendAsPeer> arrayList2 = uw1Var3.s.peers;
                    if (peer5 != null) {
                        int L = gl.L(54.0f);
                        r18 = 3;
                        int size2 = arrayList2.size() * L;
                        b = 1;
                        int i15 = 0;
                        while (i15 < arrayList2.size()) {
                            TLRPC.Peer peer6 = arrayList2.get(i15).peer;
                            View view3 = view2;
                            o39 o39Var2 = o39Var;
                            long j = peer6.channel_id;
                            if (j == 0 || j != peer5.channel_id) {
                                long j2 = peer6.user_id;
                                if (j2 == 0 || j2 != peer5.user_id) {
                                    long j3 = peer6.chat_id;
                                    if (j3 == 0 || j3 != peer5.chat_id) {
                                        i15++;
                                        view2 = view3;
                                        o39Var = o39Var2;
                                    }
                                }
                            }
                            if (i15 != arrayList2.size() - 1 && o39Var2.getMeasuredHeight() < size2) {
                                i4 = o39Var2.getMeasuredHeight() % L;
                            } else {
                                i4 = 0;
                            }
                            uw1Var3.w.g1(i15, (size2 - ((arrayList2.size() - 2) * L)) + gl.L(7.0f) + i4);
                            if (o39Var2.computeVerticalScrollOffset() > 0) {
                                view3.animate().cancel();
                                view3.animate().alpha(1.0f).setDuration(150L).start();
                            }
                        }
                    } else {
                        b = 1;
                        r18 = 3;
                    }
                    oc6Var.setScaleX(0.25f);
                    oc6Var.setScaleY(0.25f);
                    d4aVar.setAlpha(0.25f);
                    yla ylaVar = new yla(oc6Var, yla.q);
                    ylaVar.m = oo1.j(1.0f, 750.0f, 1.0f);
                    ylaVar.b(new yr3() {
                        @Override
                        public final void a(yla ylaVar2, float f7, float f8) {
                            byte b2 = r2;
                            uw1 uw1Var4 = uw1Var3;
                            switch (b2) {
                                case 0:
                                    uw1Var4.o.setScaleX(1.0f / f7);
                                    return;
                                default:
                                    uw1Var4.o.setScaleY(1.0f / f7);
                                    return;
                            }
                        }
                    });
                    yla ylaVar2 = new yla(oc6Var, yla.r);
                    ylaVar2.m = oo1.j(1.0f, 750.0f, 1.0f);
                    final byte b2 = b;
                    ylaVar2.b(new yr3() {
                        @Override
                        public final void a(yla ylaVar22, float f7, float f8) {
                            byte b22 = b2;
                            uw1 uw1Var4 = uw1Var3;
                            switch (b22) {
                                case 0:
                                    uw1Var4.o.setScaleX(1.0f / f7);
                                    return;
                                default:
                                    uw1Var4.o.setScaleY(1.0f / f7);
                                    return;
                            }
                        }
                    });
                    wr3 wr3Var = yla.v;
                    yla ylaVar3 = new yla(oc6Var, wr3Var);
                    ylaVar3.m = oo1.j(1.0f, 750.0f, 1.0f);
                    yla ylaVar4 = new yla(d4aVar, wr3Var);
                    ylaVar4.m = oo1.j(1.0f, 750.0f, 1.0f);
                    yla[] ylaVarArr = new yla[4];
                    ylaVarArr[0] = ylaVar;
                    ylaVarArr[1] = ylaVar2;
                    ylaVarArr[2] = ylaVar3;
                    ylaVarArr[r18] = ylaVar4;
                    for (yla ylaVar5 : Arrays.asList(ylaVarArr)) {
                        arrayList.add(ylaVar5);
                        ylaVar5.a(new o11(uw1Var3, ylaVar5, (byte) 7));
                        ylaVar5.h();
                    }
                    uw1 uw1Var4 = chatActivityEnterView4.r0;
                    chatActivityEnterView4.t0 = i;
                    chatActivityEnterView4.u0 = i3;
                    uw1Var4.showAtLocation(view, 51, i, i3);
                    chatActivityEnterView4.q0.setProgress(1.0f);
                    return;
                }
                return;
            case 3:
                ChatActivityEnterView chatActivityEnterView5 = this.b;
                int i16 = ChatActivityEnterView.r7;
                chatActivityEnterView5.j1();
                return;
            case 4:
                ChatActivityEnterView chatActivityEnterView6 = this.b;
                int i17 = ChatActivityEnterView.r7;
                ex1 ex1Var2 = chatActivityEnterView6.F0;
                if (ex1Var2 == null) {
                    str = "";
                } else {
                    str = ex1Var2.getText().toString();
                }
                int indexOf = str.indexOf(32);
                if (indexOf != -1 && indexOf != str.length() - 1) {
                    chatActivityEnterView6.setFieldText(str.substring(0, indexOf + 1));
                    return;
                } else {
                    chatActivityEnterView6.setFieldText("");
                    return;
                }
            case 5:
                ChatActivityEnterView chatActivityEnterView7 = this.b;
                int i18 = ChatActivityEnterView.r7;
                j47 j47Var = chatActivityEnterView7.M0;
                if (j47Var == null || j47Var.u0) {
                    AnimatorSet animatorSet = chatActivityEnterView7.j3;
                    if ((animatorSet == null || !animatorSet.isRunning()) && chatActivityEnterView7.g0 == null) {
                        chatActivityEnterView7.u1();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ChatActivityEnterView chatActivityEnterView8 = this.b;
                int i19 = ChatActivityEnterView.r7;
                hy1 hy1Var2 = chatActivityEnterView8.P3;
                if (hy1Var2 != null) {
                    hy1Var2.Z();
                    return;
                }
                return;
            case 7:
                ChatActivityEnterView chatActivityEnterView9 = this.b;
                int i20 = ChatActivityEnterView.r7;
                if (chatActivityEnterView9.R2 != null) {
                    if (chatActivityEnterView9.d0 - chatActivityEnterView9.e0 < 0) {
                        NumberTextView numberTextView = chatActivityEnterView9.c0;
                        if (numberTextView != null) {
                            gl.B3(3.5f, numberTextView, null);
                            try {
                                chatActivityEnterView9.c0.performHapticFeedback(3, 2);
                                return;
                            } catch (Exception unused2) {
                                return;
                            }
                        }
                        return;
                    }
                    cy1 B = chatActivityEnterView9.B();
                    chatActivityEnterView9.S2 = B;
                    j41 d = j41.d(chatActivityEnterView9.R);
                    String str2 = chatActivityEnterView9.R2.link;
                    String str3 = B.a;
                    ArrayList<TLRPC.MessageEntity> arrayList3 = B.b;
                    av1 av1Var = new av1(chatActivityEnterView9, (byte) 29);
                    TL_account.TL_businessChatLink c = d.c(str2);
                    if (c != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = str3;
                        tL_inputBusinessChatLink.entities = arrayList3;
                        tL_inputBusinessChatLink.title = c.title;
                        d.b(c, tL_inputBusinessChatLink, av1Var);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ChatActivityEnterView chatActivityEnterView10 = this.b;
                int i21 = ChatActivityEnterView.r7;
                if (chatActivityEnterView10.T0.getVisibility() == 0 && chatActivityEnterView10.T0.getAlpha() == 1.0f && !chatActivityEnterView10.a4) {
                    if (!chatActivityEnterView10.p3 || (ex1Var = chatActivityEnterView10.F0) == null || !ex1Var.isFocused()) {
                        if (chatActivityEnterView10.p4) {
                            if (chatActivityEnterView10.H2 != 0) {
                                chatActivityEnterView10.O1(0, true);
                                chatActivityEnterView10.V0.s(true);
                                chatActivityEnterView10.V0.z();
                                if (chatActivityEnterView10.o4) {
                                    chatActivityEnterView10.N(true);
                                }
                            } else if (!chatActivityEnterView10.u4 && (wx1Var = chatActivityEnterView10.V0) != null) {
                                wx1Var.O(false);
                            }
                        } else if (!chatActivityEnterView10.u4) {
                            chatActivityEnterView10.V0.O(true);
                        }
                        if (!chatActivityEnterView10.u4) {
                            chatActivityEnterView10.P1(!chatActivityEnterView10.p4, true, false, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ChatActivityEnterView chatActivityEnterView11 = this.b;
                int i22 = ChatActivityEnterView.r7;
                if (chatActivityEnterView11.g0() && chatActivityEnterView11.v3 && (recordCircle = chatActivityEnterView11.D2) != null && ChatActivityEnterView.this.h5) {
                    chatActivityEnterView11.m0(false, false);
                    jm3 jm3Var = chatActivityEnterView11.j1;
                    if (jm3Var != null && jm3Var.q()) {
                        jm3 jm3Var2 = chatActivityEnterView11.j1;
                        if (jm3Var2.o0 && jm3Var2.q()) {
                            jm3Var2.t();
                        }
                    } else {
                        jm3 jm3Var3 = chatActivityEnterView11.j1;
                        if (jm3Var3 != null && jm3Var3.p()) {
                            ex1 ex1Var3 = chatActivityEnterView11.F0;
                            if (ex1Var3 != null) {
                                ex1Var3.setText("");
                            }
                            chatActivityEnterView11.j1.m();
                        }
                    }
                    if (chatActivityEnterView11.v3) {
                        chatActivityEnterView11.v3 = false;
                        chatActivityEnterView11.Y1 = 0L;
                        chatActivityEnterView11.r2(2, true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ChatActivityEnterView chatActivityEnterView12 = this.b;
                int i23 = ChatActivityEnterView.r7;
                AnimatorSet animatorSet2 = chatActivityEnterView12.j3;
                if (animatorSet2 == null || !animatorSet2.isRunning()) {
                    int[] iArr2 = chatActivityEnterView12.S1;
                    int[] iArr3 = chatActivityEnterView12.R1;
                    if (chatActivityEnterView12.K1 && !chatActivityEnterView12.U1 && (i29Var = chatActivityEnterView12.i1) != null && chatActivityEnterView12.R3 != null && i29Var.getVisibility() == 0 && chatActivityEnterView12.i1.getWidth() > 0 && (ry8Var = chatActivityEnterView12.h1) != null) {
                        if (chatActivityEnterView12.i1.T0 == null) {
                            ry8Var.getLocationInWindow(iArr3);
                            chatActivityEnterView12.i1.getLocationInWindow(iArr2);
                            float width = (chatActivityEnterView12.h1.getWidth() / 2.0f) + (iArr3[0] - iArr2[0]);
                            float height = ((chatActivityEnterView12.h1.getHeight() / 2.0f) + (iArr3[1] - iArr2[1])) - gl.L(3.0f);
                            TLRPC.TL_document tL_document = chatActivityEnterView12.R3;
                            chatActivityEnterView12.y5 = null;
                            gl.e3(new aj1(chatActivityEnterView12, tL_document, (byte) 27), 100L);
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
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            chatActivityEnterView12.B5 = ofFloat;
                            ofFloat.setDuration(160L);
                            chatActivityEnterView12.B5.setInterpolator(s33.g);
                            chatActivityEnterView12.B5.addUpdateListener(new pv1(chatActivityEnterView12, (byte) 9));
                            chatActivityEnterView12.B5.start();
                            i29 i29Var2 = chatActivityEnterView12.i1;
                            jw1 jw1Var = new jw1(chatActivityEnterView12);
                            kra kraVar = i29Var2.J0;
                            RectF rectF = i29Var2.f0;
                            if (i29Var2.T0 == null && !i29Var2.X0) {
                                int width2 = i29Var2.getWidth();
                                int height2 = i29Var2.getHeight();
                                if (i29Var2.d0 && width2 > 0 && height2 > 0) {
                                    i29Var2.setPlaying(false);
                                    i29Var2.p0 = false;
                                    i29Var2.W = false;
                                    try {
                                        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
                                        float f7 = width2;
                                        rectF.set(0.0f, 0.0f, f7, height2);
                                        i29Var2.b(new Canvas(createBitmap), rectF, 1.0f);
                                        int[] iArr4 = new int[width2 * height2];
                                        createBitmap.getPixels(iArr4, 0, width2, 0, 0, width2, height2);
                                        int i24 = width2;
                                        int i25 = height2;
                                        i29Var2.a1 = i29Var2.f();
                                        if (width < f7 / 2.0f) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        i29Var2.Z0 = z;
                                        int max = Math.max(1, Math.round(gl.p * 0.75f));
                                        int i26 = 0;
                                        for (int i27 = 0; i27 < i25; i27 += max) {
                                            for (int i28 = 0; i28 < i24; i28 += max) {
                                                int i29 = iArr4[(i27 * i24) + i28];
                                                int i30 = i8;
                                                if ((i29 >>> 24) > 60) {
                                                    if (i29Var2.e(i29)) {
                                                        i26++;
                                                    } else {
                                                        i8 = i30 + 1;
                                                    }
                                                }
                                                i8 = i30;
                                            }
                                        }
                                        if (i26 > 1100) {
                                            f = 1100.0f / i26;
                                        } else {
                                            f = 1.0f;
                                        }
                                        if (i8 > 0) {
                                            f2 = Math.min(1.0f, 360.0f / i8);
                                        } else {
                                            f2 = 0.0f;
                                        }
                                        kraVar.a();
                                        kraVar.S = 0.0f;
                                        kraVar.R = 0.0f;
                                        kraVar.e(i29Var2.a1);
                                        float f8 = gl.p;
                                        int i31 = 0;
                                        int i32 = 0;
                                        int i33 = 0;
                                        while (i31 < i25) {
                                            int i34 = 0;
                                            while (i34 < i24) {
                                                int i35 = i24;
                                                int i36 = iArr4[(i31 * i24) + i34];
                                                float f9 = f;
                                                int i37 = i25;
                                                if ((i36 >>> 24) > 60) {
                                                    i33++;
                                                    int i38 = i33 * 7;
                                                    float c2 = i29.c(i38 + 3);
                                                    if (i29Var2.e(i36)) {
                                                        f4 = f9;
                                                    } else {
                                                        f4 = f2;
                                                    }
                                                    if (c2 <= f4) {
                                                        if (i29Var2.Z0) {
                                                            f5 = i34 / f7;
                                                        } else {
                                                            f5 = 1.0f - (i34 / f7);
                                                        }
                                                        float c3 = i29.c(i38 + 13) * 0.04f;
                                                        float c4 = i29.c(i38 + 11);
                                                        float f10 = i34;
                                                        float f11 = c4 - 0.5f;
                                                        i6 = i34;
                                                        float f12 = max;
                                                        float f13 = (f11 * f12) + f10;
                                                        i7 = max;
                                                        float f14 = i31;
                                                        i5 = i31;
                                                        float c5 = i29.c(i38 + 12) - 0.5f;
                                                        float f15 = (c5 * f12) + f14;
                                                        f3 = f2;
                                                        i29Var2.J0.i(f13, f15, oo1.g(c4, 0.25f, 0.25f, width - f13, f13), Math.min(f15, height) - (((i29.c(i38 + 14) * 9.0f) + 3.0f) * f8), b00.w(c5, 4.0f, f8, width), b00.w(f11, 4.0f, f8, height), yjb.z(f5, 0.3f, 0.8f, (i29.c(i38 + 15) * 0.2f) + 0.45f), ((c3 + (0.42f * f5)) * 760.0f) / 1000.0f);
                                                        i32++;
                                                        i34 = i6 + i7;
                                                        f = f9;
                                                        f2 = f3;
                                                        i24 = i35;
                                                        max = i7;
                                                        i25 = i37;
                                                        i31 = i5;
                                                    }
                                                }
                                                i5 = i31;
                                                i6 = i34;
                                                i7 = max;
                                                f3 = f2;
                                                i34 = i6 + i7;
                                                f = f9;
                                                f2 = f3;
                                                i24 = i35;
                                                max = i7;
                                                i25 = i37;
                                                i31 = i5;
                                            }
                                            i31 += max;
                                        }
                                        i29Var2.T0 = createBitmap;
                                        i29Var2.U0 = i32;
                                        i29Var2.W0 = jw1Var;
                                        i29Var2.V0 = SystemClock.uptimeMillis();
                                        i29Var2.invalidate();
                                        return;
                                    } catch (Throwable unused4) {
                                        jw1Var.a();
                                        return;
                                    }
                                }
                                jw1Var.a();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    chatActivityEnterView12.r1();
                    return;
                }
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView13 = this.b;
                int i39 = ChatActivityEnterView.r7;
                ep0 ep0Var = chatActivityEnterView13.m0;
                boolean z5 = ep0Var.w;
                ep0Var.setOpened(!z5);
                try {
                    chatActivityEnterView13.performHapticFeedback(3, 2);
                } catch (Exception unused5) {
                }
                if (chatActivityEnterView13.G0()) {
                    if (!z5) {
                        if (!chatActivityEnterView13.X0 && !chatActivityEnterView13.Y0) {
                            chatActivityEnterView13.l1();
                            return;
                        }
                        gl.e3(new av1(chatActivityEnterView13, (byte) 27), 275L);
                        chatActivityEnterView13.J0(false);
                        return;
                    }
                    return;
                }
                cx1 cx1Var = chatActivityEnterView13.n0;
                if (!z5) {
                    if (cx1Var == null) {
                        cx1 cx1Var2 = new cx1(chatActivityEnterView13, chatActivityEnterView13.getContext());
                        chatActivityEnterView13.n0 = cx1Var2;
                        fu fuVar = cx1Var2.c;
                        chatActivityEnterView13.getContext();
                        fuVar.setLayoutManager(new t26());
                        ?? r1 = chatActivityEnterView13.n0.c;
                        ?? w39Var = new w39();
                        w39Var.c = new ArrayList();
                        w39Var.d = new ArrayList();
                        w39Var.e = new ArrayList();
                        chatActivityEnterView13.o0 = w39Var;
                        r1.setAdapter(w39Var);
                        chatActivityEnterView13.n0.c.setOnItemClickListener(new dx1(chatActivityEnterView13));
                        chatActivityEnterView13.n0.c.setOnItemLongClickListener(new iw1(chatActivityEnterView13, (byte) 2));
                        chatActivityEnterView13.n0.setClipToPadding(false);
                        chatActivityEnterView13.c2.addView(chatActivityEnterView13.n0, nme.e(-1, -1, 80));
                        chatActivityEnterView13.n0.setVisibility(8);
                        vf6 vf6Var = chatActivityEnterView13.X6;
                        if (vf6Var != null) {
                            chatActivityEnterView13.o0.E(vf6Var);
                        }
                        chatActivityEnterView13.i2();
                    }
                    cx1 cx1Var3 = chatActivityEnterView13.n0;
                    if (cx1Var3.getVisibility() != 0) {
                        cx1Var3.setVisibility(0);
                        cx1Var3.c.w0(0);
                        cx1Var3.n = true;
                        cx1Var3.f = false;
                        return;
                    } else if (cx1Var3.f) {
                        cx1Var3.f = false;
                        cx1Var3.a();
                        cx1Var3.d(false);
                        return;
                    } else {
                        return;
                    }
                } else if (cx1Var != null) {
                    cx1Var.c();
                    return;
                } else {
                    return;
                }
            case 12:
                ChatActivityEnterView chatActivityEnterView14 = this.b;
                int i40 = ChatActivityEnterView.r7;
                if (chatActivityEnterView14.q7 == 3 && (hy1Var = chatActivityEnterView14.P3) != null) {
                    hy1Var.R0();
                    return;
                }
                return;
            case 13:
                ChatActivityEnterView chatActivityEnterView15 = this.b;
                int i41 = ChatActivityEnterView.r7;
                SharedPreferences.Editor edit = na7.q1(chatActivityEnterView15.R).X3.edit();
                if (oj0.d(chatActivityEnterView15.F3.s8)) {
                    edit.putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + chatActivityEnterView15.F3.a(), false);
                } else {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView15.F3.a(), false);
                }
                if (na7.q1(chatActivityEnterView15.R).k4.C0.f && na7.q1(chatActivityEnterView15.R).k4.B0.f) {
                    edit.putBoolean("show_gift_for_" + chatActivityEnterView15.F3.a(), false);
                }
                edit.apply();
                TLRPC.UserFull W1 = na7.q1(chatActivityEnterView15.R).W1(y6c.h(chatActivityEnterView15.R).e());
                if ((chatActivityEnterView15.getParentFragment().s8 == null || !chatActivityEnterView15.getParentFragment().s8.display_gifts_button) && (W1 == null || !W1.display_gifts_button)) {
                    gl.S3(chatActivityEnterView15.A2, false);
                }
                TLRPC.User h3 = chatActivityEnterView15.getParentFragment().h();
                if (h3 != null) {
                    if (chatActivityEnterView15.getParentFragment().s8 != null && oj0.e(chatActivityEnterView15.getParentFragment().s8.birthday)) {
                        z4 = true;
                    }
                    hd hdVar = new hd(3, null, chatActivityEnterView15.getContext());
                    hdVar.q(200L);
                    hdVar.setOnCancelListener(new xs0(chatActivityEnterView15, on0.l(chatActivityEnterView15.R, null, new gv1(chatActivityEnterView15, hdVar, h3, z4)), (byte) 3));
                    return;
                }
                return;
            case 14:
                ChatActivityEnterView chatActivityEnterView16 = this.b;
                int i42 = ChatActivityEnterView.r7;
                chatActivityEnterView16.j1();
                return;
            case 15:
                ChatActivityEnterView chatActivityEnterView17 = this.b;
                int i43 = ChatActivityEnterView.r7;
                hy1 hy1Var3 = chatActivityEnterView17.P3;
                if (hy1Var3 != null && !hy1Var3.g()) {
                    ?? r12 = chatActivityEnterView17.P3;
                    ly1 ly1Var = chatActivityEnterView17.G0;
                    r12.O0(ly1Var, ((jia) ly1Var.c).getText(), true);
                    return;
                }
                return;
            case 16:
                ChatActivityEnterView chatActivityEnterView18 = this.b;
                int i44 = ChatActivityEnterView.r7;
                zw1 zw1Var = chatActivityEnterView18.O0;
                if (zw1Var != null && zw1Var.isShowing()) {
                    chatActivityEnterView18.O0.dismiss();
                }
                ij.J(chatActivityEnterView18.E3, chatActivityEnterView18.F3.a(), new sw1(chatActivityEnterView18), chatActivityEnterView18.L4);
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView19 = this.b;
                int i45 = ChatActivityEnterView.r7;
                zw1 zw1Var2 = chatActivityEnterView19.O0;
                if (zw1Var2 != null && zw1Var2.isShowing()) {
                    chatActivityEnterView19.O0.dismiss();
                }
                chatActivityEnterView19.v1(true, 2147483646, 0, 0L, true);
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView20 = this.b;
                int i46 = ChatActivityEnterView.r7;
                zw1 zw1Var3 = chatActivityEnterView20.O0;
                if (zw1Var3 != null && zw1Var3.isShowing()) {
                    chatActivityEnterView20.O0.dismiss();
                }
                chatActivityEnterView20.v1(false, 0, 0, 0L, true);
                return;
            case 19:
                ChatActivityEnterView chatActivityEnterView21 = this.b;
                int i47 = ChatActivityEnterView.r7;
                if (chatActivityEnterView21.H2 != 0) {
                    chatActivityEnterView21.O1(0, false);
                    chatActivityEnterView21.V0.s(false);
                    ex1 ex1Var4 = chatActivityEnterView21.F0;
                    if (ex1Var4 != null) {
                        ex1Var4.requestFocus();
                    }
                }
                if (chatActivityEnterView21.d3 != null) {
                    if (chatActivityEnterView21.Q0() && chatActivityEnterView21.V2 == 1) {
                        if (chatActivityEnterView21.Q0() && chatActivityEnterView21.V2 == 1) {
                            chatActivityEnterView21.W1(0, 1, true, false);
                        }
                    } else {
                        chatActivityEnterView21.W1(1, 1, true, true);
                    }
                } else if (chatActivityEnterView21.f3) {
                    chatActivityEnterView21.setFieldText("/");
                    ex1 ex1Var5 = chatActivityEnterView21.F0;
                    if (ex1Var5 != null) {
                        ex1Var5.requestFocus();
                    }
                    chatActivityEnterView21.h1();
                }
                if (chatActivityEnterView21.p4) {
                    chatActivityEnterView21.P1(false, false, false, true);
                    return;
                }
                return;
            case 20:
                ChatActivityEnterView chatActivityEnterView22 = this.b;
                int i48 = ChatActivityEnterView.r7;
                chatActivityEnterView22.t0();
                return;
            default:
                ChatActivityEnterView chatActivityEnterView23 = this.b;
                int i49 = ChatActivityEnterView.r7;
                mu1 mu1Var2 = chatActivityEnterView23.F3;
                ew1 ew1Var = chatActivityEnterView23.R0;
                if (chatActivityEnterView23.n0()) {
                    if (chatActivityEnterView23.C6 == null) {
                        chatActivityEnterView23.D6 = true;
                        if (chatActivityEnterView23.B0) {
                            f6 = 0.5f;
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        chatActivityEnterView23.C6 = ofFloat2;
                        ofFloat2.addUpdateListener(new rm1(chatActivityEnterView23, f6, (byte) 1));
                        chatActivityEnterView23.C6.addListener(new t7(chatActivityEnterView23, f6, (byte) 3));
                        chatActivityEnterView23.C6.setDuration(180L);
                        chatActivityEnterView23.C6.setInterpolator(s33.i);
                        chatActivityEnterView23.C6.start();
                        return;
                    }
                    return;
                }
                gb gbVar3 = chatActivityEnterView23.V;
                if (gbVar3 == null || !gbVar3.f) {
                    if (ew1Var.x) {
                        cs5 cs5Var = chatActivityEnterView23.U6;
                        if (cs5Var != null) {
                            cs5Var.u();
                            chatActivityEnterView23.U6 = null;
                            return;
                        }
                        ex1 ex1Var6 = chatActivityEnterView23.F0;
                        if (ex1Var6 != null && mu1Var2 != null) {
                            ex1Var6.m();
                            ?? r32 = chatActivityEnterView23.c2;
                            if (r32 != null) {
                                chatActivityEnterView = r32;
                            } else {
                                chatActivityEnterView = chatActivityEnterView23;
                            }
                            cs5 cs5Var2 = new cs5(chatActivityEnterView, chatActivityEnterView23.L4, ew1Var, false, false, true);
                            cs5Var2.a0 = gl.L(280.0f);
                            mu1.v6(new t07(cs5Var2, chatActivityEnterView23.F0), mu1Var2.h, true, true, true, true);
                            cs5Var2.X = true;
                            cs5Var2.p = new aj1(chatActivityEnterView23, cs5Var2, (byte) 28);
                            chatActivityEnterView23.U6 = cs5Var2;
                            cs5Var2.a0();
                            return;
                        }
                        return;
                    } else if (chatActivityEnterView23.B0) {
                        chatActivityEnterView23.X1();
                        return;
                    } else if (chatActivityEnterView23.Q0() && chatActivityEnterView23.V2 == 0) {
                        if (chatActivityEnterView23.H2 != 0) {
                            chatActivityEnterView23.O1(0, true);
                            wx1 wx1Var2 = chatActivityEnterView23.V0;
                            if (wx1Var2 != null) {
                                wx1Var2.s(false);
                            }
                            ex1 ex1Var7 = chatActivityEnterView23.F0;
                            if (ex1Var7 != null) {
                                ex1Var7.requestFocus();
                            }
                        }
                        if (chatActivityEnterView23.p4) {
                            chatActivityEnterView23.P1(false, true, false, true);
                            chatActivityEnterView23.b4 = true;
                            gl.e3(new av1(chatActivityEnterView23, (byte) 28), 200L);
                            return;
                        }
                        chatActivityEnterView23.i1();
                        return;
                    } else {
                        chatActivityEnterView23.W1(1, 0, true, true);
                        wx1 wx1Var3 = chatActivityEnterView23.V0;
                        ex1 ex1Var8 = chatActivityEnterView23.F0;
                        if (ex1Var8 != null && ex1Var8.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (mu1Var2 != null) {
                            je5 je5Var = mu1Var2.N1;
                            if (je5Var != null) {
                                if (je5Var.W) {
                                    je5Var.f(true);
                                }
                                r3 = true;
                            } else {
                                r3 = false;
                            }
                            mu1Var2.N1 = null;
                            if (r3 != false) {
                                z3 = true;
                            }
                        }
                        wx1Var3.B(z2, z3);
                        return;
                    }
                }
                return;
        }
    }
}
