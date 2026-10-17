package hg;

import org.telegram.messenger.R;
public enum e0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f11843a;
    public final int f11844b;
    public final int f11845c;

    e0(int i10, int i11, int i12) {
        this.f11843a = i10;
        this.f11844b = i11;
        this.f11845c = i12;
    }
}
