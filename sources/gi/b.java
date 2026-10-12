package gi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zc;
public final class b implements Utilities.Callback2 {
    public final int f10161a;
    public final f f10162b;

    public b(f fVar, int i10) {
        this.f10161a = i10;
        this.f10162b = fVar;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String string;
        int i10;
        switch (this.f10161a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z61 z61Var = (z61) obj2;
                f fVar = this.f10162b;
                e eVar = fVar.f10176f;
                l61 l61Var = new l61(-4);
                l61Var.d = 0;
                l61Var.f26948c = eVar;
                l61Var.f26967z = -1;
                arrayList.add(l61Var);
                l61 c10 = l61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.f26959q = true;
                arrayList.add(c10);
                arrayList.add(l61.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(l61.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.f19216id);
                        l61 v = l61.v(chat);
                        long j10 = chat.f19216id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
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
                        v.f26955m = string;
                        arrayList.add(v);
                    }
                    return;
                }
                return;
            default:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.f10162b;
                if (tL_error != null) {
                    fVar2.getClass();
                    zc.a0(fVar2).f0(tL_error, false);
                    return;
                }
                u0.d(fVar2, fVar2.f10173a, 0);
                return;
        }
    }
}
