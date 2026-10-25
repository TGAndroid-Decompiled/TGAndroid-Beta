package ig;

import android.content.Context;
import android.view.View;
import di.x7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
import org.telegram.ui.h60;
import org.telegram.ui.j4;
import org.telegram.ui.nq;
import org.telegram.ui.of0;
import org.telegram.ui.sz;
public final class d1 implements Runnable {
    public final int f14026a;
    public final int f14027b;
    public final Object f14028c;
    public final Object d;
    public final Object e;
    public final Object f14029f;
    public final Object h;
    public final Object f14030n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f14026a = 1;
        this.f14027b = i10;
        this.f14028c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f14029f = albumEntry;
        this.h = albumEntry2;
        this.f14030n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ig.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f14026a = i11;
        this.d = obj;
        this.f14027b = i10;
        this.f14028c = serializable;
        this.e = obj2;
        this.f14029f = obj3;
        this.h = obj4;
        this.f14030n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f14026a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f14028c = inputFile;
        this.e = inputMedia;
        this.f14029f = delayedMessage;
        this.f14027b = i10;
        this.f14030n = str;
    }

    public d1(TLObject tLObject, e2 e2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, u6 u6Var, h60 h60Var) {
        this.f14026a = 5;
        this.h = tLObject;
        this.d = e2Var;
        this.f14028c = context;
        this.f14027b = i10;
        this.e = exportgroupcallinvite;
        this.f14029f = u6Var;
        this.f14030n = h60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, nq nqVar) {
        this.f14026a = 6;
        this.f14029f = tL_error;
        this.h = tLObject;
        this.f14028c = arrayList;
        this.f14027b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f14030n = nqVar;
    }

    public d1(e2 e2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f14026a = 7;
        this.d = e2Var;
        this.h = tLObject;
        this.f14027b = i10;
        this.f14028c = document;
        this.f14029f = tL_error;
        this.e = obj;
        this.f14030n = tL_stickers_addStickerToSet;
    }

    public d1(e2 e2Var, qf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f14026a = 8;
        this.d = e2Var;
        this.f14028c = cVar;
        this.h = tLObject;
        this.f14027b = i10;
        this.e = context;
        this.f14030n = tL_inputGroupCallSlug;
        this.f14029f = tL_error;
    }

    public d1(j4 j4Var, int i10, qf.c cVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f14026a = 3;
        this.d = j4Var;
        this.f14027b = i10;
        this.f14028c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f14029f = f0Var;
        this.f14030n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, cy cyVar, r2 r2Var, TLRPC.User user, String str) {
        this.f14026a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f14027b = i10;
        this.f14028c = cyVar;
        this.e = r2Var;
        this.f14029f = user;
        this.f14030n = str;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, qf.c cVar, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str) {
        this.f14026a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.f14028c = cVar;
        this.f14029f = tL_error;
        this.f14030n = messagesController;
        this.f14027b = i10;
        this.e = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, e2 e2Var, sz szVar, String str) {
        this.f14026a = 9;
        this.d = launchActivity;
        this.f14029f = tL_error;
        this.h = tLObject;
        this.f14027b = i10;
        this.f14028c = e2Var;
        this.e = szVar;
        this.f14030n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, sz szVar, int i10, String str) {
        this.f14026a = 12;
        this.d = launchActivity;
        this.f14029f = tL_error;
        this.h = tLObject;
        this.f14028c = tL_inputInvoiceSlug;
        this.e = szVar;
        this.f14027b = i10;
        this.f14030n = str;
    }

    public d1(of0 of0Var, String str, d5.i iVar, List list, String str2, String str3, int i10) {
        this.f14026a = 13;
        this.d = of0Var;
        this.f14028c = str;
        this.e = iVar;
        this.f14029f = list;
        this.h = str2;
        this.f14030n = str3;
        this.f14027b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f14026a = 14;
        this.d = profileActivity;
        this.f14028c = view;
        this.e = str;
        this.f14027b = i10;
        this.f14029f = zArr;
        this.h = strArr;
        this.f14030n = str2;
    }

    public d1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, Utilities.Callback callback) {
        this.f14026a = 15;
        this.d = e2Var;
        this.f14028c = a2Var;
        this.f14027b = i10;
        this.e = obj;
        this.f14029f = str;
        this.h = i0Var;
        this.f14030n = callback;
    }

    public d1(org.telegram.ui.web.a1 a1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.x0 x0Var, x7 x7Var) {
        this.f14026a = 16;
        this.d = a1Var;
        this.f14028c = str;
        this.h = tLObject;
        this.f14029f = tL_error;
        this.f14027b = i10;
        this.e = x0Var;
        this.f14030n = x7Var;
    }
}
