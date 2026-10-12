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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.i4;
import org.telegram.ui.t70;
import org.telegram.ui.u60;
import org.telegram.ui.vy;
import org.telegram.ui.yq;
public final class d1 implements Runnable {
    public final int f10567a;
    public final int f10568b;
    public final Object f10569c;
    public final Object d;
    public final Object f10570e;
    public final Object f10571f;
    public final Object h;
    public final Object f10572n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10567a = 1;
        this.f10568b = i10;
        this.f10569c = arrayList;
        this.d = arrayList2;
        this.f10570e = num;
        this.f10571f = albumEntry;
        this.h = albumEntry2;
        this.f10572n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10567a = i11;
        this.d = obj;
        this.f10568b = i10;
        this.f10569c = serializable;
        this.f10570e = obj2;
        this.f10571f = obj3;
        this.h = obj4;
        this.f10572n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f10567a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f10569c = inputFile;
        this.f10570e = inputMedia;
        this.f10571f = delayedMessage;
        this.f10568b = i10;
        this.f10572n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, c6 c6Var, u60 u60Var) {
        this.f10567a = 5;
        this.h = tLObject;
        this.d = a2Var;
        this.f10569c = context;
        this.f10568b = i10;
        this.f10570e = exportgroupcallinvite;
        this.f10571f = c6Var;
        this.f10572n = u60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, yq yqVar) {
        this.f10567a = 6;
        this.f10571f = tL_error;
        this.h = tLObject;
        this.f10569c = arrayList;
        this.f10568b = i10;
        this.d = atomicInteger;
        this.f10570e = arrayList2;
        this.f10572n = yqVar;
    }

    public d1(org.telegram.ui.ActionBar.a2 a2Var, of.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f10567a = 8;
        this.d = a2Var;
        this.f10569c = eVar;
        this.h = tLObject;
        this.f10568b = i10;
        this.f10570e = context;
        this.f10572n = tL_inputGroupCallSlug;
        this.f10571f = tL_error;
    }

    public d1(org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10567a = 7;
        this.d = a2Var;
        this.h = tLObject;
        this.f10568b = i10;
        this.f10569c = document;
        this.f10571f = tL_error;
        this.f10570e = obj;
        this.f10572n = tL_stickers_addStickerToSet;
    }

    public d1(i4 i4Var, int i10, of.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10567a = 3;
        this.d = i4Var;
        this.f10568b = i10;
        this.f10569c = eVar;
        this.h = tLObject;
        this.f10570e = str;
        this.f10571f = g0Var;
        this.f10572n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, vy vyVar, m2 m2Var, TLRPC.User user, String str) {
        this.f10567a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f10568b = i10;
        this.f10569c = vyVar;
        this.f10570e = m2Var;
        this.f10571f = user;
        this.f10572n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.a2 a2Var, t70 t70Var, String str) {
        this.f10567a = 9;
        this.d = launchActivity;
        this.f10571f = tL_error;
        this.h = tLObject;
        this.f10568b = i10;
        this.f10569c = a2Var;
        this.f10570e = t70Var;
        this.f10572n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, t70 t70Var, int i10, String str) {
        this.f10567a = 10;
        this.d = launchActivity;
        this.f10571f = tL_error;
        this.h = tLObject;
        this.f10569c = tL_inputInvoiceSlug;
        this.f10570e = t70Var;
        this.f10568b = i10;
        this.f10572n = str;
    }

    public d1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f10567a = 12;
        this.d = fg0Var;
        this.f10569c = str;
        this.f10570e = hVar;
        this.f10571f = list;
        this.h = str2;
        this.f10572n = str3;
        this.f10568b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10567a = 13;
        this.d = profileActivity;
        this.f10569c = view;
        this.f10570e = str;
        this.f10568b = i10;
        this.f10571f = zArr;
        this.h = strArr;
        this.f10572n = str2;
    }

    public d1(org.telegram.ui.Wallet.f2 f2Var, org.telegram.ui.Wallet.b2 b2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.i0 i0Var, Utilities.Callback callback) {
        this.f10567a = 14;
        this.d = f2Var;
        this.f10569c = b2Var;
        this.f10568b = i10;
        this.f10570e = obj;
        this.f10571f = str;
        this.h = i0Var;
        this.f10572n = callback;
    }

    public d1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, ea eaVar) {
        this.f10567a = 15;
        this.d = b1Var;
        this.f10569c = str;
        this.h = tLObject;
        this.f10571f = tL_error;
        this.f10568b = i10;
        this.f10570e = y0Var;
        this.f10572n = eaVar;
    }
}
