package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y51;
public final class b implements Utilities.Callback2 {
    public final int f9086a;
    public final f f9087b;

    public b(f fVar, int i10) {
        this.f9086a = i10;
        this.f9087b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f9086a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                m61 m61Var = (m61) obj2;
                f fVar = this.f9087b;
                e eVar = fVar.f9101f;
                y51 y51Var = new y51(-4);
                y51Var.d = 0;
                y51Var.f30512c = eVar;
                y51Var.f30531z = -1;
                arrayList.add(y51Var);
                y51 c10 = y51.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f30523q = true;
                arrayList.add(c10);
                arrayList.add(y51.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(y51.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f18343id);
                        y51 v = y51.v(chat);
                        long j3 = chat.f18343id;
                        v.d = (int) (j3 ^ (j3 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            if (arrayList4 != null) {
                                i10 = arrayList4.size();
                            } else {
                                i10 = 0;
                            }
                            string = LocaleController.formatPluralString("Chats", i10, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        v.f30519m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f9087b;
                if (tL_error != null) {
                    fVar2.getClass();
                    xc.a0(fVar2).d0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f9098a, 0);
                return;
        }
    }
}
