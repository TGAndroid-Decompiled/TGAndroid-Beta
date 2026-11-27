package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class ju1 implements rb2 {
    public final zu1 a;

    public ju1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override
    public final void A(wb2 wb2Var) {
        r47 messageObject;
        if (wb2Var != null && (messageObject = wb2Var.getMessageObject()) != null && messageObject.k != null) {
            int e1 = messageObject.e1();
            zu1 zu1Var = this.a;
            if (zu1Var.lc != e1 || zu1Var.mc != 7) {
                TLRPC.InputPeer j1 = zu1Var.getMessagesController().j1(r47.B0(messageObject.k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = j1;
                getrichmessage.id = e1;
                l01 l01Var = zu1Var.pc;
                if (l01Var != null) {
                    l01Var.a(true);
                    zu1Var.pc = null;
                }
                dq1 dq1Var = new dq1(zu1Var, e1, wb2Var, (byte) 2);
                dq1Var.b = new jj1(zu1Var, r3, (byte) 14);
                zu1Var.pc = dq1Var;
                dq1Var.d();
                int[] iArr = {zu1Var.getConnectionsManager().sendRequestTyped(getrichmessage, new ic((byte) 0), new pm1(zu1Var, dq1Var, iArr, wb2Var, messageObject, (byte) 2))};
            }
        }
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
        f(wb2Var, z, true, false);
    }

    @Override
    public final boolean A1(hm hmVar) {
        TLRPC.InputStickerSet i1;
        int i;
        zu1 zu1Var = this.a;
        if (!zu1Var.getMessagesController().M3() && hmVar != null && !hmVar.standard) {
            long documentId = hmVar.getDocumentId();
            TLRPC.Document document = hmVar.document;
            if (document == null) {
                i = ((e) zu1Var).currentAccount;
                document = wl.e(i, documentId);
            }
            if (document != null && (i1 = r47.i1(document)) != null) {
                ls6.d0(yac.t0).n0(i1, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i1);
                ly3 ly3Var = new ly3(zu1Var, zu1Var.getParentActivity(), zu1Var.Ba, arrayList);
                dy3 dy3Var = ly3Var.p1;
                dy3Var.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(dy3Var);
                dy3Var.w = imageReceiver;
                if (dy3Var.d) {
                    imageReceiver.I();
                }
                dy3Var.x = true;
                dy3Var.y.e(true, 1.0f);
                dy3Var.w.Z(jn5.b(document), "140_140", jn5.c(xb4.w(document.thumbs, 90, false, null, false), document), "140_140", lp3.d(document.thumbs, aob.m6, 0.2f, true), 0L, null, null, 0);
                dy3Var.w.m0(7);
                ImageReceiver imageReceiver2 = dy3Var.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.M(1);
                ImageReceiver imageReceiver3 = dy3Var.w;
                imageReceiver3.x0 = true;
                imageReceiver3.p0(dy3Var);
                boolean Y7 = zu1Var.Y7();
                ly3Var.i0 = Y7;
                ly3Var.n = Y7;
                zu1Var.showDialog(ly3Var);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void C0(defpackage.wb2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.C0(wb2):void");
    }

    @Override
    public final boolean E(defpackage.wb2 r38, org.telegram.tgnet.TLRPC.TodoItem r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.E(wb2, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
        int i;
        if (wb2Var != null && document != null) {
            zu1 zu1Var = this.a;
            if (zu1Var.getParentLayout() != null && W1(wb2Var)) {
                boolean J3 = r47.J3(document);
                wb2Var.setScrimBlockBounds(rectF);
                fu5 I = fu5.I(zu1Var, wb2Var);
                if (J3) {
                    i = 2131745639;
                } else {
                    i = 2131745659;
                }
                I.b(2131232119, ob6.M0(i, null), new on1(this, wb2Var, document, (byte) 6), false);
                I.p = new ut1(wb2Var, rectF, (byte) 0);
                I.a0();
            }
        }
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
        wk5 wk5Var;
        int i;
        long j;
        int i2;
        wk5 wk5Var2;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() != null && tLObject != null) {
            wk5Var = ((e) zu1Var).parentLayout;
            if (wk5Var != null) {
                wk5Var2 = ((e) zu1Var).parentLayout;
                if (((ActionBarLayout) wk5Var2).w()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z2 = tLObject instanceof TLRPC.Chat;
            if (z2) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            } else {
                return;
            }
            TLRPC.Chat chat = null;
            if (z && z2) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232583, 2, zu1Var.getResourceProvider(), zu1Var.getParentActivity());
                yob.h(aob.G8, zu1Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
                b8 b8Var = new b8(zu1Var.getParentActivity(), false, false);
                b8Var.j(ob6.M0(2131747538, null), 2131232093, null);
                b8Var.setMinimumWidth(160);
                b8Var.setOnClickListener(new r81(this, (byte) 9));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var);
                b8 b8Var2 = new b8(zu1Var.getParentActivity(), false, false);
                b8Var2.j(ob6.M0(2131746389, null), 2131232049, null);
                b8Var2.setMinimumWidth(160);
                b8Var2.setOnClickListener(new c0(this, (TLRPC.Chat) tLObject, wb2Var, (byte) 19));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(b8Var2);
                zu1 zu1Var2 = new zu1(bundle);
                zu1Var2.ga = true;
                zu1Var.presentFragmentAsPreviewWithMenu(zu1Var2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                zu1Var.p5();
                return;
            }
            if (z2) {
                chat = (TLRPC.Chat) tLObject;
            }
            if (xc2.V(chat)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                i = ((e) zu1Var).currentAccount;
                long j2 = -chat2.id;
                if (chat2.min) {
                    j = 0;
                } else {
                    j = chat2.access_hash;
                }
                i2 = ((e) zu1Var).currentAccount;
                ha4 ha4Var = new ha4(j2, j, 0, "open_channel", null, "channel_rec", null, ea4.g(i2), Utilities.b.nextLong());
                String i3 = ea4.i(i);
                if (i3 != null) {
                    ea4.e.postRunnable(new x94(i3, ha4Var, (byte) 0));
                }
            }
            zu1Var.presentFragment(new zu1(bundle));
        }
    }

    @Override
    public final void G(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.Message message = messageObject.k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.f6(true);
        zu1 zu1Var = this.a;
        zu1Var.getMessagesStorage().U1(r47.B0(messageObject.k), messageObject.k);
        zu1Var.getMessagesController().i4.g(messageObject, true, false);
        f(wb2Var, true, false, true);
    }

    @Override
    public final boolean G0(wb2 wb2Var, final TLRPC.TodoItem todoItem, final boolean z) {
        TLRPC.Peer peer;
        int i;
        TLRPC.Peer peer2;
        int i2;
        boolean l3 = r47.l3(wb2Var.getMessageObject().k);
        zu1 zu1Var = this.a;
        if (l3) {
            TLRPC.Message message = wb2Var.getMessageObject().k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long n = wf3.n(peer2);
            d31 b0 = d31.b0(zu1Var);
            i2 = ((e) zu1Var).currentAccount;
            b0.Q(2131624113, 36, hl.S2(ob6.a0(null, null, 2131743740, wf3.k(i2, n)))).k(true);
            return false;
        } else if (!wb2Var.getMessageObject().q()) {
            TLRPC.Message message2 = wb2Var.getMessageObject().k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long n2 = wf3.n(peer);
            d31 b02 = d31.b0(zu1Var);
            i = ((e) zu1Var).currentAccount;
            b02.Q(2131624113, 36, hl.S2(ob6.a0(null, null, 2131743741, wf3.k(i, n2)))).k(true);
            return false;
        } else if (!zu1Var.getUserConfig().p()) {
            d31.b0(zu1Var).Q(2131624211, 36, hl.N2(ob6.M0(2131743717, null), -1, 2, new st1(this, (byte) 9), null)).k(true);
            return false;
        } else {
            final long M = xc2.M(zu1Var.e, zu1Var.r8, true);
            final r7a sendMessagesHelper = zu1Var.getSendMessagesHelper();
            final r47 messageObject = wb2Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(r47.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().j1(r47.B0(messageObject.k));
            if (z) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    r7a r7aVar = r7a.this;
                    final boolean z2 = z;
                    if (tL_error == null) {
                        final jf7 messagesStorage = r7aVar.getMessagesStorage();
                        r47 r47Var = messageObject;
                        final long B0 = r47.B0(r47Var.k);
                        final int e1 = r47Var.e1();
                        final int i3 = todoItem.id;
                        final long e = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        to3 to3Var = messagesStorage.a;
                        final long j = M;
                        to3Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.pe7.run():void");
                            }
                        });
                        r7aVar.getMessagesController().Y3((TLRPC.Updates) tLObject, false);
                    }
                    hl.c3(new t64(r7aVar, hash, z2, (byte) 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void G1(wb2 wb2Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull N0;
        TLRPC.User currentUser = wb2Var.getCurrentUser();
        zu1 zu1Var = this.a;
        if (hl.C1(zu1Var.getParentActivity()) && (chat = zu1Var.e) != null && currentUser != null && !xc2.V(chat)) {
            uc7 messagesController = zu1Var.getMessagesController();
            long j = zu1Var.e.id;
            long j2 = currentUser.id;
            zh6 zh6Var = (zh6) messagesController.q1.f(j);
            if (zh6Var == null && (N0 = messagesController.N0(j)) != null && N0.participants != null) {
                for (int i = 0; i < N0.participants.participants.size(); i++) {
                    chatParticipant = N0.participants.participants.get(i);
                    if (chatParticipant.user_id == j2) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) zh6Var.f(j2);
            e(wb2Var, chatParticipant);
        }
    }

    @Override
    public final void H(defpackage.wb2 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.H(wb2, int, float, float, boolean):void");
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        zu1 zu1Var = this.a;
        if (!zu1Var.b8()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (zu1Var.getParentActivity() != null) {
                if (zu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    nr1 nr1Var = zu1Var.a0;
                    r47 messageObject = wb2Var.getMessageObject();
                    r47 messageObject2 = wb2Var.getMessageObject();
                    cq1 cq1Var = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    l01 l01Var = zu1Var.pc;
                    if (l01Var != null) {
                        l01Var.a(true);
                        zu1Var.pc = null;
                    }
                    if (str != null && wb2Var.getMessageObject() != null) {
                        cq1Var = new cq1(zu1Var, wb2Var.getMessageObject().e1(), str, wb2Var, (byte) 1);
                        zu1Var.pc = cq1Var;
                    } else {
                        zu1Var.pc = null;
                    }
                    nr1Var.u0(keyboardButtonProto, messageObject, messageObject2, cq1Var);
                }
            }
        }
    }

    @Override
    public final void I1(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        zu1 zu1Var = this.a;
        zu1Var.v5 = messageObject;
        zu1Var.D7();
    }

    @Override
    public final void J0(wb2 wb2Var) {
        int i;
        int i2;
        zq1 zq1Var;
        r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.c3 = !primaryMessageObject.c3;
            primaryMessageObject.M1 = true;
            zu1 zu1Var = this.a;
            wq1 wq1Var = zu1Var.A0;
            if (wq1Var != null && (zq1Var = zu1Var.C0) != null && zq1Var.y < 0) {
                for (int childCount = wq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = zu1Var.A0.getChildAt(childCount);
                    zu1Var.A0.getClass();
                    i = RecyclerView.S(childAt);
                    if (i >= 0) {
                        if (childAt instanceof wb2) {
                            if (((wb2) childAt).getCurrentMessagesGroup() == null) {
                                i2 = zu1Var.i7(childAt);
                                break;
                            }
                        } else if (childAt instanceof dl1) {
                            i2 = zu1Var.i7(childAt);
                            break;
                        }
                    }
                }
            }
            i = -1;
            i2 = 0;
            zu1Var.Zc(primaryMessageObject, false);
            kg5 kg5Var = zu1Var.P1;
            if (kg5Var != null) {
                kg5Var.f(true);
            }
            if (i >= 0 && wb2Var.getCurrentMessagesGroup() == null) {
                zu1Var.C0.g1(i, i2);
            }
        }
    }

    @Override
    public final de8 J1() {
        return this.a.Ta;
    }

    @Override
    public final boolean K() {
        SparseArray[] sparseArrayArr = this.a.o6;
        if (sparseArrayArr[1].size() + sparseArrayArr[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void K0(wb2 wb2Var, float f, float f2) {
        this.a.Y5(wb2Var, true, false, f, f2, false, false, false);
    }

    @Override
    public final void K1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new jk2(str2, str, false), 0, spannableString.length(), 33);
        hl.g(spannableString);
        d31.b0(this.a).i(ob6.M0(2131751987, null)).j();
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
        sz1 sz1Var;
        String str;
        zu1 zu1Var = this.a;
        if (!z && (sz1Var = zu1Var.c4) != null) {
            r47 messageObject = wb2Var.getMessageObject();
            if (characterStyle instanceof i8c) {
                str = "@";
            } else if ((characterStyle instanceof URLSpan) && !(characterStyle instanceof no4)) {
                str = ((URLSpan) characterStyle).getURL();
            } else {
                str = null;
            }
            sz1Var.b(messageObject, str);
        }
        zu1Var.m6(characterStyle, z, wb2Var.getMessageObject(), wb2Var);
    }

    @Override
    public final boolean L1(long r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.L1(long):boolean");
    }

    @Override
    public final boolean M() {
        zu1 zu1Var = this.a;
        if (!lbc.B(zu1Var.f) && !lbc.D(zu1Var.f)) {
            return false;
        }
        return true;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        zu1 zu1Var;
        int i;
        if (wb2Var.getMessageObject() != null && (i = (zu1Var = this.a).lc) != 0 && i == wb2Var.getMessageObject().e1() && zu1Var.mc == 3) {
            return zu1Var.oc;
        }
        return null;
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
        TLRPC.Message message;
        if (wb2Var == null) {
            q38Var.run();
            return;
        }
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null && ((!messageObject.n4() || messageObject.Y2()) && (message = messageObject.k) != null && message.rich_message != null)) {
            e eVar = this.a;
            eVar.getSendMessagesHelper().u(messageObject, messageObject.k.rich_message, null, eVar, true);
            return;
        }
        q38Var.run();
    }

    @Override
    public final int N() {
        return this.a.g4;
    }

    @Override
    public final void N0(wb2 wb2Var) {
        float f;
        if (wb2Var.getMessageObject().y3()) {
            Q0();
            return;
        }
        zu1 zu1Var = this.a;
        if (!zu1Var.A3 && zu1Var.A0 != null && zu1Var.getParentActivity() != null && zu1Var.fragmentView != null) {
            if (zu1Var.J2 == null) {
                int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
                if (indexOfChild != -1) {
                    kg5 x4 = zu1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    zu1Var.J2 = x4;
                    x4.t(ob6.M0(2131749083, null));
                } else {
                    return;
                }
            }
            r47 messageObject = wb2Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = wb2Var.getCurrentUser();
                if (currentUser != null && currentUser.id == 0) {
                    f = (wb2Var.getMeasuredHeight() - Math.max(0, wb2Var.getBottom() - ((View) wb2Var.getParent()).getMeasuredHeight())) - hl.L(50.0f);
                } else {
                    float L = hl.L(22.0f);
                    if (!messageObject.O3() && wb2Var.w9 && wb2Var.h9 != null) {
                        f = hl.L(20.0f) + L;
                    } else {
                        f = L;
                    }
                }
                if (zu1Var.x7(wb2Var, f) > hl.L(80.0f)) {
                    zu1Var.J2.w(zu1Var.w7(wb2Var, wb2Var.getForwardNameCenterX()), zu1Var.x7(wb2Var, f) - hl.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final void N1(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.X5();
            messageObject.M1 = true;
            wb2Var.J1();
            wb2Var.requestLayout();
            this.a.D0.M(messageObject, false, false);
        }
    }

    @Override
    public final void O(wb2 wb2Var) {
        r47 primaryMessageObject = wb2Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Zc(primaryMessageObject, false);
    }

    @Override
    public final int P(wb2 wb2Var) {
        xg8 xg8Var;
        zu1 zu1Var = this.a;
        if (zu1Var.sd.f && (xg8Var = zu1Var.yd) != null && xg8Var.n == wb2Var && xg8Var.a.getWidth() > 0) {
            return zu1Var.yd.a.getHeight();
        }
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        r47 messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (wb2Var != null && pageBlock != null) {
            zu1 zu1Var = this.a;
            if (zu1Var.getParentActivity() != null && (messageObject = wb2Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i = 0; i < arrayList2.size(); i++) {
                    dk9 dk9Var = (dk9) arrayList2.get(i);
                    if (dk9Var instanceof qk9) {
                        arrayList.add(((qk9) dk9Var).r0);
                    } else if (dk9Var instanceof cl9) {
                        arrayList.add(((cl9) dk9Var).r0);
                    } else if (dk9Var instanceof ik9) {
                        ArrayList arrayList3 = ((ik9) dk9Var).Y;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            arrayList.add(((xj9) obj).b);
                        }
                    } else if (dk9Var instanceof uk9) {
                        ArrayList arrayList4 = ((uk9) dk9Var).Y;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((xj9) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer q0 = PhotoViewer.q0();
                    q0.T1(null, zu1Var, null);
                    return q0.m1(null, null, null, null, null, null, null, indexOf, new qt1(zu1Var, arrayList), null, 0L, 0L, 0L, true, new pt1(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override
    public final void Q(wb2 wb2Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() != null) {
            if (zu1Var.ua == null) {
                j19 j19Var = new j19(zu1Var.getParentActivity());
                zu1Var.ua = j19Var;
                zu1Var.m1.addView(j19Var, tre.e(-1, -1, 48));
            }
            j19 j19Var2 = zu1Var.ua;
            HashMap hashMap = j19Var2.a;
            ArrayList arrayList = j19Var2.c;
            arrayList.clear();
            int i = j19Var2.d;
            yac h = yac.h(i);
            long j = h.n;
            arrayList.add(Long.valueOf(j));
            if (h.W) {
                ArrayList arrayList2 = ls6.d0(i).j1;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j2 = tL_topPeer.peer.user_id;
                    if (j2 != 0 && uc7.s1(i).X1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = uc7.s1(i).y;
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i3);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j3 = dialog.id;
                    if (j3 != j && !wf3.B(j3)) {
                        if (wf3.D(dialog.id)) {
                            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(dialog.id));
                            if (X1 != null && !lbc.v(X1) && !lbc.z(X1) && !lbc.C(X1.id)) {
                                int i4 = dialog.folder_id;
                                long j4 = dialog.id;
                                if (i4 == 1) {
                                    arrayList3.add(Long.valueOf(j4));
                                } else {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        } else {
                            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-dialog.id));
                            if (M0 != null && !M0.forum && !xc2.r0(M0) && ((!M0.gigagroup || xc2.N(M0)) && (!xc2.T(M0) || M0.creator || (((tL_chatAdminRights = M0.admin_rights) != null && tL_chatAdminRights.post_messages) || M0.megagroup)))) {
                                int i5 = dialog.folder_id;
                                long j5 = dialog.id;
                                if (i5 == 1) {
                                    arrayList3.add(Long.valueOf(j5));
                                } else {
                                    arrayList.add(Long.valueOf(j5));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b = j19.b(wb2Var);
            if (b != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    Long l = (Long) obj2;
                    if (hashSet.add(l) && wf3.D(l.longValue())) {
                        arrayList5.add(l);
                    }
                }
                i19 i19Var = new i19(j19Var2, wb2Var, arrayList5, new z09(j19Var2, b, (byte) 3));
                i19Var.setBounds(0, 0, j19Var2.getMeasuredWidth(), j19Var2.getMeasuredHeight());
                i19Var.setCallback(j19Var2);
                if (!hashMap.containsKey(b)) {
                    hashMap.put(b, i19Var);
                }
            }
        }
    }

    @Override
    public final void Q0() {
        zu1 zu1Var = this.a;
        zu1Var.i6();
        UndoView undoView = zu1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, zu1Var.l6, null);
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return !this.a.s.containsKey(r47Var);
    }

    @Override
    public final iv1 S() {
        return this.a.Fc;
    }

    @Override
    public final void T(r47 r47Var) {
        this.a.s.put(r47Var, Boolean.TRUE);
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        a aVar;
        r47 messageObject;
        if (chat == null) {
            return;
        }
        zu1 zu1Var = this.a;
        aVar = ((e) zu1Var).actionBar;
        if (!aVar.z() && !zu1Var.c8()) {
            if (!z && chat.signature_profiles && (messageObject = wb2Var.getMessageObject()) != null && r47.B0(messageObject.k) != 1271266957) {
                zu1Var.Fa(wf3.n(messageObject.k.from_id));
                return;
            } else {
                j(wb2Var, chat, i, z);
                return;
            }
        }
        zu1Var.Sa(wb2Var, f, f2, true);
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        dq1 dq1Var;
        int i;
        me7 me7Var;
        r47 messageObject = wb2Var.getMessageObject();
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            zu1 zu1Var = this.a;
            l01 l01Var = zu1Var.pc;
            if (l01Var != null) {
                l01Var.a(true);
                zu1Var.pc = null;
            }
            if (wb2Var.getMessageObject() == null) {
                zu1Var.pc = null;
                dq1Var = null;
            } else {
                dq1Var = new dq1(zu1Var, wb2Var.getMessageObject().e1(), wb2Var, (byte) 1);
                zu1Var.pc = dq1Var;
            }
            i = ((e) this.a).currentAccount;
            jxa v = jxa.v(i, false);
            Objects.requireNonNull(dq1Var);
            go1 go1Var = new go1(dq1Var, (byte) 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = org.telegram.messenger.a.b;
            }
            vnb F = jxa.F();
            if (messageObject != null && context != null) {
                long B0 = r47.B0(messageObject.k);
                int e1 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = uc7.s1(v.a).j1(B0);
                tL_inputInvoiceMessage.msg_id = e1;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u = xw0.u(F, false);
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                me7Var = new me7(v, ConnectionsManager.getInstance(v.a).sendRequest(tL_payments_getPaymentForm, new au0(v, messageObject, tL_inputInvoiceMessage, go1Var, (byte) 22)), (byte) 18);
            } else {
                me7Var = null;
            }
            if (me7Var != null) {
                dq1Var.b = me7Var;
                dq1Var.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.k;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i2 = -1;
            for (int i3 = 0; i3 < tL_messageMediaPaidMedia.extended_media.size(); i3++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i3);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i2 = arrayList.size();
                    }
                    TLRPC.TL_message O5 = zu1.O5(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        O5.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        O5.attachPath = message.attachPath;
                    }
                    O5.media = tL_messageExtendedMedia.media;
                    O5.noforwards = true;
                    arrayList.add(new r47(messageObject.K1, O5, false, true));
                }
            }
            if (i2 > -1 && !arrayList.isEmpty()) {
                PhotoViewer q0 = PhotoViewer.q0();
                zu1 zu1Var2 = this.a;
                q0.T1(null, zu1Var2, zu1Var2.Ba);
                PhotoViewer.q0().n1(arrayList, i2, this.a.a(), 0L, 0L, this.a.eb);
            }
        }
    }

    @Override
    public final void U0(wb2 wb2Var) {
        zu1 zu1Var = this.a;
        if (!zu1Var.getMessagesController().g5()) {
            id idVar = new id(3, null, zu1Var.getParentActivity());
            idVar.q(200L);
            zu1Var.getMessagesController().R0(new gt(this, idVar, wb2Var, (byte) 10));
            return;
        }
        if (wb2Var.getMessageObject() != null) {
            wb2Var.getMessageObject().t2 = Boolean.FALSE;
        }
        wb2Var.K3();
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        zu1 zu1Var = this.a;
        zu1Var.getSendMessagesHelper().m0(true, wb2Var.getMessageObject(), keyboardInlineButton, null, null, zu1Var);
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.o6(wb2Var, reactionCount, z, f, f2);
    }

    @Override
    public final boolean V1(wb2 wb2Var, final TLRPC.User user) {
        ?? r2;
        ?? r4;
        char c;
        int i;
        yb0 b;
        int i2;
        rr1 rr1Var;
        qr1 qr1Var;
        if (!g()) {
            return false;
        }
        zu1 zu1Var = this.a;
        if (zu1Var.e != null && (((rr1Var = zu1Var.d1) == null || rr1Var.getVisibility() != 0) && ((qr1Var = zu1Var.T) == null || qr1Var.getVisibility() != 0))) {
            r2 = 1;
        } else {
            r2 = 0;
        }
        TLRPC.Chat chat = zu1Var.e;
        if (chat != null && ((zu1Var.s4 == 0 || zu1Var.x4) && (!xc2.T(chat) || zu1Var.e.megagroup))) {
            r4 = 1;
        } else {
            r4 = 0;
        }
        ec0[] ec0VarArr = new ec0[r2 + 2 + r4];
        ec0VarArr[0] = ec0.d;
        ec0VarArr[1] = ec0.h;
        if (r2 != 0) {
            ec0VarArr[2] = ec0.n;
            c = 3;
        } else {
            c = 2;
        }
        if (r4 != 0) {
            ec0VarArr[c] = ec0.r;
        }
        TLRPC.UserFull Y1 = zu1Var.getMessagesController().Y1(user.id);
        if (Y1 == null) {
            i = ((e) zu1Var).classGuid;
            b = yb0.b(user, i, ec0VarArr);
        } else {
            b = yb0.c(user, Y1, ec0VarArr);
            if (!vh4.i(b)) {
                i2 = ((e) zu1Var).classGuid;
                b = yb0.b(user, i2, ec0VarArr);
            }
        }
        if (vh4.i(b)) {
            vh4.r().J((ViewGroup) zu1Var.fragmentView, zu1Var.Ba, b, new ie(this, wb2Var, user, (byte) 15));
            return true;
        }
        fu5 I = fu5.I(zu1Var, wb2Var);
        I.b(2131232271, ob6.M0(2131747513, null), new Runnable(this) {
            public final ju1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                ju1 ju1Var = this.b;
                switch (b2) {
                    case 0:
                        ju1Var.o(user2, false);
                        return;
                    case 1:
                        ju1Var.c(user2);
                        return;
                    default:
                        ju1Var.a.Da(user2);
                        return;
                }
            }
        }, false);
        I.b(2131232118, ob6.M0(2131745329, null), new on1(this, wb2Var, user, (byte) 7), false);
        I.k(2131232227, ob6.M0(2131748363, null), new Runnable(this) {
            public final ju1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                ju1 ju1Var = this.b;
                switch (b2) {
                    case 0:
                        ju1Var.o(user2, false);
                        return;
                    case 1:
                        ju1Var.c(user2);
                        return;
                    default:
                        ju1Var.a.Da(user2);
                        return;
                }
            }
        }, r2);
        I.k(2131232359, ob6.M0(2131753751, null), new Runnable(this) {
            public final ju1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                ju1 ju1Var = this.b;
                switch (b2) {
                    case 0:
                        ju1Var.o(user2, false);
                        return;
                    case 1:
                        ju1Var.c(user2);
                        return;
                    default:
                        ju1Var.a.Da(user2);
                        return;
                }
            }
        }, r4);
        I.t = false;
        I.i = (byte) 3;
        I.c0 = true;
        I.b0(0.0f, -hl.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
        a aVar;
        zu1 zu1Var = this.a;
        aVar = ((e) zu1Var).actionBar;
        boolean z = true;
        if (!aVar.z() && !zu1Var.c8()) {
            if (wb2Var != null && wb2Var.getMessageObject() != null && wb2Var.getMessageObject().q4()) {
                q1(wb2Var, 10);
                return;
            }
            if (!xc2.c0(zu1Var.e) && !zu1Var.k8()) {
                z = false;
            }
            o(user, z);
            return;
        }
        zu1Var.Sa(wb2Var, f, f2, true);
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        r47 messageObject;
        if (wb2Var == null) {
            messageObject = null;
        } else {
            messageObject = wb2Var.getMessageObject();
        }
        if (messageObject != null && messageObject.k != null) {
            zu1 zu1Var = this.a;
            if (zu1Var.g4 != 1 && !zu1Var.a8() && !messageObject.k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void Y(int i) {
        CharSequence N2;
        int i2;
        SpannableStringBuilder S2;
        int i3;
        zu1 zu1Var = this.a;
        try {
            if (i == 0) {
                zu1Var.t5();
                ls1 ls1Var = zu1Var.O3;
                if (ls1Var != null) {
                    ls1Var.l(0L, 84, null, new st1(this, (byte) 1));
                    zu1Var.O3.performHapticFeedback(3, 2);
                }
            } else if (i == 1) {
                String x = ob6.x(zu1Var.getMessagesController().H3, true);
                if (zu1Var.getMessagesController().H3 > 0) {
                    i3 = ((e) zu1Var).currentAccount;
                    S2 = hl.S2(ob6.G(u2c.g(i3), "TranscriptionTrialLeftUntil", x));
                } else {
                    i2 = ((e) zu1Var).currentAccount;
                    S2 = hl.S2(ob6.G(u2c.g(i2), "TranscriptionTrialLeft", new Object[0]));
                }
                d31.b0(zu1Var).G(2131624295, 6, S2).k(true);
                zu1Var.fragmentView.performHapticFeedback(3, 2);
            } else if (i == 2 || i == 3) {
                String x2 = ob6.x(zu1Var.getMessagesController().H3, true);
                d31 b0 = d31.b0(zu1Var);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) hl.S2(ob6.G(zu1Var.getMessagesController().G3, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i == 2) {
                    N2 = hl.N2(ob6.M0(2131743623, null), -1, 0, new st1(this, (byte) 2), null);
                } else if (zu1Var.getMessagesController().H3 <= 0) {
                    N2 = "";
                } else {
                    N2 = hl.N2(ob6.a0(null, null, 2131743622, x2), -1, 0, new st1(this, (byte) 3), null);
                }
                SpannableStringBuilder append2 = append.append(N2);
                b0.getClass();
                c21 c21Var = new c21(b0.X(), b0.c);
                c21Var.g(2131624295, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i4 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i4 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i4++;
                    }
                }
                c21Var.b.setText(append2);
                c21Var.b.setSingleLine(false);
                c21Var.b.setMaxLines(6);
                b0.b(c21Var, 7000).k(true);
                yw0.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void Y0(wb2 wb2Var) {
        r47 r47Var;
        long j;
        int i;
        ArrayList arrayList;
        ue2 ue2Var;
        m47 m47Var;
        int i2;
        zu1 zu1Var = this.a;
        j19 j19Var = zu1Var.ua;
        if (j19Var != null) {
            HashMap hashMap = j19Var.a;
            i19 i19Var = (i19) hashMap.get(j19.b(wb2Var));
            v21 v21Var = null;
            if (i19Var != null) {
                r47Var = i19Var.F;
            } else {
                r47Var = null;
            }
            i19 i19Var2 = (i19) zu1Var.ua.a.get(j19.b(wb2Var));
            if (i19Var2 != null && (i2 = i19Var2.S) != -1) {
                j = i19Var2.x[i2].d;
            } else {
                j = 0;
            }
            if (r47Var != null && j != 0) {
                Activity parentActivity = zu1Var.getParentActivity();
                i = ((e) zu1Var).currentAccount;
                boolean z = false;
                if (!jj.h(parentActivity, i, j, false)) {
                    if (r47Var.c1() != 0 && (m47Var = (m47) zu1Var.P6.f(r47Var.c1())) != null) {
                        arrayList = m47Var.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = qd4.t(r47Var);
                    }
                    if (j == yac.h(yac.t0).n) {
                        z = true;
                    }
                    long j2 = j;
                    ue2 ue2Var2 = new ue2(this, arrayList, j2, (byte) 15);
                    if (z) {
                        ue2Var2.run();
                        ue2Var = null;
                    } else {
                        ue2Var = ue2Var2;
                    }
                    v21Var = d31.v(zu1Var.getParentActivity(), zu1Var, null, 1, j2, 1, zu1Var.getThemedColor(aob.wj), zu1Var.getThemedColor(aob.yj), 5000, false, ue2Var);
                    v21Var.k = true;
                    v21Var.k(v21Var.e instanceof g21);
                }
            }
            i19 i19Var3 = (i19) hashMap.get(j19.b(wb2Var));
            if (i19Var3 != null) {
                if (v21Var == null) {
                    i19Var3.S = -1;
                    i19Var3.c();
                    return;
                }
                z11 z11Var = v21Var.e;
                if (!(z11Var instanceof c21)) {
                    i19Var3.c();
                    return;
                }
                c21 c21Var = (c21) z11Var;
                i19Var3.X = c21Var;
                c21Var.a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = i19Var3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new z(i19Var3, viewTreeObserver, (byte) 4));
            }
        }
    }

    @Override
    public final boolean Z() {
        if (this.a.g4 == 0) {
            return true;
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        zu1 zu1Var = this.a;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            CharSequence fieldText = nr1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String K = xc2.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                zu1Var.a0.setFieldText(spannableStringBuilder);
                hl.d3(new st1(this, (byte) 6), 200L);
            }
        }
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        zu1 zu1Var;
        int i;
        if (wb2Var.getMessageObject() != null && (i = (zu1Var = this.a).lc) != 0 && i == wb2Var.getMessageObject().e1() && zu1Var.mc == 1) {
            return zu1Var.nc;
        }
        return null;
    }

    @Override
    public final void a1(defpackage.wb2 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.a1(wb2):void");
    }

    @Override
    public final void a2(wb2 wb2Var, float f, float f2) {
        r47 messageObject = wb2Var.getMessageObject();
        int i = messageObject.D;
        zu1 zu1Var = this.a;
        if (i == 16) {
            TLRPC.MessageAction messageAction = messageObject.k.action;
            int i2 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(zu1Var.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i2 < size) {
                    TLRPC.Peer peer = arrayList.get(i2);
                    i2++;
                    hashSet.add(Long.valueOf(wf3.n(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                id idVar = new id(3, null, zu1Var.getParentActivity());
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = zu1Var.getMessagesController().k4.E3.f();
                idVar.setOnCancelListener(new gt0(this, zu1Var.getConnectionsManager().sendRequest(getgroupcall, new in0(this, idVar, hashSet, tL_inputGroupCallInviteMessage, messageObject, (byte) 5)), (byte) 2));
                idVar.q(600L);
                return;
            }
            TLRPC.User user = zu1Var.f;
            if (user != null) {
                boolean I4 = messageObject.I4();
                TLRPC.UserFull userFull = zu1Var.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i2 = 1;
                }
                xkc.m(user, I4, i2, zu1Var.getParentActivity(), zu1Var.getMessagesController().Y1(zu1Var.f.id), zu1Var.getAccountInstance());
                return;
            }
            return;
        }
        zu1Var.Y5(wb2Var, true, false, f, f2, messageObject.I3(), false, false);
    }

    @Override
    public final boolean b() {
        a aVar;
        a aVar2;
        boolean z;
        zu1 zu1Var = this.a;
        aVar = ((e) zu1Var).actionBar;
        if (aVar != null) {
            aVar2 = ((e) zu1Var).actionBar;
            if (!aVar2.z() && !zu1Var.c8()) {
                z = ((e) zu1Var).inPreviewMode;
                if (!z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        zu1 zu1Var = this.a;
        nr1 nr1Var = zu1Var.a0;
        if (nr1Var != null) {
            CharSequence fieldText = nr1Var.getFieldText();
            if (fieldText != null) {
                spannableStringBuilder = new SpannableStringBuilder(fieldText);
                if (fieldText.charAt(fieldText.length() - 1) != ' ') {
                    spannableStringBuilder.append((CharSequence) " ");
                }
            } else {
                spannableStringBuilder = new SpannableStringBuilder();
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != ' ') {
                spannableStringBuilder.append(' ');
            }
            String p = lbc.p(user);
            if (p != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) p).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(qd4.o(lbc.k(user, false), " "));
                spannableString.setSpan(new i8c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            zu1Var.a0.setFieldText(spannableStringBuilder);
            hl.d3(new st1(this, (byte) 7), 200L);
        }
    }

    @Override
    public final boolean c0() {
        boolean z;
        zu1 zu1Var = this.a;
        if (!zu1Var.c8()) {
            z = ((e) zu1Var).inPreviewMode;
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null) {
            int a = mi8.a(messageObject);
            boolean a2 = vsd.a(a, 7);
            zu1 zu1Var = this.a;
            if (a2) {
                d31.b0(zu1Var).Q(2131624007, 36, mi8.b(a, messageObject)).j();
            } else if (i < 0 && !arrayList.isEmpty()) {
                zu1Var.getSendMessagesHelper().v0(messageObject, arrayList, null);
                wb2Var.b0(true);
            } else if (zu1Var.getParentActivity() != null) {
                if (zu1Var.C2 == null) {
                    int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    kg5 x4 = zu1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    zu1Var.C2 = x4;
                    x4.v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i < 0) {
                    ArrayList<vb2> pollButtons = wb2Var.getPollButtons();
                    int size = pollButtons.size();
                    int i4 = 0;
                    float f = 0.0f;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        vb2 vb2Var = pollButtons.get(i4);
                        float y = ((wb2Var.getY() + vb2Var.b) - hl.L(4.0f)) - zu1Var.P9;
                        zu1Var.F2 = hl.L(13.3f) + vb2Var.a;
                        int A = c00.A(6.0f, vb2Var.b, i3);
                        zu1Var.G2 = A;
                        if (y > 0.0f) {
                            i2 = zu1Var.F2;
                            i3 = A;
                            f = 0.0f;
                            break;
                        }
                        i4++;
                        f = y;
                    }
                    if (f != 0.0f) {
                        zu1Var.A0.y0(0, (int) f, null);
                        zu1Var.E2 = wb2Var;
                        return;
                    }
                }
                zu1Var.qc(wb2Var, i, i2, i3);
            }
        }
    }

    @Override
    public final void d() {
        this.a.m1.getClass();
    }

    @Override
    public final void d0(r47 r47Var) {
        if (r47.K4(r47Var.k)) {
            this.a.Eb(r47Var, true);
        }
    }

    @Override
    public final void d2() {
        this.a.Q7();
    }

    public final void e(wb2 wb2Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        vnb vnbVar;
        TLRPC.User currentUser = wb2Var.getCurrentUser();
        zu1 zu1Var = this.a;
        zu1Var.getUserConfig().f();
        if (hl.C1(zu1Var.getParentActivity()) && (chat = zu1Var.e) != null && currentUser != null && !xc2.V(chat)) {
            boolean z4 = true;
            boolean z5 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z = false;
                    z5 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == zu1Var.getUserConfig().e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                    z4 = false;
                }
                str = channelParticipant.rank;
            } else if (tLObject instanceof TLRPC.TL_chatChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = ((TLRPC.TL_chatChannelParticipant) tLObject).channelParticipant;
                if (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator) {
                    z2 = false;
                    z5 = true;
                } else if (channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant2.promoted_by == zu1Var.getUserConfig().e()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    z4 = false;
                }
                str2 = channelParticipant2.rank;
                z3 = z2;
                boolean z6 = z4;
                boolean z7 = z5;
                Activity parentActivity = zu1Var.getParentActivity();
                i = ((e) zu1Var).currentAccount;
                vnbVar = ((e) zu1Var).resourceProvider;
                sjb.b(parentActivity, i, -zu1Var.e.id, currentUser, str2, z6, z7, z3, vnbVar);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z = false;
                    z5 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == zu1Var.getUserConfig().e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                    z4 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (xc2.T(zu1Var.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                zu1Var.getMessagesController();
                tL_channels_getParticipant.channel = uc7.i1(zu1Var.e);
                tL_channels_getParticipant.participant = zu1Var.getMessagesController().j1(currentUser.id);
                zu1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new ic((byte) 0), new qe2(this, wb2Var, (byte) 7));
                return;
            } else {
                return;
            }
            z3 = z;
            str2 = str;
            boolean z62 = z4;
            boolean z72 = z5;
            Activity parentActivity2 = zu1Var.getParentActivity();
            i = ((e) zu1Var).currentAccount;
            vnbVar = ((e) zu1Var).resourceProvider;
            sjb.b(parentActivity2, i, -zu1Var.e.id, currentUser, str2, z62, z72, z3, vnbVar);
        }
    }

    @Override
    public final void e2(wb2 wb2Var) {
        zu1 zu1Var = this.a;
        zu1Var.Ua.k(wb2Var, zu1Var, true);
        zu1Var.A0.K0(false);
    }

    public final void f(wb2 wb2Var, boolean z, boolean z2, boolean z3) {
        r47 primaryMessageObject;
        int i;
        int i2;
        zq1 zq1Var;
        if (wb2Var == null || (primaryMessageObject = wb2Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        zu1 zu1Var = this.a;
        wq1 wq1Var = zu1Var.A0;
        if (wq1Var != null && (zq1Var = zu1Var.C0) != null && zq1Var.y < 0) {
            for (int childCount = wq1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = zu1Var.A0.getChildAt(childCount);
                zu1Var.A0.getClass();
                i = RecyclerView.S(childAt);
                if (i >= 0) {
                    if (childAt instanceof wb2) {
                        if (((wb2) childAt).getCurrentMessagesGroup() == null) {
                            i2 = zu1Var.i7(childAt);
                            break;
                        }
                    } else if (childAt instanceof dl1) {
                        i2 = zu1Var.i7(childAt);
                        break;
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        if (z && i >= 0 && wb2Var.getCurrentMessagesGroup() == null) {
            zq1 zq1Var2 = zu1Var.C0;
            if (z3) {
                zu1Var.A0.getClass();
                zq1Var2.h1(RecyclerView.S(wb2Var), wb2Var.getTop() - ((int) zu1Var.P9), false);
            } else {
                zq1Var2.g1(i, i2);
            }
        }
        zu1Var.c1 = z2;
        zu1Var.Zc(primaryMessageObject, false);
        zu1Var.c1 = false;
    }

    @Override
    public final void f1(wb2 wb2Var, float f, float f2) {
        i19 i19Var;
        int i;
        boolean z;
        boolean z2;
        float f3;
        j19 j19Var = this.a.ua;
        if (j19Var != null && (i19Var = (i19) j19Var.a.get(j19.b(wb2Var))) != null) {
            f19[] f19VarArr = i19Var.x;
            RectF rectF = i19Var.r;
            if (i19Var.N) {
                float f4 = (f - rectF.left) + i19Var.V;
                float f5 = (f2 - rectF.top) + i19Var.W;
                int floor = (int) Math.floor((f4 - (hl.L(9.0f) - (hl.L(11.0f) / 2.0f))) / hl.L(53.0f));
                if ((-hl.L(37.0f)) < f5 && f5 < rectF.height()) {
                    i = ete.b(floor, 0, f19VarArr.length - 1);
                } else {
                    i = -1;
                }
                if (i19Var.S != i) {
                    i19Var.a.performHapticFeedback(3, 1);
                    i19Var.S = i;
                    for (int i2 = 0; i2 < f19VarArr.length; i2++) {
                        f19 f19Var = f19VarArr[i2];
                        if (i == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f6 = 1.0f;
                        if (f19Var.p != z) {
                            ValueAnimator valueAnimator = f19Var.n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            f19Var.p = z;
                            float f7 = f19Var.o;
                            if (z) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f3);
                            f19Var.n = ofFloat;
                            ofFloat.setDuration(180L);
                            f19Var.n.addUpdateListener(f19Var);
                            f19Var.n.setInterpolator(h19.a);
                            f19Var.n.start();
                        }
                        f19 f19Var2 = f19VarArr[i2];
                        if (i != i2 && i != -1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (f19Var2.m != z2) {
                            ValueAnimator valueAnimator2 = f19Var2.k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            f19Var2.m = z2;
                            float f8 = f19Var2.l;
                            if (!z2) {
                                f6 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f8, f6);
                            f19Var2.k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            f19Var2.k.addUpdateListener(f19Var2);
                            f19Var2.k.setInterpolator(h19.a);
                            f19Var2.k.start();
                        }
                    }
                }
            }
        }
    }

    public final boolean g() {
        zu1 zu1Var = this.a;
        if (!lbc.D(zu1Var.f)) {
            TLRPC.Chat chat = zu1Var.e;
            if (chat != null) {
                if (xc2.T(chat) && !zu1Var.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void g0(String str) {
        zu1 zu1Var = this.a;
        rr1 rr1Var = zu1Var.d1;
        if (rr1Var == null || rr1Var.getVisibility() != 0) {
            qr1 qr1Var = zu1Var.T;
            if ((qr1Var == null || qr1Var.getVisibility() != 0) && zu1Var.a0 != null && str != null && str.length() > 0) {
                nr1 nr1Var = zu1Var.a0;
                nr1Var.setFieldText("@" + str + " ");
                zu1Var.a0.o1();
            }
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
        boolean z = wb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        zu1 zu1Var = this.a;
        if (z) {
            long j = -((TLRPC.TL_messageMediaGiveaway) wb2Var.getMessageObject().k.media).channels.get(i).longValue();
            if (zu1Var.l6 != j) {
                zu1Var.presentFragment(zu1.ha(j));
            } else {
                zu1Var.p1.e(false, false);
            }
        }
        if (wb2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            zu1Var.presentFragment(ProfileActivity.Q2(((TLRPC.TL_messageMediaGiveawayResults) wb2Var.getMessageObject().k.media).winners.get(i).longValue()));
        }
    }

    @Override
    public final void h1(wb2 wb2Var) {
        xg8 xg8Var = this.a.yd;
        if (xg8Var != null && xg8Var.n == wb2Var) {
            xg8Var.x.getClass();
        }
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
        f(wb2Var, z, true, z2);
    }

    @Override
    public final void i() {
        org.telegram.messenger.a.t();
        boolean z = f11.a;
        org.telegram.messenger.a.q();
        m01.u(this.a.getParentActivity(), f11.g);
    }

    @Override
    public final boolean i1() {
        zu1 zu1Var = this.a;
        if (zu1Var.m1.getMeasuredWidth() > zu1Var.m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean i2(int i) {
        boolean z;
        wk5 wk5Var;
        wk5 wk5Var2;
        if (i != 16 && i != 2131296267 && i != 2131296264) {
            return false;
        }
        zu1 zu1Var = this.a;
        z = ((e) zu1Var).inPreviewMode;
        if (z && zu1Var.ga) {
            wk5Var = ((e) zu1Var).parentLayout;
            if (wk5Var != null) {
                wk5Var2 = ((e) zu1Var).parentLayout;
                ((ActionBarLayout) wk5Var2).p();
            }
            return true;
        }
        return !b();
    }

    public final void j(defpackage.wb2 r29, org.telegram.tgnet.TLRPC.Chat r30, int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.j(wb2, org.telegram.tgnet.TLRPC$Chat, int, boolean):void");
    }

    @Override
    public final void j0(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = ob6.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = ob6.M0(2131746321, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            r47.d(spannableStringBuilder, false);
            m47 currentMessagesGroup = wb2Var.getCurrentMessagesGroup();
            zu1 zu1Var = this.a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.e;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if ((((j47) arrayList.get(i)).l & 1) != 0) {
                        r47 r47Var = (r47) currentMessagesGroup.d.get(i);
                        if (r47Var != messageObject) {
                            int childCount = zu1Var.A0.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = zu1Var.A0.getChildAt(i2);
                                if (childAt instanceof wb2) {
                                    wb2 wb2Var2 = (wb2) childAt;
                                    if (r47Var.T(wb2Var2.getMessageObject())) {
                                        wb2Var = wb2Var2;
                                    }
                                }
                            }
                            messageObject = r47Var;
                        }
                    } else {
                        i++;
                    }
                }
            }
            zu1Var.lc(messageObject, spannableStringBuilder, 1);
            wb2Var.J3(1, false, true);
        }
    }

    @Override
    public final boolean j1(r47 r47Var) {
        it1 it1Var;
        int i = (r47.B0(r47Var.k) > 1271266957L ? 1 : (r47.B0(r47Var.k) == 1271266957L ? 0 : -1));
        zu1 zu1Var = this.a;
        if ((i == 0 || ((it1Var = zu1Var.D0) != null && it1Var.O)) && zu1Var.g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        fm1 fm1Var;
        ue2 ue2Var;
        boolean z;
        vnb vnbVar;
        long j;
        iy9 iy9Var;
        int i;
        boolean z2;
        int i2;
        jy9 jy9Var;
        int i3;
        float f;
        kg5 kg5Var;
        int i4;
        sz1 sz1Var;
        boolean z3;
        long j2;
        sz1 sz1Var2;
        ArrayList arrayList = null;
        if (!r47Var.R4() && !r47Var.f4()) {
            if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
                if (r47Var.I3()) {
                    MediaController z4 = MediaController.z();
                    ArrayList G = this.a.D0.G();
                    zu1 zu1Var = this.a;
                    long j3 = zu1Var.d7;
                    boolean z5 = !zu1Var.D0.O;
                    if (zu1Var.x4) {
                        long c = zu1Var.c();
                        z3 = z5;
                        j2 = c;
                    } else {
                        z3 = z5;
                        j2 = 0;
                    }
                    boolean q0 = z4.q0(G, r47Var, j3, z3, null, j2);
                    if (q0 && (sz1Var2 = this.a.c4) != null) {
                        sz1Var2.a(r47Var, "open_media", ea4.f(r47Var), null, true);
                    }
                    return q0;
                }
            } else {
                boolean V = MediaController.z().V(r47Var);
                MediaController z6 = MediaController.z();
                if (V) {
                    arrayList = this.a.j6(r47Var, false);
                }
                z6.u0(arrayList, false);
                if (V && (sz1Var = this.a.c4) != null) {
                    sz1Var.a(r47Var, "open_media", ea4.f(r47Var), null, true);
                }
                return V;
            }
        } else {
            ky9 ky9Var = this.a.wa;
            if (ky9Var == null || ky9Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) org.telegram.messenger.a.b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!r47Var.O3()) {
                            d31.b0(this.a).w(2131232811, ob6.M0(2131743165, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new ky9(this.a.getParentActivity());
                ky9 ky9Var2 = this.a.wa;
                if (!r47Var.O3()) {
                    fm1Var = this.a.Eb(r47Var, true);
                } else {
                    fm1Var = null;
                }
                if (!r47Var.O3()) {
                    ue2Var = this.a.Db(r47Var);
                } else {
                    ue2Var = null;
                }
                Activity activity = ky9Var2.a;
                iy9 iy9Var2 = ky9Var2.c;
                ky9Var2.Y = fm1Var;
                ky9Var2.Z = ue2Var;
                jy9 jy9Var2 = ky9Var2.O;
                if (jy9Var2 != null) {
                    iy9Var2.removeView(jy9Var2);
                    ky9Var2.O = null;
                }
                ky9Var2.P = wb2Var;
                r47 messageObject = wb2Var.getMessageObject();
                ky9Var2.N = messageObject;
                if (messageObject != null && messageObject.g4()) {
                    z = true;
                } else {
                    z = false;
                }
                ky9Var2.T = z;
                wb2 wb2Var2 = ky9Var2.P;
                if (wb2Var2 != null) {
                    vnbVar = wb2Var2.getResourcesProvider();
                } else {
                    vnbVar = null;
                }
                ky9Var2.M = vnbVar;
                if (ky9Var2.P != null) {
                    ky9Var2.U = 0.0f;
                    ky9Var2.V = wb2Var.n;
                    if (wb2Var.getParent() instanceof View) {
                        View view = (View) wb2Var.getParent();
                        ky9Var2.U = view.getY() + ky9Var2.U;
                        ky9Var2.V = view.getY() + ky9Var2.V;
                    }
                    int width = ky9Var2.P.getWidth();
                    int height = ky9Var2.P.getHeight();
                    if (ky9Var2.T) {
                        height = Math.min(hl.L(360.0f), Math.min(width, hl.q.y));
                    }
                    ky9Var2.L = height - ky9Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / hl.p);
                    j = 0;
                    int i5 = height;
                    iy9Var = iy9Var2;
                    jy9 jy9Var3 = new jy9(ky9Var2, ky9Var2.getContext(), yac.t0, ky9Var2.P.getResourcesProvider(), width, i5);
                    ky9Var2.O = jy9Var3;
                    ky9Var2.P.t0(jy9Var3);
                    ky9Var2.O.s0(ky9Var2.P);
                    ky9Var2.O.setDelegate(new uif((byte) 25));
                    jy9 jy9Var4 = ky9Var2.O;
                    r47 r47Var2 = ky9Var2.N;
                    m47 currentMessagesGroup = ky9Var2.P.getCurrentMessagesGroup();
                    wb2 wb2Var3 = ky9Var2.P;
                    jy9Var4.z3(r47Var2, currentMessagesGroup, wb2Var3.G, wb2Var3.F, false, false);
                    if (!ky9Var2.T) {
                        p40 p40Var = new p40();
                        ky9Var2.W = p40Var;
                        jy9 jy9Var5 = ky9Var2.O;
                        p40Var.i = jy9Var5;
                        jy9Var5.Ic = p40Var;
                        if (jy9Var5.getSeekBarWaveform() != null) {
                            xy9 seekBarWaveform = ky9Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = ky9Var2.s;
                            wb2 wb2Var4 = seekBarWaveform.n;
                            if (wb2Var4 != null) {
                                wb2Var4.invalidate();
                            }
                        }
                    }
                    ky9Var2.I = false;
                    iy9Var.addView(ky9Var2.O, new FrameLayout.LayoutParams(ky9Var2.P.getWidth(), i5, 17));
                    i = ceil;
                } else {
                    j = 0;
                    iy9Var = iy9Var2;
                    i = 360;
                }
                TextureView textureView = ky9Var2.Q;
                if (textureView != null) {
                    iy9Var.removeView(textureView);
                    ky9Var2.Q = null;
                }
                if (ky9Var2.T) {
                    ky9Var2.R = false;
                    TextureView textureView2 = new TextureView(activity);
                    ky9Var2.Q = textureView2;
                    iy9Var.addView(textureView2, 0, tre.c(i, i));
                }
                kfc kfcVar = MediaController.z().j0;
                if (kfcVar != null) {
                    kfcVar.f0();
                }
                kfc kfcVar2 = ky9Var2.x;
                if (kfcVar2 != null) {
                    kfcVar2.f0();
                    ky9Var2.x.l0();
                    ky9Var2.x = null;
                }
                wb2 wb2Var5 = ky9Var2.P;
                if (wb2Var5 != null && wb2Var5.getMessageObject() != null) {
                    xb4.G(ky9Var2.P.getMessageObject().K1);
                    File I = xb4.I(ky9Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        xb4.G(ky9Var2.P.getMessageObject().K1);
                        I = xb4.M(ky9Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && ky9Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(ky9Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        kfc kfcVar3 = new kfc();
                        ky9Var2.x = kfcVar3;
                        kfcVar3.K = new ve9(ky9Var2, (byte) 6);
                        if (ky9Var2.W != null) {
                            kfcVar3.L = new i09(ky9Var2, (byte) 10);
                        }
                        if (ky9Var2.T) {
                            kfcVar3.z0(ky9Var2.Q);
                        }
                        ky9Var2.x.i0(Uri.fromFile(I), "other");
                        ky9Var2.x.g0();
                        ct3 ct3Var = ky9Var2.F;
                        if (ct3Var != null) {
                            ct3Var.s = ky9Var2.x;
                            ct3Var.a();
                        }
                    }
                    zu1 zu1Var2 = this.a;
                    zu1Var2.showDialog(zu1Var2.wa);
                    return false;
                }
                kg5 kg5Var2 = ky9Var2.y;
                if (kg5Var2 != null) {
                    iy9Var.removeView(kg5Var2);
                    ky9Var2.y = null;
                }
                r47 r47Var3 = ky9Var2.N;
                if (r47Var3 != null && r47Var3.O3()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                r47 r47Var4 = ky9Var2.N;
                if (r47Var4 != null && r47.B0(r47Var4.k) != yac.h(ky9Var2.N.K1).e()) {
                    kg5 kg5Var3 = new kg5(activity, 3);
                    ky9Var2.y = kg5Var3;
                    kg5Var3.p(true);
                    if (z2) {
                        long B0 = r47.B0(ky9Var2.N.k);
                        int i6 = (B0 > j ? 1 : (B0 == j ? 0 : -1));
                        r47 r47Var5 = ky9Var2.N;
                        String str = "";
                        if (i6 > 0) {
                            TLRPC.User X1 = uc7.s1(r47Var5.K1).X1(Long.valueOf(B0));
                            if (X1 != null) {
                                str = lbc.k(X1, true);
                            }
                        } else {
                            TLRPC.Chat M0 = uc7.s1(r47Var5.K1).M0(Long.valueOf(-B0));
                            if (M0 != null) {
                                str = M0.title;
                            }
                        }
                        kg5 kg5Var4 = ky9Var2.y;
                        if (ky9Var2.T) {
                            i4 = 2131743245;
                        } else {
                            i4 = 2131743166;
                        }
                        kg5Var4.t(hl.S2(ob6.a0(null, null, i4, str)));
                    } else {
                        kg5 kg5Var5 = ky9Var2.y;
                        if (ky9Var2.T) {
                            i3 = 2131743246;
                        } else {
                            i3 = 2131743167;
                        }
                        kg5Var5.t(hl.S2(ob6.M0(i3, null)));
                    }
                    ky9Var2.y.q(12.0f);
                    kg5 kg5Var6 = ky9Var2.y;
                    if (!z2 && !ky9Var2.P.G) {
                        f = 6.0f;
                    } else {
                        f = 0.0f;
                    }
                    kg5Var6.setPadding(hl.L(f), 0, 0, 0);
                    boolean z7 = ky9Var2.T;
                    kg5 kg5Var7 = ky9Var2.y;
                    if (z7) {
                        kg5Var7.o(0.5f, 0.0f);
                        kg5Var = ky9Var2.y;
                        kg5Var.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        kg5Var7.o(0.0f, hl.L(34.0f));
                        kg5Var = ky9Var2.y;
                        kg5Var.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    kg5Var.u(14.0f);
                    kg5 kg5Var8 = ky9Var2.y;
                    kg5Var8.h = kg5.a(kg5Var8.getText(), ky9Var2.y.getTextPaint());
                    boolean z8 = ky9Var2.T;
                    kg5 kg5Var9 = ky9Var2.y;
                    wb2 wb2Var6 = ky9Var2.P;
                    if (z8) {
                        iy9Var.addView(kg5Var9, tre.d((int) ((wb2Var6.getWidth() / hl.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((ky9Var2.P.getHeight() + ky9Var2.L) / hl.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        iy9Var.addView(kg5Var9, tre.d((int) ((wb2Var6.getWidth() / hl.p) * 0.6f), 150.0f, 17, ((((ky9Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + ky9Var2.P.getBoundsLeft()) / hl.p) + 1.0f, ((-75.0f) - ((ky9Var2.P.getHeight() / hl.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    ky9Var2.y.v();
                }
                TextView textView = ky9Var2.E;
                if (textView != null) {
                    iy9Var.removeView(textView);
                    ky9Var2.E = null;
                }
                TextView textView2 = new TextView(activity);
                ky9Var2.E = textView2;
                textView2.setTextColor(-1);
                ky9Var2.E.setTypeface(hl.o());
                boolean o = aob.I.o();
                TextView textView3 = ky9Var2.E;
                if (o) {
                    textView3.setBackground(aob.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    textView3.setBackground(aob.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                ky9Var2.E.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(6.0f));
                iye.a(ky9Var2.E);
                TextView textView4 = ky9Var2.E;
                if (z2) {
                    i2 = 2131743171;
                } else {
                    i2 = 2131743168;
                }
                textView4.setText(ob6.M0(i2, null));
                ky9Var2.E.setOnClickListener(new gy9(ky9Var2, (byte) 1));
                iy9Var.addView(ky9Var2.E, tre.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z2 && (jy9Var = ky9Var2.O) != null && jy9Var.getMessageObject() != null && ky9Var2.O.getMessageObject().k != null) {
                    ky9Var2.O.getMessageObject().k.media_unread = false;
                    ky9Var2.O.invalidate();
                }
                zu1 zu1Var22 = this.a;
                zu1Var22.showDialog(zu1Var22.wa);
                return false;
            }
        }
        return false;
    }

    public final void k(wb2 wb2Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            e eVar = this.a;
            if (eVar.getMessagesController().C(bundle, eVar, wb2Var.getMessageObject(), null)) {
                eVar.presentFragment(new zu1(bundle));
            }
        }
    }

    @Override
    public final boolean k0(defpackage.wb2 r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.k0(wb2, boolean):boolean");
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        zu1 zu1Var = this.a;
        if (zu1Var.lc != 0 && wb2Var.getMessageObject() != null && zu1Var.lc == wb2Var.getMessageObject().e1() && zu1Var.mc == i) {
            return true;
        }
        return false;
    }

    @Override
    public final void k2() {
        zu1 zu1Var = this.a;
        if (zu1Var.getUserConfig().p()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", zu1Var.l6);
            bundle.putInt("start_from", 10);
            zu1Var.presentFragment(new em6(bundle, zu1Var.p1.getSharedMediaPreloader()));
            return;
        }
        d31.b0(zu1Var).Q(2131624211, 36, hl.N2(ob6.H(',', "UnlockSimilarChannelsPremium", zu1Var.getMessagesController().k4.Z1.f()), -1, 0, new st1(this, (byte) 4), null)).j();
    }

    @Override
    public final void l(wb2 wb2Var) {
        zu1 zu1Var = this.a;
        zu1Var.getNotificationCenter().k(jn7.p3, Long.valueOf(zu1Var.l6), wb2Var);
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        zu1 zu1Var = this.a;
        if (!zu1Var.b8()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) ehb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (zu1Var.getParentActivity() != null) {
                if (zu1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || ehb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        nx0 nx0Var = new nx0(1, (vnb) zu1Var.Ba, (Context) zu1Var.getParentActivity(), false);
                        nx0Var.J();
                        nx0Var.P = str;
                        nx0Var.Q = false;
                        nx0Var.R = true;
                        CharSequence[] charSequenceArr = {ob6.M0(2131751732, null)};
                        oh ohVar = new oh(zu1Var, str, (byte) 3);
                        nx0Var.M = charSequenceArr;
                        nx0Var.L = ohVar;
                        zu1Var.showDialog(nx0Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        zu1Var.pa(null, tL_inlineButtonTypeUrl.url, true, wb2Var, wb2Var.getMessageObject());
                        try {
                            wb2Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
        f(wb2Var, z, false, false);
    }

    @Override
    public final bmb l2() {
        return this.a.u9;
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        int i2;
        TLRPC.Document document;
        int i3;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i4;
        TLRPC.Document document3;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        long j3;
        int i8;
        boolean z;
        boolean z2;
        int i9;
        vnb vnbVar;
        vnb vnbVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.MessageMedia m1 = r47.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                u1(wb2Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            zu1 zu1Var = this.a;
            if (geoPoint != null) {
                if (hl.H1(zu1Var)) {
                    uc6 uc6Var = new uc6(3);
                    vnbVar2 = ((e) zu1Var).resourceProvider;
                    uc6Var.setResourceProvider(vnbVar2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = zu1Var.getMessagesController().y1(zu1Var.a());
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_messageMediaGeo.geo = messageMedia.geo;
                    String str = messageMedia.address;
                    if (str == null) {
                        if (pollAnswer != null && (tL_textWithEntities = pollAnswer.text) != null) {
                            str = tL_textWithEntities.text;
                        } else {
                            str = "";
                        }
                    }
                    tL_messageMediaGeo.address = str;
                    tL_message.media = tL_messageMediaGeo;
                    uc6Var.V0 = false;
                    uc6Var.G0(new r47(yac.t0, tL_message, false, false));
                    zu1Var.presentFragment(uc6Var);
                }
            } else if (r47.N2(messageMedia.document)) {
                rw2.e().l(zu1Var.getParentActivity());
                rw2.e().k(new hu1(this, tL_messageMediaPoll, pollAnswer, wb2Var));
                rw2 e = rw2.e();
                TLRPC.Document document4 = messageMedia.document;
                if (r47.H2(document4)) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                r47 messageObject2 = wb2Var.getMessageObject();
                vnbVar = ((e) zu1Var).resourceProvider;
                e.i(document4, null, "", null, null, i9, false, messageObject2, vnbVar, 200);
            } else if (r47.J3(messageMedia.document)) {
                r47 r47Var = MediaController.z().v0;
                if (MediaController.z().H(messageObject) && r47Var != null) {
                    boolean z3 = r47Var.m0;
                    if (i == -3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3 == z2) {
                        if (MediaController.z().G()) {
                            MediaController.z().V(r47Var);
                            return;
                        } else {
                            MediaController.z().U(r47Var, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.k;
                TLRPC.TL_message O5 = zu1.O5(message);
                O5.media = messageMedia;
                O5.attachPath = ih8.c(i, message);
                ArrayList arrayList = new ArrayList();
                i8 = ((e) zu1Var).currentAccount;
                r47 r47Var2 = new r47(i8, O5, false, true);
                if (i == -3) {
                    z = true;
                } else {
                    z = false;
                }
                r47Var2.m0 = z;
                arrayList.add(r47Var2);
                if (MediaController.z().H(messageObject)) {
                    MediaController.z().m(false, true, false, false);
                }
                MediaController.z().q0(arrayList, r47Var2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !r47.J4(document5)) {
                    i6 = ((e) zu1Var).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    yc4 yc4Var = new yc4(i6, messageObject, document6, ih8.c(i, messageObject.k));
                    if (yc4Var.g) {
                        xb4.G(i6).f(document6);
                        yc4Var.a();
                        wb2Var.a0();
                        return;
                    } else if (!yc4Var.f) {
                        xb4.G(i6).X(document6, messageObject, 2, 0);
                        yc4Var.a();
                        wb2Var.a0();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.k;
                        TLRPC.TL_message O52 = zu1.O5(message2);
                        O52.media = messageMedia;
                        O52.attachPath = ih8.c(i, message2);
                        i7 = ((e) zu1Var).currentAccount;
                        r47 r47Var3 = new r47(i7, O52, false, true);
                        if (r47.y(messageMedia.document)) {
                            PhotoViewer.q0().T1(null, zu1Var, zu1Var.Ba);
                            PhotoViewer q0 = PhotoViewer.q0();
                            if (r47Var3.D != 0) {
                                j = zu1Var.l6;
                                j2 = zu1Var.d7;
                                j3 = zu1Var.c();
                            } else {
                                j = 0;
                                j2 = 0;
                                j3 = 0;
                            }
                            q0.l1(r47Var3, zu1Var, j, j2, j3, zu1Var.db);
                            return;
                        }
                        try {
                            hl.r2(r47Var3, zu1Var.getParentActivity(), zu1Var.Ba, false);
                            return;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            zu1Var.F4(r47Var3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || r47.J4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i2 = arrayList3.size();
                    } else {
                        i2 = -1;
                    }
                    TLRPC.TL_message O53 = zu1.O5(message3);
                    O53.media = messageMedia3;
                    O53.attachPath = ih8.c(-2, message3);
                    i5 = ((e) zu1Var).currentAccount;
                    arrayList3.add(new r47(i5, O53, false, true));
                    arrayList2.add(-2);
                } else {
                    i2 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || r47.J4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i2 = arrayList3.size();
                    }
                    TLRPC.TL_message O54 = zu1.O5(message3);
                    O54.media = messageMedia2;
                    O54.attachPath = ih8.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    O54.message = pollResults2.solution;
                    O54.entities = pollResults2.solution_entities;
                    i4 = ((e) zu1Var).currentAccount;
                    arrayList3.add(new r47(i4, O54, false, true));
                    arrayList2.add(-3);
                }
                atb.b(tL_messageMediaPoll.poll, zu1Var.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                int i10 = i2;
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i11);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || r47.J4(document))) {
                        if (pollAnswer2.unshuffled_index == i) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message O55 = zu1.O5(message3);
                        O55.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        O55.message = tL_textWithEntities2.text;
                        O55.entities = tL_textWithEntities2.entities;
                        O55.attachPath = ih8.c(pollAnswer2.unshuffled_index, message3);
                        i3 = ((e) zu1Var).currentAccount;
                        arrayList3.add(new r47(i3, O55, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.s0 = arrayList2;
                    PhotoViewer.q0().T1(null, zu1Var, zu1Var.Ba);
                    PhotoViewer.q0().n1(arrayList3, i10, zu1Var.a(), 0L, 0L, zu1Var.eb);
                }
            }
        }
    }

    @Override
    public final void m2(wb2 wb2Var) {
        this.a.Ma(wb2Var);
    }

    public final void n(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            bundle.putBoolean("expandPhoto", false);
            this.a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
        r47 messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        zu1 zu1Var = this.a;
        kg5 kg5Var = zu1Var.P1;
        if (kg5Var != null) {
            kg5Var.f(true);
        }
        if (zu1Var.getParentActivity() != null && (messageObject = wb2Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(ob6.D0().y);
            } catch (Exception e) {
                cc4.g(e, true);
                str = R0.country;
            }
            kg5 kg5Var2 = new kg5(zu1Var.getParentActivity(), 3);
            kg5Var2.p(true);
            kg5Var2.L = Layout.Alignment.ALIGN_NORMAL;
            kg5Var2.d = -1L;
            kg5Var2.U = true;
            kg5Var2.e = true;
            kg5Var2.q(12.0f);
            zu1Var.P1 = kg5Var2;
            kg5Var2.r0 = new jj1(this, kg5Var2, (byte) 22);
            kg5Var2.t(hl.S2(ob6.a0(null, null, 2131750813, str)));
            zu1Var.P1.k(zu1Var.L);
            zu1Var.m1.addView(zu1Var.P1, tre.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            zu1Var.m1.post(new aq1(this, wb2Var, i2, i, (byte) 2));
        }
    }

    @Override
    public final void n1(o47 o47Var) {
        StaticLayout staticLayout = o47Var.e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = o47Var.e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new jk2(o47Var.L, charSequence, false), 0, spannableString.length(), 33);
            hl.g(spannableString);
            d31.b0(this.a).i(ob6.M0(2131751987, null)).j();
        }
    }

    public final void o(TLRPC.User user, boolean z) {
        int i;
        int i2;
        int i3;
        if (user != null) {
            long j = user.id;
            if (j != 489000) {
                TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                int i4 = 0;
                if (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
                    z = false;
                }
                zu1 zu1Var = this.a;
                TLRPC.User user2 = zu1Var.f;
                if (user2 != null && user2.id == j && zu1Var.g4 == 0 && zu1Var.p1 != null) {
                    i3 = ((e) zu1Var).currentAccount;
                    if (rr0.e0(i3, user.id) != null) {
                        zu1Var.p1.e(false, false);
                        return;
                    }
                } else if (user.bot) {
                    i = ((e) zu1Var).currentAccount;
                    rr0 e0 = rr0.e0(i, user.id);
                    if (e0 != null) {
                        zu1Var.presentFragment(e0);
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("expandPhoto", z);
                ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                TLRPC.User user3 = zu1Var.f;
                if (user3 != null && user3.id == user.id) {
                    i4 = 1;
                }
                profileActivity.y3(i4);
                Activity parentActivity = zu1Var.getParentActivity();
                i2 = ((e) zu1Var).classGuid;
                hl.g3(parentActivity, i2);
                zu1Var.presentFragment(profileActivity);
            }
        }
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        BitmapDrawable bitmapDrawable;
        int i6;
        int i7;
        int i8;
        String str2;
        yb0 yb0Var;
        int i9;
        int i10;
        ec0 ec0Var;
        rr1 rr1Var;
        qr1 qr1Var;
        if (!g()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(xc2.K(chat, false));
        zu1 zu1Var = this.a;
        if (!isEmpty && zu1Var.e != null && (((rr1Var = zu1Var.d1) == null || rr1Var.getVisibility() != 0) && ((qr1Var = zu1Var.T) == null || qr1Var.getVisibility() != 0))) {
            i = 1;
        } else {
            i = 0;
        }
        TLRPC.Chat chat2 = zu1Var.e;
        if (chat2 != null && ((zu1Var.s4 == 0 || zu1Var.x4) && (!xc2.T(chat2) || zu1Var.e.megagroup))) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TLRPC.Chat chat3 = zu1Var.e;
        if (chat3 != null && chat3.id == chat.id && !zu1Var.k8()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ec0[] ec0VarArr = new ec0[i3 + 1 + i + i2];
        ec0VarArr[0] = ec0.d;
        if (i3 != 0) {
            if (chat.broadcast) {
                ec0Var = ec0.e;
            } else {
                ec0Var = ec0.f;
            }
            ec0VarArr[1] = ec0Var;
            i4 = 2;
        } else {
            i4 = 1;
        }
        if (i != 0) {
            ec0VarArr[i4] = ec0.n;
            i4++;
        }
        if (i2 != 0) {
            ec0VarArr[i4] = ec0.r;
        }
        TLRPC.ChatFull N0 = zu1Var.getMessagesController().N0(chat.id);
        if (N0 == null) {
            i5 = ((e) zu1Var).classGuid;
            jn5 m = jn5.m(yac.t0, 0, chat);
            jn5 m2 = jn5.m(yac.t0, 1, chat);
            if (m2 != null && (m2.k instanceof TLRPC.TL_photoStrippedSize)) {
                str = "b";
            } else {
                str = null;
            }
            TLRPC.ChatPhoto chatPhoto = chat.photo;
            if (chatPhoto != null) {
                bitmapDrawable = chatPhoto.strippedBitmap;
            } else {
                bitmapDrawable = null;
            }
            i6 = i3;
            i7 = i;
            i8 = i2;
            str2 = null;
            yb0Var = new yb0(m, m2, null, str, null, null, bitmapDrawable, chat, ec0VarArr, new ac0(i5, jn7.T, chat));
        } else {
            yb0Var = yb0.a(chat, N0, ec0VarArr);
            i7 = i;
            i8 = i2;
            i6 = i3;
            str2 = null;
        }
        if (vh4.i(yb0Var)) {
            vh4.r().J((ViewGroup) zu1Var.fragmentView, zu1Var.Ba, yb0Var, new ie(this, chat, wb2Var, (byte) 16));
            return true;
        }
        fu5 I = fu5.I(zu1Var, wb2Var);
        I.b(2131232271, ob6.M0(2131747513, str2), new vt1(this, chat, (byte) 1), false);
        if (chat.broadcast) {
            i9 = 2131232093;
            i10 = 2131747538;
        } else {
            i9 = 2131232118;
            i10 = 2131747526;
        }
        I.k(i9, ob6.M0(i10, str2), new on1(this, wb2Var, chat, (byte) 8), i6);
        I.k(2131232227, ob6.M0(2131748363, str2), new vt1(this, chat, (byte) 2), i7);
        I.k(2131232359, ob6.M0(2131753751, str2), new vt1(this, chat, (byte) 3), i8);
        I.t = false;
        I.i = (byte) 3;
        I.c0 = true;
        I.b0(0.0f, -hl.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final void q0(defpackage.wb2 r25, float r26, float r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.q0(wb2, float, float, boolean):void");
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
        TLRPC.WebPage webPage;
        int i2;
        int i3;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.User user;
        String M0;
        int i4;
        TLRPC.User user2;
        int i5;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z;
        r47 messageObject = wb2Var.getMessageObject();
        boolean z2 = false;
        cu1 cu1Var = null;
        cu1 cu1Var2 = null;
        File file = null;
        cu1 cu1Var3 = null;
        cu1 cu1Var4 = null;
        if (i == 19) {
            l01 l01Var = this.a.pc;
            if (l01Var != null) {
                l01Var.a(true);
            }
            zu1 zu1Var = this.a;
            if (wb2Var.getMessageObject() != null) {
                cu1Var2 = new cu1(this, wb2Var, (byte) 2);
            }
            zu1Var.pc = cu1Var2;
            zu1 zu1Var2 = this.a;
            final l01 l01Var2 = zu1Var2.pc;
            final Activity parentActivity = zu1Var2.getParentActivity();
            final vnb resourceProvider = this.a.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            l01Var2.d();
            l01Var2.b = new um0(atomicBoolean, (byte) 0);
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia3;
                tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                tL_messageMediaGiveaway.flags = tL_messageMediaGiveawayResults.flags;
            } else {
                tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia3;
            }
            final TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
            final String b = ym0.b(messageObject);
            TLRPC.Chat M02 = uc7.s1(yac.t0).M0(Long.valueOf(-messageObject.Z0()));
            if (M02 != null && xc2.V(M02)) {
                z = true;
            } else {
                z = false;
            }
            final long j = messageObject.k.date * 1000;
            on0.e(messageObject, new pcc(atomicBoolean, l01Var2, z, b, j, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean a;
                public final l01 b;
                public final boolean c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Activity f;
                public final vnb g;

                {
                    this.e = tL_messageMediaGiveaway2;
                    this.f = parentActivity;
                    this.g = resourceProvider;
                }

                @Override
                public final void a(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.a.get()) {
                        this.b.b();
                        boolean z3 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z4 = this.c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.e;
                        Activity activity = this.f;
                        vnb vnbVar = this.g;
                        if (z3) {
                            ym0.d(z4, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, vnbVar);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            ym0.e(z4, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, vnbVar);
                        }
                    }
                }
            }, new nm0(atomicBoolean, l01Var2, (byte) 0));
        } else if (i == 21) {
            org.telegram.messenger.a.t();
            boolean z3 = f11.a;
            org.telegram.messenger.a.q();
            m01.u(this.a.getParentActivity(), f11.g);
        } else if (i == 84) {
            this.a.La(wb2Var);
        } else if (i == 80) {
            zu1 zu1Var3 = this.a;
            qm qmVar = ui8.L1;
            if (zu1Var3.getParentActivity() != null) {
                zu1Var3.showDialog(new ui8(zu1Var3.getContext(), zu1Var3.getCurrentAccount(), messageObject, zu1Var3.getResourceProvider()));
            }
        } else if (i == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                sz1 sz1Var = this.a.c4;
                if (sz1Var != null) {
                    String str = webPage2.url;
                    zg2 zg2Var = sz1Var.n;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (str == null || !str.equals((String) zg2Var.c) || uptimeMillis - zg2Var.b >= 1000) {
                        zg2Var.c = str;
                        zg2Var.b = uptimeMillis;
                        sz1Var.a(messageObject, "open_iv", null, null, false);
                    }
                }
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                    this.a.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i == 5) {
            long j2 = messageObject.k.media.user_id;
            if (j2 != 0) {
                i5 = ((e) this.a).currentAccount;
                user2 = uc7.s1(i5).X1(Long.valueOf(j2));
            } else {
                user2 = null;
            }
            zu1 zu1Var4 = this.a;
            TLRPC.MessageMedia messageMedia5 = messageObject.k.media;
            String str2 = messageMedia5.phone_number;
            String str3 = messageMedia5.vcard;
            String str4 = messageMedia5.first_name;
            String str5 = messageMedia5.last_name;
            if (user2 != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user2.id);
                bundle.putBoolean("show_add_to_contacts", true);
                bundle.putString("vcard", str3);
                bundle.putString("vcard_phone", str2);
                bundle.putString("vcard_first_name", str4);
                bundle.putString("vcard_last_name", str5);
                zu1Var4.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str3)) {
                    File f1 = hl.f1();
                    f1.mkdirs();
                    file = new File(f1, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str3);
                    bufferedWriter.close();
                }
                zu1Var4.showDialog(new r78(zu1Var4, null, user2, null, file, f78.h(str2, false), str4, str5, zu1Var4.Ba));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } else if (i == 30) {
            this.a.presentFragment(new zu1(qu6.k(messageObject.k.media.user_id, "user_id")));
        } else if (i == 31) {
            long j3 = messageObject.k.media.user_id;
            if (j3 != 0) {
                i4 = ((e) this.a).currentAccount;
                user = uc7.s1(i4).X1(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    M0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = xnb.k(new StringBuilder("+"), user.phone, f78.f());
                } else {
                    String str6 = r47.n1(messageObject.k).phone_number;
                    if (!TextUtils.isEmpty(str6)) {
                        M0 = f78.f().e(str6);
                    } else {
                        M0 = ob6.M0(2131747559, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                this.a.presentFragment(new cu2(bundle2));
            }
        } else if (i != 23 && i != 24) {
            if (messageObject.q4()) {
                this.a.Z9(messageObject, false, false);
                if (messageObject.T0 != null) {
                    l01 l01Var3 = this.a.pc;
                    if (l01Var3 != null) {
                        l01Var3.a(true);
                    }
                    zu1 zu1Var5 = this.a;
                    if (wb2Var.getMessageObject() != null) {
                        cu1Var3 = new cu1(this, wb2Var, (byte) 4);
                    }
                    zu1Var5.pc = cu1Var3;
                    Activity parentActivity2 = this.a.getParentActivity();
                    Uri parse = Uri.parse(messageObject.T0);
                    zu1 zu1Var6 = this.a;
                    m01.t(parentActivity2, parse, true, false, false, zu1Var6.pc, null, false, zu1Var6.getMessagesController().k4.I2.f, false, false);
                    return;
                }
                return;
            }
            TLRPC.WebPage W1 = messageObject.W1();
            if (W1 == null && (message = messageObject.k) != null && (messageMedia2 = message.media) != null) {
                W1 = messageMedia2.webpage;
            }
            TLRPC.WebPage webPage3 = W1;
            if (webPage3 != null) {
                if (webPage3.attributes != null) {
                    for (int i6 = 0; i6 < webPage3.attributes.size(); i6++) {
                        if ((webPage3.attributes.get(i6) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPage3.attributes.get(i6)).storyItem) != null) {
                            storyItem.dialogId = wf3.n(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), tL_webPageAttributeStory.storyItem, l6b.a(this.a.A0));
                            return;
                        }
                    }
                }
                if (!this.a.ua(webPage3.url, wb2Var, null, messageObject.e1(), 2)) {
                    l01 l01Var4 = this.a.pc;
                    if (l01Var4 != null) {
                        l01Var4.a(true);
                    }
                    zu1 zu1Var7 = this.a;
                    if (wb2Var.getMessageObject() != null) {
                        cu1Var4 = new cu1(this, wb2Var, (byte) 5);
                    }
                    zu1Var7.pc = cu1Var4;
                    m01.t(this.a.getParentActivity(), Uri.parse(webPage3.url), true, true, false, this.a.pc, null, false, true, false, false);
                }
            }
        } else {
            if (i == 24) {
                z2 = true;
            }
            TLRPC.Message message2 = messageObject.k;
            if (message2 != null && (messageMedia = message2.media) != null) {
                webPage = messageMedia.webpage;
            } else {
                webPage = null;
            }
            if (webPage != null && webPage.url != null) {
                Matcher matcher = Pattern.compile("^https?\\:\\/\\/t\\.me\\/add(?:emoji|stickers)\\/(.+)$").matcher(webPage.url);
                l01 l01Var5 = this.a.pc;
                if (l01Var5 != null) {
                    l01Var5.a(true);
                }
                zu1 zu1Var8 = this.a;
                if (wb2Var.getMessageObject() != null) {
                    cu1Var = new cu1(this, wb2Var, (byte) 3);
                }
                zu1Var8.pc = cu1Var;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i2 = ((e) this.a).currentAccount;
                    if (ls6.d0(i2).q0(group) == null) {
                        this.a.pc.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i3 = ((e) this.a).currentAccount;
                        this.a.pc.b = new zd(this, ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickerSet, new q81((byte) 1, this, z2)), (byte) 21);
                        return;
                    }
                }
                m01.t(this.a.getParentActivity(), Uri.parse(webPage.url), true, true, false, this.a.pc, null, false, true, false, false);
            }
        }
    }

    @Override
    public final void r() {
        this.a.Dc();
    }

    @Override
    public final void r0() {
        wb2 wb2Var;
        r47 messageObject;
        lm m;
        zu1 zu1Var = this.a;
        if (!zu1Var.A3 && !xea.w0 && zu1Var.A0 != null && zu1Var.getParentActivity() != null && zu1Var.fragmentView != null) {
            kg5 kg5Var = zu1Var.I2;
            if (kg5Var != null) {
                if (kg5Var.W) {
                    return;
                }
            } else {
                int indexOfChild = zu1Var.m1.indexOfChild(zu1Var.U);
                if (indexOfChild != -1) {
                    kg5 x4 = zu1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    zu1Var.I2 = x4;
                    x4.d = 10000L;
                    x4.l(zu1Var.getParentActivity().getResources().getDrawable(2131232811).mutate());
                    zu1Var.I2.t(ob6.M0(2131753755, null));
                } else {
                    return;
                }
            }
            int childCount = zu1Var.A0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = zu1Var.A0.getChildAt(i);
                if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && r47.K4(messageObject.k) && (m = wb2Var.getPhotoImage().m()) != null && m.o() >= 3000 && !zu1Var.I2.W) {
                    ImageReceiver photoImage = wb2Var.getPhotoImage();
                    float x7 = zu1Var.x7(wb2Var, photoImage.M0);
                    float f = photoImage.O0;
                    View view = (View) wb2Var.getParent();
                    float x72 = zu1Var.x7(wb2Var, -wb2Var.getTop());
                    if (x7 <= hl.L(80.0f)) {
                        continue;
                    } else if ((x7 + f) - x72 <= (f / 4.0f) + view.getMeasuredHeight()) {
                        zu1Var.Wb = wb2Var;
                        kg5 kg5Var2 = zu1Var.I2;
                        kg5Var2.r0 = new gn1(zu1Var, (byte) 9);
                        kg5Var2.w(zu1Var.w7(wb2Var, wb2Var.getNoSoundIconCenterX()), x7, true);
                        xea.C(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
        f(wb2Var, z, false, z2);
    }

    @Override
    public final boolean s0(defpackage.wb2 r41, org.telegram.tgnet.TLRPC.PollAnswer r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju1.s0(wb2, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        try {
            zu1 zu1Var = this.a;
            iv3.J0(zu1Var, r47Var, zu1Var.db, str2, str3, str4, str, i, i2, -1, zu1Var.Y7());
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final String u(long j) {
        TLRPC.Peer peer;
        String C0;
        zu1 zu1Var = this.a;
        if (!lbc.w(zu1Var.f)) {
            TLRPC.Chat chat = zu1Var.e;
            if (chat != null && !xc2.V(chat) && (C0 = zu1Var.getMessagesController().C0(zu1Var.e.id, j)) != null) {
                return C0;
            }
            TLRPC.TL_forumTopic tL_forumTopic = zu1Var.r4;
            if (tL_forumTopic != null && (peer = tL_forumTopic.from_id) != null && (peer.user_id == j || peer.channel_id == j || peer.chat_id == j)) {
                return ob6.M0(2131743677, null);
            }
        }
        return null;
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
        Bundle k = qu6.k(j, "user_id");
        e eVar = this.a;
        if (eVar.getMessagesController().C(k, eVar, wb2Var.getMessageObject(), null)) {
            eVar.presentFragment(new zu1(k));
        }
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        Uri parse;
        boolean z2;
        fu1 fu1Var;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z && m01.j(str, false, false)) {
            z2 = true;
        } else {
            z2 = z;
        }
        zu1 zu1Var = this.a;
        sz1 sz1Var = zu1Var.c4;
        if (sz1Var != null) {
            sz1Var.b(wb2Var.getMessageObject(), str);
        }
        l01 l01Var = zu1Var.pc;
        if (l01Var != null) {
            l01Var.a(true);
        }
        if (wb2Var.getMessageObject() == null) {
            fu1Var = null;
        } else {
            fu1Var = new fu1(this, wb2Var);
        }
        zu1Var.pc = fu1Var;
        if (!z2 && !m01.g(parse, false, null)) {
            jj.o0(zu1Var, str, true, true, true, !z2, zu1Var.pc, webPage, zu1Var.Ba);
        } else {
            m01.t(zu1Var.getParentActivity(), parse, true, true, false, zu1Var.pc, null, false, true, false, false);
        }
    }

    @Override
    public final void v(wb2 wb2Var, float f, float f2) {
        zu1 zu1Var = this.a;
        zu1Var.Y5(wb2Var, false, false, f, f2, true, false, false);
        zu1Var.A0.getClass();
        zu1Var.Fc(RecyclerView.S(wb2Var));
    }

    @Override
    public final void v1(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().f(messageObject);
        }
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        int i;
        r47 messageObject;
        TLRPC.Message message;
        if (wb2Var != null) {
            zu1 zu1Var = this.a;
            if (zu1Var.getParentActivity() != null) {
                i = ((e) zu1Var).currentAccount;
                if (uc7.s1(i).D4() && (messageObject = wb2Var.getMessageObject()) != null && (message = messageObject.k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(zu1Var.e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean w1() {
        zu1 zu1Var = this.a;
        if (zu1Var.m1.getKeyboardHeight() + zu1Var.La >= hl.L(20.0f)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean y0(long j) {
        TLRPC.ChatFull N0;
        zu1 zu1Var = this.a;
        TLRPC.Chat chat = zu1Var.e;
        if (chat == null || xc2.V(chat)) {
            return false;
        }
        uc7 messagesController = zu1Var.getMessagesController();
        long j2 = zu1Var.e.id;
        if (j2 == j) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j2));
        if (messagesController.getUserConfig().e() == j && M0 != null && M0.creator) {
            return true;
        }
        zh6 zh6Var = (zh6) messagesController.q1.f(j2);
        if (zh6Var == null && (N0 = messagesController.N0(j2)) != null && N0.participants != null) {
            for (int i = 0; i < N0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = N0.participants.participants.get(i);
                if (chatParticipant.user_id == j) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) zh6Var.f(j)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
        TLRPC.Message message;
        int i;
        int i2;
        int i3;
        int L;
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            byte b = iq0Var.a;
            TL_stars.StarsAmount starsAmount = null;
            zu1 zu1Var = this.a;
            if (b == 1) {
                long n = wf3.n(message.from_id);
                y0 y0Var = new y0(this, message, (byte) 28);
                Pattern pattern = jj.a;
                Activity parentActivity = zu1Var.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, parentActivity);
                String M0 = ob6.M0(2131744040, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = hl.S2(ob6.a0(null, null, 2131744039, uc7.s1(yac.t0).A1(n, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                yob.X(editText, aob.G6, null);
                editText.setHint(ob6.M0(2131744038, null));
                yob.D(editText, aob.H6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(aob.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new aj(parentActivity)});
                if (ob6.a0) {
                    i3 = hl.L(24.0f);
                } else {
                    i3 = 0;
                }
                int L2 = hl.L(8.0f);
                if (ob6.a0) {
                    L = 0;
                } else {
                    L = hl.L(24.0f);
                }
                editText.setPadding(i3, L2, L, hl.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.j(ob6.M0(2131751569, null), new o(y0Var, editText, (byte) 4));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                idVar.O = new we(editText, (byte) 0);
                frameLayout.addView(editText, tre.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                hl.d3(new c1(editText, (byte) 11), 100L);
                zu1Var.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
                }
            } else if (b == 2) {
                if (message.suggested_post != null) {
                    i = ((e) zu1Var).currentAccount;
                    boolean A = xc2.A(i, zu1Var.e, 24);
                    if (A) {
                        i2 = ((e) zu1Var).currentAccount;
                        xc2.A(i2, zu1Var.e, 5);
                    }
                    lg lgVar = new lg(this, message, A, messageObject, (byte) 6);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    zu1Var.s5(lgVar, oj.m(starsAmount), !A);
                }
            } else if (b == 3) {
                zu1Var.Y5(wb2Var, true, false, wb2Var.getLastTouchX(), wb2Var.getLastTouchY(), true, false, true);
            } else if (b == 4) {
                zu1Var.g2.k(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i;
        int i2;
        kc7 kc7Var;
        Integer num;
        jn5 b;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        zu1 zu1Var = this.a;
        if (isEmpty) {
            i = ((e) zu1Var).currentAccount;
            kl8 kl8Var = new kl8(zu1Var, i, user, null, null, zu1Var.Ba);
            wb2Var.getLocationOnScreen(new int[2]);
            kl8Var.q2 = wb2Var.getNameStatusX();
            kl8Var.r2 = wb2Var.getNameStatusY();
            kl8Var.u2 = wb2Var.getScaleX();
            kl8Var.s2 = wb2Var.getLeft();
            kl8Var.t2 = wb2Var.getTop();
            kl8Var.v2 = wb2Var;
            int f = lbc.f(user);
            if (f >= 7) {
                i2 = ((e) zu1Var).currentAccount;
                lc7 lc7Var = uc7.s1(i2).E3;
                if (lc7Var != null) {
                    kc7Var = lc7Var.d(f);
                } else {
                    kc7Var = null;
                }
                if (kc7Var != null) {
                    num = Integer.valueOf(kc7Var.f());
                } else {
                    num = null;
                }
                kl8Var.p2 = num;
            } else {
                kl8Var.p2 = Integer.valueOf(zu1Var.getThemedColor(aob.r8[f]));
            }
            ul ulVar = wb2Var.Ca;
            if (ulVar != null && (ulVar.f[0] instanceof wl)) {
                kl8Var.u2 *= 0.95f;
                if (document != null) {
                    de0 de0Var = new de0(zu1Var.getParentActivity());
                    ggb d = lp3.d(document.thumbs, aob.m6, 0.2f, false);
                    TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = jn5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && r47.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = jn5.b(document);
                        str2 = "160_160";
                    }
                    jn5 jn5Var = b;
                    String str3 = str2;
                    de0Var.setLayerNum(7);
                    de0Var.setRoundRadius(hl.L(4.0f));
                    de0Var.j(jn5Var, str3, jn5.c(w, document), "140_140", d, document);
                    if (r47.B4(document)) {
                        Integer num2 = kl8Var.p2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = zu1Var.getThemedColor(aob.v6);
                        }
                        de0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        kl8Var.x2 = r47.i1(document);
                    } else {
                        kl8Var.x2 = r47.i1(document);
                    }
                    kl8Var.w2 = de0Var;
                    kl8Var.z2 = true;
                }
            }
            zu1Var.showDialog(kl8Var);
            return;
        }
        m01.u(zu1Var.getParentActivity(), "https://" + zu1Var.getMessagesController().N2 + "/nft/" + str);
    }

    @Override
    public final void z1() {
        vnb vnbVar;
        zu1 zu1Var = this.a;
        if (zu1Var.m1 != null && zu1Var.getParentActivity() != null) {
            Context context = zu1Var.m1.getContext();
            vnbVar = ((e) zu1Var).resourceProvider;
            qe9.Z0(context, zu1Var, false, vnbVar, null);
        }
    }
}
