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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg0;
import org.telegram.ui.i4;
import org.telegram.ui.m70;
import org.telegram.ui.s60;
import org.telegram.ui.ty;
import org.telegram.ui.vq;
public final class d1 implements Runnable {
    public final int f10569a;
    public final int f10570b;
    public final Object f10571c;
    public final Object d;
    public final Object f10572e;
    public final Object f10573f;
    public final Object h;
    public final Object f10574n;

    public d1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10569a = 1;
        this.f10570b = i10;
        this.f10571c = arrayList;
        this.d = arrayList2;
        this.f10572e = num;
        this.f10573f = albumEntry;
        this.h = albumEntry2;
        this.f10574n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.d1.run():void");
    }

    public d1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10569a = i11;
        this.d = obj;
        this.f10570b = i10;
        this.f10571c = serializable;
        this.f10572e = obj2;
        this.f10573f = obj3;
        this.h = obj4;
        this.f10574n = obj5;
    }

    public d1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f10569a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f10571c = inputFile;
        this.f10572e = inputMedia;
        this.f10573f = delayedMessage;
        this.f10570b = i10;
        this.f10574n = str;
    }

    public d1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, e6 e6Var, s60 s60Var) {
        this.f10569a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f10571c = context;
        this.f10570b = i10;
        this.f10572e = exportgroupcallinvite;
        this.f10573f = e6Var;
        this.f10574n = s60Var;
    }

    public d1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, vq vqVar) {
        this.f10569a = 6;
        this.f10573f = tL_error;
        this.h = tLObject;
        this.f10571c = arrayList;
        this.f10570b = i10;
        this.d = atomicInteger;
        this.f10572e = arrayList2;
        this.f10574n = vqVar;
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, of.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f10569a = 8;
        this.d = b2Var;
        this.f10571c = eVar;
        this.h = tLObject;
        this.f10570b = i10;
        this.f10572e = context;
        this.f10574n = tL_inputGroupCallSlug;
        this.f10573f = tL_error;
    }

    public d1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10569a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f10570b = i10;
        this.f10571c = document;
        this.f10573f = tL_error;
        this.f10572e = obj;
        this.f10574n = tL_stickers_addStickerToSet;
    }

    public d1(i4 i4Var, int i10, of.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10569a = 3;
        this.d = i4Var;
        this.f10570b = i10;
        this.f10571c = eVar;
        this.h = tLObject;
        this.f10572e = str;
        this.f10573f = g0Var;
        this.f10574n = tL_messages_getWebPage;
    }

    public d1(LaunchActivity launchActivity, TLObject tLObject, int i10, ty tyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f10569a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f10570b = i10;
        this.f10571c = tyVar;
        this.f10572e = n2Var;
        this.f10573f = user;
        this.f10574n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, m70 m70Var, String str) {
        this.f10569a = 9;
        this.d = launchActivity;
        this.f10573f = tL_error;
        this.h = tLObject;
        this.f10570b = i10;
        this.f10571c = b2Var;
        this.f10572e = m70Var;
        this.f10574n = str;
    }

    public d1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, m70 m70Var, int i10, String str) {
        this.f10569a = 10;
        this.d = launchActivity;
        this.f10573f = tL_error;
        this.h = tLObject;
        this.f10571c = tL_inputInvoiceSlug;
        this.f10572e = m70Var;
        this.f10570b = i10;
        this.f10574n = str;
    }

    public d1(fg0 fg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f10569a = 12;
        this.d = fg0Var;
        this.f10571c = str;
        this.f10572e = hVar;
        this.f10573f = list;
        this.h = str2;
        this.f10574n = str3;
        this.f10570b = i10;
    }

    public d1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10569a = 13;
        this.d = profileActivity;
        this.f10571c = view;
        this.f10572e = str;
        this.f10570b = i10;
        this.f10573f = zArr;
        this.h = strArr;
        this.f10574n = str2;
    }

    public d1(org.telegram.ui.Wallet.e2 e2Var, org.telegram.ui.Wallet.a2 a2Var, int i10, Object obj, String str, org.telegram.ui.Wallet.h0 h0Var, Utilities.Callback callback) {
        this.f10569a = 14;
        this.d = e2Var;
        this.f10571c = a2Var;
        this.f10570b = i10;
        this.f10572e = obj;
        this.f10573f = str;
        this.h = h0Var;
        this.f10574n = callback;
    }

    public d1(org.telegram.ui.web.b1 b1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.y0 y0Var, ea eaVar) {
        this.f10569a = 15;
        this.d = b1Var;
        this.f10571c = str;
        this.h = tLObject;
        this.f10573f = tL_error;
        this.f10570b = i10;
        this.f10572e = y0Var;
        this.f10574n = eaVar;
    }
}
