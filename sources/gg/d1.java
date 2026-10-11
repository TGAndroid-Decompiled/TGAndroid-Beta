package gg;

import ai.ea;
import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.h4;
import org.telegram.ui.n70;
import org.telegram.ui.s60;
import org.telegram.ui.sy;
import org.telegram.ui.vq;
public final class d1 implements Runnable {
    public final int f10568a;
    public final int f10569b;
    public final Object f10570c;
    public final Object d;
    public final Object f10571e;
    public final Object f10572f;
    public final Object h;
    public final Object f10573n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10568a = 1;
        this.f10569b = i10;
        this.f10570c = arrayList;
        this.d = arrayList2;
        this.f10571e = num;
        this.f10572f = albumEntry;
        this.h = albumEntry2;
        this.f10573n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10568a = i11;
        this.d = obj;
        this.f10569b = i10;
        this.f10570c = serializable;
        this.f10571e = obj2;
        this.f10572f = obj3;
        this.h = obj4;
        this.f10573n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f10568a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f10570c = inputFile;
        this.f10571e = inputMedia;
        this.f10572f = delayedMessage;
        this.f10569b = i10;
        this.f10573n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, s60 s60Var) {
        this.f10568a = 5;
        this.h = tLObject;
        this.d = a2Var;
        this.f10570c = context;
        this.f10569b = i10;
        this.f10571e = exportgroupcallinvite;
        this.f10572f = d6Var;
        this.f10573n = s60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, vq vqVar) {
        this.f10568a = 6;
        this.f10572f = tL_error;
        this.h = tLObject;
        this.f10570c = arrayList;
        this.f10569b = i10;
        this.d = atomicInteger;
        this.f10571e = arrayList2;
        this.f10573n = vqVar;
    }

    public d1(org.telegram.ui.ActionBar.a2 a2Var, of.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f10568a = 8;
        this.d = a2Var;
        this.f10570c = eVar;
        this.h = tLObject;
        this.f10569b = i10;
        this.f10571e = context;
        this.f10573n = tL_inputGroupCallSlug;
        this.f10572f = tL_error;
    }

    public d1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10568a = 7;
        this.d = a2Var;
        this.h = tLObject;
        this.f10569b = i10;
        this.f10570c = document;
        this.f10572f = tL_error;
        this.f10571e = obj;
        this.f10573n = tL_stickers_addStickerToSet;
    }

    public d1(h4 h4Var, int i10, of.e eVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10568a = 3;
        this.d = h4Var;
        this.f10569b = i10;
        this.f10570c = eVar;
        this.h = tLObject;
        this.f10571e = str;
        this.f10572f = f0Var;
        this.f10573n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, sy syVar, m2 m2Var, TLRPC.User user, String str) {
        this.f10568a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f10569b = i10;
        this.f10570c = syVar;
        this.f10571e = m2Var;
        this.f10572f = user;
        this.f10573n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, n70 n70Var, String str) {
        this.f10568a = 9;
        this.d = launchActivity;
        this.f10572f = tL_error;
        this.h = tLObject;
        this.f10569b = i10;
        this.f10570c = a2Var;
        this.f10571e = n70Var;
        this.f10573n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, n70 n70Var, int i10, String str) {
        this.f10568a = 10;
        this.d = launchActivity;
        this.f10572f = tL_error;
        this.h = tLObject;
        this.f10570c = tL_inputInvoiceSlug;
        this.f10571e = n70Var;
        this.f10569b = i10;
        this.f10573n = str;
    }

    public d1(eg0 eg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f10568a = 12;
        this.d = eg0Var;
        this.f10570c = str;
        this.f10571e = hVar;
        this.f10572f = list;
        this.h = str2;
        this.f10573n = str3;
        this.f10569b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10568a = 13;
        this.d = profileActivity;
        this.f10570c = view;
        this.f10571e = str;
        this.f10569b = i10;
        this.f10572f = zArr;
        this.h = strArr;
        this.f10573n = str2;
    }

    public d1(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, Utilities.Callback callback) {
        this.f10568a = 14;
        this.d = f2Var;
        this.f10570c = b2Var;
        this.f10569b = i10;
        this.f10571e = obj;
        this.f10572f = str;
        this.h = i0Var;
        this.f10573n = callback;
    }

    public d1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, ea eaVar) {
        this.f10568a = 15;
        this.d = b1Var;
        this.f10570c = str;
        this.h = tLObject;
        this.f10572f = tL_error;
        this.f10569b = i10;
        this.f10571e = y0Var;
        this.f10573n = eaVar;
    }
}
