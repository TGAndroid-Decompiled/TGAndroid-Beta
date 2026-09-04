package hg;

import org.telegram.messenger.R;
public enum f0 {
    All(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    Private(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    Groups(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    Channels(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);
    
    public final int f11036a;
    public final int f11037b;
    public final int f11038c;

    f0(int i10, int i11, int i12) {
        this.f11036a = i10;
        this.f11037b = i11;
        this.f11038c = i12;
    }
}
