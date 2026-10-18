package hg;

import android.content.Context;
import android.view.View;
import ci.z7;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.f2;
import org.telegram.ui.b80;
import org.telegram.ui.d60;
import org.telegram.ui.ey;
import org.telegram.ui.l4;
import org.telegram.ui.lq;
import org.telegram.ui.of0;
public final class d1 implements Runnable {
    public final int f11835a;
    public final int f11836b;
    public final Object f11837c;
    public final Object d;
    public final Object e;
    public final Object f11838f;
    public final Object h;
    public final Object f11839n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f11835a = 1;
        this.f11836b = i10;
        this.f11837c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f11838f = albumEntry;
        this.h = albumEntry2;
        this.f11839n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f11835a = i11;
        this.d = obj;
        this.f11836b = i10;
        this.f11837c = serializable;
        this.e = obj2;
        this.f11838f = obj3;
        this.h = obj4;
        this.f11839n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f11835a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f11837c = inputFile;
        this.e = inputMedia;
        this.f11838f = delayedMessage;
        this.f11836b = i10;
        this.f11839n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, d60 d60Var) {
        this.f11835a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f11837c = context;
        this.f11836b = i10;
        this.e = exportgroupcallinvite;
        this.f11838f = d6Var;
        this.f11839n = d60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, lq lqVar) {
        this.f11835a = 6;
        this.f11838f = tL_error;
        this.h = tLObject;
        this.f11837c = arrayList;
        this.f11836b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f11839n = lqVar;
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f11835a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f11836b = i10;
        this.f11837c = document;
        this.f11838f = tL_error;
        this.e = obj;
        this.f11839n = tL_stickers_addStickerToSet;
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, pf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f11835a = 8;
        this.d = b2Var;
        this.f11837c = cVar;
        this.h = tLObject;
        this.f11836b = i10;
        this.e = context;
        this.f11839n = tL_inputGroupCallSlug;
        this.f11838f = tL_error;
    }

    public d1(l4 l4Var, int i10, pf.c cVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f11835a = 3;
        this.d = l4Var;
        this.f11836b = i10;
        this.f11837c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f11838f = g0Var;
        this.f11839n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, ey eyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f11835a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11836b = i10;
        this.f11837c = eyVar;
        this.e = n2Var;
        this.f11838f = user;
        this.f11839n = str;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, pf.c cVar, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str) {
        this.f11835a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11837c = cVar;
        this.f11838f = tL_error;
        this.f11839n = messagesController;
        this.f11836b = i10;
        this.e = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, b80 b80Var, String str) {
        this.f11835a = 9;
        this.d = launchActivity;
        this.f11838f = tL_error;
        this.h = tLObject;
        this.f11836b = i10;
        this.f11837c = b2Var;
        this.e = b80Var;
        this.f11839n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, b80 b80Var, int i10, String str) {
        this.f11835a = 12;
        this.d = launchActivity;
        this.f11838f = tL_error;
        this.h = tLObject;
        this.f11837c = tL_inputInvoiceSlug;
        this.e = b80Var;
        this.f11836b = i10;
        this.f11839n = str;
    }

    public d1(of0 of0Var, String str, c5.i iVar, List list, String str2, String str3, int i10) {
        this.f11835a = 13;
        this.d = of0Var;
        this.f11837c = str;
        this.e = iVar;
        this.f11838f = list;
        this.h = str2;
        this.f11839n = str3;
        this.f11836b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f11835a = 14;
        this.d = profileActivity;
        this.f11837c = view;
        this.e = str;
        this.f11836b = i10;
        this.f11838f = zArr;
        this.h = strArr;
        this.f11839n = str2;
    }

    public d1(f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.j0 j0Var, Utilities.Callback callback) {
        this.f11835a = 15;
        this.d = f2Var;
        this.f11837c = b2Var;
        this.f11836b = i10;
        this.e = obj;
        this.f11838f = str;
        this.h = j0Var;
        this.f11839n = callback;
    }

    public d1(org.telegram.ui.web.a1 a1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.x0 x0Var, z7 z7Var) {
        this.f11835a = 16;
        this.d = a1Var;
        this.f11837c = str;
        this.h = tLObject;
        this.f11838f = tL_error;
        this.f11836b = i10;
        this.e = x0Var;
        this.f11839n = z7Var;
    }
}
