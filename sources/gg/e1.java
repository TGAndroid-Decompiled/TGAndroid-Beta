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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.h4;
import org.telegram.ui.u60;
import org.telegram.ui.uy;
import org.telegram.ui.vq;
import org.telegram.ui.y80;
public final class e1 implements Runnable {
    public final int f9722a;
    public final int f9723b;
    public final Object f9724c;
    public final Object d;
    public final Object e;
    public final Object f9725f;
    public final Object h;
    public final Object f9726n;

    public e1(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2, MediaController.AlbumEntry albumEntry3) {
        this.f9722a = 1;
        this.f9723b = i10;
        this.f9724c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f9725f = albumEntry;
        this.h = albumEntry2;
        this.f9726n = albumEntry3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gg.e1.run():void");
    }

    public e1(Object obj, int i10, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.f9722a = i11;
        this.d = obj;
        this.f9723b = i10;
        this.f9724c = serializable;
        this.e = obj2;
        this.f9725f = obj3;
        this.h = obj4;
        this.f9726n = obj5;
    }

    public e1(SendMessagesHelper sendMessagesHelper, TLObject tLObject, TLRPC.InputFile inputFile, TLRPC.InputMedia inputMedia, SendMessagesHelper.DelayedMessage delayedMessage, int i10, String str) {
        this.f9722a = 2;
        this.d = sendMessagesHelper;
        this.h = tLObject;
        this.f9724c = inputFile;
        this.e = inputMedia;
        this.f9725f = delayedMessage;
        this.f9723b = i10;
        this.f9726n = str;
    }

    public e1(TLObject tLObject, org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, TL_phone.exportGroupCallInvite exportgroupcallinvite, e6 e6Var, u60 u60Var) {
        this.f9722a = 5;
        this.h = tLObject;
        this.d = b2Var;
        this.f9724c = context;
        this.f9723b = i10;
        this.e = exportgroupcallinvite;
        this.f9725f = e6Var;
        this.f9726n = u60Var;
    }

    public e1(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, vq vqVar) {
        this.f9722a = 6;
        this.f9725f = tL_error;
        this.h = tLObject;
        this.f9724c = arrayList;
        this.f9723b = i10;
        this.d = atomicInteger;
        this.e = arrayList2;
        this.f9726n = vqVar;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, nf.e eVar, TLObject tLObject, int i10, Context context, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.f9722a = 8;
        this.d = b2Var;
        this.f9724c = eVar;
        this.h = tLObject;
        this.f9723b = i10;
        this.e = context;
        this.f9726n = tL_inputGroupCallSlug;
        this.f9725f = tL_error;
    }

    public e1(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, int i10, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.f9722a = 7;
        this.d = b2Var;
        this.h = tLObject;
        this.f9723b = i10;
        this.f9724c = document;
        this.f9725f = tL_error;
        this.e = obj;
        this.f9726n = tL_stickers_addStickerToSet;
    }

    public e1(h4 h4Var, int i10, nf.e eVar, TLObject tLObject, String str, org.telegram.ui.f0 f0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f9722a = 3;
        this.d = h4Var;
        this.f9723b = i10;
        this.f9724c = eVar;
        this.h = tLObject;
        this.e = str;
        this.f9725f = f0Var;
        this.f9726n = tL_messages_getWebPage;
    }

    public e1(LaunchActivity launchActivity, TLObject tLObject, int i10, uy uyVar, n2 n2Var, TLRPC.User user, String str) {
        this.f9722a = 11;
        this.d = launchActivity;
        this.h = tLObject;
        this.f9723b = i10;
        this.f9724c = uyVar;
        this.e = n2Var;
        this.f9725f = user;
        this.f9726n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, org.telegram.ui.ActionBar.b2 b2Var, y80 y80Var, String str) {
        this.f9722a = 9;
        this.d = launchActivity;
        this.f9725f = tL_error;
        this.h = tLObject;
        this.f9723b = i10;
        this.f9724c = b2Var;
        this.e = y80Var;
        this.f9726n = str;
    }

    public e1(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, y80 y80Var, int i10, String str) {
        this.f9722a = 10;
        this.d = launchActivity;
        this.f9725f = tL_error;
        this.h = tLObject;
        this.f9724c = tL_inputInvoiceSlug;
        this.e = y80Var;
        this.f9723b = i10;
        this.f9726n = str;
    }

    public e1(gg0 gg0Var, String str, c5.h hVar, List list, String str2, String str3, int i10) {
        this.f9722a = 12;
        this.d = gg0Var;
        this.f9724c = str;
        this.e = hVar;
        this.f9725f = list;
        this.h = str2;
        this.f9726n = str3;
        this.f9723b = i10;
    }

    public e1(ProfileActivity profileActivity, View view, String str, int i10, boolean[] zArr, String[] strArr, String str2) {
        this.f9722a = 13;
        this.d = profileActivity;
        this.f9724c = view;
        this.e = str;
        this.f9723b = i10;
        this.f9725f = zArr;
        this.h = strArr;
        this.f9726n = str2;
    }

    public e1(org.telegram.ui.web.d1 d1Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.z0 z0Var, da daVar) {
        this.f9722a = 14;
        this.d = d1Var;
        this.f9724c = str;
        this.h = tLObject;
        this.f9725f = tL_error;
        this.f9723b = i10;
        this.e = z0Var;
        this.f9726n = daVar;
    }
}
