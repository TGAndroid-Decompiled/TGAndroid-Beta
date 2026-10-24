package hg;

import android.content.Context;
import android.view.View;
import ci.y7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;
import org.telegram.ui.f60;
import org.telegram.ui.f80;
import org.telegram.ui.k4;
import org.telegram.ui.lq;
import org.telegram.ui.qf0;
public final class d1 implements Runnable {
    public final int f11859a;
    public final int f11860b;
    public final Object f11861c;
    public final Object d;
    public final Object e;
    public final Object f11862f;
    public final Object h;
    public final Object f11863n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f11859a = 1;
        this.f11860b = i10;
        this.f11861c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f11862f = albumEntry;
        this.h = albumEntry2;
        this.f11863n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f11859a = i11;
        this.d = obj;
        this.f11860b = i10;
        this.f11861c = serializable;
        this.e = obj2;
        this.f11862f = obj3;
        this.h = obj4;
        this.f11863n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f11859a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f11861c = inputFile;
        this.e = inputMedia;
        this.f11862f = delayedMessage;
        this.f11860b = i10;
        this.f11863n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, g6 g6Var, f60 f60Var) {
        this.f11859a = 5;
        this.h = tLObject;
        this.d = c2Var;
        this.f11861c = context;
        this.f11860b = i10;
        this.e = exportgroupcallinvite;
        this.f11862f = g6Var;
        this.f11863n = f60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, lq lqVar) {
        this.f11859a = 6;
        this.f11862f = tL_error;
        this.h = tLObject;
        this.f11861c = arrayList;
        this.f11860b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f11863n = lqVar;
    }

    public d1(org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f11859a = 7;
        this.d = c2Var;
        this.h = tLObject;
        this.f11860b = i10;
        this.f11861c = document;
        this.f11862f = tL_error;
        this.e = obj;
        this.f11863n = tL_stickers_addStickerToSet;
    }

    public d1(org.telegram.ui.ActionBar.c2 c2Var, pf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f11859a = 8;
        this.d = c2Var;
        this.f11861c = cVar;
        this.h = tLObject;
        this.f11860b = i10;
        this.e = context;
        this.f11863n = tL_inputGroupCallSlug;
        this.f11862f = tL_error;
    }

    public d1(k4 k4Var, int i10, pf.c cVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f11859a = 3;
        this.d = k4Var;
        this.f11860b = i10;
        this.f11861c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f11862f = f0Var;
        this.f11863n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, ey eyVar, o2 o2Var, TLRPC.User user, String str) {
        this.f11859a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11860b = i10;
        this.f11861c = eyVar;
        this.e = o2Var;
        this.f11862f = user;
        this.f11863n = str;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, pf.c cVar, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str) {
        this.f11859a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11861c = cVar;
        this.f11862f = tL_error;
        this.f11863n = messagesController;
        this.f11860b = i10;
        this.e = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.c2 c2Var, f80 f80Var, String str) {
        this.f11859a = 9;
        this.d = launchActivity;
        this.f11862f = tL_error;
        this.h = tLObject;
        this.f11860b = i10;
        this.f11861c = c2Var;
        this.e = f80Var;
        this.f11863n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, f80 f80Var, int i10, String str) {
        this.f11859a = 12;
        this.d = launchActivity;
        this.f11862f = tL_error;
        this.h = tLObject;
        this.f11861c = tL_inputInvoiceSlug;
        this.e = f80Var;
        this.f11860b = i10;
        this.f11863n = str;
    }

    public d1(qf0 qf0Var, String str, c5.i iVar, List list, String str2, String str3, int i10) {
        this.f11859a = 13;
        this.d = qf0Var;
        this.f11861c = str;
        this.e = iVar;
        this.f11862f = list;
        this.h = str2;
        this.f11863n = str3;
        this.f11860b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f11859a = 14;
        this.d = profileActivity;
        this.f11861c = view;
        this.e = str;
        this.f11860b = i10;
        this.f11862f = zArr;
        this.h = strArr;
        this.f11863n = str2;
    }

    public d1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, Utilities.Callback callback) {
        this.f11859a = 15;
        this.d = e2Var;
        this.f11861c = a2Var;
        this.f11860b = i10;
        this.e = obj;
        this.f11862f = str;
        this.h = i0Var;
        this.f11863n = callback;
    }

    public d1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, y7 y7Var) {
        this.f11859a = 16;
        this.d = b1Var;
        this.f11861c = str;
        this.h = tLObject;
        this.f11862f = tL_error;
        this.f11860b = i10;
        this.e = y0Var;
        this.f11863n = y7Var;
    }
}
