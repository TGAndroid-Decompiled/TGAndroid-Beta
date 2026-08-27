package cg;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.e4;
import jh.k6;
import jh.s6;
import jh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.pf;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.wx;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a61;
import org.telegram.ui.gy;
import org.telegram.ui.id;
import org.telegram.ui.lq;
import org.telegram.ui.rn;

public final class e1 implements Utilities.Callback {

    public final int f2666a;

    public final Object f2667b;

    public final Object f2668c;
    public final Object d;

    public final Object f2669e;

    public e1(gh.k2 k2Var, we.d dVar, Utilities.Callback callback, gh.v1 v1Var) {
        this.f2666a = 2;
        this.f2667b = k2Var;
        this.f2669e = dVar;
        this.f2668c = callback;
        this.d = v1Var;
    }

    @Override
    public final void run(Object obj) {
        String string;
        int i10;
        int i11 = this.f2666a;
        String str = "";
        int i12 = 0;
        int i13 = 1;
        Object obj2 = this.f2669e;
        Object obj3 = this.d;
        Object obj4 = this.f2668c;
        Object obj5 = this.f2667b;
        switch (i11) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj4;
                String str2 = (String) obj3;
                we.d dVar = (we.d) obj2;
                TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = (TLRPC.TL_payments_checkedGiftCode) obj;
                if (!((AtomicBoolean) obj5).get() && n2Var.getParentActivity() != null) {
                    if (tL_payments_checkedGiftCode.from_id == null) {
                        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
                        tL_premiumGiftOption.months = tL_payments_checkedGiftCode.months;
                        TLRPC.User userI = n2Var instanceof rn ? ((rn) n2Var).i() : null;
                        if (userI == null || userI.self) {
                            userI = new TLRPC.TL_user();
                        }
                        TLRPC.User user = userI;
                        boolean z10 = tL_payments_checkedGiftCode.used_date != 0;
                        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                        if (n2VarR != null && k1.O0 == null) {
                            k1 k1Var = new k1(n2VarR, UserConfig.selectedAccount, user, new ag.p(tL_premiumGiftOption), str2, z10, n2VarR.getResourceProvider());
                            k1Var.show();
                            k1.O0 = k1Var;
                        }
                    } else {
                        n2Var.showDialog(new g1(n2Var, tL_payments_checkedGiftCode, str2));
                    }
                    if (dVar != null) {
                        dVar.b();
                    }
                }
                break;
            case 1:
                z1 z1Var = (z1) obj5;
                MessagesController.getInstance(z1Var.currentAccount).getBoostsController().getBoostsStats(-((TLRPC.Chat) obj4).f22380id, new p1(z1Var, (TL_stories.TL_premium_myBoosts) obj, (ArrayList) obj3, (HashSet) obj2, 0));
                break;
            case 2:
                gh.k2 k2Var = (gh.k2) obj5;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                gh.v1 v1Var = (gh.v1) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((we.d) obj2).b();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                k2Var.dismiss();
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new d5.u(11, v1Var, tL_error));
                } else {
                    k2Var.dismiss();
                }
                break;
            case 3:
                TLRPC.TL_document tL_document = (TLRPC.TL_document) obj4;
                Long l10 = (Long) obj;
                e4 e4Var = ((jh.s2) obj5).f13937a;
                SendMessagesHelper.getInstance(e4Var.f13296y2).sendSticker(tL_document, (String) obj3, e4Var.f13291x1, null, null, e4Var.K1.f13141a, null, null, true, 0, 0, false, this.f2669e, null, l10.longValue(), e4Var.X1.getSendMonoForumPeerId(), e4Var.X1.getSendMessageSuggestionParams());
                e4Var.X1.p(tL_document);
                e4Var.X1.setFieldText("");
                e4Var.k0(l10.longValue() <= 0);
                break;
            case 4:
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                c6 c6Var = (c6) obj2;
                k6 k6Var = (k6) obj;
                e4 e4Var2 = ((x3) obj5).f14128l;
                if (((HashSet) obj4).contains(Integer.valueOf(k6Var.f13588a))) {
                    e4Var2.O1.c(k6Var.f13588a, e4Var2.f13291x1, storyItem);
                    string = LocaleController.formatString(R.string.StoryAddedToAlbumX, k6Var.f13589b);
                } else {
                    s6 s6Var = e4Var2.O1;
                    long j10 = e4Var2.f13291x1;
                    int i14 = k6Var.f13588a;
                    s6Var.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(storyItem);
                    s6Var.c0(i14, j10, arrayList);
                    string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, k6Var.f13589b);
                }
                new mc(e4Var2.Y0, c6Var).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(string)).j();
                x3 x3Var = e4Var2.f13261p1;
                if (x3Var != null) {
                    x3Var.a();
                }
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new k0(obj5, obj4, obj3, obj2, (TLRPC.TL_error) obj, 23));
                break;
            case 6:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj5;
                MessageObject messageObject = (MessageObject) obj4;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                int i15 = ChatActivityEnterView.f26070i5;
                if (user3 != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInstance(chatActivityEnterView.M).getInputPeer(messageObject.messageOwner.peer_id);
                    tL_messages_sendBotRequestedPeer.flags |= 1;
                    tL_messages_sendBotRequestedPeer.msg_id = messageObject.getId();
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user3));
                    ConnectionsManager.getInstance(chatActivityEnterView.M).sendRequest(tL_messages_sendBotRequestedPeer, null);
                    long j11 = user2.f22527id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user3.f22527id);
                    pf pfVar = new pf(bundle, user3, user2, j11);
                    rn rnVar = chatActivityEnterView.K2;
                    if (rnVar != null) {
                        rnVar.presentFragment(pfVar);
                    }
                }
                break;
            case 7:
                tk.L((tk) obj5, (rn) obj4, (TLRPC.TL_messageMediaGeo) obj3, (c6) obj2, (Long) obj);
                break;
            case 8:
                tk.P((tk) obj5, (rn) obj4, (TLRPC.TL_messageMediaVenue) obj3, (c6) obj2);
                break;
            case 9:
                in inVar = (in) obj5;
                rn rnVar2 = (rn) obj4;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                Long l11 = (Long) obj;
                if (rnVar2.c()) {
                    y4.L(rnVar2.getParentActivity(), rnVar2.a(), new a1.d(inVar, tL_messageMediaPoll, arrayList2, l11, 10));
                } else {
                    inVar.f29420f0.e(tL_messageMediaPoll, inVar.K, inVar.f29425h1, arrayList2, true, 0, l11.longValue());
                    inVar.f34900b.dismiss(true);
                }
                break;
            case 10:
                wx wxVar = (wx) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                if (((String) obj3).equals(wxVar.v)) {
                    k5.h(wxVar.B.Y0).f(arrayList4);
                    int size = arrayList4.size();
                    while (i12 < size) {
                        Object obj6 = arrayList4.get(i12);
                        i12++;
                        MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                        keywordResult.emoji = "animated_" + ((TLRPC.Document) obj6).f22386id;
                        keywordResult.keyword = null;
                        arrayList3.add(keywordResult);
                    }
                    runnable.run();
                    break;
                }
                break;
            case 11:
                hu0.m((hu0) obj5, (HashSet) obj4, (TL_stories.StoryItem) obj3, (b70) obj2, (k6) obj);
                break;
            case 12:
                gy gyVar = (gy) obj5;
                gyVar.Q4(gyVar.getMessagesController().getChat((Long) obj3), (Runnable) obj, new lq(gyVar, (id) obj2, (org.telegram.ui.ActionBar.n2) obj4, i13));
                break;
            case 13:
                a61 a61Var = (a61) obj5;
                String[] strArr = (String[]) obj4;
                String str3 = (String) obj3;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                Runnable runnable2 = (Runnable) obj;
                int i16 = a61Var.R;
                if (ConnectionsManager.getInstance(i16).getConnectionState() != 3) {
                    runnable2.run();
                } else {
                    if (strArr != null && strArr.length != 0) {
                        str = strArr[0];
                    }
                    MediaDataController.getInstance(i16).searchStickers(true, str, str3, new org.telegram.ui.b0(a61Var, linkedHashSet, runnable2, 9));
                }
                break;
            case 14:
                a61 a61Var2 = (a61) obj5;
                String str4 = (String) obj3;
                ArrayList arrayList5 = (ArrayList) obj4;
                HashMap map = (HashMap) obj2;
                Runnable runnable3 = (Runnable) obj;
                int i17 = a61Var2.R;
                if (a61Var2.S != 4) {
                    runnable3.run();
                    break;
                } else {
                    ArrayList arrayList6 = new ArrayList(0);
                    LongSparseArray longSparseArray = new LongSparseArray(0);
                    HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i17).getAllStickers();
                    if (str4.length() <= 14) {
                        int length = str4.length();
                        CharSequence charSequenceConcat = str4;
                        int i18 = 0;
                        while (i18 < length) {
                            if (i18 >= length - 1) {
                                if (charSequenceConcat.charAt(i18) == 65039) {
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 1, charSequenceConcat.length()));
                                    length--;
                                    i18--;
                                }
                            } else if (charSequenceConcat.charAt(i18) == 55356) {
                                int i19 = i18 + 1;
                                if (charSequenceConcat.charAt(i19) < 57339 || charSequenceConcat.charAt(i19) > 57343) {
                                    if (charSequenceConcat.charAt(i18) == 8205) {
                                        i10 = i18 + 1;
                                        if (charSequenceConcat.charAt(i10) != 9792 || charSequenceConcat.charAt(i10) == 9794) {
                                        }
                                        i18--;
                                    }
                                    if (charSequenceConcat.charAt(i18) == 65039) {
                                        charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 1, charSequenceConcat.length()));
                                        length--;
                                        i18--;
                                    }
                                }
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 2, charSequenceConcat.length()));
                                length -= 2;
                                i18--;
                            } else {
                                if (charSequenceConcat.charAt(i18) == 8205) {
                                    i10 = i18 + 1;
                                    if (charSequenceConcat.charAt(i10) != 9792) {
                                    }
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 2, charSequenceConcat.length()));
                                    length -= 2;
                                    i18--;
                                }
                                if (charSequenceConcat.charAt(i18) == 65039) {
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i18), charSequenceConcat.subSequence(i18 + 1, charSequenceConcat.length()));
                                    length--;
                                    i18--;
                                }
                            }
                            i18++;
                        }
                        ArrayList<TLRPC.Document> arrayList7 = allStickers != null ? allStickers.get(charSequenceConcat.toString()) : null;
                        if (arrayList7 != null && !arrayList7.isEmpty()) {
                            arrayList6.addAll(arrayList7);
                            int size2 = arrayList7.size();
                            for (int i20 = 0; i20 < size2; i20++) {
                                TLRPC.Document document = arrayList7.get(i20);
                                longSparseArray.put(document.f22386id, document);
                            }
                            arrayList5.add(arrayList6);
                        }
                    }
                    if (allStickers != null && !allStickers.isEmpty() && str4.length() > 1) {
                        MediaDataController.getInstance(i17).getEmojiSuggestions(a61.W1, str4, false, new a1.d(allStickers, map, arrayList5, runnable3, 18), false);
                        break;
                    }
                }
                break;
            case 15:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj5;
                String str5 = (String) obj3;
                nh.o1 o1Var = (nh.o1) obj4;
                String str6 = (String) obj2;
                String str7 = (String) obj;
                if (str7 == null) {
                    z0Var.v("secure_storage_failed", org.telegram.ui.web.z0.y("req_id", str5, "error", "RESTORE_CANCELLED"));
                } else {
                    try {
                        o1Var.j(str7);
                        z0Var.v("secure_storage_key_restored", org.telegram.ui.web.z0.y("req_id", str5, "value", (String) o1Var.f(str6).first));
                    } catch (Exception e9) {
                        z0Var.v("secure_storage_failed", org.telegram.ui.web.z0.y("req_id", str5, "error", e9.getMessage()));
                        return;
                    }
                }
                break;
            default:
                Runnable[] runnableArr = (Runnable[]) obj5;
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) obj4;
                TextView textView = (TextView) obj3;
                TextView textView2 = (TextView) obj2;
                Boolean bool = (Boolean) obj;
                AndroidUtilities.cancelRunOnUIThread(runnableArr[0]);
                ValueAnimator valueAnimator = valueAnimatorArr[0];
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(textView.getAlpha(), bool.booleanValue() ? 1.0f : 0.0f);
                valueAnimatorArr[0] = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ag.t2(23, textView, textView2));
                valueAnimatorArr[0].setDuration(320L);
                valueAnimatorArr[0].setInterpolator(er.h);
                valueAnimatorArr[0].start();
                if (bool.booleanValue()) {
                    AndroidUtilities.runOnUIThread(runnableArr[0], 5320L);
                }
                break;
        }
    }

    public e1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f2666a = i10;
        this.f2667b = obj;
        this.f2668c = obj2;
        this.d = obj3;
        this.f2669e = obj4;
    }

    public e1(Object obj, String str, Object obj2, Object obj3, int i10) {
        this.f2666a = i10;
        this.f2667b = obj;
        this.d = str;
        this.f2668c = obj2;
        this.f2669e = obj3;
    }

    public e1(gy gyVar, Long l10, id idVar, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f2666a = 12;
        this.f2667b = gyVar;
        this.d = l10;
        this.f2669e = idVar;
        this.f2668c = n2Var;
    }
}
