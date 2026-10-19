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
import org.telegram.ui.b60;
import org.telegram.ui.cy;
import org.telegram.ui.jq;
import org.telegram.ui.l4;
import org.telegram.ui.lf0;
import org.telegram.ui.z70;
public final class d1 implements Runnable {
    public final int f11834a;
    public final int f11835b;
    public final Object f11836c;
    public final Object d;
    public final Object e;
    public final Object f11837f;
    public final Object h;
    public final Object f11838n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f11834a = 1;
        this.f11835b = i10;
        this.f11836c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f11837f = albumEntry;
        this.h = albumEntry2;
        this.f11838n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: hg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f11834a = i11;
        this.d = obj;
        this.f11835b = i10;
        this.f11836c = serializable;
        this.e = obj2;
        this.f11837f = obj3;
        this.h = obj4;
        this.f11838n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f11834a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f11836c = inputFile;
        this.e = inputMedia;
        this.f11837f = delayedMessage;
        this.f11835b = i10;
        this.f11838n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, b60 b60Var) {
        this.f11834a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f11836c = context;
        this.f11835b = i10;
        this.e = exportgroupcallinvite;
        this.f11837f = d6Var;
        this.f11838n = b60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, jq jqVar) {
        this.f11834a = 6;
        this.f11837f = tL_error;
        this.h = tLObject;
        this.f11836c = arrayList;
        this.f11835b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f11838n = jqVar;
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f11834a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f11835b = i10;
        this.f11836c = document;
        this.f11837f = tL_error;
        this.e = obj;
        this.f11838n = tL_stickers_addStickerToSet;
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, pf.c cVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f11834a = 8;
        this.d = b2Var;
        this.f11836c = cVar;
        this.h = tLObject;
        this.f11835b = i10;
        this.e = context;
        this.f11838n = tL_inputGroupCallSlug;
        this.f11837f = tL_error;
    }

    public d1(l4 l4Var, int i10, pf.c cVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f11834a = 3;
        this.d = l4Var;
        this.f11835b = i10;
        this.f11836c = cVar;
        this.h = tLObject;
        this.e = str;
        this.f11837f = g0Var;
        this.f11838n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, cy cyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f11834a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11835b = i10;
        this.f11836c = cyVar;
        this.e = n2Var;
        this.f11837f = user;
        this.f11838n = str;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, pf.c cVar, TLRPC.TL_error tL_error, MessagesController messagesController, int i10, String str) {
        this.f11834a = 10;
        this.d = launchActivity;
        this.h = tLObject;
        this.f11836c = cVar;
        this.f11837f = tL_error;
        this.f11838n = messagesController;
        this.f11835b = i10;
        this.e = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, z70 z70Var, String str) {
        this.f11834a = 9;
        this.d = launchActivity;
        this.f11837f = tL_error;
        this.h = tLObject;
        this.f11835b = i10;
        this.f11836c = b2Var;
        this.e = z70Var;
        this.f11838n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, z70 z70Var, int i10, String str) {
        this.f11834a = 12;
        this.d = launchActivity;
        this.f11837f = tL_error;
        this.h = tLObject;
        this.f11836c = tL_inputInvoiceSlug;
        this.e = z70Var;
        this.f11835b = i10;
        this.f11838n = str;
    }

    public d1(lf0 lf0Var, String str, c5.i iVar, List list, String str2, String str3, int i10) {
        this.f11834a = 13;
        this.d = lf0Var;
        this.f11836c = str;
        this.e = iVar;
        this.f11837f = list;
        this.h = str2;
        this.f11838n = str3;
        this.f11835b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f11834a = 14;
        this.d = profileActivity;
        this.f11836c = view;
        this.e = str;
        this.f11835b = i10;
        this.f11837f = zArr;
        this.h = strArr;
        this.f11838n = str2;
    }

    public d1(f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.j0 j0Var, Utilities.Callback callback) {
        this.f11834a = 15;
        this.d = f2Var;
        this.f11836c = b2Var;
        this.f11835b = i10;
        this.e = obj;
        this.f11837f = str;
        this.h = j0Var;
        this.f11838n = callback;
    }

    public d1(org.telegram.ui.web.a1 a1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.x0 x0Var, z7 z7Var) {
        this.f11834a = 16;
        this.d = a1Var;
        this.f11836c = str;
        this.h = tLObject;
        this.f11837f = tL_error;
        this.f11835b = i10;
        this.e = x0Var;
        this.f11838n = z7Var;
    }
}
