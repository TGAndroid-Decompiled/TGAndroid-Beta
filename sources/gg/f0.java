package gg;

import org.telegram.messenger.R;
public enum f0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f9712a;
    public final int f9713b;
    public final int f9714c;

    f0(int i10, int i11, int i12) {
        this.f9712a = i10;
        this.f9713b = i11;
        this.f9714c = i12;
    }
}
