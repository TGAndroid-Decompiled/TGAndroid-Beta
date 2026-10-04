package gg;

import ai.da;
import android.content.Context;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.h90;
import org.telegram.ui.i4;
import org.telegram.ui.t60;
import org.telegram.ui.uq;
import org.telegram.ui.uy;
public final class e1 implements Runnable {
    public final int f10566a;
    public final int f10567b;
    public final Object f10568c;
    public final Object d;
    public final Object f10569e;
    public final Object f10570f;
    public final Object h;
    public final Object f10571n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10566a = 1;
        this.f10567b = i10;
        this.f10568c = arrayList;
        this.d = arrayList2;
        this.f10569e = num;
        this.f10570f = albumEntry;
        this.h = albumEntry2;
        this.f10571n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10566a = i11;
        this.d = obj;
        this.f10567b = i10;
        this.f10568c = serializable;
        this.f10569e = obj2;
        this.f10570f = obj3;
        this.h = obj4;
        this.f10571n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f10566a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f10568c = inputFile;
        this.f10569e = inputMedia;
        this.f10570f = delayedMessage;
        this.f10567b = i10;
        this.f10571n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, t60 t60Var) {
        this.f10566a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f10568c = context;
        this.f10567b = i10;
        this.f10569e = exportgroupcallinvite;
        this.f10570f = d6Var;
        this.f10571n = t60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, uq uqVar) {
        this.f10566a = 6;
        this.f10570f = tL_error;
        this.h = tLObject;
        this.f10568c = arrayList;
        this.f10567b = i10;
        this.d = atomicInteger;
        this.f10569e = arrayList2;
        this.f10571n = uqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f10566a = 8;
        this.d = b2Var;
        this.f10568c = eVar;
        this.h = tLObject;
        this.f10567b = i10;
        this.f10569e = context;
        this.f10571n = tL_inputGroupCallSlug;
        this.f10570f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10566a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f10567b = i10;
        this.f10568c = document;
        this.f10570f = tL_error;
        this.f10569e = obj;
        this.f10571n = tL_stickers_addStickerToSet;
    }

    public e1(i4 i4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10566a = 3;
        this.d = i4Var;
        this.f10567b = i10;
        this.f10568c = eVar;
        this.h = tLObject;
        this.f10569e = str;
        this.f10570f = g0Var;
        this.f10571n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, uy uyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f10566a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f10567b = i10;
        this.f10568c = uyVar;
        this.f10569e = n2Var;
        this.f10570f = user;
        this.f10571n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, h90 h90Var, String str) {
        this.f10566a = 9;
        this.d = launchActivity;
        this.f10570f = tL_error;
        this.h = tLObject;
        this.f10567b = i10;
        this.f10568c = b2Var;
        this.f10569e = h90Var;
        this.f10571n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, h90 h90Var, int i10, String str) {
        this.f10566a = 10;
        this.d = launchActivity;
        this.f10570f = tL_error;
        this.h = tLObject;
        this.f10568c = tL_inputInvoiceSlug;
        this.f10569e = h90Var;
        this.f10567b = i10;
        this.f10571n = str;
    }

    public e1(dg0 dg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f10566a = 12;
        this.d = dg0Var;
        this.f10568c = str;
        this.f10569e = hVar;
        this.f10570f = list;
        this.h = str2;
        this.f10571n = str3;
        this.f10567b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10566a = 13;
        this.d = profileActivity;
        this.f10568c = view;
        this.f10569e = str;
        this.f10567b = i10;
        this.f10570f = zArr;
        this.h = strArr;
        this.f10571n = str2;
    }

    public e1(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, da daVar) {
        this.f10566a = 14;
        this.d = c1Var;
        this.f10568c = str;
        this.h = tLObject;
        this.f10570f = tL_error;
        this.f10567b = i10;
        this.f10569e = z0Var;
        this.f10571n = daVar;
    }
}
