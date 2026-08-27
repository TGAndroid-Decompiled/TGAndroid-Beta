package hh;

import java.util.ArrayList;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.mc;

public final class k6 implements Runnable {

    public final int f9604a = 0;

    public final boolean f9605b;

    public final long f9606c;
    public final boolean d;

    public final Object f9607e;

    public final Object f9608f;
    public final TLObject h;

    public final TLObject f9609n;

    public final Object f9610r;

    public k6(u7 u7Var, boolean[] zArr, TL_stars.StarGift starGift, boolean z10, boolean z11, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, gh.z5 z5Var) {
        this.f9607e = u7Var;
        this.f9608f = zArr;
        this.h = starGift;
        this.f9605b = z10;
        this.d = z11;
        this.f9606c = j10;
        this.f9609n = tL_textWithEntities;
        this.f9610r = z5Var;
    }

    @Override
    public final void run() {
        char c10;
        int i10;
        TL_stories.StoryItem storyItem;
        TLRPC.InputGroupCall inputGroupCall;
        int i11 = this.f9604a;
        Object obj = this.f9610r;
        TLObject tLObject = this.f9609n;
        TLObject tLObject2 = this.h;
        Object obj2 = this.f9608f;
        Object obj3 = this.f9607e;
        switch (i11) {
            case 0:
                ((boolean[]) obj2)[0] = true;
                ((u7) obj3).i((TL_stars.StarGift) tLObject2, this.f9605b, this.d, this.f9606c, (TLRPC.TL_textWithEntities) tLObject, (gh.z5) obj);
                break;
            default:
                sb sbVar = (sb) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TL_stories.TL_startLive tL_startLive = (TL_stories.TL_startLive) tLObject2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                kh.c cVar = (kh.c) obj;
                jh.b bVar = sbVar.f16742a;
                int i12 = sbVar.f16749c;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    MessagesController.getInstance(i12).processUpdates(updates, false);
                    lh.wa waVar = sbVar.f16818x0;
                    if (waVar != null) {
                        waVar.destroy(true, null);
                    }
                    ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateStoryID.class);
                    int size = arrayListFindUpdates.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj4 = arrayListFindUpdates.get(i13);
                            i13++;
                            TL_update.TL_updateStoryID tL_updateStoryID = (TL_update.TL_updateStoryID) obj4;
                            c10 = 0;
                            if (tL_updateStoryID.random_id == tL_startLive.random_id) {
                                i10 = tL_updateStoryID.f22636id;
                            }
                        } else {
                            c10 = 0;
                            i10 = -1;
                        }
                    }
                    ArrayList arrayListFindUpdates2 = MessagesController.findUpdates(updates, TL_stories.TL_updateStory.class);
                    int size2 = arrayListFindUpdates2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 < size2) {
                            Object obj5 = arrayListFindUpdates2.get(i14);
                            i14++;
                            TL_stories.StoryItem storyItem2 = ((TL_stories.TL_updateStory) obj5).story;
                            if (storyItem2 != null && (storyItem2.f22617id == i10 || i10 == -1)) {
                                storyItem = storyItem2;
                            }
                        } else {
                            storyItem = null;
                        }
                    }
                    if (storyItem != null) {
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                            inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        } else {
                            inputGroupCall = null;
                        }
                    } else {
                        inputGroupCall = null;
                    }
                    if (inputGroupCall != null) {
                        jh.d1 d1Var = jh.d1.S;
                        if (d1Var != null) {
                            d1Var.e();
                            if (jh.d1.S != null) {
                                jh.d1.S = null;
                                NotificationCenter notificationCenter = NotificationCenter.getInstance(i12);
                                int i15 = NotificationCenter.liveStoryUpdated;
                                Object[] objArr = new Object[1];
                                objArr[c10] = Long.valueOf(jh.d1.S.g());
                                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                            }
                        }
                        AndroidUtilities.runOnUIThread(new lh.fa(sbVar, this.f9605b, storyItem, this.f9606c, inputGroupCall, this.d), 100L);
                    }
                } else if (tL_error != null) {
                    if (!tL_error.text.startsWith("STORY_LIVE_ALREADY_")) {
                        lh.q9 q9Var = sbVar.m0;
                        if (q9Var != null) {
                            new mc(q9Var.container, bVar).d0(tL_error, true);
                            cVar.run();
                        }
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(sbVar.f16745b, 0, bVar);
                        String string = LocaleController.getString(R.string.LiveStoryAlreadyStreamingTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.N = string;
                        b2Var.P = LocaleController.getString(R.string.LiveStoryAlreadyStreaming);
                        i0.a.C(R.string.OK, alertDialog$Builder, null);
                    }
                }
                break;
        }
    }

    public k6(sb sbVar, TLObject tLObject, TL_stories.TL_startLive tL_startLive, boolean z10, long j10, boolean z11, TLRPC.TL_error tL_error, kh.c cVar) {
        this.f9607e = sbVar;
        this.f9608f = tLObject;
        this.h = tL_startLive;
        this.f9605b = z10;
        this.f9606c = j10;
        this.d = z11;
        this.f9609n = tL_error;
        this.f9610r = cVar;
    }
}
