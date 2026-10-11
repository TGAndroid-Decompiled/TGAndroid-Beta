package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xb implements RequestDelegate {
    public final int f19832a;
    public final MessagesController f19833b;
    public final long f19834c;
    public final long d;
    public final ArrayList f19835e;

    public xb(int i10, long j3, long j10, ArrayList arrayList, MessagesController messagesController) {
        this.f19832a = i10;
        this.f19833b = messagesController;
        this.f19834c = j3;
        this.d = j10;
        this.f19835e = arrayList;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19832a) {
            case 0:
                this.f19833b.lambda$checkUnreadPollVotesInternal2$433(this.f19834c, this.d, this.f19835e, tLObject, tL_error);
                return;
            case 1:
                this.f19833b.lambda$checkUnreadPollVotesInternal2$435(this.f19834c, this.d, this.f19835e, tLObject, tL_error);
                return;
            case 2:
                this.f19833b.lambda$checkUnreadPollVotesInternal2$437(this.f19834c, this.d, this.f19835e, tLObject, tL_error);
                return;
            case 3:
                this.f19833b.lambda$checkUnreadReactionsInternal2$426(this.f19834c, this.d, this.f19835e, tLObject, tL_error);
                return;
            case 4:
                this.f19833b.lambda$checkUnreadReactionsInternal2$428(this.f19834c, this.d, this.f19835e, tLObject, tL_error);
                return;
            default:
                this.f19833b.lambda$checkUnreadReactionsInternal2$430(this.f19834c, this.d, this.f19835e, tLObject, tL_error);
                return;
        }
    }
}
