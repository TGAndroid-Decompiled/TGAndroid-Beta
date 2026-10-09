package e2;

import java.util.concurrent.ThreadFactory;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Wallet.WalletEngine2;
public final class c0 implements ThreadFactory {
    public final int f8531a;

    public c0(int i10) {
        this.f8531a = i10;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8531a) {
            case 0:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
            case 1:
                return new Thread(runnable, "RoundVideoFiles");
            case 2:
                return new Thread(runnable, "RoundVideoOutput");
            case 3:
                return new Thread(runnable, "Lottie-" + ck0.P0.getAndIncrement());
            case 4:
                return new Thread(runnable, "LottieLow-" + ck0.Q0.getAndIncrement());
            case 5:
                return new Thread(runnable, "GramWalletStorage");
            default:
                return WalletEngine2.r(runnable);
        }
    }
}
