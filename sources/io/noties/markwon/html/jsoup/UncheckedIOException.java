package io.noties.markwon.html.jsoup;

import java.io.IOException;

public class UncheckedIOException extends RuntimeException {
    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }
}
