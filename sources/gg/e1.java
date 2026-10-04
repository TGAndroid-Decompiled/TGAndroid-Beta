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
    public final int f10565a;
    public final int f10566b;
    public final Object f10567c;
    public final Object d;
    public final Object f10568e;
    public final Object f10569f;
    public final Object h;
    public final Object f10570n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f10565a = 1;
        this.f10566b = i10;
        this.f10567c = arrayList;
        this.d = arrayList2;
        this.f10568e = num;
        this.f10569f = albumEntry;
        this.h = albumEntry2;
        this.f10570n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f10565a = i11;
        this.d = obj;
        this.f10566b = i10;
        this.f10567c = serializable;
        this.f10568e = obj2;
        this.f10569f = obj3;
        this.h = obj4;
        this.f10570n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f10565a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f10567c = inputFile;
        this.f10568e = inputMedia;
        this.f10569f = delayedMessage;
        this.f10566b = i10;
        this.f10570n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, d6 d6Var, t60 t60Var) {
        this.f10565a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f10567c = context;
        this.f10566b = i10;
        this.f10568e = exportgroupcallinvite;
        this.f10569f = d6Var;
        this.f10570n = t60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, uq uqVar) {
        this.f10565a = 6;
        this.f10569f = tL_error;
        this.h = tLObject;
        this.f10567c = arrayList;
        this.f10566b = i10;
        this.d = atomicInteger;
        this.f10568e = arrayList2;
        this.f10570n = uqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f10565a = 8;
        this.d = b2Var;
        this.f10567c = eVar;
        this.h = tLObject;
        this.f10566b = i10;
        this.f10568e = context;
        this.f10570n = tL_inputGroupCallSlug;
        this.f10569f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f10565a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f10566b = i10;
        this.f10567c = document;
        this.f10569f = tL_error;
        this.f10568e = obj;
        this.f10570n = tL_stickers_addStickerToSet;
    }

    public e1(i4 i4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.g0 g0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f10565a = 3;
        this.d = i4Var;
        this.f10566b = i10;
        this.f10567c = eVar;
        this.h = tLObject;
        this.f10568e = str;
        this.f10569f = g0Var;
        this.f10570n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, uy uyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f10565a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f10566b = i10;
        this.f10567c = uyVar;
        this.f10568e = n2Var;
        this.f10569f = user;
        this.f10570n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, h90 h90Var, String str) {
        this.f10565a = 9;
        this.d = launchActivity;
        this.f10569f = tL_error;
        this.h = tLObject;
        this.f10566b = i10;
        this.f10567c = b2Var;
        this.f10568e = h90Var;
        this.f10570n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, h90 h90Var, int i10, String str) {
        this.f10565a = 10;
        this.d = launchActivity;
        this.f10569f = tL_error;
        this.h = tLObject;
        this.f10567c = tL_inputInvoiceSlug;
        this.f10568e = h90Var;
        this.f10566b = i10;
        this.f10570n = str;
    }

    public e1(dg0 dg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f10565a = 12;
        this.d = dg0Var;
        this.f10567c = str;
        this.f10568e = hVar;
        this.f10569f = list;
        this.h = str2;
        this.f10570n = str3;
        this.f10566b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f10565a = 13;
        this.d = profileActivity;
        this.f10567c = view;
        this.f10568e = str;
        this.f10566b = i10;
        this.f10569f = zArr;
        this.h = strArr;
        this.f10570n = str2;
    }

    public e1(org.telegram.ui.web.c1 c1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, da daVar) {
        this.f10565a = 14;
        this.d = c1Var;
        this.f10567c = str;
        this.h = tLObject;
        this.f10569f = tL_error;
        this.f10566b = i10;
        this.f10568e = z0Var;
        this.f10570n = daVar;
    }
}
