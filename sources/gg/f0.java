package gg;

import org.telegram.messenger.R;
public enum f0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f9724a;
    public final int f9725b;
    public final int f9726c;

    f0(int i10, int i11, int i12) {
        this.f9724a = i10;
        this.f9725b = i11;
        this.f9726c = i12;
    }
}
