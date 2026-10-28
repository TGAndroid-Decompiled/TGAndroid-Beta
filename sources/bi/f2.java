package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.media.AudioManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class f2 implements Runnable {
    public final int f4594a;
    public final Object f4595b;
    public final Object f4596c;

    public f2(int i10, Object obj, Object obj2) {
        this.f4594a = i10;
        this.f4595b = obj;
        this.f4596c = obj2;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z10;
        TLRPC.TL_messageReactions tL_messageReactions2;
        di.h1 h1Var;
        long j10;
        int i12;
        int i13;
        fi.rb rbVar;
        di.x9 x9Var;
        switch (this.f4594a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f4596c;
                ((org.telegram.ui.ActionBar.e2) this.f4595b).dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        b02 = org.telegram.ui.Components.wc.b0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        b02 = org.telegram.ui.Components.wc.b0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    org.telegram.messenger.t.q(i11, b02, i10, 36);
                    return;
                }
                return;
            case 1:
                h7.P0((h7) this.f4595b, (Long) this.f4596c);
                return;
            case 2:
                h7 h7Var = (h7) this.f4595b;
                if (!((ca) this.f4596c).e) {
                    org.telegram.ui.Components.qc R = h7Var.getBulletinFactory().R(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    R.f31872u = true;
                    R.j();
                    return;
                }
                h7Var.f4747k0.setLoading(false);
                h7Var.Q1();
                return;
            case 3:
                MessagesController.getInstance(((h7) this.f4595b).currentAccount).lambda$processUpdates$379((TLRPC.Updates) ((TLObject) this.f4596c), false);
                return;
            case 4:
                ((h7) this.f4595b).getBulletinFactory().g0((TLRPC.TL_error) this.f4596c, false);
                return;
            case 5:
                h7 h7Var2 = (h7) this.f4595b;
                org.telegram.ui.Components.wc.b0((wn) this.f4596c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(h7Var2.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new a2(h7Var2, 8)).k(true);
                return;
            case 6:
                h7 h7Var3 = (h7) this.f4595b;
                h7Var3.getClass();
                ((boolean[]) this.f4596c)[0] = true;
                h7Var3.f4747k0.setLoading(false);
                h7Var3.Q1();
                return;
            case 7:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f4596c;
                ((h7) this.f4595b).getBulletinFactory().R(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 8:
                ((h7) this.f4595b).Q2((CharSequence) this.f4596c);
                return;
            case 9:
                m7 m7Var = (m7) this.f4595b;
                wn wnVar = (wn) this.f4596c;
                org.telegram.ui.Cells.z zVar = m7Var.f5088b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    m7Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = m7Var.f5088b;
                    if (zVar2 instanceof org.telegram.ui.Cells.s1) {
                        messageObject = ((org.telegram.ui.Cells.s1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.v0) && (messageObject = ((org.telegram.ui.Cells.v0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    aa aaVar = ca.y(messageObject2.currentAccount, false).B;
                    if (aaVar != null) {
                        aaVar.b();
                    }
                    TLRPC.ChatFull chatFull = wnVar.f45245p8;
                    Context context = m7Var.getContext();
                    int currentAccount = wnVar.getCurrentAccount();
                    long a2 = wnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    be beVar = new be(context, currentAccount, a2, wnVar, messageObject2, arrayList2, z10, false, 0L, wnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.z zVar3 = m7Var.f5088b;
                    beVar.V = wnVar;
                    beVar.W = zVar3;
                    beVar.show();
                    return;
                }
                return;
            case 10:
                TLObject tLObject = (TLObject) this.f4595b;
                ai.i iVar = (ai.i) this.f4596c;
                if (tLObject instanceof TL_stars.StarGifts) {
                    iVar.run((TL_stars.StarGifts) tLObject);
                    return;
                } else {
                    iVar.run(null);
                    return;
                }
            case 11:
                boolean[] zArr = (boolean[]) this.f4595b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f4596c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 12:
                t9 t9Var = (t9) this.f4595b;
                TLObject tLObject2 = (TLObject) this.f4596c;
                ArrayList arrayList3 = t9Var.f5471l;
                int i14 = t9Var.f5463a;
                if (tLObject2 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i15 = 0;
                        while (i15 < arrayList3.size() && ((TL_stars.SavedStarGift) arrayList3.get(i15)).pinned_to_top) {
                            i15++;
                        }
                        arrayList3.add(i15, savedStarGift);
                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(t9Var.f5464b), t9Var);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                ((MessagesController) this.f4595b).lambda$processUpdates$379((TLRPC.Updates) ((TLObject) this.f4596c), false);
                return;
            case 14:
                new org.telegram.ui.Components.wc(((org.telegram.ui.ActionBar.k3[]) this.f4595b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.u6) this.f4596c).R(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            case 15:
                be beVar2 = (be) this.f4595b;
                beVar2.T = true;
                beVar2.o(new y9((aa) this.f4596c, 2));
                AndroidUtilities.runOnUIThread(new ed(beVar2, 1), 240L);
                return;
            case 16:
                ((c1.e) this.f4595b).e().onError(((kotlin.jvm.internal.p) this.f4596c).f16668a);
                return;
            case 17:
                ((c1.e) this.f4595b).e().onError((w0.h) this.f4596c);
                return;
            case 18:
                ((c1.e) this.f4595b).e().onResult((v0.o) this.f4596c);
                return;
            case 19:
                c2.j.f5950a = (AudioManager) ((Context) this.f4595b).getSystemService("audio");
                ((e2.i) this.f4596c).e();
                return;
            case 20:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f4595b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f4596c;
                a4.l lVar = FirebaseMessaging.f7701l;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 21:
                com.google.firebase.messaging.l lVar2 = (com.google.firebase.messaging.l) this.f4595b;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f4596c;
                try {
                    taskCompletionSource2.setResult(lVar2.a());
                    return;
                } catch (Exception e10) {
                    taskCompletionSource2.setException(e10);
                    return;
                }
            case 22:
                v0.f fVar = (v0.f) this.f4596c;
                v0.i iVar2 = ((d1.e) this.f4595b).f7832f;
                if (iVar2 != null) {
                    iVar2.onResult(fVar);
                    return;
                } else {
                    kotlin.jvm.internal.i.h("callback");
                    throw null;
                }
            case 23:
                ((di.y9) this.f4595b).I(ProfileActivity.t4(((di.v0) this.f4596c).f9239c));
                return;
            case 24:
                di.m2 m2Var = (di.m2) this.f4595b;
                AndroidUtilities.addToClipboard(((di.q0) this.f4596c).v);
                if (AndroidUtilities.shouldShowClipboardToast()) {
                    Toast.makeText(m2Var.getContext(), LocaleController.getString(R.string.TextCopied), 0).show();
                    return;
                }
                return;
            case 25:
                di.m2 m2Var2 = (di.m2) this.f4595b;
                di.v0 v0Var = (di.v0) this.f4596c;
                long j11 = v0Var.f9239c;
                di.q4 q4Var = m2Var2.f8774i0;
                if (j11 != UserConfig.getInstance(q4Var.f9020r2).getClientUserId() && ((h1Var = m2Var2.f8773h0.A0) == null || j11 != DialogObject.getPeerDialogId(h1Var.i()))) {
                    if (q4Var.D3 != null) {
                        for (int i16 = 0; i16 < q4Var.D3.peers.size(); i16++) {
                            if (j11 != DialogObject.getPeerDialogId(q4Var.D3.peers.get(i16).peer)) {
                            }
                        }
                    }
                    Context context2 = m2Var2.getContext();
                    long j12 = v0Var.f9239c;
                    di.c0 c0Var = new di.c0(0, m2Var2, v0Var);
                    di.b bVar = new di.b();
                    org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context2, (org.telegram.ui.ActionBar.u6) bVar, false);
                    k3Var.fixNavigationBar();
                    LinearLayout d = wh.d(context2, 1);
                    TextView g7 = org.telegram.messenger.t.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.f23465j5, bVar);
                    g7.setTypeface(AndroidUtilities.bold());
                    g7.setText(LocaleController.getString(R.string.DeleteSingleMessagesTitle));
                    d.addView(g7, kb1.o(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context2, bVar);
                    q4Var2.setText(LocaleController.getString(R.string.DeleteAdditionalActions));
                    d.addView(q4Var2, kb1.o(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(4, 21, context2, bVar, true);
                    aq checkBoxRound = y1Var.getCheckBoxRound();
                    int i17 = org.telegram.ui.ActionBar.y6.V6;
                    int i18 = org.telegram.ui.ActionBar.y6.g7;
                    int i19 = org.telegram.ui.ActionBar.y6.f23486k7;
                    checkBoxRound.b(i17, i18, i19);
                    y1Var.e(LocaleController.getString(R.string.DeleteReportSpam), null, false, true, false);
                    y1Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var2 = y1Var;
                                    y1Var2.c(!y1Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var3 = y1Var;
                                    y1Var3.c(!y1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var;
                                    y1Var4.c(!y1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i20 = org.telegram.ui.ActionBar.y6.f23449i6;
                    org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(bVar.g(i20), 2, -1);
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i20);
                    y1Var.setBackground(g02);
                    org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, bVar);
                    d.addView(y1Var, kb1.r(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var2 = new org.telegram.ui.Cells.y1(4, 21, context2, bVar, true);
                    y1Var2.getCheckBoxRound().b(i17, i18, i19);
                    y1Var2.e(LocaleController.formatString(R.string.DeleteAllFrom, DialogObject.getName(j12)), null, false, true, false);
                    y1Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var22 = y1Var2;
                                    y1Var22.c(!y1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var3 = y1Var2;
                                    y1Var3.c(!y1Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var2;
                                    y1Var4.c(!y1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(bVar.g(i20), 2, -1);
                    org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i20);
                    y1Var2.setBackground(g03);
                    org.telegram.ui.ActionBar.f7.k(y1Var2, g03, null, N2, bVar);
                    d.addView(y1Var2, kb1.r(-1, -2));
                    final org.telegram.ui.Cells.y1 y1Var3 = new org.telegram.ui.Cells.y1(4, 21, context2, bVar, true);
                    y1Var3.getCheckBoxRound().b(i17, i18, i19);
                    y1Var3.e(LocaleController.formatString(R.string.DeleteBan, DialogObject.getName(j12)), null, false, false, false);
                    y1Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.y1 y1Var22 = y1Var3;
                                    y1Var22.c(!y1Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.y1 y1Var32 = y1Var3;
                                    y1Var32.c(!y1Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.y1 y1Var4 = y1Var3;
                                    y1Var4.c(!y1Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y g04 = org.telegram.ui.ActionBar.y6.g0(bVar.g(i20), 2, -1);
                    org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i20);
                    y1Var3.setBackground(g04);
                    org.telegram.ui.ActionBar.f7.k(y1Var3, g04, null, N3, bVar);
                    d.addView(y1Var3, kb1.r(-1, -2));
                    org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context2, bVar);
                    i9Var.setBackgroundColor(-16777216);
                    i9Var.setFixedSize(12);
                    d.addView(i9Var, kb1.r(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    fi.d dVar = new fi.d(context2, bVar, true);
                    dVar.i(LocaleController.getString(R.string.DeleteProceedBtn), false, true);
                    dVar.setOnClickListener(new di.e0(y1Var, y1Var2, y1Var3, c0Var, k3Var, 0));
                    frameLayout.addView(dVar, kb1.h(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    d.addView(frameLayout, kb1.r(-1, -2));
                    k3Var.setCustomView(d);
                    k3Var.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = m2Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(v0Var.f9237a));
                ConnectionsManager.getInstance(m2Var2.N).sendRequest(deletegroupcallmessages, null);
                m2Var2.c(v0Var.f9237a);
                return;
            case 26:
                di.h1 h1Var2 = (di.h1) this.f4595b;
                ArrayList arrayList4 = (ArrayList) this.f4596c;
                h1Var2.getClass();
                int size = arrayList4.size();
                int i21 = 0;
                while (i21 < size) {
                    Object obj = arrayList4.get(i21);
                    i21++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj;
                    NotificationCenter.getInstance(h1Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.f22045id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
            case 27:
                ((di.h1) this.f4595b).F.remove((String) this.f4596c);
                return;
            case 28:
                di.q4 q4Var3 = (di.q4) this.f4595b;
                fi.v3 v3Var = (fi.v3) this.f4596c;
                q4Var3.removeView(v3Var);
                if (q4Var3.S1 == v3Var) {
                    q4Var3.S1 = null;
                    return;
                }
                return;
            default:
                di.q4 q4Var4 = (di.q4) this.f4595b;
                fi.sb D = fi.sb.D((Activity) this.f4596c, q4Var4.f9020r2);
                di.p4 p4Var = q4Var4.B2;
                if (p4Var != null && (x9Var = (di.x9) p4Var.f8901c) != null) {
                    j10 = x9Var.currentPosition;
                } else {
                    j10 = 0;
                }
                File h = q4Var4.D1.h();
                TL_stories.StoryItem storyItem = q4Var4.D1.f8870a;
                fi.w7 w7Var = new fi.w7();
                w7Var.f11914n = true;
                w7Var.f11926t = storyItem.media;
                int i22 = w7Var.f11887a;
                w7Var.f11920q = MessagesController.getInstance(i22).getPeer(storyItem.dialogId);
                w7Var.f11922r = storyItem.f22267id;
                w7Var.f11924s = storyItem.caption;
                w7Var.L = h;
                w7Var.M = false;
                w7Var.f11910k0 = 720;
                w7Var.f11912l0 = 1280;
                TLRPC.MessageMedia messageMedia = storyItem.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                    w7Var.K = false;
                    if (h != null) {
                        w7Var.h(h.getAbsolutePath());
                    }
                } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    w7Var.K = true;
                    TLRPC.Document document = messageMedia.document;
                    if (document != null && document.attributes != null) {
                        int i23 = 0;
                        while (true) {
                            if (i23 < storyItem.media.document.attributes.size()) {
                                TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i23);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                                    w7Var.f11910k0 = documentAttribute.f22035w;
                                    w7Var.f11912l0 = documentAttribute.h;
                                    w7Var.f11905i = documentAttribute.duration;
                                } else {
                                    i23++;
                                }
                            }
                        }
                    }
                    TLRPC.Document document2 = storyItem.media.document;
                    if (document2 != null) {
                        String str = storyItem.firstFramePath;
                        if (str != null) {
                            w7Var.N = str;
                        } else if (document2.thumbs != null) {
                            for (int i24 = 0; i24 < storyItem.media.document.thumbs.size(); i24++) {
                                TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i24);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    w7Var.O = ImageLoader.getStrippedPhotoBitmap(photoSize.bytes, null);
                                } else {
                                    File pathToAttach = FileLoader.getInstance(i22).getPathToAttach(photoSize, true);
                                    if (pathToAttach != null && pathToAttach.exists()) {
                                        w7Var.N = pathToAttach.getAbsolutePath();
                                    }
                                }
                            }
                        }
                    }
                }
                w7Var.A();
                w7Var.e(storyItem);
                fi.lb d10 = fi.nb.d(q4Var4.f9046y0);
                RectF rectF = D.H;
                WindowManager.LayoutParams layoutParams = D.h;
                WindowManager windowManager = D.f11621f;
                int i25 = D.f11611c;
                if (!D.d) {
                    if (MessagesController.getInstance(i25).isFrozen()) {
                        org.telegram.ui.b.b(i25);
                    } else {
                        D.f11668u0 = false;
                        D.e = false;
                        D.B2 = false;
                        if (windowManager != null && (rbVar = D.f11644n) != null && rbVar.getParent() == null) {
                            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, D.f11644n, layoutParams);
                            windowManager.addView(D.f11644n, layoutParams);
                            D.f0();
                        }
                        D.K1 = w7Var;
                        fi.o9.a(i25, w7Var);
                        fi.w7 w7Var2 = D.K1;
                        if (w7Var2 != null && w7Var2.K) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        D.O1 = i12;
                        D.f11662s0.f11305g = false;
                        if (d10 != null) {
                            D.F = d10;
                            D.J = d10.f11321a;
                            rectF.set(d10.f11323c);
                            D.G = d10.f11322b;
                            D.F.e();
                        } else {
                            D.J = 0;
                            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
                            D.G = AndroidUtilities.dp(8.0f);
                        }
                        D.f11657r.c();
                        fi.eb ebVar = D.f11628h0;
                        int i26 = D.J;
                        if (i26 != 1 && i26 != 0) {
                            i13 = -14737633;
                        } else {
                            i13 = 0;
                        }
                        ebVar.setBackgroundColor(i13);
                        D.f11657r.setTranslationX(0.0f);
                        D.f11657r.setTranslationY(0.0f);
                        D.f11657r.b(0.0f);
                        D.f11657r.setScaleX(1.0f);
                        D.f11657r.setScaleY(1.0f);
                        D.K = 0.0f;
                        AndroidUtilities.lockOrientation(D.f11607b, 1);
                        fi.w7 w7Var3 = D.K1;
                        if (w7Var3 != null) {
                            D.f11613c1.setText(w7Var3.C0);
                        }
                        D.K(new fi.p9(D, 7), j10);
                        D.f11609b1.b(true, false);
                        D.J(1, false);
                        D.k0(-1, false, false);
                        D.d();
                        D.f11671v0 = 0L;
                        D.f11675w0 = "";
                    }
                }
                D.Q = new di.c2(q4Var4, 12);
                D.R = new di.h2(0, q4Var4, D);
                return;
        }
    }

    public f2(ca caVar, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f4594a = 11;
        this.f4595b = zArr;
        this.f4596c = callback2;
    }
}
