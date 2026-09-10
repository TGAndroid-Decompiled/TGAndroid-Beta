package d9;
public abstract class a implements f {
    public abstract boolean a(char c10);

    @Override
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
