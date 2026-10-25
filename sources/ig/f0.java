package ig;

import org.telegram.messenger.R;
public enum f0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f14051a;
    public final int f14052b;
    public final int f14053c;

    f0(int i10, int i11, int i12) {
        this.f14051a = i10;
        this.f14052b = i11;
        this.f14053c = i12;
    }
}
