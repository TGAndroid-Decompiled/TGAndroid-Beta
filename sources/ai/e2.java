package ai;

import org.telegram.messenger.FactCheckController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
public final class e2 implements Runnable {
    public final int f1195a;
    public final Object f1196b;
    public final boolean f1197c;
    public final Object d;
    public final Object e;
    public final Object f1198f;

    public e2(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f1195a = i10;
        this.d = obj;
        this.e = obj2;
        this.f1196b = obj3;
        this.f1198f = obj4;
        this.f1197c = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e2.run():void");
    }

    public e2(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f1195a = i10;
        this.d = obj;
        this.e = obj2;
        this.f1196b = obj3;
        this.f1197c = z10;
        this.f1198f = obj4;
    }

    public e2(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f1195a = i10;
        this.d = obj;
        this.e = obj2;
        this.f1197c = z10;
        this.f1196b = obj3;
        this.f1198f = obj4;
    }

    public e2(Object obj, TLObject tLObject, boolean z10, Object obj2, Object obj3, int i10) {
        this.f1195a = i10;
        this.d = obj;
        this.f1196b = tLObject;
        this.f1197c = z10;
        this.e = obj2;
        this.f1198f = obj3;
    }

    public e2(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1195a = i10;
        this.d = obj;
        this.f1197c = z10;
        this.e = obj2;
        this.f1196b = obj3;
        this.f1198f = obj4;
    }

    public e2(FactCheckController factCheckController, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f1195a = 5;
        this.d = factCheckController;
        this.f1196b = tLObject;
        this.e = tL_textWithEntities;
        this.f1197c = z10;
        this.f1198f = b2Var;
    }

    public e2(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f1195a = 25;
        this.d = payments_giveawayinfo;
        this.f1197c = z10;
        this.e = str;
        this.f1196b = tL_messageMediaGiveaway;
        this.f1198f = n2Var;
    }

    public e2(bz bzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1195a = 18;
        this.d = bzVar;
        this.e = str;
        this.f1197c = z10;
        this.f1198f = str2;
        this.f1196b = tLObject;
    }
}
