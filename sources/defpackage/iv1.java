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
import org.telegram.messenger.a;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class iv1 implements mc2 {
    public final yv1 a;

    public iv1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override
    public final void A(rc2 rc2Var) {
        k47 messageObject;
        if (rc2Var != null && (messageObject = rc2Var.getMessageObject()) != null && messageObject.k != null) {
            int e1 = messageObject.e1();
            yv1 yv1Var = this.a;
            if (yv1Var.kc != e1 || yv1Var.lc != 7) {
                TLRPC.InputPeer i1 = yv1Var.getMessagesController().i1(k47.B0(messageObject.k));
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = i1;
                getrichmessage.id = e1;
                k11 k11Var = yv1Var.oc;
                if (k11Var != null) {
                    k11Var.a(true);
                    yv1Var.oc = null;
                }
                cr1 cr1Var = new cr1(yv1Var, e1, rc2Var, (byte) 2);
                cr1Var.b = new uj1(yv1Var, r3, (byte) 11);
                yv1Var.oc = cr1Var;
                cr1Var.d();
                int[] iArr = {yv1Var.getConnectionsManager().sendRequestTyped(getrichmessage, new kc((byte) 0), new sm1(yv1Var, cr1Var, iArr, rc2Var, messageObject, (byte) 2))};
            }
        }
    }

    @Override
    public final boolean A0(long j) {
        TLRPC.ChatFull M0;
        yv1 yv1Var = this.a;
        TLRPC.Chat chat = yv1Var.e;
        if (chat == null || sd2.V(chat)) {
            return false;
        }
        oc7 messagesController = yv1Var.getMessagesController();
        long j2 = yv1Var.e.id;
        if (j2 == j) {
            messagesController.getClass();
            return true;
        }
        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j2));
        if (messagesController.getUserConfig().e() == j && L0 != null && L0.creator) {
            return true;
        }
        vh6 vh6Var = (vh6) messagesController.q1.f(j2);
        if (vh6Var == null && (M0 = messagesController.M0(j2)) != null && M0.participants != null) {
            for (int i = 0; i < M0.participants.participants.size(); i++) {
                TLRPC.ChatParticipant chatParticipant = M0.participants.participants.get(i);
                if (chatParticipant.user_id == j) {
                    return chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                }
            }
        }
        return ((TLRPC.ChannelParticipant) vh6Var.f(j)) instanceof TLRPC.TL_channelParticipantCreator;
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
        TLRPC.Message message;
        int i;
        int i2;
        int i3;
        int L;
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null && (message = messageObject.k) != null) {
            byte b = ir0Var.a;
            TL_stars.StarsAmount starsAmount = null;
            yv1 yv1Var = this.a;
            if (b == 1) {
                long n = pg3.n(message.from_id);
                x0 x0Var = new x0(this, message, (byte) 29);
                Pattern pattern = ik.a;
                Activity parentActivity = yv1Var.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, parentActivity);
                String M0 = jb6.M0(2131744072, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = gm.S2(jb6.a0(null, null, 2131744071, oc7.r1(z8c.t0).z1(n, false)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                anb.X(editText, cmb.F6, null);
                editText.setHint(jb6.M0(2131744070, null));
                anb.D(editText, cmb.G6, null);
                editText.setTextSize(1, 16.0f);
                editText.setBackground(cmb.T(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new zj(parentActivity)});
                if (jb6.a0) {
                    i3 = gm.L(24.0f);
                } else {
                    i3 = 0;
                }
                int L2 = gm.L(8.0f);
                if (jb6.a0) {
                    L = 0;
                } else {
                    L = gm.L(24.0f);
                }
                editText.setPadding(i3, L2, L, gm.L(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.j(jb6.M0(2131751541, null), new o(x0Var, editText, (byte) 4));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                heVar.O = new wf(editText, (byte) 0);
                frameLayout.addView(editText, qoe.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                gm.d3(new b1(editText, (byte) 13), 100L);
                yv1Var.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
                }
            } else if (b == 2) {
                if (message.suggested_post != null) {
                    i = ((d) yv1Var).currentAccount;
                    boolean A = sd2.A(i, yv1Var.e, 24);
                    if (A) {
                        i2 = ((d) yv1Var).currentAccount;
                        sd2.A(i2, yv1Var.e, 5);
                    }
                    rh rhVar = new rh(this, message, A, messageObject, (byte) 6);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    yv1Var.t5(rhVar, nk.m(starsAmount), !A);
                }
            } else if (b == 3) {
                yv1Var.Y5(rc2Var, true, false, rc2Var.getLastTouchX(), rc2Var.getLastTouchY(), true, false, true);
            } else if (b == 4) {
                yv1Var.g2.k(messageObject.Y1(), true);
            }
        }
    }

    @Override
    public final void C1() {
        ylb ylbVar;
        yv1 yv1Var = this.a;
        if (yv1Var.m1 != null && yv1Var.getParentActivity() != null) {
            Context context = yv1Var.m1.getContext();
            ylbVar = ((d) yv1Var).resourceProvider;
            cd9.Y0(context, yv1Var, false, ylbVar, null);
        }
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
        g(rc2Var, z, true, false);
    }

    @Override
    public final boolean D1(gn gnVar) {
        TLRPC.InputStickerSet i1;
        int i;
        yv1 yv1Var = this.a;
        if (!yv1Var.getMessagesController().H3() && gnVar != null && !gnVar.standard) {
            long documentId = gnVar.getDocumentId();
            TLRPC.Document document = gnVar.document;
            if (document == null) {
                i = ((d) yv1Var).currentAccount;
                document = vm.e(i, documentId);
            }
            if (document != null && (i1 = k47.i1(document)) != null) {
                hs6.d0(z8c.t0).n0(i1, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(i1);
                az3 az3Var = new az3(yv1Var, yv1Var.getParentActivity(), yv1Var.Ba, arrayList);
                sy3 sy3Var = az3Var.p1;
                sy3Var.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(sy3Var);
                sy3Var.w = imageReceiver;
                if (sy3Var.d) {
                    imageReceiver.I();
                }
                sy3Var.x = true;
                sy3Var.y.e(true, 1.0f);
                sy3Var.w.Z(gn5.b(document), "140_140", gn5.c(bc4.w(document.thumbs, 90, false, null, false), document), "140_140", eq3.d(document.thumbs, cmb.l6, 0.2f, true), 0L, null, null, 0);
                sy3Var.w.m0(7);
                ImageReceiver imageReceiver2 = sy3Var.w;
                imageReceiver2.v0 = true;
                imageReceiver2.u0 = true;
                imageReceiver2.M(1);
                ImageReceiver imageReceiver3 = sy3Var.w;
                imageReceiver3.x0 = true;
                imageReceiver3.p0(sy3Var);
                boolean Y7 = yv1Var.Y7();
                az3Var.i0 = Y7;
                az3Var.n = Y7;
                yv1Var.showDialog(az3Var);
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean E(defpackage.rc2 r38, org.telegram.tgnet.TLRPC.TodoItem r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.E(rc2, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
        int i;
        if (rc2Var != null && document != null) {
            yv1 yv1Var = this.a;
            if (yv1Var.getParentLayout() != null && Z1(rc2Var)) {
                boolean J3 = k47.J3(document);
                rc2Var.setScrimBlockBounds(rectF);
                bu5 I = bu5.I(yv1Var, rc2Var);
                if (J3) {
                    i = 2131745645;
                } else {
                    i = 2131745665;
                }
                I.b(2131232120, jb6.M0(i, null), new co1(this, rc2Var, document, (byte) 8), false);
                I.p = new vu1(rc2Var, rectF, (byte) 0);
                I.a0();
            }
        }
    }

    @Override
    public final void F0(defpackage.rc2 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.F0(rc2):void");
    }

    @Override
    public final void G(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.Message message = messageObject.k;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.f6(true);
        yv1 yv1Var = this.a;
        yv1Var.getMessagesStorage().U1(k47.B0(messageObject.k), messageObject.k);
        yv1Var.getMessagesController().i4.g(messageObject, true, false);
        g(rc2Var, true, false, true);
    }

    @Override
    public final void H(defpackage.rc2 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.H(rc2, int, float, float, boolean):void");
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
        tk5 tk5Var;
        int i;
        long j;
        int i2;
        tk5 tk5Var2;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() != null && tLObject != null) {
            tk5Var = ((d) yv1Var).parentLayout;
            if (tk5Var != null) {
                tk5Var2 = ((d) yv1Var).parentLayout;
                if (((ActionBarLayout) tk5Var2).w()) {
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
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232584, 2, yv1Var.getResourceProvider(), yv1Var.getParentActivity());
                anb.h(cmb.F8, yv1Var.getResourceProvider(), actionBarPopupWindow$ActionBarPopupWindowLayout);
                a8 a8Var = new a8(yv1Var.getParentActivity(), false, false);
                a8Var.j(jb6.M0(2131747544, null), 2131232094, null);
                a8Var.setMinimumWidth(160);
                a8Var.setOnClickListener(new k81(this, (byte) 10));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var);
                a8 a8Var2 = new a8(yv1Var.getParentActivity(), false, false);
                a8Var2.j(jb6.M0(2131746395, null), 2131232050, null);
                a8Var2.setMinimumWidth(160);
                a8Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, rc2Var, (byte) 19));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(a8Var2);
                yv1 yv1Var2 = new yv1(bundle);
                yv1Var2.ga = true;
                yv1Var.presentFragmentAsPreviewWithMenu(yv1Var2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                yv1Var.q5();
                return;
            }
            if (z2) {
                chat = (TLRPC.Chat) tLObject;
            }
            if (sd2.V(chat)) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject;
                i = ((d) yv1Var).currentAccount;
                long j2 = -chat2.id;
                if (chat2.min) {
                    j = 0;
                } else {
                    j = chat2.access_hash;
                }
                i2 = ((d) yv1Var).currentAccount;
                la4 la4Var = new la4(j2, j, 0, "open_channel", null, "channel_rec", null, ia4.d(i2), Utilities.b.nextLong());
                String f = ia4.f(i);
                if (f != null) {
                    ia4.d.postRunnable(new ba4(f, la4Var, (byte) 0));
                }
            }
            yv1Var.presentFragment(new yv1(bundle));
        }
    }

    @Override
    public final boolean J0(rc2 rc2Var, final TLRPC.TodoItem todoItem, final boolean z) {
        TLRPC.Peer peer;
        int i;
        TLRPC.Peer peer2;
        int i2;
        boolean l3 = k47.l3(rc2Var.getMessageObject().k);
        yv1 yv1Var = this.a;
        if (l3) {
            TLRPC.Message message = rc2Var.getMessageObject().k;
            if (message != null) {
                peer2 = message.from_id;
            } else {
                peer2 = null;
            }
            long n = pg3.n(peer2);
            c41 b0 = c41.b0(yv1Var);
            i2 = ((d) yv1Var).currentAccount;
            b0.Q(2131624113, 36, gm.S2(jb6.a0(null, null, 2131743772, pg3.k(i2, n)))).k(true);
            return false;
        } else if (!rc2Var.getMessageObject().q()) {
            TLRPC.Message message2 = rc2Var.getMessageObject().k;
            if (message2 != null) {
                peer = message2.from_id;
            } else {
                peer = null;
            }
            long n2 = pg3.n(peer);
            c41 b02 = c41.b0(yv1Var);
            i = ((d) yv1Var).currentAccount;
            b02.Q(2131624113, 36, gm.S2(jb6.a0(null, null, 2131743773, pg3.k(i, n2)))).k(true);
            return false;
        } else if (!yv1Var.getUserConfig().p()) {
            c41.b0(yv1Var).Q(2131624211, 36, gm.N2(jb6.M0(2131743749, null), -1, 2, new ru1(this, (byte) 9), null)).k(true);
            return false;
        } else {
            final long M = sd2.M(yv1Var.e, yv1Var.r8, true);
            final a6a sendMessagesHelper = yv1Var.getSendMessagesHelper();
            final k47 messageObject = rc2Var.getMessageObject();
            sendMessagesHelper.getClass();
            if (messageObject == null) {
                return true;
            }
            final int hash = Objects.hash(Long.valueOf(k47.B0(messageObject.k)), Integer.valueOf(messageObject.e1()), Integer.valueOf(todoItem.id));
            sendMessagesHelper.I.put(Integer.valueOf(hash), Boolean.valueOf(z));
            TLRPC.TL_messages_toggleTodoCompleted tL_messages_toggleTodoCompleted = new TLRPC.TL_messages_toggleTodoCompleted();
            tL_messages_toggleTodoCompleted.msg_id = messageObject.e1();
            tL_messages_toggleTodoCompleted.peer = sendMessagesHelper.getMessagesController().i1(k47.B0(messageObject.k));
            if (z) {
                tL_messages_toggleTodoCompleted.completed.add(Integer.valueOf(todoItem.id));
            } else {
                tL_messages_toggleTodoCompleted.incompleted.add(Integer.valueOf(todoItem.id));
            }
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_toggleTodoCompleted, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    a6a a6aVar = a6a.this;
                    final boolean z2 = z;
                    if (tL_error == null) {
                        final cf7 messagesStorage = a6aVar.getMessagesStorage();
                        k47 k47Var = messageObject;
                        final long B0 = k47.B0(k47Var.k);
                        final int e1 = k47Var.e1();
                        final int i3 = todoItem.id;
                        final long e = messagesStorage.getUserConfig().e();
                        final int currentTime = messagesStorage.getConnectionsManager().getCurrentTime();
                        mp3 mp3Var = messagesStorage.a;
                        final long j = M;
                        mp3Var.c(new Runnable() {
                            @Override
                            public final void run() {
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.he7.run():void");
                            }
                        });
                        a6aVar.getMessagesController().T3((TLRPC.Updates) tLObject, false);
                    }
                    gm.c3(new i74(a6aVar, hash, z2, (byte) 3));
                }
            });
            return true;
        }
    }

    @Override
    public final void J1(rc2 rc2Var) {
        TLRPC.Chat chat;
        TLRPC.ChatParticipant chatParticipant;
        TLRPC.ChatFull M0;
        TLRPC.User currentUser = rc2Var.getCurrentUser();
        yv1 yv1Var = this.a;
        if (gm.C1(yv1Var.getParentActivity()) && (chat = yv1Var.e) != null && currentUser != null && !sd2.V(chat)) {
            oc7 messagesController = yv1Var.getMessagesController();
            long j = yv1Var.e.id;
            long j2 = currentUser.id;
            vh6 vh6Var = (vh6) messagesController.q1.f(j);
            if (vh6Var == null && (M0 = messagesController.M0(j)) != null && M0.participants != null) {
                for (int i = 0; i < M0.participants.participants.size(); i++) {
                    chatParticipant = M0.participants.participants.get(i);
                    if (chatParticipant.user_id == j2) {
                        break;
                    }
                }
            }
            chatParticipant = (TLObject) vh6Var.f(j2);
            e(rc2Var, chatParticipant);
        }
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
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        yv1 yv1Var = this.a;
        if (!yv1Var.b8()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (yv1Var.getParentActivity() != null) {
                if (yv1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    ms1 ms1Var = yv1Var.a0;
                    k47 messageObject = rc2Var.getMessageObject();
                    k47 messageObject2 = rc2Var.getMessageObject();
                    br1 br1Var = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    k11 k11Var = yv1Var.oc;
                    if (k11Var != null) {
                        k11Var.a(true);
                        yv1Var.oc = null;
                    }
                    if (str != null && rc2Var.getMessageObject() != null) {
                        br1Var = new br1(yv1Var, rc2Var.getMessageObject().e1(), str, rc2Var, (byte) 1);
                        yv1Var.oc = br1Var;
                    } else {
                        yv1Var.oc = null;
                    }
                    ms1Var.s0(keyboardButtonProto, messageObject, messageObject2, br1Var);
                }
            }
        }
    }

    @Override
    public final void L1(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        yv1 yv1Var = this.a;
        yv1Var.v5 = messageObject;
        yv1Var.D7();
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
        n02 n02Var;
        String str;
        yv1 yv1Var = this.a;
        if (!z && (n02Var = yv1Var.c4) != null) {
            k47 messageObject = rc2Var.getMessageObject();
            if (characterStyle instanceof j6c) {
                str = "@";
            } else if ((characterStyle instanceof URLSpan) && !(characterStyle instanceof jo4)) {
                str = ((URLSpan) characterStyle).getURL();
            } else {
                str = null;
            }
            n02Var.b(messageObject, str);
        }
        yv1Var.m6(characterStyle, z, rc2Var.getMessageObject(), rc2Var);
    }

    @Override
    public final void M0(rc2 rc2Var) {
        int i;
        int i2;
        yr1 yr1Var;
        k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.c3 = !primaryMessageObject.c3;
            primaryMessageObject.M1 = true;
            yv1 yv1Var = this.a;
            vr1 vr1Var = yv1Var.A0;
            if (vr1Var != null && (yr1Var = yv1Var.C0) != null && yr1Var.y < 0) {
                for (int childCount = vr1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = yv1Var.A0.getChildAt(childCount);
                    yv1Var.A0.getClass();
                    i = RecyclerView.R(childAt);
                    if (i >= 0) {
                        if (childAt instanceof rc2) {
                            if (((rc2) childAt).getCurrentMessagesGroup() == null) {
                                i2 = yv1Var.i7(childAt);
                                break;
                            }
                        } else if (childAt instanceof cm1) {
                            i2 = yv1Var.i7(childAt);
                            break;
                        }
                    }
                }
            }
            i = -1;
            i2 = 0;
            yv1Var.Zc(primaryMessageObject, false);
            hg5 hg5Var = yv1Var.P1;
            if (hg5Var != null) {
                hg5Var.f(true);
            }
            if (i >= 0 && rc2Var.getCurrentMessagesGroup() == null) {
                yv1Var.C0.g1(i, i2);
            }
        }
    }

    @Override
    public final pc8 M1() {
        return this.a.Ta;
    }

    @Override
    public final boolean N() {
        yv1 yv1Var = this.a;
        if (!m9c.B(yv1Var.f) && !m9c.D(yv1Var.f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void N0(rc2 rc2Var, float f, float f2) {
        this.a.Y5(rc2Var, true, false, f, f2, false, false, false);
    }

    @Override
    public final void N1(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new bl2(str2, str, false), 0, spannableString.length(), 33);
        gm.g(spannableString);
        c41.b0(this.a).i(jb6.M0(2131751959, null)).j();
    }

    @Override
    public final int O() {
        return this.a.g4;
    }

    @Override
    public final boolean O1(long r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.O1(long):boolean");
    }

    @Override
    public final void P(rc2 rc2Var) {
        k47 primaryMessageObject = rc2Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.a.Zc(primaryMessageObject, false);
    }

    @Override
    public final String P0(rc2 rc2Var) {
        yv1 yv1Var;
        int i;
        if (rc2Var.getMessageObject() != null && (i = (yv1Var = this.a).kc) != 0 && i == rc2Var.getMessageObject().e1() && yv1Var.lc == 3) {
            return yv1Var.nc;
        }
        return null;
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
        TLRPC.Message message;
        if (rc2Var == null) {
            n28Var.run();
            return;
        }
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null && ((!messageObject.n4() || messageObject.Y2()) && (message = messageObject.k) != null && message.rich_message != null)) {
            d dVar = this.a;
            dVar.getSendMessagesHelper().u(messageObject, messageObject.k.rich_message, null, dVar, true);
            return;
        }
        n28Var.run();
    }

    @Override
    public final int Q(rc2 rc2Var) {
        lf8 lf8Var;
        yv1 yv1Var = this.a;
        if (yv1Var.pd.f && (lf8Var = yv1Var.vd) != null && lf8Var.n == rc2Var && lf8Var.a.getWidth() > 0) {
            return yv1Var.vd.a.getHeight();
        }
        return 0;
    }

    @Override
    public final void Q0(rc2 rc2Var) {
        float f;
        if (rc2Var.getMessageObject().y3()) {
            T0();
            return;
        }
        yv1 yv1Var = this.a;
        if (!yv1Var.A3 && yv1Var.A0 != null && yv1Var.getParentActivity() != null && yv1Var.fragmentView != null) {
            if (yv1Var.J2 == null) {
                int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
                if (indexOfChild != -1) {
                    hg5 x4 = yv1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    yv1Var.J2 = x4;
                    x4.t(jb6.M0(2131749086, null));
                } else {
                    return;
                }
            }
            k47 messageObject = rc2Var.getMessageObject();
            if (messageObject != null) {
                TLRPC.User currentUser = rc2Var.getCurrentUser();
                if (currentUser != null && currentUser.id == 0) {
                    f = (rc2Var.getMeasuredHeight() - Math.max(0, rc2Var.getBottom() - ((View) rc2Var.getParent()).getMeasuredHeight())) - gm.L(50.0f);
                } else {
                    float L = gm.L(22.0f);
                    if (!messageObject.O3() && rc2Var.w9 && rc2Var.h9 != null) {
                        f = gm.L(20.0f) + L;
                    } else {
                        f = L;
                    }
                }
                if (yv1Var.x7(rc2Var, f) > gm.L(80.0f)) {
                    yv1Var.J2.w(yv1Var.w7(rc2Var, rc2Var.getForwardNameCenterX()), yv1Var.x7(rc2Var, f) - gm.L(4.0f), true);
                }
            }
        }
    }

    @Override
    public final void Q1(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null && messageObject.D == 27) {
            messageObject.X5();
            messageObject.M1 = true;
            rc2Var.J1();
            rc2Var.requestLayout();
            this.a.D0.M(messageObject, false, false);
        }
    }

    @Override
    public final void R(rc2 rc2Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() != null) {
            if (yv1Var.ua == null) {
                xz8 xz8Var = new xz8(yv1Var.getParentActivity());
                yv1Var.ua = xz8Var;
                yv1Var.m1.addView(xz8Var, qoe.e(-1, -1, 48));
            }
            xz8 xz8Var2 = yv1Var.ua;
            HashMap hashMap = xz8Var2.a;
            ArrayList arrayList = xz8Var2.c;
            arrayList.clear();
            int i = xz8Var2.d;
            z8c h = z8c.h(i);
            long j = h.n;
            arrayList.add(Long.valueOf(j));
            if (h.W) {
                ArrayList arrayList2 = hs6.d0(i).j1;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                    long j2 = tL_topPeer.peer.user_id;
                    if (j2 != 0 && oc7.r1(i).W1(Long.valueOf(tL_topPeer.peer.user_id)) != null) {
                        arrayList.add(Long.valueOf(j2));
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = oc7.r1(i).y;
            for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i3);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j3 = dialog.id;
                    if (j3 != j && !pg3.B(j3)) {
                        if (pg3.D(dialog.id)) {
                            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(dialog.id));
                            if (W1 != null && !m9c.v(W1) && !m9c.z(W1) && !m9c.C(W1.id)) {
                                int i4 = dialog.folder_id;
                                long j4 = dialog.id;
                                if (i4 == 1) {
                                    arrayList3.add(Long.valueOf(j4));
                                } else {
                                    arrayList.add(Long.valueOf(j4));
                                }
                            }
                        } else {
                            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-dialog.id));
                            if (L0 != null && !L0.forum && !sd2.r0(L0) && ((!L0.gigagroup || sd2.N(L0)) && (!sd2.T(L0) || L0.creator || (((tL_chatAdminRights = L0.admin_rights) != null && tL_chatAdminRights.post_messages) || L0.megagroup)))) {
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
            String b = xz8.b(rc2Var);
            if (b != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList.get(i6);
                    i6++;
                    Long l = (Long) obj2;
                    if (hashSet.add(l) && pg3.D(l.longValue())) {
                        arrayList5.add(l);
                    }
                }
                wz8 wz8Var = new wz8(xz8Var2, rc2Var, arrayList5, new ey8(xz8Var2, b, (byte) 7));
                wz8Var.setBounds(0, 0, xz8Var2.getMeasuredWidth(), xz8Var2.getMeasuredHeight());
                wz8Var.setCallback(xz8Var2);
                if (!hashMap.containsKey(b)) {
                    hashMap.put(b, wz8Var);
                }
            }
        }
    }

    @Override
    public final hw1 S() {
        return this.a.Ec;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        k47 messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (rc2Var != null && pageBlock != null) {
            yv1 yv1Var = this.a;
            if (yv1Var.getParentActivity() != null && (messageObject = rc2Var.getMessageObject()) != null && (message = messageObject.k) != null && messageObject.y2 != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = messageObject.y2.g;
                for (int i = 0; i < arrayList2.size(); i++) {
                    qi9 qi9Var = (qi9) arrayList2.get(i);
                    if (qi9Var instanceof dj9) {
                        arrayList.add(((dj9) qi9Var).r0);
                    } else if (qi9Var instanceof pj9) {
                        arrayList.add(((pj9) qi9Var).r0);
                    } else if (qi9Var instanceof vi9) {
                        ArrayList arrayList3 = ((vi9) qi9Var).Y;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            arrayList.add(((ki9) obj).b);
                        }
                    } else if (qi9Var instanceof hj9) {
                        ArrayList arrayList4 = ((hj9) qi9Var).Y;
                        int size2 = arrayList4.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList4.get(i3);
                            i3++;
                            arrayList.add(((ki9) obj2).b);
                        }
                    }
                }
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer r0 = PhotoViewer.r0();
                    r0.T1(null, yv1Var, null);
                    return r0.m1(null, null, null, null, null, null, null, indexOf, new pu1(yv1Var, arrayList), null, 0L, 0L, 0L, true, new ou1(richMessage, arrayList, messageObject), null);
                }
            }
        }
        return false;
    }

    @Override
    public final void T(k47 k47Var) {
        this.a.s.put(k47Var, Boolean.TRUE);
    }

    @Override
    public final void T0() {
        yv1 yv1Var = this.a;
        yv1Var.i6();
        UndoView undoView = yv1Var.N3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, yv1Var.l6, null);
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        cr1 cr1Var;
        int i;
        ge7 ge7Var;
        k47 messageObject = rc2Var.getMessageObject();
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            yv1 yv1Var = this.a;
            k11 k11Var = yv1Var.oc;
            if (k11Var != null) {
                k11Var.a(true);
                yv1Var.oc = null;
            }
            if (rc2Var.getMessageObject() == null) {
                yv1Var.oc = null;
                cr1Var = null;
            } else {
                cr1Var = new cr1(yv1Var, rc2Var.getMessageObject().e1(), rc2Var, (byte) 1);
                yv1Var.oc = cr1Var;
            }
            i = ((d) this.a).currentAccount;
            jva v = jva.v(i, false);
            Objects.requireNonNull(cr1Var);
            fo1 fo1Var = new fo1(cr1Var, (byte) 8);
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            ylb F = jva.F();
            if (messageObject != null && context != null) {
                long B0 = k47.B0(messageObject.k);
                int e1 = messageObject.e1();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = oc7.r1(v.a).i1(B0);
                tL_inputInvoiceMessage.msg_id = e1;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject u = wx0.u(F, false);
                if (u != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = u.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                ge7Var = new ge7(v, ConnectionsManager.getInstance(v.a).sendRequest(tL_payments_getPaymentForm, new av0(v, messageObject, tL_inputInvoiceMessage, fo1Var, (byte) 21)), (byte) 17);
            } else {
                ge7Var = null;
            }
            if (ge7Var != null) {
                cr1Var.b = ge7Var;
                cr1Var.d();
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
                    TLRPC.TL_message P5 = yv1.P5(message);
                    if (!TextUtils.isEmpty(tL_messageExtendedMedia.attachPath)) {
                        P5.attachPath = tL_messageExtendedMedia.attachPath;
                    } else if (tL_messageMediaPaidMedia.extended_media.size() == 1) {
                        P5.attachPath = message.attachPath;
                    }
                    P5.media = tL_messageExtendedMedia.media;
                    P5.noforwards = true;
                    arrayList.add(new k47(messageObject.K1, P5, false, true));
                }
            }
            if (i2 > -1 && !arrayList.isEmpty()) {
                PhotoViewer r0 = PhotoViewer.r0();
                yv1 yv1Var2 = this.a;
                r0.T1(null, yv1Var2, yv1Var2.Ba);
                PhotoViewer.r0().n1(arrayList, i2, this.a.a(), 0L, 0L, this.a.eb);
            }
        }
    }

    @Override
    public final void U0(rc2 rc2Var) {
        yv1 yv1Var = this.a;
        if (!yv1Var.getMessagesController().a5()) {
            he heVar = new he(3, null, yv1Var.getParentActivity());
            heVar.q(200L);
            yv1Var.getMessagesController().Q0(new iu(this, heVar, rc2Var, (byte) 11));
            return;
        }
        if (rc2Var.getMessageObject() != null) {
            rc2Var.getMessageObject().t2 = Boolean.FALSE;
        }
        rc2Var.K3();
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return !this.a.s.containsKey(k47Var);
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
        this.a.o6(rc2Var, reactionCount, z, f, f2);
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
        org.telegram.ui.ActionBar.a aVar;
        yv1 yv1Var = this.a;
        aVar = ((d) yv1Var).actionBar;
        boolean z = true;
        if (!aVar.y() && !yv1Var.c8()) {
            if (rc2Var != null && rc2Var.getMessageObject() != null && rc2Var.getMessageObject().q4()) {
                t1(rc2Var, 10);
                return;
            }
            if (!sd2.c0(yv1Var.e) && !yv1Var.j8()) {
                z = false;
            }
            o(user, z);
            return;
        }
        yv1Var.Ra(rc2Var, f, f2, true);
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        org.telegram.ui.ActionBar.a aVar;
        k47 messageObject;
        if (chat == null) {
            return;
        }
        yv1 yv1Var = this.a;
        aVar = ((d) yv1Var).actionBar;
        if (!aVar.y() && !yv1Var.c8()) {
            if (!z && chat.signature_profiles && (messageObject = rc2Var.getMessageObject()) != null && k47.B0(messageObject.k) != 1271266957) {
                yv1Var.Ea(pg3.n(messageObject.k.from_id));
                return;
            } else {
                j(rc2Var, chat, i, z);
                return;
            }
        }
        yv1Var.Ra(rc2Var, f, f2, true);
    }

    @Override
    public final void X0(rc2 rc2Var) {
        k47 k47Var;
        long j;
        int i;
        ArrayList arrayList;
        of2 of2Var;
        f47 f47Var;
        int i2;
        yv1 yv1Var = this.a;
        xz8 xz8Var = yv1Var.ua;
        if (xz8Var != null) {
            HashMap hashMap = xz8Var.a;
            wz8 wz8Var = (wz8) hashMap.get(xz8.b(rc2Var));
            u31 u31Var = null;
            if (wz8Var != null) {
                k47Var = wz8Var.F;
            } else {
                k47Var = null;
            }
            wz8 wz8Var2 = (wz8) yv1Var.ua.a.get(xz8.b(rc2Var));
            if (wz8Var2 != null && (i2 = wz8Var2.S) != -1) {
                j = wz8Var2.x[i2].d;
            } else {
                j = 0;
            }
            if (k47Var != null && j != 0) {
                Activity parentActivity = yv1Var.getParentActivity();
                i = ((d) yv1Var).currentAccount;
                boolean z = false;
                if (!ik.h(parentActivity, i, j, false)) {
                    if (k47Var.c1() != 0 && (f47Var = (f47) yv1Var.P6.f(k47Var.c1())) != null) {
                        arrayList = f47Var.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = td4.u(k47Var);
                    }
                    if (j == z8c.h(z8c.t0).n) {
                        z = true;
                    }
                    long j2 = j;
                    of2 of2Var2 = new of2(this, arrayList, j2, (byte) 15);
                    if (z) {
                        of2Var2.run();
                        of2Var = null;
                    } else {
                        of2Var = of2Var2;
                    }
                    u31Var = c41.v(yv1Var.getParentActivity(), yv1Var, null, 1, j2, 1, yv1Var.getThemedColor(cmb.vj), yv1Var.getThemedColor(cmb.xj), 5000, false, of2Var);
                    u31Var.k = true;
                    u31Var.k(u31Var.e instanceof f31);
                }
            }
            wz8 wz8Var3 = (wz8) hashMap.get(xz8.b(rc2Var));
            if (wz8Var3 != null) {
                if (u31Var == null) {
                    wz8Var3.S = -1;
                    wz8Var3.c();
                    return;
                }
                y21 y21Var = u31Var.e;
                if (!(y21Var instanceof b31)) {
                    wz8Var3.c();
                    return;
                }
                b31 b31Var = (b31) y21Var;
                wz8Var3.X = b31Var;
                b31Var.a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = wz8Var3.X.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new xj3(wz8Var3, viewTreeObserver, (byte) 2));
            }
        }
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        yv1 yv1Var = this.a;
        yv1Var.getSendMessagesHelper().m0(true, rc2Var.getMessageObject(), keyboardInlineButton, null, null, yv1Var);
    }

    @Override
    public final void Y(int i) {
        CharSequence N2;
        int i2;
        SpannableStringBuilder S2;
        int i3;
        yv1 yv1Var = this.a;
        try {
            if (i == 0) {
                yv1Var.u5();
                kt1 kt1Var = yv1Var.O3;
                if (kt1Var != null) {
                    kt1Var.l(0L, 84, null, new ru1(this, (byte) 1));
                    yv1Var.O3.performHapticFeedback(3, 2);
                }
            } else if (i == 1) {
                String x = jb6.x(yv1Var.getMessagesController().H3, true);
                if (yv1Var.getMessagesController().H3 > 0) {
                    i3 = ((d) yv1Var).currentAccount;
                    S2 = gm.S2(jb6.G(v0c.g(i3), "TranscriptionTrialLeftUntil", x));
                } else {
                    i2 = ((d) yv1Var).currentAccount;
                    S2 = gm.S2(jb6.G(v0c.g(i2), "TranscriptionTrialLeft", new Object[0]));
                }
                c41.b0(yv1Var).G(2131624295, 6, S2).k(true);
                yv1Var.fragmentView.performHapticFeedback(3, 2);
            } else if (i == 2 || i == 3) {
                String x2 = jb6.x(yv1Var.getMessagesController().H3, true);
                c41 b0 = c41.b0(yv1Var);
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) gm.S2(jb6.G(yv1Var.getMessagesController().G3, "TranscriptionTrialEnd", new Object[0]))).append((CharSequence) " ");
                if (i == 2) {
                    N2 = gm.N2(jb6.M0(2131743655, null), -1, 0, new ru1(this, (byte) 2), null);
                } else if (yv1Var.getMessagesController().H3 <= 0) {
                    N2 = "";
                } else {
                    N2 = gm.N2(jb6.a0(null, null, 2131743654, x2), -1, 0, new ru1(this, (byte) 3), null);
                }
                SpannableStringBuilder append2 = append.append(N2);
                b0.getClass();
                b31 b31Var = new b31(b0.X(), b0.c);
                b31Var.c(2131624295, 36, 36, new String[0]);
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
                b31Var.b.setText(append2);
                b31Var.b.setSingleLine(false);
                b31Var.b.setMaxLines(6);
                b0.b(b31Var, 7000).k(true);
                xx0.APP_ERROR.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final boolean Y1(rc2 rc2Var, final TLRPC.User user) {
        ?? r2;
        ?? r4;
        char c;
        int i;
        wc0 b;
        int i2;
        qs1 qs1Var;
        ps1 ps1Var;
        if (!h()) {
            return false;
        }
        yv1 yv1Var = this.a;
        if (yv1Var.e != null && (((qs1Var = yv1Var.d1) == null || qs1Var.getVisibility() != 0) && ((ps1Var = yv1Var.T) == null || ps1Var.getVisibility() != 0))) {
            r2 = 1;
        } else {
            r2 = 0;
        }
        TLRPC.Chat chat = yv1Var.e;
        if (chat != null && ((yv1Var.s4 == 0 || yv1Var.x4) && (!sd2.T(chat) || yv1Var.e.megagroup))) {
            r4 = 1;
        } else {
            r4 = 0;
        }
        cd0[] cd0VarArr = new cd0[r2 + 2 + r4];
        cd0VarArr[0] = cd0.d;
        cd0VarArr[1] = cd0.h;
        if (r2 != 0) {
            cd0VarArr[2] = cd0.n;
            c = 3;
        } else {
            c = 2;
        }
        if (r4 != 0) {
            cd0VarArr[c] = cd0.r;
        }
        TLRPC.UserFull X1 = yv1Var.getMessagesController().X1(user.id);
        if (X1 == null) {
            i = ((d) yv1Var).classGuid;
            b = wc0.b(user, i, cd0VarArr);
        } else {
            b = wc0.c(user, X1, cd0VarArr);
            if (!yh4.l(b)) {
                i2 = ((d) yv1Var).classGuid;
                b = wc0.b(user, i2, cd0VarArr);
            }
        }
        if (yh4.l(b)) {
            yh4.t().J((ViewGroup) yv1Var.fragmentView, yv1Var.Ba, b, new jf(this, rc2Var, user, (byte) 15));
            return true;
        }
        bu5 I = bu5.I(yv1Var, rc2Var);
        I.b(2131232272, jb6.M0(2131747519, null), new Runnable(this) {
            public final iv1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                iv1 iv1Var = this.b;
                switch (b2) {
                    case 0:
                        iv1Var.o(user2, false);
                        return;
                    case 1:
                        iv1Var.d(user2);
                        return;
                    default:
                        iv1Var.a.Ca(user2);
                        return;
                }
            }
        }, false);
        I.b(2131232119, jb6.M0(2131745335, null), new co1(this, rc2Var, user, (byte) 6), false);
        I.k(2131232228, jb6.M0(2131748366, null), new Runnable(this) {
            public final iv1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                iv1 iv1Var = this.b;
                switch (b2) {
                    case 0:
                        iv1Var.o(user2, false);
                        return;
                    case 1:
                        iv1Var.d(user2);
                        return;
                    default:
                        iv1Var.a.Ca(user2);
                        return;
                }
            }
        }, r2);
        I.k(2131232360, jb6.M0(2131753723, null), new Runnable(this) {
            public final iv1 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b2 = r3;
                TLRPC.User user2 = user;
                iv1 iv1Var = this.b;
                switch (b2) {
                    case 0:
                        iv1Var.o(user2, false);
                        return;
                    case 1:
                        iv1Var.d(user2);
                        return;
                    default:
                        iv1Var.a.Ca(user2);
                        return;
                }
            }
        }, r4);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gm.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final boolean Z() {
        if (this.a.g4 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void Z0(defpackage.rc2 r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.Z0(rc2):void");
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        k47 messageObject;
        if (rc2Var == null) {
            messageObject = null;
        } else {
            messageObject = rc2Var.getMessageObject();
        }
        if (messageObject != null && messageObject.k != null) {
            yv1 yv1Var = this.a;
            if (yv1Var.g4 != 1 && !yv1Var.a8() && !messageObject.k.noforwards && messageObject.D != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        yv1 yv1Var = this.a;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            CharSequence fieldText = ms1Var.getFieldText();
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
            String K = sd2.K(chat, false);
            if (K != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) K).append((CharSequence) " ");
                yv1Var.a0.setFieldText(spannableStringBuilder);
                gm.d3(new ru1(this, (byte) 6), 200L);
            }
        }
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        yv1 yv1Var;
        int i;
        if (rc2Var.getMessageObject() != null && (i = (yv1Var = this.a).kc) != 0 && i == rc2Var.getMessageObject().e1() && yv1Var.lc == 1) {
            return yv1Var.mc;
        }
        return null;
    }

    @Override
    public final boolean b() {
        org.telegram.ui.ActionBar.a aVar;
        org.telegram.ui.ActionBar.a aVar2;
        boolean z;
        yv1 yv1Var = this.a;
        aVar = ((d) yv1Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) yv1Var).actionBar;
            if (!aVar2.y() && !yv1Var.c8()) {
                z = ((d) yv1Var).inPreviewMode;
                if (!z) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject != null) {
            int a = ah8.a(messageObject);
            boolean a2 = iqd.a(a, 7);
            yv1 yv1Var = this.a;
            if (a2) {
                c41.b0(yv1Var).Q(2131624007, 36, ah8.b(a, messageObject)).j();
            } else if (i < 0 && !arrayList.isEmpty()) {
                yv1Var.getSendMessagesHelper().v0(messageObject, arrayList, null);
                rc2Var.a0(true);
            } else if (yv1Var.getParentActivity() != null) {
                if (yv1Var.C2 == null) {
                    int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
                    if (indexOfChild == -1) {
                        return;
                    }
                    hg5 x4 = yv1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    yv1Var.C2 = x4;
                    x4.v0 = 0.0f;
                }
                if (arrayList.isEmpty() && i < 0) {
                    ArrayList<qc2> pollButtons = rc2Var.getPollButtons();
                    int size = pollButtons.size();
                    int i4 = 0;
                    float f = 0.0f;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        qc2 qc2Var = pollButtons.get(i4);
                        float y = ((rc2Var.getY() + qc2Var.b) - gm.L(4.0f)) - yv1Var.P9;
                        yv1Var.F2 = gm.L(13.3f) + qc2Var.a;
                        int z = b10.z(6.0f, qc2Var.b, i3);
                        yv1Var.G2 = z;
                        if (y > 0.0f) {
                            i2 = yv1Var.F2;
                            i3 = z;
                            f = 0.0f;
                            break;
                        }
                        i4++;
                        f = y;
                    }
                    if (f != 0.0f) {
                        yv1Var.A0.x0(0, (int) f, null);
                        yv1Var.E2 = rc2Var;
                        return;
                    }
                }
                yv1Var.qc(rc2Var, i, i2, i3);
            }
        }
    }

    @Override
    public final void c() {
        this.a.m1.getClass();
    }

    public final void d(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        yv1 yv1Var = this.a;
        ms1 ms1Var = yv1Var.a0;
        if (ms1Var != null) {
            CharSequence fieldText = ms1Var.getFieldText();
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
            String p = m9c.p(user);
            if (p != null) {
                spannableStringBuilder.append((CharSequence) "@").append((CharSequence) p).append((CharSequence) " ");
            } else {
                SpannableString spannableString = new SpannableString(td4.p(m9c.k(user, false), " "));
                spannableString.setSpan(new j6c(String.valueOf(user.id), 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            yv1Var.a0.setFieldText(spannableStringBuilder);
            gm.d3(new ru1(this, (byte) 7), 200L);
        }
    }

    @Override
    public final boolean d0() {
        boolean z;
        yv1 yv1Var = this.a;
        if (!yv1Var.c8()) {
            z = ((d) yv1Var).inPreviewMode;
            if (!z) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d2(rc2 rc2Var, float f, float f2) {
        k47 messageObject = rc2Var.getMessageObject();
        int i = messageObject.D;
        yv1 yv1Var = this.a;
        if (i == 16) {
            TLRPC.MessageAction messageAction = messageObject.k.action;
            int i2 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(yv1Var.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i2 < size) {
                    TLRPC.Peer peer = arrayList.get(i2);
                    i2++;
                    hashSet.add(Long.valueOf(pg3.n(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.e1();
                he heVar = new he(3, null, yv1Var.getParentActivity());
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = yv1Var.getMessagesController().l4.w3.f();
                heVar.setOnCancelListener(new fu0(this, yv1Var.getConnectionsManager().sendRequest(getgroupcall, new fo0(this, heVar, hashSet, tL_inputGroupCallInviteMessage, messageObject, (byte) 5)), (byte) 2));
                heVar.q(600L);
                return;
            }
            TLRPC.User user = yv1Var.f;
            if (user != null) {
                boolean I4 = messageObject.I4();
                TLRPC.UserFull userFull = yv1Var.s8;
                if (userFull != null && userFull.video_calls_available) {
                    i2 = 1;
                }
                sic.m(user, I4, i2, yv1Var.getParentActivity(), yv1Var.getMessagesController().X1(yv1Var.f.id), yv1Var.getAccountInstance());
                return;
            }
            return;
        }
        yv1Var.Y5(rc2Var, true, false, f, f2, messageObject.I3(), false, false);
    }

    public final void e(rc2 rc2Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        int i;
        ylb ylbVar;
        TLRPC.User currentUser = rc2Var.getCurrentUser();
        yv1 yv1Var = this.a;
        yv1Var.getUserConfig().f();
        if (gm.C1(yv1Var.getParentActivity()) && (chat = yv1Var.e) != null && currentUser != null && !sd2.V(chat)) {
            boolean z4 = true;
            boolean z5 = false;
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                    z = false;
                    z5 = true;
                } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                    if (channelParticipant.promoted_by == yv1Var.getUserConfig().e()) {
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
                    if (channelParticipant2.promoted_by == yv1Var.getUserConfig().e()) {
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
                Activity parentActivity = yv1Var.getParentActivity();
                i = ((d) yv1Var).currentAccount;
                ylbVar = ((d) yv1Var).resourceProvider;
                xhb.b(parentActivity, i, -yv1Var.e.id, currentUser, str2, z6, z7, z3, ylbVar);
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                if (tLObject instanceof TLRPC.TL_chatParticipantCreator) {
                    z = false;
                    z5 = true;
                } else if (tLObject instanceof TLRPC.TL_chatParticipantAdmin) {
                    if (((TLRPC.TL_chatParticipantAdmin) tLObject).inviter_id == yv1Var.getUserConfig().e()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                    z4 = false;
                }
                str = ((TLRPC.ChatParticipant) tLObject).rank;
            } else if (sd2.T(yv1Var.e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                yv1Var.getMessagesController();
                tL_channels_getParticipant.channel = oc7.h1(yv1Var.e);
                tL_channels_getParticipant.participant = yv1Var.getMessagesController().i1(currentUser.id);
                yv1Var.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new kc((byte) 0), new lf2(this, rc2Var, (byte) 9));
                return;
            } else {
                return;
            }
            z3 = z;
            str2 = str;
            boolean z62 = z4;
            boolean z72 = z5;
            Activity parentActivity2 = yv1Var.getParentActivity();
            i = ((d) yv1Var).currentAccount;
            ylbVar = ((d) yv1Var).resourceProvider;
            xhb.b(parentActivity2, i, -yv1Var.e.id, currentUser, str2, z62, z72, z3, ylbVar);
        }
    }

    @Override
    public final void e0(k47 k47Var) {
        if (k47.K4(k47Var.k)) {
            this.a.Db(k47Var, true);
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    public final void g(rc2 rc2Var, boolean z, boolean z2, boolean z3) {
        k47 primaryMessageObject;
        int i;
        int i2;
        yr1 yr1Var;
        if (rc2Var == null || (primaryMessageObject = rc2Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.M1 = true;
        yv1 yv1Var = this.a;
        vr1 vr1Var = yv1Var.A0;
        if (vr1Var != null && (yr1Var = yv1Var.C0) != null && yr1Var.y < 0) {
            for (int childCount = vr1Var.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = yv1Var.A0.getChildAt(childCount);
                yv1Var.A0.getClass();
                i = RecyclerView.R(childAt);
                if (i >= 0) {
                    if (childAt instanceof rc2) {
                        if (((rc2) childAt).getCurrentMessagesGroup() == null) {
                            i2 = yv1Var.i7(childAt);
                            break;
                        }
                    } else if (childAt instanceof cm1) {
                        i2 = yv1Var.i7(childAt);
                        break;
                    }
                }
            }
        }
        i = -1;
        i2 = 0;
        if (z && i >= 0 && rc2Var.getCurrentMessagesGroup() == null) {
            yr1 yr1Var2 = yv1Var.C0;
            if (z3) {
                yv1Var.A0.getClass();
                yr1Var2.h1(RecyclerView.R(rc2Var), rc2Var.getTop() - ((int) yv1Var.P9), false);
            } else {
                yr1Var2.g1(i, i2);
            }
        }
        yv1Var.c1 = z2;
        yv1Var.Zc(primaryMessageObject, false);
        yv1Var.c1 = false;
    }

    @Override
    public final void g2() {
        this.a.Q7();
    }

    public final boolean h() {
        yv1 yv1Var = this.a;
        if (!m9c.D(yv1Var.f)) {
            TLRPC.Chat chat = yv1Var.e;
            if (chat != null) {
                if (sd2.T(chat) && !yv1Var.e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void h0(String str) {
        yv1 yv1Var = this.a;
        qs1 qs1Var = yv1Var.d1;
        if (qs1Var == null || qs1Var.getVisibility() != 0) {
            ps1 ps1Var = yv1Var.T;
            if ((ps1Var == null || ps1Var.getVisibility() != 0) && yv1Var.a0 != null && str != null && str.length() > 0) {
                ms1 ms1Var = yv1Var.a0;
                ms1Var.setFieldText("@" + str + " ");
                yv1Var.a0.j1();
            }
        }
    }

    @Override
    public final void i() {
        a.t();
        boolean z = e21.a;
        a.q();
        l11.u(this.a.getParentActivity(), e21.g);
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
        boolean z = rc2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveaway;
        yv1 yv1Var = this.a;
        if (z) {
            long j = -((TLRPC.TL_messageMediaGiveaway) rc2Var.getMessageObject().k.media).channels.get(i).longValue();
            if (yv1Var.l6 != j) {
                yv1Var.presentFragment(yv1.ga(j));
            } else {
                yv1Var.p1.e(false, false);
            }
        }
        if (rc2Var.getMessageObject().k.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            yv1Var.presentFragment(ProfileActivity.S2(((TLRPC.TL_messageMediaGiveawayResults) rc2Var.getMessageObject().k.media).winners.get(i).longValue()));
        }
    }

    @Override
    public final void i1(rc2 rc2Var, float f, float f2) {
        wz8 wz8Var;
        int i;
        boolean z;
        boolean z2;
        float f3;
        xz8 xz8Var = this.a.ua;
        if (xz8Var != null && (wz8Var = (wz8) xz8Var.a.get(xz8.b(rc2Var))) != null) {
            tz8[] tz8VarArr = wz8Var.x;
            RectF rectF = wz8Var.r;
            if (wz8Var.N) {
                float f4 = (f - rectF.left) + wz8Var.V;
                float f5 = (f2 - rectF.top) + wz8Var.W;
                int floor = (int) Math.floor((f4 - (gm.L(9.0f) - (gm.L(11.0f) / 2.0f))) / gm.L(53.0f));
                if ((-gm.L(37.0f)) < f5 && f5 < rectF.height()) {
                    i = pqe.b(floor, 0, tz8VarArr.length - 1);
                } else {
                    i = -1;
                }
                if (wz8Var.S != i) {
                    wz8Var.a.performHapticFeedback(3, 1);
                    wz8Var.S = i;
                    for (int i2 = 0; i2 < tz8VarArr.length; i2++) {
                        tz8 tz8Var = tz8VarArr[i2];
                        if (i == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float f6 = 1.0f;
                        if (tz8Var.p != z) {
                            ValueAnimator valueAnimator = tz8Var.n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            tz8Var.p = z;
                            float f7 = tz8Var.o;
                            if (z) {
                                f3 = 1.0f;
                            } else {
                                f3 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f3);
                            tz8Var.n = ofFloat;
                            ofFloat.setDuration(180L);
                            tz8Var.n.addUpdateListener(tz8Var);
                            tz8Var.n.setInterpolator(vz8.a);
                            tz8Var.n.start();
                        }
                        tz8 tz8Var2 = tz8VarArr[i2];
                        if (i != i2 && i != -1) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (tz8Var2.m != z2) {
                            ValueAnimator valueAnimator2 = tz8Var2.k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            tz8Var2.m = z2;
                            float f8 = tz8Var2.l;
                            if (!z2) {
                                f6 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f8, f6);
                            tz8Var2.k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            tz8Var2.k.addUpdateListener(tz8Var2);
                            tz8Var2.k.setInterpolator(vz8.a);
                            tz8Var2.k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void i2(rc2 rc2Var) {
        yv1 yv1Var = this.a;
        yv1Var.Ua.k(rc2Var, yv1Var, true);
        yv1Var.A0.J0(false);
    }

    public final void j(defpackage.rc2 r29, org.telegram.tgnet.TLRPC.Chat r30, int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.j(rc2, org.telegram.tgnet.TLRPC$Chat, int, boolean):void");
    }

    @Override
    public final void k(rc2 rc2Var) {
        yv1 yv1Var = this.a;
        yv1Var.getNotificationCenter().k(nm7.p3, Long.valueOf(yv1Var.l6), rc2Var);
    }

    @Override
    public final void k0(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.k.fwd_from;
        if (messageFwdHeader != null && !TextUtils.isEmpty(messageFwdHeader.psa_type)) {
            String N0 = jb6.N0("PsaMessageInfo_" + messageObject.k.fwd_from.psa_type);
            if (TextUtils.isEmpty(N0)) {
                N0 = jb6.M0(2131746327, null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
            k47.d(spannableStringBuilder, false);
            f47 currentMessagesGroup = rc2Var.getCurrentMessagesGroup();
            yv1 yv1Var = this.a;
            if (currentMessagesGroup != null) {
                ArrayList arrayList = currentMessagesGroup.e;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if ((((c47) arrayList.get(i)).l & 1) != 0) {
                        k47 k47Var = (k47) currentMessagesGroup.d.get(i);
                        if (k47Var != messageObject) {
                            int childCount = yv1Var.A0.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = yv1Var.A0.getChildAt(i2);
                                if (childAt instanceof rc2) {
                                    rc2 rc2Var2 = (rc2) childAt;
                                    if (k47Var.T(rc2Var2.getMessageObject())) {
                                        rc2Var = rc2Var2;
                                    }
                                }
                            }
                            messageObject = k47Var;
                        }
                    } else {
                        i++;
                    }
                }
            }
            yv1Var.lc(messageObject, spannableStringBuilder, 1);
            rc2Var.J3(1, false, true);
        }
    }

    @Override
    public final void k1(rc2 rc2Var) {
        lf8 lf8Var = this.a.vd;
        if (lf8Var != null && lf8Var.n == rc2Var) {
            lf8Var.x.getClass();
        }
    }

    public final void l(rc2 rc2Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            d dVar = this.a;
            if (dVar.getMessagesController().A(bundle, dVar, rc2Var.getMessageObject(), null)) {
                dVar.presentFragment(new yv1(bundle));
            }
        }
    }

    @Override
    public final boolean l0(defpackage.rc2 r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.l0(rc2, boolean):boolean");
    }

    @Override
    public final boolean l1() {
        yv1 yv1Var = this.a;
        if (yv1Var.m1.getMeasuredWidth() > yv1Var.m1.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
        g(rc2Var, z, true, z2);
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
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
        ylb ylbVar;
        ylb ylbVar2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.MessageMedia m1 = k47.m1(messageObject);
        if (messageMedia != null && messageObject != null && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                x1(rc2Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            yv1 yv1Var = this.a;
            if (geoPoint != null) {
                if (gm.H1(yv1Var)) {
                    pc6 pc6Var = new pc6(3);
                    ylbVar2 = ((d) yv1Var).resourceProvider;
                    pc6Var.setResourceProvider(ylbVar2);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.local_id = -1;
                    tL_message.peer_id = yv1Var.getMessagesController().x1(yv1Var.a());
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
                    pc6Var.V0 = false;
                    pc6Var.G0(new k47(z8c.t0, tL_message, false, false));
                    yv1Var.presentFragment(pc6Var);
                }
            } else if (k47.N2(messageMedia.document)) {
                hx2.e().l(yv1Var.getParentActivity());
                hx2.e().k(new gv1(this, tL_messageMediaPoll, pollAnswer, rc2Var));
                hx2 e = hx2.e();
                TLRPC.Document document4 = messageMedia.document;
                if (k47.H2(document4)) {
                    i9 = 2;
                } else {
                    i9 = 0;
                }
                k47 messageObject2 = rc2Var.getMessageObject();
                ylbVar = ((d) yv1Var).resourceProvider;
                e.i(document4, null, "", null, null, i9, false, messageObject2, ylbVar, 200);
            } else if (k47.J3(messageMedia.document)) {
                k47 k47Var = MediaController.w().v0;
                if (MediaController.w().D(messageObject) && k47Var != null) {
                    boolean z3 = k47Var.m0;
                    if (i == -3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z3 == z2) {
                        if (MediaController.w().C()) {
                            MediaController.w().R(k47Var);
                            return;
                        } else {
                            MediaController.w().Q(k47Var, true);
                            return;
                        }
                    }
                }
                TLRPC.Message message = messageObject.k;
                TLRPC.TL_message P5 = yv1.P5(message);
                P5.media = messageMedia;
                P5.attachPath = wf8.c(i, message);
                ArrayList arrayList = new ArrayList();
                i8 = ((d) yv1Var).currentAccount;
                k47 k47Var2 = new k47(i8, P5, false, true);
                if (i == -3) {
                    z = true;
                } else {
                    z = false;
                }
                k47Var2.m0 = z;
                arrayList.add(k47Var2);
                if (MediaController.w().D(messageObject)) {
                    MediaController.w().l(false, true, false, false);
                }
                MediaController.w().n0(arrayList, k47Var2, 0L, true, null, 0L);
            } else {
                TLRPC.Document document5 = messageMedia.document;
                if (document5 != null && !k47.J4(document5)) {
                    i6 = ((d) yv1Var).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    bd4 bd4Var = new bd4(i6, messageObject, document6, wf8.c(i, messageObject.k));
                    if (bd4Var.g) {
                        bc4.G(i6).f(document6);
                        bd4Var.a();
                        rc2Var.Z();
                        return;
                    } else if (!bd4Var.f) {
                        bc4.G(i6).X(document6, messageObject, 2, 0);
                        bd4Var.a();
                        rc2Var.Z();
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.k;
                        TLRPC.TL_message P52 = yv1.P5(message2);
                        P52.media = messageMedia;
                        P52.attachPath = wf8.c(i, message2);
                        i7 = ((d) yv1Var).currentAccount;
                        k47 k47Var3 = new k47(i7, P52, false, true);
                        if (k47.y(messageMedia.document)) {
                            PhotoViewer.r0().T1(null, yv1Var, yv1Var.Ba);
                            PhotoViewer r0 = PhotoViewer.r0();
                            if (k47Var3.D != 0) {
                                j = yv1Var.l6;
                                j2 = yv1Var.d7;
                                j3 = yv1Var.d();
                            } else {
                                j = 0;
                                j2 = 0;
                                j3 = 0;
                            }
                            r0.l1(k47Var3, yv1Var, j, j2, j3, yv1Var.db);
                            return;
                        }
                        try {
                            gm.r2(k47Var3, yv1Var.getParentActivity(), yv1Var.Ba, false);
                            return;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            yv1Var.F4(k47Var3);
                            return;
                        }
                    }
                }
                TLRPC.Message message3 = messageObject.k;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || k47.J4(document3))) {
                    if (messageMedia3 == messageMedia) {
                        i2 = arrayList3.size();
                    } else {
                        i2 = -1;
                    }
                    TLRPC.TL_message P53 = yv1.P5(message3);
                    P53.media = messageMedia3;
                    P53.attachPath = wf8.c(-2, message3);
                    i5 = ((d) yv1Var).currentAccount;
                    arrayList3.add(new k47(i5, P53, false, true));
                    arrayList2.add(-2);
                } else {
                    i2 = -1;
                }
                if (messageObject.L0 && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || k47.J4(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i2 = arrayList3.size();
                    }
                    TLRPC.TL_message P54 = yv1.P5(message3);
                    P54.media = messageMedia2;
                    P54.attachPath = wf8.c(-3, message3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    P54.message = pollResults2.solution;
                    P54.entities = pollResults2.solution_entities;
                    i4 = ((d) yv1Var).currentAccount;
                    arrayList3.add(new k47(i4, P54, false, true));
                    arrayList2.add(-3);
                }
                brb.b(tL_messageMediaPoll.poll, yv1Var.getUserConfig().e());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                int i10 = i2;
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i11);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || k47.J4(document))) {
                        if (pollAnswer2.unshuffled_index == i) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message P55 = yv1.P5(message3);
                        P55.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        P55.message = tL_textWithEntities2.text;
                        P55.entities = tL_textWithEntities2.entities;
                        P55.attachPath = wf8.c(pollAnswer2.unshuffled_index, message3);
                        i3 = ((d) yv1Var).currentAccount;
                        arrayList3.add(new k47(i3, P55, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.s0 = arrayList2;
                    PhotoViewer.r0().T1(null, yv1Var, yv1Var.Ba);
                    PhotoViewer.r0().n1(arrayList3, i10, yv1Var.a(), 0L, 0L, yv1Var.eb);
                }
            }
        }
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        yv1 yv1Var = this.a;
        if (!yv1Var.b8()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) kfb.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (yv1Var.getParentActivity() != null) {
                if (yv1Var.d1.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || kfb.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        my0 my0Var = new my0(1, (ylb) yv1Var.Ba, (Context) yv1Var.getParentActivity(), false);
                        my0Var.J();
                        my0Var.P = str;
                        my0Var.Q = false;
                        my0Var.R = true;
                        CharSequence[] charSequenceArr = {jb6.M0(2131751704, null)};
                        ff ffVar = new ff(yv1Var, str, (byte) 3);
                        my0Var.M = charSequenceArr;
                        my0Var.L = ffVar;
                        yv1Var.showDialog(my0Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        yv1Var.oa(null, tL_inlineButtonTypeUrl.url, true, rc2Var, rc2Var.getMessageObject());
                        try {
                            rc2Var.performHapticFeedback(0, 1);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    @Override
    public final boolean m1(k47 k47Var) {
        hu1 hu1Var;
        int i = (k47.B0(k47Var.k) > 1271266957L ? 1 : (k47.B0(k47Var.k) == 1271266957L ? 0 : -1));
        yv1 yv1Var = this.a;
        if ((i == 0 || ((hu1Var = yv1Var.D0) != null && hu1Var.O)) && yv1Var.g4 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean m2(int i) {
        boolean z;
        tk5 tk5Var;
        tk5 tk5Var2;
        if (i != 16 && i != 2131296267 && i != 2131296264) {
            return false;
        }
        yv1 yv1Var = this.a;
        z = ((d) yv1Var).inPreviewMode;
        if (z && yv1Var.ga) {
            tk5Var = ((d) yv1Var).parentLayout;
            if (tk5Var != null) {
                tk5Var2 = ((d) yv1Var).parentLayout;
                ((ActionBarLayout) tk5Var2).p();
            }
            return true;
        }
        return !b();
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
    public final boolean n1(rc2 rc2Var, int i) {
        yv1 yv1Var = this.a;
        if (yv1Var.kc != 0 && rc2Var.getMessageObject() != null && yv1Var.kc == rc2Var.getMessageObject().e1() && yv1Var.lc == i) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        jm1 jm1Var;
        of2 of2Var;
        boolean z;
        ylb ylbVar;
        long j;
        qw9 qw9Var;
        int i;
        boolean z2;
        int i2;
        rw9 rw9Var;
        int i3;
        float f;
        hg5 hg5Var;
        int i4;
        n02 n02Var;
        boolean z3;
        long j2;
        n02 n02Var2;
        ArrayList arrayList = null;
        if (!k47Var.R4() && !k47Var.f4()) {
            if (!k47.Q4(k47Var.k) && !k47Var.g4()) {
                if (k47Var.I3()) {
                    MediaController w = MediaController.w();
                    ArrayList G = this.a.D0.G();
                    yv1 yv1Var = this.a;
                    long j3 = yv1Var.d7;
                    boolean z4 = !yv1Var.D0.O;
                    if (yv1Var.x4) {
                        long d = yv1Var.d();
                        z3 = z4;
                        j2 = d;
                    } else {
                        z3 = z4;
                        j2 = 0;
                    }
                    boolean n0 = w.n0(G, k47Var, j3, z3, null, j2);
                    if (n0 && (n02Var2 = this.a.c4) != null) {
                        n02Var2.a(k47Var, "open_media", ia4.c(k47Var), null, true);
                    }
                    return n0;
                }
            } else {
                boolean R = MediaController.w().R(k47Var);
                MediaController w2 = MediaController.w();
                if (R) {
                    arrayList = this.a.j6(k47Var, false);
                }
                w2.q0(arrayList, false);
                if (R && (n02Var = this.a.c4) != null) {
                    n02Var.a(k47Var, "open_media", ia4.c(k47Var), null, true);
                }
                return R;
            }
        } else {
            tw9 tw9Var = this.a.wa;
            if (tw9Var == null || tw9Var.c0) {
                try {
                    AudioManager audioManager = (AudioManager) a.b.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!k47Var.O3()) {
                            c41.b0(this.a).w(2131232805, jb6.M0(2131743197, null)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.a.wa = new tw9(this.a.getParentActivity());
                tw9 tw9Var2 = this.a.wa;
                if (!k47Var.O3()) {
                    jm1Var = this.a.Db(k47Var, true);
                } else {
                    jm1Var = null;
                }
                if (!k47Var.O3()) {
                    of2Var = this.a.Cb(k47Var);
                } else {
                    of2Var = null;
                }
                Activity activity = tw9Var2.a;
                qw9 qw9Var2 = tw9Var2.c;
                tw9Var2.Y = jm1Var;
                tw9Var2.Z = of2Var;
                rw9 rw9Var2 = tw9Var2.O;
                if (rw9Var2 != null) {
                    qw9Var2.removeView(rw9Var2);
                    tw9Var2.O = null;
                }
                tw9Var2.P = rc2Var;
                k47 messageObject = rc2Var.getMessageObject();
                tw9Var2.N = messageObject;
                if (messageObject != null && messageObject.g4()) {
                    z = true;
                } else {
                    z = false;
                }
                tw9Var2.T = z;
                rc2 rc2Var2 = tw9Var2.P;
                if (rc2Var2 != null) {
                    ylbVar = rc2Var2.getResourcesProvider();
                } else {
                    ylbVar = null;
                }
                tw9Var2.M = ylbVar;
                if (tw9Var2.P != null) {
                    tw9Var2.U = 0.0f;
                    tw9Var2.V = rc2Var.n;
                    if (rc2Var.getParent() instanceof View) {
                        View view = (View) rc2Var.getParent();
                        tw9Var2.U = view.getY() + tw9Var2.U;
                        tw9Var2.V = view.getY() + tw9Var2.V;
                    }
                    int width = tw9Var2.P.getWidth();
                    int height = tw9Var2.P.getHeight();
                    if (tw9Var2.T) {
                        height = Math.min(gm.L(360.0f), Math.min(width, gm.q.y));
                    }
                    tw9Var2.L = height - tw9Var2.P.getHeight();
                    int ceil = (int) Math.ceil((Math.min(width, height) * 0.92f) / gm.p);
                    j = 0;
                    int i5 = height;
                    qw9Var = qw9Var2;
                    rw9 rw9Var3 = new rw9(tw9Var2, tw9Var2.getContext(), z8c.t0, tw9Var2.P.getResourcesProvider(), width, i5);
                    tw9Var2.O = rw9Var3;
                    tw9Var2.P.t0(rw9Var3);
                    tw9Var2.O.s0(tw9Var2.P);
                    tw9Var2.O.setDelegate(new fgf((byte) 25));
                    rw9 rw9Var4 = tw9Var2.O;
                    k47 k47Var2 = tw9Var2.N;
                    f47 currentMessagesGroup = tw9Var2.P.getCurrentMessagesGroup();
                    rc2 rc2Var3 = tw9Var2.P;
                    rw9Var4.z3(k47Var2, currentMessagesGroup, rc2Var3.G, rc2Var3.F, false, false);
                    if (!tw9Var2.T) {
                        n50 n50Var = new n50();
                        tw9Var2.W = n50Var;
                        rw9 rw9Var5 = tw9Var2.O;
                        n50Var.i = rw9Var5;
                        rw9Var5.Ic = n50Var;
                        if (rw9Var5.getSeekBarWaveform() != null) {
                            gx9 seekBarWaveform = tw9Var2.O.getSeekBarWaveform();
                            seekBarWaveform.L = tw9Var2.s;
                            rc2 rc2Var4 = seekBarWaveform.n;
                            if (rc2Var4 != null) {
                                rc2Var4.invalidate();
                            }
                        }
                    }
                    tw9Var2.I = false;
                    qw9Var.addView(tw9Var2.O, new FrameLayout.LayoutParams(tw9Var2.P.getWidth(), i5, 17));
                    i = ceil;
                } else {
                    j = 0;
                    qw9Var = qw9Var2;
                    i = 360;
                }
                TextureView textureView = tw9Var2.Q;
                if (textureView != null) {
                    qw9Var.removeView(textureView);
                    tw9Var2.Q = null;
                }
                if (tw9Var2.T) {
                    tw9Var2.R = false;
                    TextureView textureView2 = new TextureView(activity);
                    tw9Var2.Q = textureView2;
                    qw9Var.addView(textureView2, 0, qoe.c(i, i));
                }
                ndc ndcVar = MediaController.w().j0;
                if (ndcVar != null) {
                    ndcVar.f0();
                }
                ndc ndcVar2 = tw9Var2.x;
                if (ndcVar2 != null) {
                    ndcVar2.f0();
                    tw9Var2.x.l0();
                    tw9Var2.x = null;
                }
                rc2 rc2Var5 = tw9Var2.P;
                if (rc2Var5 != null && rc2Var5.getMessageObject() != null) {
                    bc4.G(tw9Var2.P.getMessageObject().K1);
                    File I = bc4.I(tw9Var2.P.getMessageObject().F0());
                    if (I != null && !I.exists()) {
                        I = new File(I.getPath() + ".enc");
                    }
                    if (I == null || !I.exists()) {
                        bc4.G(tw9Var2.P.getMessageObject().K1);
                        I = bc4.M(tw9Var2.P.getMessageObject().k, false, true);
                        if (I != null && !I.exists()) {
                            I = new File(I.getPath() + ".enc");
                        }
                    }
                    if ((I == null || !I.exists()) && tw9Var2.P.getMessageObject().k.attachPath != null) {
                        I = new File(tw9Var2.P.getMessageObject().k.attachPath);
                    }
                    if (I != null && I.exists()) {
                        ndc ndcVar3 = new ndc();
                        tw9Var2.x = ndcVar3;
                        ndcVar3.K = new x59(tw9Var2, (byte) 9);
                        if (tw9Var2.W != null) {
                            ndcVar3.L = new cf9(tw9Var2, (byte) 5);
                        }
                        if (tw9Var2.T) {
                            ndcVar3.z0(tw9Var2.Q);
                        }
                        tw9Var2.x.i0(Uri.fromFile(I), "other");
                        tw9Var2.x.g0();
                        ut3 ut3Var = tw9Var2.F;
                        if (ut3Var != null) {
                            ut3Var.s = tw9Var2.x;
                            ut3Var.a();
                        }
                    }
                    yv1 yv1Var2 = this.a;
                    yv1Var2.showDialog(yv1Var2.wa);
                    return false;
                }
                hg5 hg5Var2 = tw9Var2.y;
                if (hg5Var2 != null) {
                    qw9Var.removeView(hg5Var2);
                    tw9Var2.y = null;
                }
                k47 k47Var3 = tw9Var2.N;
                if (k47Var3 != null && k47Var3.O3()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                k47 k47Var4 = tw9Var2.N;
                if (k47Var4 != null && k47.B0(k47Var4.k) != z8c.h(tw9Var2.N.K1).e()) {
                    hg5 hg5Var3 = new hg5(activity, 3);
                    tw9Var2.y = hg5Var3;
                    hg5Var3.p(true);
                    if (z2) {
                        long B0 = k47.B0(tw9Var2.N.k);
                        int i6 = (B0 > j ? 1 : (B0 == j ? 0 : -1));
                        k47 k47Var5 = tw9Var2.N;
                        String str = "";
                        if (i6 > 0) {
                            TLRPC.User W1 = oc7.r1(k47Var5.K1).W1(Long.valueOf(B0));
                            if (W1 != null) {
                                str = m9c.k(W1, true);
                            }
                        } else {
                            TLRPC.Chat L0 = oc7.r1(k47Var5.K1).L0(Long.valueOf(-B0));
                            if (L0 != null) {
                                str = L0.title;
                            }
                        }
                        hg5 hg5Var4 = tw9Var2.y;
                        if (tw9Var2.T) {
                            i4 = 2131743277;
                        } else {
                            i4 = 2131743198;
                        }
                        hg5Var4.t(gm.S2(jb6.a0(null, null, i4, str)));
                    } else {
                        hg5 hg5Var5 = tw9Var2.y;
                        if (tw9Var2.T) {
                            i3 = 2131743278;
                        } else {
                            i3 = 2131743199;
                        }
                        hg5Var5.t(gm.S2(jb6.M0(i3, null)));
                    }
                    tw9Var2.y.q(12.0f);
                    hg5 hg5Var6 = tw9Var2.y;
                    if (!z2 && !tw9Var2.P.G) {
                        f = 6.0f;
                    } else {
                        f = 0.0f;
                    }
                    hg5Var6.setPadding(gm.L(f), 0, 0, 0);
                    boolean z5 = tw9Var2.T;
                    hg5 hg5Var7 = tw9Var2.y;
                    if (z5) {
                        hg5Var7.o(0.5f, 0.0f);
                        hg5Var = tw9Var2.y;
                        hg5Var.L = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        hg5Var7.o(0.0f, gm.L(34.0f));
                        hg5Var = tw9Var2.y;
                        hg5Var.L = Layout.Alignment.ALIGN_NORMAL;
                    }
                    hg5Var.u(14.0f);
                    hg5 hg5Var8 = tw9Var2.y;
                    hg5Var8.h = hg5.a(hg5Var8.getText(), tw9Var2.y.getTextPaint());
                    boolean z6 = tw9Var2.T;
                    hg5 hg5Var9 = tw9Var2.y;
                    rc2 rc2Var6 = tw9Var2.P;
                    if (z6) {
                        qw9Var.addView(hg5Var9, qoe.d((int) ((rc2Var6.getWidth() / gm.p) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((tw9Var2.P.getHeight() + tw9Var2.L) / gm.p) / 2.0f), 0.0f, 0.0f));
                    } else {
                        qw9Var.addView(hg5Var9, qoe.d((int) ((rc2Var6.getWidth() / gm.p) * 0.6f), 150.0f, 17, ((((tw9Var2.P.getWidth() * (-0.39999998f)) / 2.0f) + tw9Var2.P.getBoundsLeft()) / gm.p) + 1.0f, ((-75.0f) - ((tw9Var2.P.getHeight() / gm.p) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    tw9Var2.y.v();
                }
                TextView textView = tw9Var2.E;
                if (textView != null) {
                    qw9Var.removeView(textView);
                    tw9Var2.E = null;
                }
                TextView textView2 = new TextView(activity);
                tw9Var2.E = textView2;
                textView2.setTextColor(-1);
                tw9Var2.E.setTypeface(gm.o());
                boolean o = cmb.I.o();
                TextView textView3 = tw9Var2.E;
                if (o) {
                    textView3.setBackground(cmb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    textView3.setBackground(cmb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                tw9Var2.E.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(6.0f));
                rve.a(tw9Var2.E);
                TextView textView4 = tw9Var2.E;
                if (z2) {
                    i2 = 2131743203;
                } else {
                    i2 = 2131743200;
                }
                textView4.setText(jb6.M0(i2, null));
                tw9Var2.E.setOnClickListener(new ow9(tw9Var2, (byte) 1));
                qw9Var.addView(tw9Var2.E, qoe.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z2 && (rw9Var = tw9Var2.O) != null && rw9Var.getMessageObject() != null && tw9Var2.O.getMessageObject().k != null) {
                    tw9Var2.O.getMessageObject().k.media_unread = false;
                    tw9Var2.O.invalidate();
                }
                yv1 yv1Var22 = this.a;
                yv1Var22.showDialog(yv1Var22.wa);
                return false;
            }
        }
        return false;
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
                yv1 yv1Var = this.a;
                TLRPC.User user2 = yv1Var.f;
                if (user2 != null && user2.id == j && yv1Var.g4 == 0 && yv1Var.p1 != null) {
                    i3 = ((d) yv1Var).currentAccount;
                    if (rs0.f0(i3, user.id) != null) {
                        yv1Var.p1.e(false, false);
                        return;
                    }
                } else if (user.bot) {
                    i = ((d) yv1Var).currentAccount;
                    rs0 f0 = rs0.f0(i, user.id);
                    if (f0 != null) {
                        yv1Var.presentFragment(f0);
                        return;
                    }
                }
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bundle.putBoolean("expandPhoto", z);
                ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                TLRPC.User user3 = yv1Var.f;
                if (user3 != null && user3.id == user.id) {
                    i4 = 1;
                }
                profileActivity.B3(i4);
                Activity parentActivity = yv1Var.getParentActivity();
                i2 = ((d) yv1Var).classGuid;
                gm.g3(parentActivity, i2);
                yv1Var.presentFragment(profileActivity);
            }
        }
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
        k47 messageObject;
        TLRPC.TL_factCheck R0;
        String str;
        yv1 yv1Var = this.a;
        hg5 hg5Var = yv1Var.P1;
        if (hg5Var != null) {
            hg5Var.f(true);
        }
        if (yv1Var.getParentActivity() != null && (messageObject = rc2Var.getMessageObject()) != null && (R0 = messageObject.R0()) != null && R0.country != null) {
            try {
                str = new Locale("", R0.country).getDisplayCountry(jb6.D0().y);
            } catch (Exception e) {
                fc4.g(e, true);
                str = R0.country;
            }
            hg5 hg5Var2 = new hg5(yv1Var.getParentActivity(), 3);
            hg5Var2.p(true);
            hg5Var2.L = Layout.Alignment.ALIGN_NORMAL;
            hg5Var2.d = -1L;
            hg5Var2.U = true;
            hg5Var2.e = true;
            hg5Var2.q(12.0f);
            yv1Var.P1 = hg5Var2;
            hg5Var2.r0 = new uj1(this, hg5Var2, (byte) 23);
            hg5Var2.t(gm.S2(jb6.a0(null, null, 2131750785, str)));
            yv1Var.P1.k(yv1Var.L);
            yv1Var.m1.addView(yv1Var.P1, qoe.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            yv1Var.m1.post(new zq1(this, rc2Var, i2, i, (byte) 2));
        }
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
        g(rc2Var, z, false, false);
    }

    @Override
    public final void o2() {
        yv1 yv1Var = this.a;
        if (yv1Var.getUserConfig().p()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", yv1Var.l6);
            bundle.putInt("start_from", 10);
            yv1Var.presentFragment(new cm6(bundle, yv1Var.p1.getSharedMediaPreloader()));
            return;
        }
        c41.b0(yv1Var).Q(2131624211, 36, gm.N2(jb6.H(',', "UnlockSimilarChannelsPremium", yv1Var.getMessagesController().l4.R1.f()), -1, 0, new ru1(this, (byte) 4), null)).j();
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        BitmapDrawable bitmapDrawable;
        boolean z;
        int i6;
        int i7;
        String str2;
        boolean z2;
        wc0 wc0Var;
        int i8;
        int i9;
        cd0 cd0Var;
        qs1 qs1Var;
        ps1 ps1Var;
        if (!h()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(sd2.K(chat, false));
        yv1 yv1Var = this.a;
        if (!isEmpty && yv1Var.e != null && (((qs1Var = yv1Var.d1) == null || qs1Var.getVisibility() != 0) && ((ps1Var = yv1Var.T) == null || ps1Var.getVisibility() != 0))) {
            i = 1;
        } else {
            i = 0;
        }
        TLRPC.Chat chat2 = yv1Var.e;
        if (chat2 != null && ((yv1Var.s4 == 0 || yv1Var.x4) && (!sd2.T(chat2) || yv1Var.e.megagroup))) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        TLRPC.Chat chat3 = yv1Var.e;
        if (chat3 != null && chat3.id == chat.id && !yv1Var.j8()) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        cd0[] cd0VarArr = new cd0[i3 + 1 + i + i2];
        cd0VarArr[0] = cd0.d;
        if (i3 != 0) {
            if (chat.broadcast) {
                cd0Var = cd0.e;
            } else {
                cd0Var = cd0.f;
            }
            cd0VarArr[1] = cd0Var;
            i4 = 2;
        } else {
            i4 = 1;
        }
        if (i != 0) {
            cd0VarArr[i4] = cd0.n;
            i4++;
        }
        if (i2 != 0) {
            cd0VarArr[i4] = cd0.r;
        }
        TLRPC.ChatFull M0 = yv1Var.getMessagesController().M0(chat.id);
        if (M0 == null) {
            i5 = ((d) yv1Var).classGuid;
            gn5 m = gn5.m(z8c.t0, 0, chat);
            gn5 m2 = gn5.m(z8c.t0, 1, chat);
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
            z = true;
            i6 = i;
            i7 = i2;
            str2 = null;
            z2 = i3;
            wc0Var = new wc0(m, m2, null, str, null, null, bitmapDrawable, chat, cd0VarArr, new yc0(i5, nm7.T, chat));
        } else {
            wc0Var = wc0.a(chat, M0, cd0VarArr);
            i6 = i;
            i7 = i2;
            z = true;
            str2 = null;
            z2 = i3;
        }
        if (yh4.l(wc0Var)) {
            yh4.t().J((ViewGroup) yv1Var.fragmentView, yv1Var.Ba, wc0Var, new jf(this, chat, rc2Var, (byte) 16));
            return z;
        }
        bu5 I = bu5.I(yv1Var, rc2Var);
        I.b(2131232272, jb6.M0(2131747519, str2), new uu1(this, chat, (byte) 0), false);
        if (chat.broadcast) {
            i8 = 2131232094;
            i9 = 2131747544;
        } else {
            i8 = 2131232119;
            i9 = 2131747532;
        }
        I.k(i8, jb6.M0(i9, str2), new co1(this, rc2Var, chat, (byte) 7), z2);
        I.k(2131232228, jb6.M0(2131748366, str2), new uu1(this, chat, z ? (byte) 1 : (byte) 0), i6);
        I.k(2131232360, jb6.M0(2131753723, str2), new uu1(this, chat, (byte) 2), i7);
        I.t = false;
        I.i = (byte) 3;
        I.Z = true;
        I.b0(0.0f, -gm.L(48.0f));
        I.a0();
        return true;
    }

    @Override
    public final hkb p2() {
        return this.a.u9;
    }

    @Override
    public final void q() {
        this.a.Dc();
    }

    @Override
    public final void q1(h47 h47Var) {
        StaticLayout staticLayout = h47Var.e;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = h47Var.e.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new bl2(h47Var.L, charSequence, false), 0, spannableString.length(), 33);
            gm.g(spannableString);
            c41.b0(this.a).i(jb6.M0(2131751959, null)).j();
        }
    }

    @Override
    public final void q2(rc2 rc2Var) {
        this.a.La(rc2Var);
    }

    @Override
    public final void r0(defpackage.rc2 r26, float r27, float r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.r0(rc2, float, float, boolean):void");
    }

    @Override
    public final void s0() {
        rc2 rc2Var;
        k47 messageObject;
        kn m;
        yv1 yv1Var = this.a;
        if (!yv1Var.A3 && !gda.w0 && yv1Var.A0 != null && yv1Var.getParentActivity() != null && yv1Var.fragmentView != null) {
            hg5 hg5Var = yv1Var.I2;
            if (hg5Var != null) {
                if (hg5Var.W) {
                    return;
                }
            } else {
                int indexOfChild = yv1Var.m1.indexOfChild(yv1Var.U);
                if (indexOfChild != -1) {
                    hg5 x4 = yv1Var.x4(250.0f, 3, indexOfChild + 1, false);
                    yv1Var.I2 = x4;
                    x4.d = 10000L;
                    x4.l(yv1Var.getParentActivity().getResources().getDrawable(2131232805).mutate());
                    yv1Var.I2.t(jb6.M0(2131753727, null));
                } else {
                    return;
                }
            }
            int childCount = yv1Var.A0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = yv1Var.A0.getChildAt(i);
                if ((childAt instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) != null && k47.K4(messageObject.k) && (m = rc2Var.getPhotoImage().m()) != null && m.o() >= 3000 && !yv1Var.I2.W) {
                    ImageReceiver photoImage = rc2Var.getPhotoImage();
                    float x7 = yv1Var.x7(rc2Var, photoImage.M0);
                    float f = photoImage.O0;
                    View view = (View) rc2Var.getParent();
                    float x72 = yv1Var.x7(rc2Var, -rc2Var.getTop());
                    if (x7 <= gm.L(80.0f)) {
                        continue;
                    } else if ((x7 + f) - x72 <= (f / 4.0f) + view.getMeasuredHeight()) {
                        yv1Var.Tb = rc2Var;
                        hg5 hg5Var2 = yv1Var.I2;
                        hg5Var2.r0 = new ho1(yv1Var, (byte) 1);
                        hg5Var2.w(yv1Var.w7(rc2Var, rc2Var.getNoSoundIconCenterX()), x7, true);
                        gda.C(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final String t(long j) {
        TLRPC.Peer peer;
        String A0;
        yv1 yv1Var = this.a;
        if (!m9c.w(yv1Var.f)) {
            TLRPC.Chat chat = yv1Var.e;
            if (chat != null && !sd2.V(chat) && (A0 = yv1Var.getMessagesController().A0(yv1Var.e.id, j)) != null) {
                return A0;
            }
            TLRPC.TL_forumTopic tL_forumTopic = yv1Var.r4;
            if (tL_forumTopic != null && (peer = tL_forumTopic.from_id) != null && (peer.user_id == j || peer.channel_id == j || peer.chat_id == j)) {
                return jb6.M0(2131743709, null);
            }
        }
        return null;
    }

    @Override
    public final boolean t0(defpackage.rc2 r44, org.telegram.tgnet.TLRPC.PollAnswer r45) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv1.t0(rc2, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
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
        k47 messageObject = rc2Var.getMessageObject();
        boolean z2 = false;
        bv1 bv1Var = null;
        bv1 bv1Var2 = null;
        File file = null;
        bv1 bv1Var3 = null;
        bv1 bv1Var4 = null;
        if (i == 19) {
            k11 k11Var = this.a.oc;
            if (k11Var != null) {
                k11Var.a(true);
            }
            yv1 yv1Var = this.a;
            if (rc2Var.getMessageObject() != null) {
                bv1Var2 = new bv1(this, rc2Var, (byte) 2);
            }
            yv1Var.oc = bv1Var2;
            yv1 yv1Var2 = this.a;
            final k11 k11Var2 = yv1Var2.oc;
            final Activity parentActivity = yv1Var2.getParentActivity();
            final ylb resourceProvider = this.a.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            k11Var2.d();
            k11Var2.b = new tn0(atomicBoolean, (byte) 0);
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
            final String b = yn0.b(messageObject);
            TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(-messageObject.Z0()));
            if (L0 != null && sd2.V(L0)) {
                z = true;
            } else {
                z = false;
            }
            final long j = messageObject.k.date * 1000;
            oo0.e(messageObject, new qac(atomicBoolean, k11Var2, z, b, j, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean a;
                public final k11 b;
                public final boolean c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway e;
                public final Activity f;
                public final ylb g;

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
                        ylb ylbVar = this.g;
                        if (z3) {
                            yn0.d(z4, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, ylbVar);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            yn0.e(z4, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, activity, ylbVar);
                        }
                    }
                }
            }, new vn0(atomicBoolean, k11Var2, (byte) 0));
        } else if (i == 21) {
            a.t();
            boolean z3 = e21.a;
            a.q();
            l11.u(this.a.getParentActivity(), e21.g);
        } else if (i == 84) {
            this.a.Ka(rc2Var);
        } else if (i == 80) {
            yv1 yv1Var3 = this.a;
            pn pnVar = ih8.L1;
            if (yv1Var3.getParentActivity() != null) {
                yv1Var3.showDialog(new ih8(yv1Var3.getContext(), yv1Var3.getCurrentAccount(), messageObject, yv1Var3.getResourceProvider()));
            }
        } else if (i == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.k.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                n02 n02Var = this.a.c4;
                if (n02Var != null) {
                    String str = webPage2.url;
                    vh2 vh2Var = n02Var.n;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (str == null || !str.equals((String) vh2Var.c) || uptimeMillis - vh2Var.b >= 1000) {
                        vh2Var.c = str;
                        vh2Var.b = uptimeMillis;
                        n02Var.a(messageObject, "open_iv", null, null, false);
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
                i5 = ((d) this.a).currentAccount;
                user2 = oc7.r1(i5).W1(Long.valueOf(j2));
            } else {
                user2 = null;
            }
            yv1 yv1Var4 = this.a;
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
                yv1Var4.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            try {
                if (!TextUtils.isEmpty(str3)) {
                    File f1 = gm.f1();
                    f1.mkdirs();
                    file = new File(f1, "vcard.vcf");
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    bufferedWriter.write(str3);
                    bufferedWriter.close();
                }
                yv1Var4.showDialog(new d68(yv1Var4, null, user2, null, file, r58.h(str2, false), str4, str5, yv1Var4.Ba));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else if (i == 30) {
            this.a.presentFragment(new yv1(kt6.k(messageObject.k.media.user_id, "user_id")));
        } else if (i == 31) {
            long j3 = messageObject.k.media.user_id;
            if (j3 != 0) {
                i4 = ((d) this.a).currentAccount;
                user = oc7.r1(i4).W1(Long.valueOf(j3));
            } else {
                user = null;
            }
            if (user != null) {
                if (!TextUtils.isEmpty(messageObject.Z1)) {
                    M0 = messageObject.Z1.toString();
                } else if (!TextUtils.isEmpty(user.phone)) {
                    M0 = mlb.l(new StringBuilder("+"), user.phone, r58.f());
                } else {
                    String str6 = k47.n1(messageObject.k).phone_number;
                    if (!TextUtils.isEmpty(str6)) {
                        M0 = r58.f().e(str6);
                    } else {
                        M0 = jb6.M0(2131747565, null);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                bundle2.putString("phone", M0);
                bundle2.putBoolean("addContact", true);
                this.a.presentFragment(new tu2(bundle2));
            }
        } else if (i != 23 && i != 24) {
            if (messageObject.q4()) {
                this.a.Y9(messageObject, false, false);
                if (messageObject.T0 != null) {
                    k11 k11Var3 = this.a.oc;
                    if (k11Var3 != null) {
                        k11Var3.a(true);
                    }
                    yv1 yv1Var5 = this.a;
                    if (rc2Var.getMessageObject() != null) {
                        bv1Var3 = new bv1(this, rc2Var, (byte) 4);
                    }
                    yv1Var5.oc = bv1Var3;
                    Activity parentActivity2 = this.a.getParentActivity();
                    Uri parse = Uri.parse(messageObject.T0);
                    yv1 yv1Var6 = this.a;
                    l11.t(parentActivity2, parse, true, false, false, yv1Var6.oc, null, false, yv1Var6.getMessagesController().l4.A2.f, false, false);
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
                            storyItem.dialogId = pg3.n(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.e1();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            this.a.getOrCreateStoryViewer().J(this.a.getParentActivity(), tL_webPageAttributeStory.storyItem, q4b.a(this.a.A0));
                            return;
                        }
                    }
                }
                if (!this.a.ta(webPage3.url, rc2Var, null, messageObject.e1(), 2)) {
                    k11 k11Var4 = this.a.oc;
                    if (k11Var4 != null) {
                        k11Var4.a(true);
                    }
                    yv1 yv1Var7 = this.a;
                    if (rc2Var.getMessageObject() != null) {
                        bv1Var4 = new bv1(this, rc2Var, (byte) 5);
                    }
                    yv1Var7.oc = bv1Var4;
                    l11.t(this.a.getParentActivity(), Uri.parse(webPage3.url), true, true, false, this.a.oc, null, false, true, false, false);
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
                k11 k11Var5 = this.a.oc;
                if (k11Var5 != null) {
                    k11Var5.a(true);
                }
                yv1 yv1Var8 = this.a;
                if (rc2Var.getMessageObject() != null) {
                    bv1Var = new bv1(this, rc2Var, (byte) 3);
                }
                yv1Var8.oc = bv1Var;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i2 = ((d) this.a).currentAccount;
                    if (hs6.d0(i2).q0(group) == null) {
                        this.a.oc.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i3 = ((d) this.a).currentAccount;
                        this.a.oc.b = new eh(this, ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getStickerSet, new r91((byte) 1, this, z2)), (byte) 21);
                        return;
                    }
                }
                l11.t(this.a.getParentActivity(), Uri.parse(webPage.url), true, true, false, this.a.oc, null, false, true, false, false);
            }
        }
    }

    @Override
    public final void u(rc2 rc2Var, float f, float f2) {
        yv1 yv1Var = this.a;
        yv1Var.Y5(rc2Var, false, false, f, f2, true, false, false);
        yv1Var.A0.getClass();
        yv1Var.Fc(RecyclerView.R(rc2Var));
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
        g(rc2Var, z, false, z2);
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
        Bundle k = kt6.k(j, "user_id");
        d dVar = this.a;
        if (dVar.getMessagesController().A(k, dVar, rc2Var.getMessageObject(), null)) {
            dVar.presentFragment(new yv1(k));
        }
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        try {
            yv1 yv1Var = this.a;
            zv3.I0(yv1Var, k47Var, yv1Var.db, str2, str3, str4, str, i, i2, -1, yv1Var.Y7());
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        int i;
        k47 messageObject;
        TLRPC.Message message;
        if (rc2Var != null) {
            yv1 yv1Var = this.a;
            if (yv1Var.getParentActivity() != null) {
                i = ((d) yv1Var).currentAccount;
                if (oc7.r1(i).x4() && (messageObject = rc2Var.getMessageObject()) != null && (message = messageObject.k) != null && message.rich_message != null) {
                    if (!messageObject.L2 || message.translatedRichMessage == null) {
                        return messageObject.u(yv1Var.e);
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
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        Uri parse;
        boolean z2;
        ev1 ev1Var;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z && l11.j(str, false, false)) {
            z2 = true;
        } else {
            z2 = z;
        }
        yv1 yv1Var = this.a;
        n02 n02Var = yv1Var.c4;
        if (n02Var != null) {
            n02Var.b(rc2Var.getMessageObject(), str);
        }
        k11 k11Var = yv1Var.oc;
        if (k11Var != null) {
            k11Var.a(true);
        }
        if (rc2Var.getMessageObject() == null) {
            ev1Var = null;
        } else {
            ev1Var = new ev1(this, rc2Var);
        }
        yv1Var.oc = ev1Var;
        if (!z2 && !l11.g(parse, false, null)) {
            ik.o0(yv1Var, str, true, true, true, !z2, yv1Var.oc, webPage, yv1Var.Ba);
        } else {
            l11.t(yv1Var.getParentActivity(), parse, true, true, false, yv1Var.oc, null, false, true, false, false);
        }
    }

    @Override
    public final void y1(rc2 rc2Var) {
        k47 messageObject = rc2Var.getMessageObject();
        if (messageObject.k.send_state != 0) {
            this.a.getSendMessagesHelper().f(messageObject);
        }
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i;
        int i2;
        ec7 ec7Var;
        Integer num;
        gn5 b;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        yv1 yv1Var = this.a;
        if (isEmpty) {
            i = ((d) yv1Var).currentAccount;
            yj8 yj8Var = new yj8(yv1Var, i, user, null, null, yv1Var.Ba);
            rc2Var.getLocationOnScreen(new int[2]);
            yj8Var.q2 = rc2Var.getNameStatusX();
            yj8Var.r2 = rc2Var.getNameStatusY();
            yj8Var.u2 = rc2Var.getScaleX();
            yj8Var.s2 = rc2Var.getLeft();
            yj8Var.t2 = rc2Var.getTop();
            yj8Var.v2 = rc2Var;
            int f = m9c.f(user);
            if (f >= 7) {
                i2 = ((d) yv1Var).currentAccount;
                fc7 fc7Var = oc7.r1(i2).E3;
                if (fc7Var != null) {
                    ec7Var = fc7Var.d(f);
                } else {
                    ec7Var = null;
                }
                if (ec7Var != null) {
                    num = Integer.valueOf(ec7Var.f());
                } else {
                    num = null;
                }
                yj8Var.p2 = num;
            } else {
                yj8Var.p2 = Integer.valueOf(yv1Var.getThemedColor(cmb.q8[f]));
            }
            tm tmVar = rc2Var.Ca;
            if (tmVar != null && (tmVar.f[0] instanceof vm)) {
                yj8Var.u2 *= 0.95f;
                if (document != null) {
                    bf0 bf0Var = new bf0(yv1Var.getParentActivity());
                    meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                    TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                    if ("video/webm".equals(document.mime_type)) {
                        b = gn5.b(document);
                        if (d != null) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str2 = "160_160_g";
                    } else {
                        if (d != null && k47.K2(document, false)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        b = gn5.b(document);
                        str2 = "160_160";
                    }
                    gn5 gn5Var = b;
                    String str3 = str2;
                    bf0Var.setLayerNum(7);
                    bf0Var.setRoundRadius(gm.L(4.0f));
                    bf0Var.j(gn5Var, str3, gn5.c(w, document), "140_140", d, document);
                    if (k47.B4(document)) {
                        Integer num2 = yj8Var.p2;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = yv1Var.getThemedColor(cmb.u6);
                        }
                        bf0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        yj8Var.x2 = k47.i1(document);
                    } else {
                        yj8Var.x2 = k47.i1(document);
                    }
                    yj8Var.w2 = bf0Var;
                    yj8Var.z2 = true;
                }
            }
            yv1Var.showDialog(yj8Var);
            return;
        }
        l11.u(yv1Var.getParentActivity(), "https://" + yv1Var.getMessagesController().N2 + "/nft/" + str);
    }

    @Override
    public final boolean z1() {
        yv1 yv1Var = this.a;
        if (yv1Var.m1.getKeyboardHeight() + yv1Var.La >= gm.L(20.0f)) {
            return true;
        }
        return false;
    }
}
