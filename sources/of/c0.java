package of;

import org.telegram.messenger.R;
public enum c0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f19262a;
    public final int f19263b;
    public final int f19264c;

    c0(int i9, int i10, int i11) {
        this.f19262a = i9;
        this.f19263b = i10;
        this.f19264c = i11;
    }
}
