package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ec;

public final class w2 implements Runnable {

    public final int f10265a;

    public final i5 f10266b;

    public final String f10267c;

    public w2(i5 i5Var, String str, int i10) {
        this.f10265a = i10;
        this.f10266b = i5Var;
        this.f10267c = str;
    }

    @Override
    public final void run() {
        switch (this.f10265a) {
            case 0:
                i5.i1(this.f10266b, this.f10267c);
                break;
            case 1:
                i5 i5Var = this.f10266b;
                we.e.u(i5Var.getContext(), MessagesController.getInstance(i5Var.currentAccount).tonBlockchainExplorerUrl + this.f10267c);
                break;
            case 2:
                i5 i5Var2 = this.f10266b;
                we.e.u(i5Var2.getContext(), MessagesController.getInstance(i5Var2.currentAccount).tonBlockchainExplorerUrl + this.f10267c);
                break;
            case 3:
                i5 i5Var3 = this.f10266b;
                we.e.u(i5Var3.getContext(), MessagesController.getInstance(i5Var3.currentAccount).tonBlockchainExplorerUrl + this.f10267c);
                break;
            case 4:
                i5 i5Var4 = this.f10266b;
                we.e.u(i5Var4.getContext(), MessagesController.getInstance(i5Var4.currentAccount).tonBlockchainExplorerUrl + this.f10267c);
                break;
            case 5:
                i5 i5Var5 = this.f10266b;
                we.e.u(i5Var5.getContext(), MessagesController.getInstance(i5Var5.currentAccount).tonBlockchainExplorerUrl + this.f10267c);
                break;
            case 6:
                i5 i5Var6 = this.f10266b;
                we.e.u(i5Var6.getContext(), MessagesController.getInstance(i5Var6.currentAccount).tonBlockchainExplorerUrl + this.f10267c);
                break;
            case 7:
                AndroidUtilities.addToClipboard(this.f10267c);
                ec ecVarK = this.f10266b.getBulletinFactory().k(false);
                ecVarK.f28030t = true;
                ecVarK.j();
                break;
            default:
                i5.o0(this.f10266b, this.f10267c);
                break;
        }
    }
}
